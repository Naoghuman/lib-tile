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
 * This <code>Interface</code> can be used to create a <code>TileValidator</code> 
 * which can be used to validate a {@link java.lang.Double} or a {@link java.lang.String} 
 * against still to be defined rules.
 * <p />
 * A concrete implementation from this <code>Interface</code> can be found in
 * the class {@link com.github.naoghuman.lib.tile.core.internal.DefaultTileValidator}
 * which validates if a) is a {@link java.lang.Double} greater then 0.0d or b)
 * if a {@link java.lang.String} isn't NULL or EMPTY. The class <code>DefaultTileValidator</code> 
 * can be accessed over {@link com.github.naoghuman.lib.tile.core.TileProvider#getDefaultTileValidator()}.
 *
 * @author Naoghuman
 * @see com.github.naoghuman.lib.tile.core.TileProvider#getDefaultTileValidator()
 * @see com.github.naoghuman.lib.tile.core.internal.DefaultTileValidator
 */
public interface TileValidator {

    /**
     * Validates if the parameter <code>value</code> isn't NULL.
     *
     * @param value the parameter which should be validated.
     * @throws NullPointerException if (value == NULL).
     */
    public default void validateIsNotNull(String value) throws NullPointerException {
        if (value == null) {
            throw new NullPointerException("The value can't be NULL"); // NOI18N
        }
    }

    /**
     * This method validates if the parameter <code>value</code> valid against
     * still to be defined rules.
     *
     * @param value the parameter which should be validated.
     * @throws IllegalArgumentException if the validation fails.
     */
    public void validate(double value) throws IllegalArgumentException;

    /**
     * This method validates if the parameter <code>value</code> isn't NULL or
     * EMPTY.
     *
     * @param value the parameter which should be validated.
     * @throws NullPointerException if (value == NULL).
     * @throws IllegalArgumentException if the validation fails.
     */
    public void validate(String value) throws NullPointerException, IllegalArgumentException;

}
