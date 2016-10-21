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
 * The singleton <code>DefaultTileLoader</code> allowed the developer to load a
 * {@link com.github.naoghuman.lib.tile.core.Tile} (which is per definition a
 * little transparent Image) as a {@link javafx.scene.layout.Background} or an
 * {@link javafx.scene.image.Image} with a concrete implementation from an
 * {@link com.github.naoghuman.lib.tile.core.AbstractTileLoader}.
 *
 * @author Naoghuman
 * @see com.github.naoghuman.lib.tile.core.AbstractTileLoader
 * @see com.github.naoghuman.lib.tile.core.Tile
 * @see javafx.scene.layout.Background
 * @see javafx.scene.image.Image
 */
public final class DefaultTileLoader {

    private static final Optional<DefaultTileLoader> instance = Optional.of(new DefaultTileLoader());

    /**
     * Returns a singleton instance from the class <code>DefaultTileLoader</code>.
     *
     * @return a singleton instance from the class
     * <code>DefaultTileLoader</code>.
     */
    public static final DefaultTileLoader getDefault() {
        return instance.get();
    }

    private DefaultTileLoader() {

    }

    /**
     * This method checks the parameters 'width' and 'height'.
     *
     * @param width which must be (width > 0.0d).
     * @param height which must be (height > 0.0d).
     * @throws IllegalArgumentException if (width <= 0.0d || height <= 0.0d)
     */
    private void checkParameterDimension(final double width, final double height) throws IllegalArgumentException {
        if (width <= 0.0d) {
            throw new IllegalArgumentException("The parameter 'width' can't <= 0.0d"); // NOI18N
        }

        if (height <= 0.0d) {
            throw new IllegalArgumentException("The parameter 'height' can't <= 0.0d"); // NOI18N
        }
    }

    /**
     * This method checks the parameter 'imageName'.
     *
     * @param imageName which must be (imageName != NULL &&
     * !imageName.trim().isEmpty()).
     * @throws NullPointerException if (imageName == null)
     * @throws IllegalArgumentException if (imageName.trim().isEmpty())
     */
    private void checkParameterImageName(final String imageName) throws NullPointerException, IllegalArgumentException {
        if (imageName == null) {
            throw new NullPointerException("The parameter 'imageName' can't be NULL"); // NOI18N
        }

        if (imageName.trim().isEmpty()) {
            throw new IllegalArgumentException("The parameter 'imageName' can't be EMPTY"); // NOI18N
        }
    }

    /**
     * This method checks the parameter 'title'.
     *
     * @param title which must be (title != NULL && !title.trim().isEmpty()).
     * @throws NullPointerException if (title == null)
     * @throws IllegalArgumentException if (title.trim().isEmpty())
     */
    private void checkParameterTitle(final String title) throws NullPointerException, IllegalArgumentException {
        if (title == null) {
            throw new NullPointerException("The parameter 'title' can't be NULL"); // NOI18N
        }

        if (title.trim().isEmpty()) {
            throw new IllegalArgumentException("The parameter 'title' can't be EMPTY"); // NOI18N
        }
    }

    /**
     * Loads the given {@link com.github.naoghuman.lib.tile.core.Tile} with the
     * {@link com.github.naoghuman.lib.tile.core.AbstractTileLoader} as an
     * {@link javafx.scene.image.Image} which will be converted to a
     * {@link javafx.scene.layout.Background}.
     * <p />
     * Internal following checks will be performed:
     * <ul>
     * <li>Checks if the
     * {@link com.github.naoghuman.lib.tile.core.AbstractTileLoader} supports
     * the {@link com.github.naoghuman.lib.tile.core.Tile}. If not an
     * {@link java.lang.UnsupportedOperationException} is thrown.</li>
     * <li>Checks if the parameters 'width' and 'height' from the
     * <code>Tile</code> is greater then 0.0d. If not the a
     * IllegalArgumentException will be thrown.</li>
     * <li>Checks if the parameter 'imageName' from the <code>Tile</code> is not
     * NULL and not empty. Throws otherwise a NullPointerException or a
     * IllegalArgumentException.</li>
     * <li>Checks if the parameter 'title' from the <code>Tile</code> is not
     * NULL and not empty. Throws otherwise a NullPointerException or a
     * IllegalArgumentException.</li>
     * </ul>
     *
     * @param loader loads the given
     * {@link com.github.naoghuman.lib.tile.core.Tile} as an
     * {@link javafx.scene.image.Image} which will then be converted to a
     * {@link javafx.scene.layout.Background}.
     * @param tile the {@link com.github.naoghuman.lib.tile.core.Tile} which
     * should be loaded as a {@link javafx.scene.layout.Background}.
     * @return the loaded {@link javafx.scene.layout.Background}.
     * @see com.github.naoghuman.lib.tile.core.AbstractTileLoader
     * @see com.github.naoghuman.lib.tile.core.Tile
     * @see javafx.scene.layout.Background
     * @see javafx.scene.image.Image
     * @see #checkParameterDimension(double, double)
     * @see #checkParameterImageName(java.lang.String)
     * @see #checkParameterTitle(java.lang.String)
     */
    public Background loadAsBackground(final AbstractTileLoader loader, final Tile tile) {
        final Image overlay = DefaultTileLoader.getDefault().loadAsImage(loader, tile);
        final BackgroundSize backgroundSize = new BackgroundSize(tile.getWidth(), tile.getHeight(),
                false, false, false, false);
        final BackgroundImage backgroundImage = new BackgroundImage(overlay, BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT, BackgroundPosition.CENTER, backgroundSize);
        final Background background = new Background(backgroundImage);

        return background;
    }

