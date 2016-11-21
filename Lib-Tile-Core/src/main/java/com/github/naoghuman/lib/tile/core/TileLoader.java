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

/**
 * This interface defines the minimal functionalities which should be supported
 * by a <code>TileLoader</code>. With a concrete implementation from this
 * <code>Interface</code> it's then be possible to load a
 * {@link com.github.naoghuman.lib.tile.core.Tile} (which is per definition a
 * little transparent Image) as a {@link javafx.scene.layout.Background} or an
 * {@link javafx.scene.image.Image}.
 *
 * @author Naoghuman
 * @see com.github.naoghuman.lib.tile.core.Tile
 * @see javafx.scene.layout.Background
 * @see javafx.scene.image.Image
 */
public interface TileLoader {

    /**
     * With the parameter <code>prefix</code> a concrete implementation from this 
     * <code>Interface</code> defines if a given {@link com.github.naoghuman.lib.tile.core.Tile} 
     * is supported by this <code>TileLoader</code> or not.
     *
     * @return the prefix which defines if the {@link com.github.naoghuman.lib.tile.core.Tile} 
     * is supported or not by this <code>TileLoader</code>.
     * @see com.github.naoghuman.lib.tile.core.Tile
     */
    public String getPrefix();

    /**
     * Checks the given {@link com.github.naoghuman.lib.tile.core.Tile} if it's
     * supported by this <code>TileLoader</code>.
     *
     * @param tile the {@link com.github.naoghuman.lib.tile.core.Tile} which should be 
     * checked if it's supported by this <code>TileLoader</code> or not.
     * @return <code>true</code> if the {@link com.github.naoghuman.lib.tile.core.Tile} 
     * is supported by this <code>TileLoader</code>, otherwise <code>false</code>.
     * @see com.github.naoghuman.lib.tile.core.Tile
     */
    public boolean isSupported(Tile tile);

}
