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
 * A <code>Tile</code> is per definition a little transparent
 * {@link javafx.scene.image.Image} which overlay a background color or an
 * {@link javafx.scene.image.Image} with the help of repetitions from the
 * {@link javafx.scene.image.Image} in a layer.
 *
 * @author Naoghuman
 * @see javafx.scene.image.Image
 */
public interface Tile {

    /**
     * The autor is the creator from the <code>Tile</code>.
     * <p />
     * This parameter is optional. If this parameter is NULL or empty then the
     * parameter <code>autorUrl</code> won't be evaluated.
     *
     * @return the autor from the <code>Tile</code>.
     * @see #getAutorUrl()
     */
    public String getAutor();

    /**
     * The autor url from the <code>Tile</code>.
     * <p />
     * This parameter is optional. If the parameter <code>autor</code> is NULL
     * or empty then this parameter won't be evaluated.
     *
     * @return the autor url from the <code>Tile</code>.
     * @see #getAutor()
     */
    public String getAutorUrl();

    /**
     * The height from a single <code>Tile</code> image.
     * <p />
     * This parameter can't be <= 0.0d.
     *
     * @return the height from a single <code>Tile</code> image.
     */
    public double getHeight();

    /**
     * The image name from the <code>Tile</code>.
     * <p />
     * This parameter can't be NULL or empty.
     *
     * @return the image name from the <code>Tile</code>.
     */
    public String getImageName();

    /**
     * The title from the <code>Tile</code>.
     * <p />
     * This parameter can't be NULL or empty.
     *
     * @return the title from the <code>Tile</code>.
     */
    public String getTitle();

    /**
     * The width from a single <code>Tile</code> image.
     * <p />
     * This parameter can't be <= 0.0d.
     *
     * @return the width from a single <code>Tile</code> image.
     */
    public double getWidth();

}