    /**
     * Loads the given {@link com.github.naoghuman.lib.tile.core.Tile} with the
     * {@link com.github.naoghuman.lib.tile.core.AbstractTileLoader} as an
     * {@link javafx.scene.image.Image}.
     * <p />
     * Internal following checks will be performed:
     * <ul>
     * <li>Checks if the
     * {@link com.github.naoghuman.lib.tile.core.AbstractTileLoader} supports
     * the {@link com.github.naoghuman.lib.tile.core.Tile}. If not an
     * {@link java.lang.UnsupportedOperationException} is thrown.</li>
     * <li>Checks if the parameters 'width' and 'height' from the
     * <code>Tile</code> is greater then 0.0d. If not the a
     * IllegalArgumentException will be thrown.</li>
     * <li>Checks if the parameter 'imageName' from the <code>Tile</code> is not
     * NULL and not empty. Throws otherwise a NullPointerException or a
     * IllegalArgumentException.</li>
     * <li>Checks if the parameter 'title' from the <code>Tile</code> is not
     * NULL and not empty. Throws otherwise a NullPointerException or a
     * IllegalArgumentException.</li>
     * </ul>
     *
     * @param loader loads the given
     * {@link com.github.naoghuman.lib.tile.core.Tile} as an
     * {@link javafx.scene.image.Image}.
     * @param tile the {@link com.github.naoghuman.lib.tile.core.Tile} which
     * should be loaded as an {@link javafx.scene.image.Image}.
     * @return the loaded {@link javafx.scene.image.Image}.
     * @see com.github.naoghuman.lib.tile.core.AbstractTileLoader
     * @see com.github.naoghuman.lib.tile.core.Tile
     * @see javafx.scene.image.Image
     * @see #checkParameterDimension(double, double)
     * @see #checkParameterImageName(java.lang.String)
     * @see #checkParameterTitle(java.lang.String)
     */
    public Image loadAsImage(final AbstractTileLoader loader, final Tile tile) {
        if (!loader.isSupported(tile)) {
            throw new UnsupportedOperationException(
                    "The tile-loader '" + loader.getClass().getName() // NOI18N
                    + "' doesn't support the Tile: " + tile.toString()); // NOI18N
        }

        try {
            final String imageName = tile.getImageName();
            DefaultTileLoader.getDefault().checkParameterImageName(imageName);

            final String title = tile.getTitle();
            DefaultTileLoader.getDefault().checkParameterTitle(title);

            final double width = tile.getWidth();
            final double height = tile.getHeight();
            DefaultTileLoader.getDefault().checkParameterDimension(width, height);
        } catch (NullPointerException | IllegalArgumentException ex) {
            Logger.getLogger(DefaultTileLoader.class.getName()).log(Level.SEVERE,
                    "Given Tile isn't valid: " + tile.toString(), ex);
        }

        Image img = null;
        try {
            final URI uri = loader.getClass().getResource(tile.getImageName()).toURI();
            img = new Image(uri.toString(), tile.getWidth(), tile.getHeight(), true, true);
        } catch (Exception ex) {
            Logger.getLogger(DefaultTileLoader.class.getName()).log(Level.SEVERE,
                    "Can't load Tile: " + tile.toString(), ex);
        }

        return img;
    }

}
