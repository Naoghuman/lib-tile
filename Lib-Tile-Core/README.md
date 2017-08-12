Lib-Tile-Core
===



Intention
---

The library `Lib-Tile-Core` provides the API to load a [Tile] (which is per 
definition a little transparent Image) as a [Background] or an [Image] with 
a concrete implementation from a [TileLoader].

The main point to access the functionalities from this <code>API</code> is the 
class [TileProvider]. For example with the method `TileProvider#loadAsBackground(TileLoader, Tile)` 
the developer can load a [Tile] as a [Background].

> __Hint__  
> This libray is a part from the project [Lib-Tile]. Plz see for additional 
> informations like [Download], [Requirements] or [Installation] there. Thanks :smile:



Content
---

* [Examples](#Examples)
* [Api](#Api)
    * [com.github.naoghuman.lib.tile.core.Tile](#Ti)
    * [com.github.naoghuman.lib.tile.core.TileLoader](#TiLo)
    * [com.github.naoghuman.lib.tile.core.TileProvider](#TiPr)
    * [com.github.naoghuman.lib.tile.core.TileSet](#TiSet)
    * [com.github.naoghuman.lib.tile.core.TileValidator](#TiVa)
* [Internal](#In)
    * [com.github.naoghuman.lib.tile.core.internal.DefaultTile](#DeTi)
    * [com.github.naoghuman.lib.tile.core.internal.DefaultTileValidator](#DeTiVa)
* [License](#License)
* [Autor](#Autor)
* [Contact](#Contact)



Examples<a name="Examples" />
---

Examples how to use the `predefined`, `reduced`, `mixed` and / or `own` [TileSet]s 
can be found in the `demo` application [Lib-Tile-Demo].

_Image:_ Demo application  
![demo_v0.3.0.png][demo_v0.3.0]



Api<a name="Api" />
---


### com.github.naoghuman.lib.tile.core.Tile<a name="Ti" />

```Java
/**
 * A {@code Tile} is per definition a little transparent
 * {@link javafx.scene.image.Image} which overlay a background color or an
 * {@code Image} with the help of repetitions from the {@code Image} in a layer.
 * <p>
 * An instance from this {@code Interface} can be easily over the class
 * {@link com.github.naoghuman.lib.tile.core.TileProvider} generated which is
 * the preferred way.
 *
 * @author Naoghuman
 * @since 0.2.0
 * @see com.github.naoghuman.lib.tile.core.TileProvider
 * @see javafx.scene.image.Image
 */
public interface Tile
```

```Java
/**
 * Returned the {@code prefix} from this {@code Tile} which is per definition 
 * the first signs from the image name included first minus.
 * <p>
 * For example given image name {@code "tt-arches.png"} so the prefix will
 * be {@code "tt-"}.
 *
 * @return the prefix from this {@code Tile}.
 */
public default String getPrefix()
```

```Java
/**
 * The autor is the creator from this {@code Tile}.
 * <p>
 * This parameter is optional. If this parameter is {@code NULL} or {@code EMPTY} 
 * then this {@code Getter} return {@link java.util.Optional#empty()}.
 *
 * @return the autor from this {@code Tile}.
 * @see com.github.naoghuman.lib.tile.core.Tile#getAutorUrl()
 * @see java.util.Optional
 */
public Optional<String> getAutor();
```

```Java
/**
 * The autor url from this {@code Tile}.
 * <p>
 * This parameter is optional. If the parameter {@code autor} is {@code NULL} 
 * or {@code EMPTY} then this {@code Getter} return {@link java.util.Optional#empty()}.
 *
 * @return the autor url from this {@code Tile}.
 * @see com.github.naoghuman.lib.tile.core.Tile#getAutor()
 * @see java.util.Optional
 */
public Optional<String> getAutorUrl();
```

```Java
/**
 * The height from this {@code Tile} image.
 * <p>
 * This parameter can't be {@code <= 0.0d}.
 *
 * @return the height from this {@code Tile} image.
 */
public double getHeight();
```

```Java
/**
 * The image name from this {@code Tile}.
 * <p>
 * This parameter can't be {@code NULL} or {@code EMPTY}.
 *
 * @return the image name from this {@code Tile}.
 */
public String getImageName();
```

```Java
/**
 * The scope from this {@code Tile}. The scope defines if a {@code Tile} is
 * supported by a {@link com.github.naoghuman.lib.tile.core.TileLoader} or not.
 * <p>
 * This parameter can't be {@code NULL} or {@code EMPTY}.
 *
 * @return the scope from this {@code Tile}.
 * @see com.github.naoghuman.lib.tile.core.TileLoader
 */
public String getScope();
```

```Java
/**
 * The title from this {@code Tile}.
 * <p>
 * This parameter can't be {@code NULL} or {@code EMPTY}.
 *
 * @return the title from this {@code Tile}.
 */
public String getTitle();
```

```Java
/**
 * The width from this {@code Tile} image.
 * <p>
 * This parameter can't be {@code <= 0.0d}.
 *
 * @return the width from this {@code Tile} image.
 */
public double getWidth();
```


### com.github.naoghuman.lib.tile.core.TileLoader<a name="TiLo" />

```Java
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
public abstract class TileLoader
```


```java
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
protected TileLoader()
```


```java
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
protected void addPrefix(String prefix)
```


```java
/**
 * This abstract method allowed all child classes to defined the supported prefixes.
 * <p>
 * A prefix can be added in this method with the method
 * {@link com.github.naoghuman.lib.tile.core.TileLoader#addPrefix(java.lang.String)}.
 * 
 * @see com.github.naoghuman.lib.tile.core.TileLoader#addPrefix(java.lang.String)
 */
protected abstract void configurePrefixes();
```


```java
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
```


```java
/**
 * Returned all supported {@code prefixes} from this TileLoader as an 
 * {@code javafx.collections.ObservableList}.
 * 
 * @return all supported prefixes from this TileLoader.
 * @see    javafx.collections.ObservableList
 */
public ObservableList<String> getPrefixes()
```


```java
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
public String getScope()
```


```java
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
protected void setScope(final String scope)
```


```java
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
protected boolean supports(final Tile tile)
```


### com.github.naoghuman.lib.tile.core.TileProvider<a name="TiPr" />

```Java
/**
 * The singleton {@code TileProvider} allowed the developer access to all relevant 
 * methods in context from the {@code API} from the library {@code Lib-Tile-Core}.
 * <p>
 * For example with the methods {@code getDefaultTile(XY)} a concrete instance from 
 * the {@code Inteface} {@link com.github.naoghuman.lib.tile.core.Tile} can be created.
 * <br>
 * With the method {@code getDefaultValidator()} the developer have access to a 
 * default implementation from the {@code Inteface} 
 * {@link com.github.naoghuman.lib.tile.core.TileValidator}.
 *
 * @author Naoghuman
 * @since  0.2.0
 * @see    com.github.naoghuman.lib.tile.core.Tile
 * @see    com.github.naoghuman.lib.tile.core.TileValidator
 */
public final class TileProvider 
```


```java
/**
 * Returns a singleton instance from the class {@code TileProvider}.
 *
 * @return a singleton instance from this class.
 */
public static final TileProvider getDefault()
```


```java
/**
 * Creates a new instance from {@link com.github.naoghuman.lib.tile.core.Tile}
 * with the defined values.
 * <p>
 * The optional attributes {@code autor} and {@code autorURL} will returned 
 * {@link java.util.Optional#empty()} in this case.
 * 
 * @param  scope defines the {@code scope} from the new {@code Tile}.
 * @param  imageName defines the {@code imageName} from the new {@code Tile}.
 * @param  title defines the {@code title} from the new {@code Tile}.
 * @param  width defines the {@code width} from the new {@code Tile}.
 * @param  height defines the {@code height} from the new {@code Tile}.
 * @return a new {@code Tile} with the specified values.
 * @see    com.github.naoghuman.lib.tile.core.Tile
 * @see    java.util.Optional#empty()
 */
public Tile getDefaultTile(
        final String scope, final String imageName, final String title,
        final double width, final double height
)
```


```java
/**
 * Creates a new instance from {@link com.github.naoghuman.lib.tile.core.Tile}
 * with the defined values.
 * <p>
 * The optional attribute {@code autorURL} will returned 
 * {@link java.util.Optional#empty()} in this case.
 * 
 * @param  scope defines the {@code scope} from the new {@code Tile}.
 * @param  imageName defines the {@code imageName} from the new {@code Tile}.
 * @param  title defines the {@code title} from the new {@code Tile}.
 * @param  width defines the {@code width} from the new {@code Tile}.
 * @param  height defines the {@code height} from the new {@code Tile}.
 * @param  autor defines the {@code autor} from the new {@code Tile}.
 * @return a new {@code Tile} with the specified values.
 * @see    com.github.naoghuman.lib.tile.core.Tile
 * @see    java.util.Optional#empty()
 */
public Tile getDefaultTile(
        final String scope, final String imageName, final String title,
        final double width, final double height,    final String autor
)
```


```java
/**
 * Creates a new instance from {@link com.github.naoghuman.lib.tile.core.Tile}
 * with the defined values.
 * 
 * @param  scope defines the {@code scope} from the new {@code Tile}.
 * @param  imageName defines the {@code imageName} from the new {@code Tile}.
 * @param  title defines the {@code title} from the new {@code Tile}.
 * @param  width defines the {@code width} from the new {@code Tile}.
 * @param  height defines the {@code height} from the new {@code Tile}.
 * @param  autor defines the {@code autor} from the new {@code Tile}.
 * @param  autorUrl defines the {@code autorUrl} from the new {@code Tile}.
 * @return a new {@code Tile} with the specified values.
 * @see    com.github.naoghuman.lib.tile.core.Tile
 */
public Tile getDefaultTile(
        final String scope,  final String imageName, final String title,
        final double width, final double height,     final String autor, 
        final String autorUrl
)
```


```java
/**
 * This method returns a concrete implementation from the {@code Interface} 
 * {@link com.github.naoghuman.lib.tile.core.TileValidator}.
 * <p>
 * The validator can then be used to validate for example if a {@link java.lang.Double} 
 * is greater then {@code 0.0d} or if a {@link java.lang.String} isn't {@code NULL} or 
 * {@code EMPTY}.
 *
 * @return a concrete implementation from the {@code Interface}
 *         {@link com.github.naoghuman.lib.tile.core.validator.TileValidator}.
 * @see    com.github.naoghuman.lib.tile.core.TileValidator
 * @see    com.github.naoghuman.lib.tile.internal.DefaultTileValidator
 */
public TileValidator getDefaultValidator()
```


```java
/**
 * Loads the given {@link com.github.naoghuman.lib.tile.core.Tile} with the
 * {@link com.github.naoghuman.lib.tile.core.TileLoader} as an
 * {@link javafx.scene.image.Image} which will be converted to a
 * {@link javafx.scene.layout.Background}.
 * 
 * @param  tileLoader loads the given {@link com.github.naoghuman.lib.tile.core.Tile} 
 *         as an {@link javafx.scene.image.Image} which will then be converted to a 
 *         {@link javafx.scene.layout.Background}.
 * @param  tile the {@link com.github.naoghuman.lib.tile.core.Tile} which should be 
 *         loaded as a {@link javafx.scene.layout.Background}.
 * @return the loaded {@link javafx.scene.layout.Background}.
 * @see    com.github.naoghuman.lib.tile.core.TileLoader
 * @see    com.github.naoghuman.lib.tile.core.Tile
 * @see    javafx.scene.layout.Background
 * @see    javafx.scene.image.Image
 */
public Optional<Background> loadAsBackground(final TileLoader tileLoader, final Tile tile)
```


```java
/**
 * Loads the given {@link com.github.naoghuman.lib.tile.core.Tile} with the
 * {@link com.github.naoghuman.lib.tile.core.TileLoader} as an 
 * {@link javafx.scene.image.Image}.
 *
 * @param  tileLoader loads the given {@link com.github.naoghuman.lib.tile.core.Tile} 
 *         as an {@link javafx.scene.image.Image}.
 * @param  tile the {@link com.github.naoghuman.lib.tile.core.Tile} which should be 
 *         loaded as an {@link javafx.scene.image.Image}.
 * @return the loaded {@link javafx.scene.image.Image}.
 * @see    com.github.naoghuman.lib.tile.core.Tile
 * @see    com.github.naoghuman.lib.tile.core.TileLoader
 * @see    com.github.naoghuman.lib.tile.core.TileValidator
 * @see    javafx.scene.image.Image
 */
public Optional<Image> loadAsImage(final TileLoader tileLoader, final Tile tile)
```


### com.github.naoghuman.lib.tile.core.TileSet<a name="TiSet" />

```Java
/**
 * This {@code abstract} class defines the minimal functionalities which should 
 * be supported by a {@code TileSet}.
 * <p>
 * Simple said a {@code TileSet} is a container which contains a set of 
 * {@link com.github.naoghuman.lib.tile.core.Tile}s and their corresponding 
 * {@link com.github.naoghuman.lib.tile.core.TileLoader}s.
 * <p>
 * A {@code TileLoader} supports a {@code Tile} if
 * <ul>
 * <li>the {@code prefix} from the {@code Tile} is supported by the {@code TileLoader} and</li>
 * <li>the {@code scope} from both are equals</li>
 * </ul>
 *
 * @author Naoghuman
 * @since  0.2.0
 * @see    com.github.naoghuman.lib.tile.core.Tile
 * @see    com.github.naoghuman.lib.tile.core.Tile#getPrefix()
 * @see    com.github.naoghuman.lib.tile.core.Tile#getScope()
 * @see    com.github.naoghuman.lib.tile.core.TileLoader
 * @see    com.github.naoghuman.lib.tile.core.TileLoader#getPrefixes()
 * @see    com.github.naoghuman.lib.tile.core.TileLoader#getScope()
 */
public abstract class TileSet
```


```java
/**
 * Protected constructor from the abstract class {@code TileSet}.
 */
protected TileSet()
```


```java
/**
 * With this method a developer can add a {@link com.github.naoghuman.lib.tile.core.Tile} 
 * to the supported list of {@code Tile}s in a concrete implementation from this abstract 
 * class.
 * <p>
 * This method should be normally used in the abstract method 
 * {@link com.github.naoghuman.lib.tile.core.TileSet#configureTiles()}.
 *
 * @param tile which should be added to the supported list of {@code Tile}s.
 * @see   com.github.naoghuman.lib.tile.core.Tile
 * @see   com.github.naoghuman.lib.tile.core.TileSet#configureTiles()
 */
public void addTile(final Tile tile)
```


```java
/**
 * With this method a developer can add a {@link com.github.naoghuman.lib.tile.core.TileLoader} 
 * to the supported list of {@code TileLoader}s in a concrete implementation from this abstract 
 * class.
 * <p>
 * This method should be normally used in the abstract method 
 * {@link com.github.naoghuman.lib.tile.core.TileSet#configureTileLoaders()}.
 *
 * @param tileLoader which should be added to the supported list of {@code TileLoader}s.
 * @see   com.github.naoghuman.lib.tile.core.TileLoader
 * @see   com.github.naoghuman.lib.tile.core.TileSet#configureTileLoaders()
 */
public void addTileLoader(final TileLoader tileLoader)
```


```java
/**
 * This abstract method allowed all child classes to defined the supported
 * {@link com.github.naoghuman.lib.tile.core.TileLoader}s.
 * <p>
 * A {@code TileLoader} can be added in this method with the method 
 * {@link com.github.naoghuman.lib.tile.core.TileLoader#addTileLoader(java.lang.com.github.naoghuman.lib.tile.core.TileLoader)}.
 * 
 * @see com.github.naoghuman.lib.tile.core.TileLoader#addTileLoader(java.lang.com.github.naoghuman.lib.tile.core.TileLoader)
 */
protected abstract void configureTileLoaders();
```


```java
/**
 * This abstract method allowed all child classes to defined the supported
 * {@link com.github.naoghuman.lib.tile.core.Tile}s.
 * <p>
 * A {@code Tile} can be added in this method with the method 
 * {@link com.github.naoghuman.lib.tile.core.TileLoader#addTile(java.lang.com.github.naoghuman.lib.tile.core.Tile)}.
 * 
 * @see com.github.naoghuman.lib.tile.core.TileLoader#addTile(java.lang.com.github.naoghuman.lib.tile.core.Tile)
 */
protected abstract void configureTiles();
```


```java
/**
 * Search and returnes the first {@link com.github.naoghuman.lib.tile.core.Tile}
 * with the given {@code title} wrapped in an {@link java.util.Optional}.
 * <p>
 * When no {@code Tile} with this title is found then {@link java.util.Optional#empty()} 
 * will be returned.
 * 
 * @param  title the search criteria
 * @return the {@code Tile} wrapped in an {@code Optional} or {@code Optional#empty()}}.
 * @see    com.github.naoghuman.lib.tile.core.Tile
 * @see    java.util.Optional
 * @see    java.util.Optional#empty()
 */
public Optional<Tile> getTile(final String title)
```


```java
/**
 * Search and returnes the first {@link com.github.naoghuman.lib.tile.core.TileLoader}
 * which supports the given {@link com.github.naoghuman.lib.tile.core.Tile} wrapped in 
 * an {@link java.util.Optional}.
 * <p>
 * A {@code TileLoader} supports a {@code Tile} if
 * <ul>
 * <li>the {@code prefix} from the {@code Tile} is supported by the {@code TileLoader} and</li>
 * <li>the {@code scope} from both are equals</li>
 * </ul>
 * <p>
 * When no {@code TileLoader} is found then an {@link java.util.Optional#empty()} will 
 * be returned.
 * 
 * @param  tile the search criteria
 * @return the {@code TileLoader} wrapped in an {@code Optional} or {@code Optional#empty()}}.
 * @see    com.github.naoghuman.lib.tile.core.Tile
 * @see    com.github.naoghuman.lib.tile.core.Tile#getPrefix()
 * @see    com.github.naoghuman.lib.tile.core.Tile#getScope()
 * @see    com.github.naoghuman.lib.tile.core.TileLoader
 * @see    com.github.naoghuman.lib.tile.core.TileLoader#getPrefixes()
 * @see    com.github.naoghuman.lib.tile.core.TileLoader#getScope()
 * @see    java.util.Optional
 * @see    java.util.Optional#empty()
 */
public Optional<TileLoader> getTileLoader(final Tile tile)
```


```java
/**
 * Returnes all {@link com.github.naoghuman.lib.tile.core.Tile}s from this
 * {@code TileSet} as an {@link javafx.collections.ObservableList}.
 * <p>
 * The list from {@code Tile}s will be sorted by their {@code titles}.
 * 
 * @return all {@code Tile}s from this {@code TileSet}.
 * @see    com.github.naoghuman.lib.tile.core.Tile
 * @see    javafx.collections.ObservableList
 */
public ObservableList<Tile> getTiles()
```


### com.github.naoghuman.lib.tile.core.TileValidator<a name="TiVa" />

```Java
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
public interface TileValidator
```


```java
/**
 * This method validates if the attribute {@code value} is valid against
 * still to be defined rules.
 *
 * @param value the attribute which should be validated.
 * @throws IllegalArgumentException if the validation fails.
 */
public void validate(final double value) throws IllegalArgumentException;
```


```java
/**
 * Validates if the attribute {@code list} isn't {@code NULL} or {@code EMPTY}.
 * 
 * @param <E>  the type of {@code Object}s from this list.
 * @param list the attribute which should be validated.
 */
public default <E> void validate(final ObservableList<E> list) throws NullPointerException, IllegalStateException
```


```java
/**
 * This method validates if the attribute {@code value} isn't {@code NULL} 
 * or {@code EMPTY}.
 *
 * @param value the attribute which should be validated.
 * @throws NullPointerException if the value is {@code NULL}.
 * @throws IllegalArgumentException if the value is {@code EMPTY}.
 */
public default void validate(final String value) throws NullPointerException, IllegalArgumentException
```



Internal<a name="In" />
---

### com.github.naoghuman.lib.tile.core.internal.DefaultTile<a name="DeTi" />

```Java
/**
 * The default {@code Implementation} from the {@code Interface} 
 * {@link com.github.naoghuman.lib.tile.core.Tile}.
 * <p>
 * An instance from this class can be easily throw the class 
 * {@link com.github.naoghuman.lib.tile.core.TileProvider} generated which 
 * is the preferred way.
 *
 * @author Naoghuman
 * @since  0.2.0
 * @see    com.github.naoghuman.lib.tile.core.Tile
 * @see    com.github.naoghuman.lib.tile.core.TileProvider
 */
public class DefaultTile implements Tile
```


```java
/**
 * Creates a new instance from {@link com.github.naoghuman.lib.tile.core.Tile}
 * with the defined values.
 * <p>
 * The optional attributes {@code autor} and {@code autorURL} will returned 
 * {@link java.util.Optional#empty()} in this case.
 *
 * @param  scope defines the {@code scope} from the new {@code Tile}.
 * @param  imageName defines the {@code imageName} from the new {@code Tile}.
 * @param  title defines the {@code title} from the new {@code Tile}.
 * @param  width defines the {@code width} from the new {@code Tile}.
 * @param  height defines the {@code height} from the new {@code Tile}.
 * @see    com.github.naoghuman.lib.tile.core.Tile
 * @see    java.util.Optional#empty()
 */
public DefaultTile(
        final String scope, final String imageName, final String title,
        final double width, final double height
)
```


```java
/**
 * Creates a new instance from {@link com.github.naoghuman.lib.tile.core.Tile}
 * with the defined values.
 * <p>
 * The optional attribute {@code autorURL} will returned 
 * {@link java.util.Optional#empty()} in this case.
 * 
 * @param  scope defines the {@code scope} from the new {@code Tile}.
 * @param  imageName defines the {@code imageName} from the new {@code Tile}.
 * @param  title defines the {@code title} from the new {@code Tile}.
 * @param  width defines the {@code width} from the new {@code Tile}.
 * @param  height defines the {@code height} from the new {@code Tile}.
 * @param  autor defines the {@code autor} from the new {@code Tile}.
 * @see    com.github.naoghuman.lib.tile.core.Tile
 * @see    java.util.Optional#empty()
 */
public DefaultTile(
        final String scope, final String imageName, final String title,
        final double width, final double height,    final String autor
)
```


```java
/**
 * Creates a new instance from {@link com.github.naoghuman.lib.tile.core.Tile}
 * with the defined values.
 *
 * @param  scope defines the {@code scope} from the new {@code Tile}.
 * @param  imageName defines the {@code imageName} from the new {@code Tile}.
 * @param  title defines the {@code title} from the new {@code Tile}.
 * @param  width defines the {@code width} from the new {@code Tile}.
 * @param  height defines the {@code height} from the new {@code Tile}.
 * @param  autor defines the {@code autor} from the new {@code Tile}.
 * @param  autorUrl defines the {@code autorUrl} from the new {@code Tile}.
 * @see    com.github.naoghuman.lib.tile.core.Tile
 */
public DefaultTile(
        final String scope, final String imageName, final String title,
        final double width, final double height,    final String autor, 
        final String autorUrl
)
```


### com.github.naoghuman.lib.tile.core.internal.DefaultTileValidator<a name="DeTiVa" />

```Java
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
public final class DefaultTileValidator implements TileValidator
```


```java
/**
 * Returns a singleton instance from the class {@code DefaultTileValidator}.
 *
 * @return a singleton instance from this class.
 */
public static final DefaultTileValidator getDefault()
```



License<a name="License" />
---

The project `Lib-Tile` and all sub-projects are licensed under [General Public License 3.0].



Autor<a name="Autor" />
---

The project `Lib-Tile` and all sub-projects are maintained by me, Peter Rogge. 
See [Contact](#Contact).



Contact<a name="Contact" />
---

You can reach me under <peter.rogge@yahoo.de>.



[//]: # (Images)
[demo_v0.3.0]:https://user-images.githubusercontent.com/8161815/29042851-02bf3cd4-7bb9-11e7-818d-28c7260c0c25.png



[//]: # (Links)
[Background]:https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/Background.html
[Download]:https://github.com/Naoghuman/lib-tile/blob/master/README.md#Download
[General Public License 3.0]:http://www.gnu.org/licenses/gpl-3.0.en.html
[Image]:https://docs.oracle.com/javase/8/javafx/api/javafx/scene/image/Image.html
[Installation]:https://github.com/Naoghuman/lib-tile/blob/master/README.md#Installation
[Lib-Tile]:https://github.com/Naoghuman/lib-tile
[Lib-Tile-Demo]:https://github.com/Naoghuman/lib-tile-demo
[Requirements]:https://github.com/Naoghuman/lib-tile/blob/master/README.md#Requirements
[Tile]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-Core/src/main/java/com/github/naoghuman/lib/tile/core/Tile.java
[TileLoader]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-Core/src/main/java/com/github/naoghuman/lib/tile/core/TileLoader.java
[TileProvider]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-Core/src/main/java/com/github/naoghuman/lib/tile/core/TileProvider.java
[TileSet]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-Core/src/main/java/com/github/naoghuman/lib/tile/core/TileSet.java
