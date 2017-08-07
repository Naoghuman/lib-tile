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
package com.github.naoghuman.lib.tile.customized.examples.reducedtileset;

import com.github.naoghuman.lib.tile.core.TileSet;
import com.github.naoghuman.lib.tile.transparenttextures.TransparentTexturesTileSet;
import com.github.naoghuman.lib.tile.transparenttextures.images.TransparentTexturesTileLoader;
import java.util.Optional;

/**
 * 
 * @author Naoghuman
 */
public final class CustomizedExampleReducedTileSet extends TileSet {
    
    private static final Optional<CustomizedExampleReducedTileSet> instance = Optional.of(new CustomizedExampleReducedTileSet());

    /**
     * Returns a singleton instance from the class <code>CustomizedExampleReducedTileSet</code>.
     * 
     * @return a singleton instance from the class <code>CustomizedExampleReducedTileSet</code>.
     */
    public static final CustomizedExampleReducedTileSet getDefault() {
        return instance.get();
    }

    private CustomizedExampleReducedTileSet() {
        super();
    }

    @Override
    protected void configureTileLoaders() {
        super.addTileLoader(TransparentTexturesTileLoader.getDefault());
    }

    @Override
    protected void configureTiles() {
        super.addTile(TransparentTexturesTileSet.TT_3PX_TILE);
        super.addTile(TransparentTexturesTileSet.TT_60_LINES);
        super.addTile(TransparentTexturesTileSet.TT_ARCHES);
    }

}
