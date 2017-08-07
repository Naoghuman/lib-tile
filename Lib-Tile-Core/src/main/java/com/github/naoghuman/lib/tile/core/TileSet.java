/*
 * Copyright (C) 2016 Naoghuman
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.naoghuman.lib.tile.core;

import java.util.Optional;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * TileSet
 *  - enthaelt eine List<Tile>
 *  - enthaelt eine List<TileLoader>
 * 
 *  - TileLoader ermoeglicht das laden von Tile
 *  - fuer das laden eines Tile über einen TileLoader ist es notwendig, dass
 *    der TileLoader das Tile supported(prefix)
 *  - der TileToader sollte ABER auch verantwortlich sein fuer das Tile
 *  - TODO d.h. die Bilder der Tile welche ueber den TileLoader geladen werden sollen
 *    fuer den TileLoader verfuegbar sein
 * 
 *  - wie wird der prefix gemanagt?
 *     - Tile(-Bilder) haben
 *        a) einen oder mehrere prefixe
 *        b) die dazugehoerenden bildernamen
 *     - TileLoader verifizieren (validate {NEU TileValidator}) das sie verantwortlich
 *       sind, dass sie das Tile laden können
 *        a) prefix ist okay
 *        b) TileLoader kann definierte Bilder erreichen
 *        c) ist verantwortlich fuer das tile (tile ist registiert bei dem lader,
 *           bedeutet das bild ist fuer den TileLoader erreichbar)
 * 
 *  - COC (convention over configuration)
 *     - Tile have min one Prefix
 *     - TileLoader have min one Prefix.
 *        - The Prefixes from the TileLoader(s) reflected the Prefixes from the Tile(s).
 *        - The package from the TileLoader defines the responsible area from the loader.
 *           - That means the images are in the same package like the TileLoader (but can be
 *             in other libraries).
 *           - Or with other words only the images in the same package like the TileLoader 
 *             can be loaded from it.
 *     - other possiblility is that the TileSet generate a Id, adding a Tile or TileLoader
 *       adds also the TileSetId to the Tile and TileLoader.
 *        - So I know which is responsible...
 *  - new method: 
 *     - TileSet.getTileLoader(Tile): Optional<TileLoader>
 *        - Searchs in all TileLoaders and returned the first TileLoader which supports 
 *          the Tiles Prefix.
 *     - TileSet.checkConfiguration(): void
 *        - At last after the initialization must be at minimum one TileLoader and one Tile.
 * 
 * @author Naoghuman
 */
public abstract class TileSet {
    
    private final ObservableList<Tile>       tiles       = FXCollections.observableArrayList();
    private final ObservableList<TileLoader> tileLoaders = FXCollections.observableArrayList();
    
    protected TileSet() {
        this.initialize();
    }
    
    private void initialize() {
        this.configureTileLoaders();
        this.configureTiles();
        
        this.validateConfiguration();
    }
    
    public void addTile(final Tile tile) {
        tiles.add(tile);
    }
    
    public void addTileLoader(final TileLoader tileLoader) {
        tileLoaders.add(tileLoader);
    }
    
    private void validateConfiguration() {
        TileProvider.getDefault().getDefaultTileValidator().validateIsNotEmpty(tiles);
        TileProvider.getDefault().getDefaultTileValidator().validateIsNotEmpty(tileLoaders);
    }
        
    /**
     * Add all TileLoaders which are responsible for loading the Tiles in this 
     * TileSet to the collection.
     */
    protected abstract void configureTileLoaders();
    
    /**
     * Add all Tiles from this TileSet to the collection.
     */
    protected abstract void configureTiles();
    
    protected Optional<Tile> getTile(final String title) {
//        Tile tile = null;
//        for(Tile t : tiles) {
//            if (t.getTitle().equals(title)) {
//                tile = t;
//                break;
//            }
//        }
        // TODO convert to lambda
        final Optional<Tile> tile = tiles.stream()
                .filter(t -> t.getTitle().equals(title))
                .findFirst();
        
        return tile;
        
//        return Optional.ofNullable(tile);
    }
    
    public Optional<TileLoader> getTileLoader(final Tile tile) {
//        TileLoader tileLoader = null;
//        for(TileLoader tl : tileLoaders) {
//            if (tl.supports(tile.getPrefix())) {
//                tileLoader = tl;
//                break;
//            }
//        }
	// TODO convert to lambda
        final Optional<TileLoader> tileLoader = tileLoaders.stream()
                .filter(tl -> tl.supports(tile))
                .findFirst();
        
        return tileLoader;
        
//        return Optional.ofNullable(tileLoader);
    }

    public ObservableList<Tile> getTiles() {
        if (tiles.isEmpty()) {
            return tiles;
        }
        
        FXCollections.sort(tiles, (Tile tile1, Tile tile2) -> {
            return tile1.getTitle().compareTo(tile2.getTitle());
        });

        return tiles;
    }
    
}
