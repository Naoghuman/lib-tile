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

import com.github.naoghuman.lib.tile.core.TileValidator;
import java.util.Optional;

/**
 * A concrete implementation from the {@code Interface}
 * {@link com.github.naoghuman.lib.tile.core.validator.TileValidator}.
 * <p>
 * The acces over {@link com.github.naoghuman.lib.tile.core.TileProvider#getDefaultTileValidator()}
 * is preferred instead the directly instanziation from this class.
 *
 * @author Naoghuman
 * @since  0.2.0
 * @see    com.github.naoghuman.lib.tile.core.TileProvider#getDefaultTileValidator()
 * @see    com.github.naoghuman.lib.tile.core.TileValidator
 */
public final class DefaultTileValidator implements TileValidator {

    private static final Optional<DefaultTileValidator> instance = Optional.of(new DefaultTileValidator());

    /**
     * Returns a singleton instance from the class {@code DefaultTileValidator}.
     *
     * @return a singleton instance from this class.
     */
    public static final DefaultTileValidator getDefault() {
        return instance.get();
    }

    private DefaultTileValidator() {

    }

    @Override
    public void validate(double value) throws IllegalArgumentException {
        if (value <= 0.0d) {
            throw new IllegalArgumentException("The value can't <= 0.0d"); // NOI18N
        }
    }

}
