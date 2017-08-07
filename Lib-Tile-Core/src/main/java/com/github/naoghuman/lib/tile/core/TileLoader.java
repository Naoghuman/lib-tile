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

import java.util.Optional;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * This abstract class defines the minimal functionalities which should be supported
 * by a <code>TileLoader</code>. With a concrete implementation from this
 * <code>abstract</code> class it's then be possible to load a
 * {@link com.github.naoghuman.lib.tile.core.Tile} (which is per definition a
 * little transparent Image) as a {@link javafx.scene.layout.Background} or an
 * {@link javafx.scene.image.Image}.
 *
 * @author Naoghuman
 * @see com.github.naoghuman.lib.tile.core.Tile
 * @see javafx.scene.layout.Background
 * @see javafx.scene.image.Image
 */
public abstract class TileLoader {

    private final ObservableList<String> prefixes = FXCollections.observableArrayList();
    
    private String scope;
    
    protected TileLoader() {
        this.initialize();
    }
    
    private void initialize() {
        this.configurePrefixes();
        this.configureScope();
        
        this.validate();
    }
    
    /**
     * With the parameter <code>prefix</code> a concrete implementation from this 
     * <code>abstract</code> class defines if a given {@link com.github.naoghuman.lib.tile.core.Tile} 
     * is supported by this <code>TileLoader</code> or not.
     * <p>
     * This method will be normally used in the abstract method 
     * {@link com.github.naoghuman.lib.tile.core.TileLoader#configurePrefixes()}. 
     * If the prefix is always defined then it won't be added.
     *
     * @param prefix the prefix which should be added to the supported list of prefixes.
     * @see   com.github.naoghuman.lib.tile.core.Tile
     * @see   com.github.naoghuman.lib.tile.core.TileLoader#configurePrefixes()
     */
    protected void addPrefix(String prefix) {
        if (!prefixes.contains(prefix)) {
            prefixes.add(prefix);
        }
    };
    
    private void validate() {
        TileProvider.getDefault().getDefaultTileValidator().validate(scope);
        TileProvider.getDefault().getDefaultTileValidator().validateIsNotEmpty(prefixes);
    }
    
    /**
     * This abstract method allowed all child classes to defined the supported 
     * prefixes.
     * <p>
     * A prefix can be added in this method with {@link com.github.naoghuman.lib.tile.core.TileLoader#addPrefix(java.lang.String)}.
     * 
     * @see com.github.naoghuman.lib.tile.core.TileLoader#addPrefix(java.lang.String)
     */
    protected abstract void configurePrefixes();
    
    /**
     * This abstract method allowed the developer to define the scope from this
     * TileLoader.
     * <p>
     * The scope from a TileLoader is per definition the package scope from the 
     * TileLoader. The scope can be added through the method 
     * {@link com.github.naoghuman.lib.tile.core.TileLoader#setScope(java.lang.String)}.
     * 
     * @see com.github.naoghuman.lib.tile.core.TileLoader#setScope(java.lang.String) 
     */
    protected abstract void configureScope();
    
    /**
     * Returned all supported prefixes from this TileLoader as an ObservableList.
     * 
     * @return all  supported prefixes from this TileLoader.
     */
    public ObservableList<String> getPrefixes() {
        return prefixes;
    }
    
    /**
     * Returned the scope from this TileLoader.
     * 
     * @return the scope from this TileLoader.
     */
    public String getScope() {
        return scope;
    }
    
    /**
     * Let define the scope from this TileLoader.
     * <p>
     * This method will be normally used in the abstract method 
     * {@link com.github.naoghuman.lib.tile.core.TileLoader#configureScope()}. 
     * 
     * 
     * @param scope the scope from this TileLoader.
     * @see   com.github.naoghuman.lib.tile.core.TileLoader#configureScope() 
     */
    protected void setScope(final String scope) {
        this.scope = scope;
    }

    /**
     * Checks the given {@link com.github.naoghuman.lib.tile.core.Tile} if it's
     * supported by this <code>TileLoader</code>.
     * <p>
     * Following condifitions will be checked:
     * <ul>
     * <li>If the {@code scope} from both (Tile and TileLoader) are equale.</li>
     * <li>If this TileLoader supports the {@code prefix} from the Tile.</li>
     * </ul>
     *
     * @param tile the Tile which should be checked if it's supported by this TileLoader or not.
     * @return <code>true</code> if the {@link com.github.naoghuman.lib.tile.core.Tile} 
     * is supported by this <code>TileLoader</code>, otherwise <code>false</code>.
     * @see com.github.naoghuman.lib.tile.core.Tile
     */
    protected boolean supports(final Tile tile) {
        boolean scopeIsSupported = this.getScope().equals(tile.getScope());
        
        boolean prefixIsSupported = false;
        final String prefixToCheck = tile.getPrefix();
        TileProvider.getDefault().getDefaultTileValidator().validate(prefixToCheck);

        final Optional<String> prefix = prefixes.stream()
                .filter(p -> p.equals(prefixToCheck))
                .findFirst();
        if (prefix.isPresent()) {
            prefixIsSupported = true;
        }

        return scopeIsSupported && prefixIsSupported;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("TileLoader ["); // NOI18N
        sb.append("name=").append(this.getClass().getSimpleName()); // NOI18N
        sb.append("]"); // NOI18N
        
        // TODO add prefixes
        
        return sb.toString();
    }
    
}
