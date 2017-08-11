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
 * This {@code abstract} class defines the minimal functionalities which should 
 * be supported by a {@code TileSet}.
 * <p>
 * Simple said a {@code TileSet} is a container which contains a set of 
 * {@link com.github.naoghuman.lib.tile.core.Tile}s and their corresponding 
 * {@link com.github.naoghuman.lib.tile.core.TileLoader}s.
 * <p>
 * A {@code TileLoader} supports a {@code Tile} if
 * <ul>
 * <li>the {@code prefix} from the {@code Tile} is supported by the {@code TileLoader} and</li>
 * <li>the {@code scope} from both are equals</li>
 * </ul>
 *
 * @author Naoghuman
 * @since  0.2.0
 * @see    com.github.naoghuman.lib.tile.core.Tile
 * @see    com.github.naoghuman.lib.tile.core.Tile#getPrefix()
 * @see    com.github.naoghuman.lib.tile.core.Tile#getScope()
 * @see    com.github.naoghuman.lib.tile.core.TileLoader
 * @see    com.github.naoghuman.lib.tile.core.TileLoader#getPrefixes()
 * @see    com.github.naoghuman.lib.tile.core.TileLoader#getScope()
 */
public abstract class TileSet {
    
    private final ObservableList<Tile>       tiles       = FXCollections.observableArrayList();
    private final ObservableList<TileLoader> tileLoaders = FXCollections.observableArrayList();
    
    /**
     * Protected constructor from the abstract class {@code TileSet}.
     */
    protected TileSet() {
        this.initialize();
    }
    
    private void initialize() {
        this.configureTileLoaders();
        this.configureTiles();
        
        this.validate();
    }
    
    /**
     * With this method a developer can add a {@link com.github.naoghuman.lib.tile.core.Tile} 
     * to the supported list of {@code Tile}s in a concrete implementation from this abstract 
     * class.
     * <p>
     * This method should be normally used in the abstract method 
     * {@link com.github.naoghuman.lib.tile.core.TileSet#configureTiles()}.
     *
     * @param tile which should be added to the supported list of {@code Tile}s.
     * @see   com.github.naoghuman.lib.tile.core.Tile
     * @see   com.github.naoghuman.lib.tile.core.TileSet#configureTiles()
     */
    public void addTile(final Tile tile) {
        tiles.add(tile);
    }

    /**
     * With this method a developer can add a {@link com.github.naoghuman.lib.tile.core.TileLoader} 
     * to the supported list of {@code TileLoader}s in a concrete implementation from this abstract 
     * class.
     * <p>
     * This method should be normally used in the abstract method 
     * {@link com.github.naoghuman.lib.tile.core.TileSet#configureTileLoaders()}.
     *
     * @param tileLoader which should be added to the supported list of {@code TileLoader}s.
     * @see   com.github.naoghuman.lib.tile.core.TileLoader
     * @see   com.github.naoghuman.lib.tile.core.TileSet#configureTileLoaders()
     */
    public void addTileLoader(final TileLoader tileLoader) {
        tileLoaders.add(tileLoader);
    }
        
    /**
     * This abstract method allowed all child classes to defined the supported
     * {@link com.github.naoghuman.lib.tile.core.TileLoader}s.
     * <p>
     * A {@code TileLoader} can be added in this method with the method 
     * {@link com.github.naoghuman.lib.tile.core.TileLoader#addTileLoader(java.lang.com.github.naoghuman.lib.tile.core.TileLoader)}.
     * 
     * @see com.github.naoghuman.lib.tile.core.TileLoader#addTileLoader(java.lang.com.github.naoghuman.lib.tile.core.TileLoader)
     */
    protected abstract void configureTileLoaders();
    
    /**
     * This abstract method allowed all child classes to defined the supported
     * {@link com.github.naoghuman.lib.tile.core.Tile}s.
     * <p>
     * A {@code Tile} can be added in this method with the method 
     * {@link com.github.naoghuman.lib.tile.core.TileLoader#addTile(java.lang.com.github.naoghuman.lib.tile.core.Tile)}.
     * 
     * @see com.github.naoghuman.lib.tile.core.TileLoader#addTile(java.lang.com.github.naoghuman.lib.tile.core.Tile)
     */
    protected abstract void configureTiles();
    
    /**
     * Search and returnes the first {@link com.github.naoghuman.lib.tile.core.Tile}
     * with the given {@code title} wrapped in an {@link java.util.Optional}.
     * <p>
     * When no {@code Tile} with this title is found then {@link java.util.Optional#empty()} 
     * will be returned.
     * 
     * @param  title the search criteria
     * @return the {@code Tile} wrapped in an {@code Optional} or {@code Optional#empty()}}.
     * @see    com.github.naoghuman.lib.tile.core.Tile
     * @see    java.util.Optional
     * @see    java.util.Optional#empty()
     */
    public Optional<Tile> getTile(final String title) {
        final Optional<Tile> tile = tiles.stream()
                .filter(t -> t.getTitle().equals(title))
                .findFirst();
        
        return tile;
    }
    
    /**
     * Search and returnes the first {@link com.github.naoghuman.lib.tile.core.TileLoader}
     * which supports the given {@link com.github.naoghuman.lib.tile.core.Tile} wrapped in 
     * an {@link java.util.Optional}.
     * <p>
     * A {@code TileLoader} supports a {@code Tile} if
     * <ul>
     * <li>the {@code prefix} from the {@code Tile} is supported by the {@code TileLoader} and</li>
     * <li>the {@code scope} from both are equals</li>
     * </ul>
     * <p>
     * When no {@code TileLoader} is found then an {@link java.util.Optional#empty()} will 
     * be returned.
     * 
     * @param  tile the search criteria
     * @return the {@code TileLoader} wrapped in an {@code Optional} or {@code Optional#empty()}}.
     * @see    com.github.naoghuman.lib.tile.core.Tile
     * @see    com.github.naoghuman.lib.tile.core.Tile#getPrefix()
     * @see    com.github.naoghuman.lib.tile.core.Tile#getScope()
     * @see    com.github.naoghuman.lib.tile.core.TileLoader
     * @see    com.github.naoghuman.lib.tile.core.TileLoader#getPrefixes()
     * @see    com.github.naoghuman.lib.tile.core.TileLoader#getScope()
     * @see    java.util.Optional
     * @see    java.util.Optional#empty()
     */
    public Optional<TileLoader> getTileLoader(final Tile tile) {
        final Optional<TileLoader> tileLoader = tileLoaders.stream()
                .filter(tl -> tl.supports(tile))
                .findFirst();
        
        return tileLoader;
    }
    
    /**
     * Returnes all {@link com.github.naoghuman.lib.tile.core.Tile}s from this
     * {@code TileSet} as an {@link javafx.collections.ObservableList}.
     * <p>
     * The list from {@code Tile}s will be sorted by their {@code titles}.
     * 
     * @return all {@code Tile}s from this {@code TileSet}.
     * @see    com.github.naoghuman.lib.tile.core.Tile
     * @see    javafx.collections.ObservableList
     */
    public ObservableList<Tile> getTiles() {
        if (tiles.isEmpty()) {
            return tiles;
        }
        
        FXCollections.sort(tiles, (Tile tile1, Tile tile2) -> {
            return tile1.getTitle().compareTo(tile2.getTitle());
        });

        return tiles;
    }
    
    private void validate() {
        TileProvider.getDefault().getDefaultValidator().validate(tiles);
        TileProvider.getDefault().getDefaultValidator().validate(tileLoaders);
    }
    
}
