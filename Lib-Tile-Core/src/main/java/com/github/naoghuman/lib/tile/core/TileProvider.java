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

import com.github.naoghuman.lib.tile.internal.DefaultTile;
import com.github.naoghuman.lib.tile.internal.DefaultTileValidator;
import java.net.URI;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;

/**
 * The singleton {@code TileProvider} allowed the developer access to all relevant 
 * methods in context from the {@code API} from the library {@code Lib-Tile-Core}.
 * <p>
 * For example with the methods {@code getDefaultTile(XY)} a concrete instance from 
 * the {@code Inteface} {@link com.github.naoghuman.lib.tile.core.Tile} can be created.
 * <br>
 * With the method {@code getDefaultValidator()} the developer have access to a 
 * default implementation from the {@code Inteface} 
 * {@link com.github.naoghuman.lib.tile.core.TileValidator}.
 *
 * @author Naoghuman
 * @since  0.2.0
 * @see    com.github.naoghuman.lib.tile.core.Tile
 * @see    com.github.naoghuman.lib.tile.core.TileValidator
 */
public final class TileProvider {

    private static final Optional<TileProvider> instance = Optional.of(new TileProvider());

    /**
     * Returns a singleton instance from the class {@code TileProvider}.
     *
     * @return a singleton instance from this class.
     */
    public static final TileProvider getDefault() {
        return instance.get();
    }

    private TileProvider() {

    }
    
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
     * @return a new {@code Tile} with the specified values.
     * @see    com.github.naoghuman.lib.tile.core.Tile
     * @see    java.util.Optional#empty()
     */
    public Tile getDefaultTile(
            final String scope, final String imageName, final String title,
            final double width, final double height
    ) {
        return new DefaultTile(scope, imageName, title, width, height);
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
     * @return a new {@code Tile} with the specified values.
     * @see    com.github.naoghuman.lib.tile.core.Tile
     * @see    java.util.Optional#empty()
     */
    public Tile getDefaultTile(
            final String scope, final String imageName, final String title,
            final double width, final double height,    final String autor
    ) {
        return new DefaultTile(scope, imageName, title, width, height, autor);
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
     * @return a new {@code Tile} with the specified values.
     * @see    com.github.naoghuman.lib.tile.core.Tile
     */
    public Tile getDefaultTile(
            final String scope,  final String imageName, final String title,
            final double width, final double height,     final String autor, 
            final String autorUrl
    ) {
        return new DefaultTile(scope, imageName, title, width, height, autor, autorUrl);
    }

    /**
     * This method returns a concrete implementation from the {@code Interface} 
     * {@link com.github.naoghuman.lib.tile.core.TileValidator}.
     * <p>
     * The validator can then be used to validate for example if a {@link java.lang.Double} 
     * is greater then {@code 0.0d} or if a {@link java.lang.String} isn't {@code NULL} or 
     * {@code EMPTY}.
     *
     * @return a concrete implementation from the {@code Interface}
     *         {@link com.github.naoghuman.lib.tile.core.validator.TileValidator}.
     * @see    com.github.naoghuman.lib.tile.core.TileValidator
     * @see    com.github.naoghuman.lib.tile.internal.DefaultTileValidator
     */
    public TileValidator getDefaultValidator() {
        return DefaultTileValidator.getDefault();
    }

    /**
     * Loads the given {@link com.github.naoghuman.lib.tile.core.Tile} with the
     * {@link com.github.naoghuman.lib.tile.core.TileLoader} as an
     * {@link javafx.scene.image.Image} which will be converted to a
     * {@link javafx.scene.layout.Background}.
     * 
     * @param  tileLoader loads the given {@link com.github.naoghuman.lib.tile.core.Tile} 
     *         as an {@link javafx.scene.image.Image} which will then be converted to a 
     *         {@link javafx.scene.layout.Background}.
     * @param  tile the {@link com.github.naoghuman.lib.tile.core.Tile} which should be 
     *         loaded as a {@link javafx.scene.layout.Background}.
     * @return the loaded {@link javafx.scene.layout.Background}.
     * @see    com.github.naoghuman.lib.tile.core.TileLoader
     * @see    com.github.naoghuman.lib.tile.core.Tile
     * @see    javafx.scene.layout.Background
     * @see    javafx.scene.image.Image
     */
    public Optional<Background> loadAsBackground(final TileLoader tileLoader, final Tile tile) {
        Optional<Background> background = Optional.empty();
        final Optional<Image> image = TileProvider.getDefault().loadAsImage(tileLoader, tile);
        if (image.isPresent()) {
            final BackgroundSize backgroundSize = new BackgroundSize(
                    tile.getWidth(), tile.getHeight(),
                    false, false, false, false);
            final BackgroundImage backgroundImage = new BackgroundImage(
                    image.get(), BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT,
                    BackgroundPosition.CENTER, backgroundSize);
            background = Optional.ofNullable(new Background(backgroundImage));
        }
        
        return background;
    }

    /**
     * Loads the given {@link com.github.naoghuman.lib.tile.core.Tile} with the
     * {@link com.github.naoghuman.lib.tile.core.TileLoader} as an 
     * {@link javafx.scene.image.Image}.
     *
     * @param  tileLoader loads the given {@link com.github.naoghuman.lib.tile.core.Tile} 
     *         as an {@link javafx.scene.image.Image}.
     * @param  tile the {@link com.github.naoghuman.lib.tile.core.Tile} which should be 
     *         loaded as an {@link javafx.scene.image.Image}.
     * @return the loaded {@link javafx.scene.image.Image}.
     * @see    com.github.naoghuman.lib.tile.core.Tile
     * @see    com.github.naoghuman.lib.tile.core.TileLoader
     * @see    com.github.naoghuman.lib.tile.core.TileValidator
     * @see    javafx.scene.image.Image
     */
    public Optional<Image> loadAsImage(final TileLoader tileLoader, final Tile tile) {
        if (!tileLoader.supports(tile)) {
            throw new UnsupportedOperationException(
                    "The TileLoader [" + tileLoader.getClass().getName() // NOI18N
                    + "] doesn't support the Tile [" + tile.toString() + "]"); // NOI18N
        }
        
        Optional<Image> image = Optional.empty();
        try {
            final String imageName = tile.getImageName();
            final URI uri = tileLoader.getClass().getResource(imageName).toURI();
            
            final double width = tile.getWidth();
            final double height = tile.getHeight();
            image = Optional.ofNullable(new Image(uri.toString(), width, height, true, true));
        } catch (Exception ex) {
            Logger.getLogger(TileProvider.class.getName()).log(Level.SEVERE,
                    "Can't load Tile image [" + tile.toString()+ "]\n" // NOI18N
                            + "with TileLoader [" + tileLoader.toString() + "]", ex); // NOI18N
        }

        return image;
    }

}
