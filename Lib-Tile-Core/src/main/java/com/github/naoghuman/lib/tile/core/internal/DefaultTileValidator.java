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

import com.github.naoghuman.lib.tile.core.TileValidator;
import java.util.Optional;

/**
 * A concrete implementation from the <code>Interface</code>
 * {@link com.github.naoghuman.lib.tile.core.validator.TileValidator} which can
 * be used to validate a) is a {@link java.lang.Double} greater then 0.0d or b)
 * if a {@link java.lang.String} isn't NULL or EMPTY.
 * <p />
 * The class can be accessed over
 * {@link com.github.naoghuman.lib.tile.core.TileProvider#getDefaultTileValidator()}.
 *
 * @author Naoghuman
 * @see com.github.naoghuman.lib.tile.core.TileProvider#getDefaultTileValidator()
 * @see com.github.naoghuman.lib.tile.core.TileValidator
 */
public final class DefaultTileValidator implements TileValidator {

    private static final Optional<DefaultTileValidator> instance = Optional.of(new DefaultTileValidator());

    /**
     * Returns a singleton instance from the class <code>DefaultTileValidator</code>.
     *
     * @return a singleton instance from the class <code>DefaultTileValidator</code>.
     */
    public static final DefaultTileValidator getDefault() {
        return instance.get();
    }

    private DefaultTileValidator() {

    }

    @Override
    public void validate(double value) throws IllegalArgumentException {
        if (value <= 0.0d) {
            throw new IllegalArgumentException("Parameter can't <= 0.0d"); // NOI18N
        }
    }

    @Override
    public final void validate(String value) throws NullPointerException, IllegalArgumentException {
        TileValidator.super.validateIsNotNull(value);

        if (value.trim().isEmpty()) {
            throw new IllegalArgumentException("The value can't be EMPTY"); // NOI18N
        }
    }

}
