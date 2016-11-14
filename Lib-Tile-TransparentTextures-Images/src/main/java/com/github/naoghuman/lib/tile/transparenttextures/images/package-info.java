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

/**
 * The main functionality from this package is to allowed the developer to load 
 * a {@link com.github.naoghuman.lib.tile.core.Tile} from the enum 
 * {@link com.github.naoghuman.lib.tile.transparenttextures.TransparentTexturesTile} 
 * as a {@link javafx.scene.layout.Background} or an {@link javafx.scene.image.Image}.
 * <p />
 * The class {@link com.github.naoghuman.lib.tile.transparenttextures.images.TransparentTexturesTileLoader}
 * should be used as a concrete implementation from the <code>Interface</code>
 * {@link com.github.naoghuman.lib.tile.core.TileLoader} to load the <code>Tile</code>
 * with the help from {@link com.github.naoghuman.lib.tile.core.TileProvider#loadAsBackground(TileLoader, Tile)} 
 * or {@link com.github.naoghuman.lib.tile.core.TileProvider#loadAsImage(TileLoader, Tile)}.
 *
 * @see com.github.naoghuman.lib.tile.core.Tile
 * @see com.github.naoghuman.lib.tile.core.TileLoader
 * @see com.github.naoghuman.lib.tile.core.TileProvider
 * @see com.github.naoghuman.lib.tile.transparenttextures.TransparentTexturesTile
 * @see com.github.naoghuman.lib.tile.transparenttextures.images.TransparentTexturesTileLoader
 */
package com.github.naoghuman.lib.tile.transparenttextures.images;