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

import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import com.github.naoghuman.lib.tile.core.Tile;
import com.github.naoghuman.lib.tile.core.AbstractTileLoader;
import com.github.naoghuman.lib.tile.core.DefaultTileLoader;
import java.util.Optional;

/**
 * The singleton <code>TransparentTexturesTileLoader</code> is a concrete implementation 
 * from the interface {@link com.github.naoghuman.lib.tile.core.AbstractTileLoader}.
 * <p />
 * With this class it's possible to load a {@link com.github.naoghuman.lib.tile.core.Tile} 
 * (which is per definition a little transparent Image) from the enum 
 * {@link com.github.naoghuman.lib.tile.transparenttextures.TransparentTexturesTile} as a 
 * {@link javafx.scene.layout.Background} or an {@link javafx.scene.image.Image}.
 *
 * @author Naoghuman
 * @see com.github.naoghuman.lib.tile.core.AbstractTileLoader
 * @see com.github.naoghuman.lib.tile.core.Tile
 * @see com.github.naoghuman.lib.tile.transparenttextures.TransparentTexturesTile
 * @see javafx.scene.layout.Background
 * @see javafx.scene.image.Image
 */
public final class TransparentTexturesTileLoader implements AbstractTileLoader {
	
    private static final Optional<TransparentTexturesTileLoader> instance = Optional.of(new TransparentTexturesTileLoader());

    /**
     * Returns a singleton instance from the class <code>TransparentTexturesTileLoader</code>.
     * 
     * @return a singleton instance from the class <code>TransparentTexturesTileLoader</code>.
     */
    public static final TransparentTexturesTileLoader getDefault() {
        return instance.get();
    }

    private TransparentTexturesTileLoader() {

    }

    @Override
    public String getPrefix() {
        return "tt-"; // NOI18N
    }

    @Override
    public boolean isSupported(final Tile tile) {
        final String name = tile.getImageName();
        final boolean isSupported = 
                (name != null)
                && (!name.trim().isEmpty())
                && (name.startsWith(this.getPrefix()));

        return isSupported;
    }

    @Override
    public Background loadAsBackground(final Tile tile) {
        return DefaultTileLoader.getDefault().loadAsBackground(TransparentTexturesTileLoader.getDefault(), tile);
    }

    @Override
    public Image loadAsImage(final Tile tile) {
        return DefaultTileLoader.getDefault().loadAsImage(TransparentTexturesTileLoader.getDefault(), tile);
    }

}
