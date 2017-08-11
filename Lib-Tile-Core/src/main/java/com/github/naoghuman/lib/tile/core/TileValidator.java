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

import java.util.Objects;
import javafx.collections.ObservableList;

/**
 * The {@code Interface} {@code TileValidator} defines different {@code validate()} 
 * methods which can be used to validate a {@link java.lang.Double} or a 
 * {@link java.lang.String} against still to be defined rules.
 * <p>
 * A concrete implementation from this {@code Interface} can be access over
 * the class {@link com.github.naoghuman.lib.tile.core.TileProvider}.
 *
 * @author Naoghuman
 * @since  0.2.0
 * @see    com.github.naoghuman.lib.tile.core.TileProvider#getDefaultValidator()
 */
public interface TileValidator {

    /**
     * This method validates if the attribute {@code value} is valid against
     * still to be defined rules.
     *
     * @param value the attribute which should be validated.
     * @throws IllegalArgumentException if the validation fails.
     */
    public void validate(final double value) throws IllegalArgumentException;
    
    /**
     * Validates if the attribute {@code list} isn't {@code NULL} or {@code EMPTY}.
     * 
     * @param <E>  the type of {@code Object}s from this list.
     * @param list the attribute which should be validated.
     */
    public default <E> void validate(final ObservableList<E> list) throws NullPointerException, IllegalStateException {
        Objects.requireNonNull(list, "The list can't be NULL."); // NOI18N
        
        if (list.isEmpty()) {
            throw new IllegalStateException("The list can't be EMPTY."); // NOI18N
        }
    }

    /**
     * This method validates if the attribute {@code value} isn't {@code NULL} 
     * or {@code EMPTY}.
     *
     * @param value the attribute which should be validated.
     * @throws NullPointerException if the value is {@code NULL}.
     * @throws IllegalArgumentException if the value is {@code EMPTY}.
     */
    public default void validate(final String value) throws NullPointerException, IllegalArgumentException {
        Objects.requireNonNull(value, "The value can't be NULL."); // NOI18N

        if (value.trim().isEmpty()) {
            throw new IllegalArgumentException("The value can't be EMPTY"); // NOI18N
        }
    }
}
