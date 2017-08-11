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
package com.github.naoghuman.lib.tile.internal;

import com.github.naoghuman.lib.tile.core.Tile;
import com.github.naoghuman.lib.tile.core.TileProvider;
import java.util.Optional;

/**
 * The default {@code Implementation} from the {@code Interface} 
 * {@link com.github.naoghuman.lib.tile.core.Tile}.
 * <p>
 * An instance from this class can be easily throw the class 
 * {@link com.github.naoghuman.lib.tile.core.TileProvider} generated which 
 * is the preferred way.
 *
 * @author Naoghuman
 * @since  0.2.0
 * @see    com.github.naoghuman.lib.tile.core.Tile
 * @see    com.github.naoghuman.lib.tile.core.TileProvider
 */
public class DefaultTile implements Tile {
    
    private static final String UNDEFINED = "[undefined]"; // NOI18N
    
    private final double height;
    private final double width;

    private final String autor;
    private final String autorUrl;
    private final String imageName;
    private final String scope;
    private final String title;
    
    /**
     * Creates a new instance from {@link com.github.naoghuman.lib.tile.core.Tile}
     * with the defined values.
     * <p>
     * The optional attributes {@code autor} and {@code autorURL} will returned 
     * {@link java.util.Optional#empty()} in this case.
     *
     * @param  scope defines the {@code scope} from the new {@code Tile}.
     * @param  imageName defines the {@code imageName} from the new {@code Tile}.
     * @param  title defines the {@code title} from the new {@code Tile}.
     * @param  width defines the {@code width} from the new {@code Tile}.
     * @param  height defines the {@code height} from the new {@code Tile}.
     * @see    com.github.naoghuman.lib.tile.core.Tile
     * @see    java.util.Optional#empty()
     */
    public DefaultTile(
            final String scope, final String imageName, final String title,
            final double width, final double height
    ) {
        this(scope, imageName, title, width, height, UNDEFINED, UNDEFINED);
    }
    
    /**
     * Creates a new instance from {@link com.github.naoghuman.lib.tile.core.Tile}
     * with the defined values.
     * <p>
     * The optional attribute {@code autorURL} will returned 
     * {@link java.util.Optional#empty()} in this case.
     * 
     * @param  scope defines the {@code scope} from the new {@code Tile}.
     * @param  imageName defines the {@code imageName} from the new {@code Tile}.
     * @param  title defines the {@code title} from the new {@code Tile}.
     * @param  width defines the {@code width} from the new {@code Tile}.
     * @param  height defines the {@code height} from the new {@code Tile}.
     * @param  autor defines the {@code autor} from the new {@code Tile}.
     * @see    com.github.naoghuman.lib.tile.core.Tile
     * @see    java.util.Optional#empty()
     */
    public DefaultTile(
            final String scope, final String imageName, final String title,
            final double width, final double height,    final String autor
    ) {
        this(scope, imageName, title, width, height, autor, UNDEFINED);
    }

    /**
     * Creates a new instance from {@link com.github.naoghuman.lib.tile.core.Tile}
     * with the defined values.
     *
     * @param  scope defines the {@code scope} from the new {@code Tile}.
     * @param  imageName defines the {@code imageName} from the new {@code Tile}.
     * @param  title defines the {@code title} from the new {@code Tile}.
     * @param  width defines the {@code width} from the new {@code Tile}.
     * @param  height defines the {@code height} from the new {@code Tile}.
     * @param  autor defines the {@code autor} from the new {@code Tile}.
     * @param  autorUrl defines the {@code autorUrl} from the new {@code Tile}.
     * @see    com.github.naoghuman.lib.tile.core.Tile
     */
    public DefaultTile(
            final String scope, final String imageName, final String title,
            final double width, final double height,    final String autor, 
            final String autorUrl
    ) {
        TileProvider.getDefault().getDefaultValidator().validate(scope);
        this.scope = scope;
        
        TileProvider.getDefault().getDefaultValidator().validate(imageName);
        this.imageName = imageName;
        
        TileProvider.getDefault().getDefaultValidator().validate(title);
        this.title = title;
        
        TileProvider.getDefault().getDefaultValidator().validate(width);
        this.width = width;
        
        TileProvider.getDefault().getDefaultValidator().validate(height);
        this.height = height;
        
        TileProvider.getDefault().getDefaultValidator().validate(autorUrl);
        this.autor = autor;
        
        TileProvider.getDefault().getDefaultValidator().validate(autorUrl);
        this.autorUrl = autorUrl;
    }

    @Override
    public Optional<String> getAutor() {
        return autor.equals(UNDEFINED) ? Optional.ofNullable(autor) : Optional.empty();
    }

    @Override
    public Optional<String> getAutorUrl() {
        return autorUrl.equals(UNDEFINED) ? Optional.ofNullable(autorUrl) : Optional.empty();
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
    public String getScope() {
        return scope;
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
        sb.append("scope=").append(this.getScope()); // NOI18N
        sb.append(", imageName=").append(this.getImageName()); // NOI18N
        sb.append(", title=").append(this.getTitle()); // NOI18N
        sb.append(", w=").append(this.getWidth()); // NOI18N
        sb.append(", h=").append(this.getHeight()); // NOI18N
        
        final Optional<String> optionalAutor = this.getAutor();
        if (optionalAutor.isPresent() && !optionalAutor.get().equals(UNDEFINED)) {
            sb.append(", autor=").append(optionalAutor.get()); // NOI18N
        }
        
        final Optional<String> optionalAutorUrl = this.getAutorUrl();
        if (optionalAutorUrl.isPresent() && !optionalAutorUrl.get().equals(UNDEFINED)) {
            sb.append(", autorUrl=").append(optionalAutorUrl.get()); // NOI18N
        }
                
        sb.append("]"); // NOI18N
        
        return sb.toString();
    }
    
}
