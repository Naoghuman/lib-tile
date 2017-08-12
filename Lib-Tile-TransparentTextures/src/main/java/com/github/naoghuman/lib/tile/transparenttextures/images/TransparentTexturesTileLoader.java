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

import com.github.naoghuman.lib.tile.core.TileLoader;
import java.util.Optional;

/**
 * The class {@code TransparentTexturesTileLoader} allowed to load a
 * {@link com.github.naoghuman.lib.tile.core.Tile} with the help from the class
 * {@link com.github.naoghuman.lib.tile.core.TileProvider}.
 * <p>
 * A {@code TileLoader} supports a {@code Tile} if gollowing conditions are true:
 * <ul>
 * <li>If the {@code scope} from both ({@code Tile} and {@code TileLoader}) are equals.</li>
 * <li>If this {@code TileLoader} supports the {@code prefix} from the {@code Tile}.</li>
 * </ul>
 * 
 * @author Naoghuman
 * @since 0.2.0
 * @see com.github.naoghuman.lib.tile.core.Tile
 * @see com.github.naoghuman.lib.tile.core.TileLoader
 * @see com.github.naoghuman.lib.tile.core.TileProvider
 */
public final class TransparentTexturesTileLoader extends TileLoader {
	
    private static final Optional<TransparentTexturesTileLoader> INSTANCE = Optional.of(new TransparentTexturesTileLoader());

    /**
     * Returns a singleton instance from the class {@code TransparentTexturesTileLoader}.
     * 
     * @return a singleton instance from this class.
     */
    public static final TransparentTexturesTileLoader getDefault() {
        return INSTANCE.get();
    }

    private TransparentTexturesTileLoader() {
        super();
    }

    @Override
    protected void configurePrefixes() {
        super.addPrefix("tt-"); // NOI18N
    }

    @Override
    protected void configureScope() {
        super.setScope(this.getClass().getPackage().getName());
    }

}
