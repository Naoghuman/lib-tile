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
 * This package contains the main <code>API</code> from the library <code>Lib-Core</code>.
 * <p />
 * With this <code>Classes</code> and <code>Interfaces</code> the developer can load a 
 * {@link com.github.naoghuman.lib.tile.core.Tile} (which is per definition a little 
 * transparent Image) as a {@link javafx.scene.layout.Background} or an 
 * {@link javafx.scene.image.Image}.
 * <p />
 * Main point for access the functionalities from this library is the class 
 * {@link com.github.naoghuman.lib.tile.core.TileProvider}. For example with the method 
 * {@link com.github.naoghuman.lib.tile.core.TileProvider#loadAsBackground(TileLoader, Tile)} 
 * the developer can load the <code>Tile</code> as an {@link javafx.scene.layout.Background}.
 * 
 * @see com.github.naoghuman.lib.tile.core.TileLoader
 * @see com.github.naoghuman.lib.tile.core.TileProvider
 * @see com.github.naoghuman.lib.tile.core.Tile
 * @see javafx.scene.layout.Background
 * @see javafx.scene.image.Image
 */
package com.github.naoghuman.lib.tile.core;