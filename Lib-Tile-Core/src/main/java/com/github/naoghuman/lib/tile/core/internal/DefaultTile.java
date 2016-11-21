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
package com.github.naoghuman.lib.tile.core.internal;

import com.github.naoghuman.lib.tile.core.Tile;
import com.github.naoghuman.lib.tile.core.TileProvider;

/**
 *
 * @author Naoghuman
 */
public class DefaultTile implements Tile {
    
    private final double height;
    private final double width;

    private final String autor;
    private final String autorUrl;
    private final String imageName;
    private final String title;
    
    /**
     *
     * @param imageName
     * @param title
     * @param width
     * @param height
     * @param autor
     */
    public DefaultTile(
            final String imageName, final String title,
            final double width, final double height,
            final String autor
    ) {
        this(imageName, title, width, height, autor, ""); // NOI18N
    }

    /**
     *
     * @param imageName
     * @param title
     * @param width
     * @param height
     * @param autor
     * @param autorUrl
     */
    public DefaultTile(
            final String imageName, final String title,
            final double width, final double height,
            final String autor, final String autorUrl
    ) {
        TileProvider.getDefault().getDefaultTileValidator().validate(imageName);
        this.imageName = imageName;
        
        TileProvider.getDefault().getDefaultTileValidator().validate(title);
        this.title = title;
        
        TileProvider.getDefault().getDefaultTileValidator().validate(width);
        this.width = width;
        
        TileProvider.getDefault().getDefaultTileValidator().validate(height);
        this.height = height;
        
        this.autor = autor;
        this.autorUrl = autorUrl;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public String getAutorUrl() {
        return autorUrl;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public String getImageName() {
        return imageName;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Tile ["); // NOI18N
        sb.append("imageName=").append(this.getImageName()); // NOI18N
        sb.append(", "); // NOI18N
        sb.append("title=").append(this.getTitle()); // NOI18N
        sb.append(", "); // NOI18N
        sb.append("w=").append(this.getWidth()); // NOI18N
        sb.append(", "); // NOI18N
        sb.append("h=").append(this.getHeight()); // NOI18N
        sb.append(", "); // NOI18N
        sb.append("autor=").append(this.getAutor()); // NOI18N
        
        final String autorUrl = this.getAutorUrl();
        if (
                (autorUrl != null)
                && (!autorUrl.isEmpty())
        ) {
            sb.append(", "); // NOI18N
            sb.append("autorUrl=").append(autorUrl); // NOI18N
        }
                
        sb.append("]"); // NOI18N
        
        return sb.toString();
    }
    
}
