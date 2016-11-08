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

/**
 * This package contains a <code>Validator</code> which allowed to validate 
 * the parameter from a {@link com.github.naoghuman.lib.tile.core.Tile} 
 * against specific rules.
 * <p />
 * The class {@link com.github.naoghuman.lib.tile.core.validator.DefaultTileValidator}
 * can be used to validate a) is a {@link java.lang.Double} greater then 0.0d or b) 
 * if a {@link java.lang.String} isn't NULL or EMPTY.
 * <br />
 * With the <code>Interface</code> {@link com.github.naoghuman.lib.tile.core.validator.TileValidator}
 * the developer can defined own rules how a {@link java.lang.Double} or a 
 * {@link java.lang.String} is valid.
 * 
 * @see com.github.naoghuman.lib.tile.core.Tile
 * @see com.github.naoghuman.lib.tile.core.validator.DefaultTileValidator
 * @see com.github.naoghuman.lib.tile.core.validator.TileValidator
 */
package com.github.naoghuman.lib.tile.core.validator;