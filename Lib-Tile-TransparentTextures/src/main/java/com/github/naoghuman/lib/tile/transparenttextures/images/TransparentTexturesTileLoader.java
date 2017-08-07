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
package com.github.naoghuman.lib.tile.transparenttextures.images;

import com.github.naoghuman.lib.tile.core.Tile;
import com.github.naoghuman.lib.tile.core.TileLoader;
import java.util.Optional;

/**
 * The singleton <code>TransparentTexturesTileLoader</code> is a concrete implementation 
 * from the <code>Interface</code> {@link com.github.naoghuman.lib.tile.core.TileLoader}.
 * <p>
 * With this class it's possible to load a {@link com.github.naoghuman.lib.tile.core.Tile} 
 * (which is per definition a little transparent Image) from the enum 
 * {@link com.github.naoghuman.lib.tile.transparenttextures.TransparentTexturesTile} as a 
 * {@link javafx.scene.layout.Background} or an {@link javafx.scene.image.Image} with the 
 * help from {@link com.github.naoghuman.lib.tile.core.TileProvider#loadAsBackground(TileLoader, Tile)} 
 * or {@link com.github.naoghuman.lib.tile.core.TileProvider#loadAsImage(TileLoader, Tile)}.
 *
 * @author Naoghuman
 * @see com.github.naoghuman.lib.tile.core.Tile
 * @see com.github.naoghuman.lib.tile.core.TileLoader
 * @see com.github.naoghuman.lib.tile.core.TileProvider
 * @see com.github.naoghuman.lib.tile.transparenttextures.TransparentTexturesTile
 * @see javafx.scene.layout.Background
 * @see javafx.scene.image.Image
 */
public final class TransparentTexturesTileLoader extends TileLoader {
	
    private static final Optional<TransparentTexturesTileLoader> INSTANCE = Optional.of(new TransparentTexturesTileLoader());

    /**
     * Returns a singleton instance from the class <code>TransparentTexturesTileLoader</code>.
     * 
     * @return a singleton instance from the class <code>TransparentTexturesTileLoader</code>.
     */
    public static final TransparentTexturesTileLoader getDefault() {
        return INSTANCE.get();
    }

    private TransparentTexturesTileLoader() {
        super();
    }

    @Override
    protected void configurePrefixes() {
        super.addPrefix("tt-"); // NOI18N
    }

    @Override
    protected void configureScope() {
        super.setScope(this.getClass().getPackage().getName());
    }

}
