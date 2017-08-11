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
 * This {@code abstract} class defines the minimal functionalities which should be 
 * supported by a {@code TileLoader}.
 * <p>
 * With a concrete {@code implementation} from this abstract class it's then be 
 * possible to load a {@link com.github.naoghuman.lib.tile.core.Tile} (which is per 
 * definition a little transparent Image) as a {@link javafx.scene.layout.Background} 
 * or an {@link javafx.scene.image.Image}.
 *
 * @author Naoghuman
 * @since  0.2.0
 * @see    com.github.naoghuman.lib.tile.core.Tile
 * @see    javafx.scene.layout.Background
 * @see    javafx.scene.image.Image
 */
public abstract class TileLoader {

    private final ObservableList<String> prefixes = FXCollections.observableArrayList();
    
    private String scope;
    
    /**
     * Protected constructor from the abstract class {@code TileLoader}.
     * <p>
     * This conctructor will called following methods in the represented order:
     * <ul>
     * <li>{@link com.github.naoghuman.lib.tile.core.TileLoader#configurePrefixes()}</li>
     * <li>{@link com.github.naoghuman.lib.tile.core.TileLoader#configureScope()}</li>
     * <li>{@link com.github.naoghuman.lib.tile.core.TileLoader#validate()}</li>
     * </ul>
     * 
     * @see com.github.naoghuman.lib.tile.core.TileLoader#configurePrefixes()
     * @see com.github.naoghuman.lib.tile.core.TileLoader#configureScope()
     * @see com.github.naoghuman.lib.tile.core.TileLoader#validate()
     */
    protected TileLoader() {
        this.initialize();
    }
    
    private void initialize() {
        this.configurePrefixes();
        this.configureScope();
        
        this.validate();
    }
    
    /**
     * With the parameter {@code prefix} a concrete implementation from this 
     * abstract class defines if a given {@link com.github.naoghuman.lib.tile.core.Tile} 
     * is supported by this {@code TileLoader} or not. If the prefix is always defined 
     * then it won't be added.
     * <p>
     * This method should be normally used in the abstract method 
     * {@link com.github.naoghuman.lib.tile.core.TileLoader#configurePrefixes()}.
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
    
    /**
     * This abstract method allowed all child classes to defined the supported prefixes.
     * <p>
     * A prefix can be added in this method with the method
     * {@link com.github.naoghuman.lib.tile.core.TileLoader#addPrefix(java.lang.String)}.
     * 
     * @see com.github.naoghuman.lib.tile.core.TileLoader#addPrefix(java.lang.String)
     */
    protected abstract void configurePrefixes();
    
    /**
     * This abstract method allowed the developer to define the {@code scope} 
     * from this TileLoader.
     * <p>
     * The scope from a TileLoader is per definition the package scope from the 
     * TileLoader. The scope can be added through the method 
     * {@link com.github.naoghuman.lib.tile.core.TileLoader#setScope(java.lang.String)}.
     * 
     * @see com.github.naoghuman.lib.tile.core.TileLoader#setScope(java.lang.String) 
     */
    protected abstract void configureScope();
    
    /**
     * Returned all supported {@code prefixes} from this TileLoader as an 
     * {@code javafx.collections.ObservableList}.
     * 
     * @return all supported prefixes from this TileLoader.
     * @see    javafx.collections.ObservableList
     */
    public ObservableList<String> getPrefixes() {
        return prefixes;
    }
    
    /**
     * Returnes the {@code scope} from this {@code TileLoader} which should be per 
     * convention the {@code package} from a concrete instance from this abstract class.
     * <p>
     * The scope defines if a {@code TileLoader} supports a 
     * {@link com.github.naoghuman.lib.tile.core.Tile} or not. That means if a 
     * {@code TileLoader} can be used to load the {@code image} from the {@code Tile}.
     * <br>
     * Therefor it's necessary that the  {@code Tile} have the same {@code scope} like 
     * the {@code TileLoader} (the {@code image} must be in the same package like the 
     * {@code TileLoader}).
     * 
     * @return the scope from this {@code TileLoader}.
     * @see    com.github.naoghuman.lib.tile.core.Tile
     */
    public String getScope() {
        return scope;
    }
    
    /**
     * Let set the developer the {@code scope} from this {@code TileLoader} which should 
     * be per convention the {@code package} from a concrete instance from this abstract 
     * class.
     * <p>
     * The scope defines if a {@code TileLoader} supports a 
     * {@link com.github.naoghuman.lib.tile.core.Tile} or not. That means if a 
     * {@code TileLoader} can be used to load the {@code image} from the {@code Tile}.
     * <br>
     * Therefor it's necessary that the  {@code Tile} have the same {@code scope} like 
     * the {@code TileLoader} (the {@code image} must be in the same package like the 
     * {@code TileLoader}).
     * <p>
     * This method should be normally used in the abstract method 
     * {@link com.github.naoghuman.lib.tile.core.TileLoader#configureScope()}.
     * 
     * @param scope the scope from this {@code TileLoader}.
     * @see   com.github.naoghuman.lib.tile.core.Tile
     * @see   com.github.naoghuman.lib.tile.core.TileLoader#configureScope() 
     */
    protected void setScope(final String scope) {
        this.scope = scope;
    }

    /**
     * Checks the given {@link com.github.naoghuman.lib.tile.core.Tile} if it's
     * supported by this {@code TileLoader}.
     * <p>
     * Following conditions will be checked:
     * <ul>
     * <li>If the {@code scope} from both ({@code Tile} and {@code TileLoader}) are equals.</li>
     * <li>If this {@code TileLoader} supports the {@code prefix} from the {@code Tile}.</li>
     * </ul>
     *
     * @param  tile which should be checked if it's supported by this {@code TileLoader} 
     *         or not.
     * @return {@code TRUE} if the {@code Tile} is supported by this {@code TileLoader}, 
     *         otherwise {@code FALSE}.
     * @see    com.github.naoghuman.lib.tile.core.Tile
     * @see    com.github.naoghuman.lib.tile.core.TileLoader#addPrefix()
     * @see    com.github.naoghuman.lib.tile.core.TileLoader#setScope()
     */
    protected boolean supports(final Tile tile) {
        boolean scopeIsSupported = this.getScope().equals(tile.getScope());
        
        boolean prefixIsSupported = false;
        final String prefixToCheck = tile.getPrefix();
        TileProvider.getDefault().getDefaultValidator().validate(prefixToCheck);

        final Optional<String> prefix = prefixes.stream()
                .filter(p -> p.equals(prefixToCheck))
                .findFirst();
        if (prefix.isPresent()) {
            prefixIsSupported = true;
        }

        return scopeIsSupported && prefixIsSupported;
    }
    
    private void validate() {
        TileProvider.getDefault().getDefaultValidator().validate(scope);
        TileProvider.getDefault().getDefaultValidator().validate(prefixes);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("TileLoader ["); // NOI18N
        sb.append("name=").append(this.getClass().getSimpleName()); // NOI18N
        sb.append("scope=").append(this.getScope()); // NOI18N

        sb.append(", prefixes=(").append(this.getScope()); // NOI18N
        final ObservableList<String> prefixes = this.getPrefixes();
        sb.append(prefixes.get(0));
        for(int i = 1; i < prefixes.size(); i++) {
            sb.append(",").append(prefixes.get(i));
        }
        sb.append(")"); // NOI18N
        
        sb.append("]"); // NOI18N
        
        return sb.toString();
    }
    
}
