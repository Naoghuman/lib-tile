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

import javafx.scene.image.Image;
import javafx.scene.layout.Background;

/**
 * This interface defines the minimal functionalities which should be supported 
 * by an <code>AbstractTileLoader</code>. With a concrete implementation from 
 * this <code>Interface</code> a developer is then be able to load a 
 * {@link com.github.naoghuman.lib.tile.core.Tile} as a 
 * {@link javafx.scene.layout.Background} or an {@link javafx.scene.image.Image}.
 *
 * @author Naoghuman
 * @see com.github.naoghuman.lib.tile.core.Tile
 * @see javafx.scene.layout.Background
 * @see javafx.scene.image.Image
 */
public interface AbstractTileLoader {

    /**
     * The parameter <code>prefix</code> defines if the 
     * {@link com.github.naoghuman.lib.tile.core.Tile} is supported by this 
     * <code>AbstractTileLoader</code> or not.
     *
     * @return the prefix which defines if the {@link com.github.naoghuman.lib.tile.core.Tile} 
     * is supported or not by this <code>AbstractTileLoader</code>.
     * @see com.github.naoghuman.lib.tile.core.Tile
     */
    public String getPrefix();

    /**
     * Checks the given {@link com.github.naoghuman.lib.tile.core.Tile} if it's 
     * supported by this <code>AbstractTileLoader</code>.
     * 
     * @param tile the {@link com.github.naoghuman.lib.tile.core.Tile} which should 
     * be checked if it's supported by this <code>AbstractTileLoader</code> or not.
     * @return <code>true</code> if the {@link com.github.naoghuman.lib.tile.core.Tile} 
     * is supported by this <code>AbstractTileLoader</code>, otherwise <code>false</code>.
     * @see com.github.naoghuman.lib.tile.core.Tile
     */
    public boolean isSupported(Tile tile);

    /**
     * Loads an {@link javafx.scene.image.Image} with a concrete implementation 
     * from this <code>Interface</code> and the given {@link com.github.naoghuman.lib.tile.core.Tile}. 
     * Then the {@link javafx.scene.image.Image} will be converted to a 
     * {@link javafx.scene.layout.Background} and returned.
     * <p />
     * This method delegates to the method 
     * {@link com.github.naoghuman.lib.tile.core.DefaultTileLoader#loadAsBackground(AbstractTileLoader, Tile)}
     * with the concrete implementation from an <code>AbstractTileLoader</code>.<br />
     * See for example the method 
     * {@link com.github.naoghuman.lib.tile.transparenttextures.images.TransparentTexturesTileLoader#loadAsBackground(Tile)} 
     * in the library <code>Lib-Tile-TransparentTextures-Images</code>.
     * 
     * @param tile the {@link com.github.naoghuman.lib.tile.core.Tile} which 
     * should be loaded as a {@link javafx.scene.layout.Background}.
     * @return the loaded {@link javafx.scene.layout.Background}.
     * @see com.github.naoghuman.lib.tile.core.DefaultTileLoader#loadAsBackground(AbstractTileLoader, Tile)
     * @see com.github.naoghuman.lib.tile.core.Tile
     * @see com.github.naoghuman.lib.tile.transparenttextures.images.TransparentTexturesTileLoader#loadAsBackground(Tile)
     * @see javafx.scene.layout.Background
     * @see javafx.scene.image.Image
     */
    public Background loadAsBackground(Tile tile);
    
    /**
     * Loads an {@link javafx.scene.image.Image} with a concrete implementation 
     * from this <code>Interface</code> and the given {@link com.github.naoghuman.lib.tile.core.Tile}.
     * <p />
     * This method delegates to the method 
     * {@link com.github.naoghuman.lib.tile.core.DefaultTileLoader#loadAsImage(AbstractTileLoader, Tile)}
     * with the concrete implementation from an <code>AbstractTileLoader</code>.<br />
     * See for example the method 
     * {@link com.github.naoghuman.lib.tile.transparenttextures.images.TransparentTexturesTileLoader#loadAsImage(Tile)}
     * in the library <code>Lib-Tile-TransparentTextures-Images</code>.
     * 
     * @param tile the {@link com.github.naoghuman.lib.tile.core.Tile} which 
     * should be loaded as a {@link javafx.scene.image.Image}.
     * @return the loaded {@link javafx.scene.image.Image}.
     * @see com.github.naoghuman.lib.tile.core.DefaultTileLoader#loadAsImage(AbstractTileLoader, Tile)
     * @see com.github.naoghuman.lib.tile.core.Tile
     * @see com.github.naoghuman.lib.tile.transparenttextures.images.TransparentTexturesTileLoader#loadAsImage(Tile)
     * @see javafx.scene.image.Image
     */
    public Image loadAsImage(Tile tile);
    
}
