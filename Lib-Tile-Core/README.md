Lib-Tile-Core
===



<br />
Intention
---

The library `Lib-Tile-Core` provides the API to load a [Tile] (which is per 
definition a little transparent Image) as a [Background] or an [Image] with 
a concrete implementation from a [TileLoader].

The main point for access the functionalities from this <code>API</code> is the 
class [TileProvider]. For example with the method TileProvider#loadAsBackground(TileLoader, Tile) 
the developer can load a [Tile] as an [Background].

> __Hint__  
> This libray is a part from the project [Lib-Tile]. Plz see for additional 
> informations like [Download], [Requirements] or [Installation] there. Thanks :smile:



<br />
Content
---

* [Examples](#Examples)
* [Api](#Api)
    * [com.github.naoghuman.lib.tile.core.Tile](#Ti)
    * [com.github.naoghuman.lib.tile.core.TileLoader](#TiLo)
    * [com.github.naoghuman.lib.tile.core.TileProvider](#TiPr)
    * [com.github.naoghuman.lib.tile.core.TileValidator](#TiVa)
* [Internal](#In)
    * [com.github.naoghuman.lib.tile.core.internal.DefaultTileValidator](#DeTiVa)
* [License](#License)
* [Autor](#Autor)
* [Contact](#Contact)



<br />
Examples<a name="Examples" />
---

TODO Add in later version examples how to use this `api`.



<br />
Api<a name="Api" />
---


<br />
### com.github.naoghuman.lib.tile.core.Tile<a name="Ti" />

```Java
/**
 * A <code>Tile</code> is per definition a little transparent
 * {@link javafx.scene.image.Image} which overlay a background color or an
 * {@link javafx.scene.image.Image} with the help of repetitions from the
 * {@link javafx.scene.image.Image} in a layer.
 *
 * @author Naoghuman
 * @see javafx.scene.image.Image
 */
public interface Tile
```


```java
/**
 * The autor is the creator from the <code>Tile</code>.
 * <p />
 * This parameter is optional. If this parameter is NULL or empty then the
 * parameter <code>autorUrl</code> won't be evaluated.
 *
 * @return the autor from the <code>Tile</code>.
 * @see #getAutorUrl()
 */
public String getAutor()
```


```java
/**
 * The autor url from the <code>Tile</code>.
 * <p />
 * This parameter is optional. If the parameter <code>autor</code> is NULL
 * or EMPTY then this parameter won't be evaluated.
 *
 * @return the autor url from the <code>Tile</code>.
 * @see #getAutor()
 */
public String getAutorUrl()
```


```java
/**
 * The height from a single <code>Tile</code> image.
 * <p />
 * This parameter can't be <= 0.0d.
 *
 * @return the height from a single <code>Tile</code> image.
 */
public double getHeight()
```


```java
/**
 * The image name from the <code>Tile</code>.
 * <p />
 * This parameter can't be NULL or EMPTY.
 *
 * @return the image name from the <code>Tile</code>.
 */
public String getImageName()
```


```java
/**
 * The title from the <code>Tile</code>.
 * <p />
 * This parameter can't be NULL or EMPTY.
 *
 * @return the title from the <code>Tile</code>.
 */
public String getTitle()
```


```java
/**
 * The width from a single <code>Tile</code> image.
 * <p />
 * This parameter can't be <= 0.0d.
 *
 * @return the width from a single <code>Tile</code> image.
 */
public double getWidth()
```


<br />
### com.github.naoghuman.lib.tile.core.TileLoader<a name="TiLo" />

```Java
/**
 * This interface defines the minimal functionalities which should be supported
 * by a <code>TileLoader</code>. With a concrete implementation from this
 * <code>Interface</code> it's then be possible to load a
 * {@link com.github.naoghuman.lib.tile.core.Tile} (which is per definition a
 * little transparent Image) as a {@link javafx.scene.layout.Background} or an
 * {@link javafx.scene.image.Image}.
 *
 * @author Naoghuman
 * @see com.github.naoghuman.lib.tile.core.Tile
 * @see javafx.scene.layout.Background
 * @see javafx.scene.image.Image
 */
public interface TileLoader
```


```java
/**
 * With the parameter <code>prefix</code> a concrete implementation from this 
 * <code>Interface</code> defines if a given {@link com.github.naoghuman.lib.tile.core.Tile} 
 * is supported by this <code>TileLoader</code> or not.
 *
 * @return the prefix which defines if the {@link com.github.naoghuman.lib.tile.core.Tile} 
 * is supported or not by this <code>TileLoader</code>.
 * @see com.github.naoghuman.lib.tile.core.Tile
 */
public String getPrefix()
```


```java
/**
 * Checks the given {@link com.github.naoghuman.lib.tile.core.Tile} if it's
 * supported by this <code>TileLoader</code>.
 *
 * @param tile the {@link com.github.naoghuman.lib.tile.core.Tile} which should be 
 * checked if it's supported by this <code>TileLoader</code> or not.
 * @return <code>true</code> if the {@link com.github.naoghuman.lib.tile.core.Tile} 
 * is supported by this <code>TileLoader</code>, otherwise <code>false</code>.
 * @see com.github.naoghuman.lib.tile.core.Tile
 */
public boolean isSupported(Tile tile)
```


```java
/**
 * Loads the given {@link com.github.naoghuman.lib.tile.core.Tile} with the
 * {@link com.github.naoghuman.lib.tile.core.TileLoader} as an
 * {@link javafx.scene.image.Image} which will be converted to a
 * {@link javafx.scene.layout.Background}.
 * <p />
 * This method delegates to the method
 * {@link com.github.naoghuman.lib.tile.core.TileProvider#loadAsBackground(TileLoader, Tile)}.
 * For additional information plz see the JavaDoc there.
 * <br />
 * See for an example the method
 * {@link com.github.naoghuman.lib.tile.transparenttextures.images.TransparentTexturesTileLoader#loadAsBackground(Tile)}
 * in the library <code>Lib-Tile-TransparentTextures-Images</code>.
 *
 * @param tile the {@link com.github.naoghuman.lib.tile.core.Tile} which
 * should be loaded as a {@link javafx.scene.layout.Background}.
 * @return the loaded {@link javafx.scene.layout.Background}.
 * @see com.github.naoghuman.lib.tile.core.TileProvider#loadAsBackground(TileLoader, Tile)
 * @see com.github.naoghuman.lib.tile.core.Tile
 * @see com.github.naoghuman.lib.tile.transparenttextures.images.TransparentTexturesTileLoader#loadAsBackground(Tile)
 * @see javafx.scene.layout.Background
 * @see javafx.scene.image.Image
 * @deprecated This method is deprecated with version 0.2.0. As an
 * alternative {@link com.github.naoghuman.lib.tile.core.TileProvider#loadAsBackground(TileLoader, Tile)}
 * should be used.
 */
@Deprecated
public Background loadAsBackground(Tile tile)
```


```java
/**
 * Loads the given {@link com.github.naoghuman.lib.tile.core.Tile} with the
 * {@link com.github.naoghuman.lib.tile.core.TileLoader} as an
 * {@link javafx.scene.image.Image}.
 * <p />
 * This method delegates to the method
 * {@link com.github.naoghuman.lib.tile.core.TileProvider#loadAsImage(TileLoader, Tile)}.
 * For additional information plz see the JavaDoc there.
 * <br />
 * See for example the method
 * {@link com.github.naoghuman.lib.tile.transparenttextures.images.TransparentTexturesTileLoader#loadAsImage(Tile)}
 * in the library <code>Lib-Tile-TransparentTextures-Images</code>.
 *
 * @param tile the {@link com.github.naoghuman.lib.tile.core.Tile} which
 * should be loaded as a {@link javafx.scene.image.Image}.
 * @return the loaded {@link javafx.scene.image.Image}.
 * @see com.github.naoghuman.lib.tile.core.TileProvider#loadAsImage(TileLoader, Tile)
 * @see com.github.naoghuman.lib.tile.core.Tile
 * @see
 * com.github.naoghuman.lib.tile.transparenttextures.images.TransparentTexturesTileLoader#loadAsImage(Tile)
 * @see javafx.scene.image.Image
 * @deprecated This method is deprecated with version 0.2.0. As an alternative
 * {@link com.github.naoghuman.lib.tile.core.TileProvider#loadAsImage(TileLoader, Tile)}
 * should be used.
 */
@Deprecated
public Image loadAsImage(Tile tile)
```


<br />
### com.github.naoghuman.lib.tile.core.TileProvider<a name="TiPr" />

```Java
/**
 * The singleton <code>TileProvider</code> allowed the developer to load a
 * {@link com.github.naoghuman.lib.tile.core.Tile} (which is per definition a
 * little transparent Image) as a {@link javafx.scene.layout.Background} or an
 * {@link javafx.scene.image.Image} with a concrete implementation from an
 * {@link com.github.naoghuman.lib.tile.core.TileLoader}.
 *
 * @author Naoghuman
 * @see com.github.naoghuman.lib.tile.core.TileLoader
 * @see com.github.naoghuman.lib.tile.core.Tile
 * @see javafx.scene.layout.Background
 * @see javafx.scene.image.Image
 */
public final class TileProvider
```


```java
private static final Optional<TileProvider> instance = Optional.of(new TileProvider());

/**
 * Returns a singleton instance from the class <code>TileProvider</code>.
 *
 * @return a singleton instance from this class.
 */
public static final TileProvider getDefault()
```


```java
/**
 * This method returns a concrete implementation from the
 * <code>Interface</code> {@link com.github.naoghuman.lib.tile.core.TileValidator} 
 * which can be used to validate a) is a {@link java.lang.Double} greater then
 * 0.0d or b) if a {@link java.lang.String} isn't NULL or EMPTY.
 *
 * @return a concrete implementation from the <code>Interface</code>
 * {@link com.github.naoghuman.lib.tile.core.validator.TileValidator}.
 * @see com.github.naoghuman.lib.tile.core.TileValidator
 * @see com.github.naoghuman.lib.tile.core.internal.DefaultTileValidator
 */
public TileValidator getDefaultTileValidator()
```


```java
/**
 * Loads the given {@link com.github.naoghuman.lib.tile.core.Tile} with the
 * {@link com.github.naoghuman.lib.tile.core.TileLoader} as an
 * {@link javafx.scene.image.Image} which will be converted to a
 * {@link javafx.scene.layout.Background}.
 * <p />
 * Internal the parameter from the <code>Tile</code> will be checked with 
 * the {@link com.github.naoghuman.lib.tile.core.internal.DefaultTileValidator} 
 * against following rules a) is a {@link java.lang.Double} greater then 0.0d 
 * or b) if a {@link java.lang.String} isn't NULL or EMPTY.
 * <p />
 * Following parameters in the <code>Tile</code> will be checked by default:
 * <ul>
 * <li>imageName, title, width, height</li>
 * </ul>
 * 
 * @param loader loads the given {@link com.github.naoghuman.lib.tile.core.Tile} 
 * as an {@link javafx.scene.image.Image} which will then be converted to a
 * {@link javafx.scene.layout.Background}.
 * @param tile the {@link com.github.naoghuman.lib.tile.core.Tile} which
 * should be loaded as a {@link javafx.scene.layout.Background}.
 * @return the loaded {@link javafx.scene.layout.Background}.
 * @see com.github.naoghuman.lib.tile.core.TileLoader
 * @see com.github.naoghuman.lib.tile.core.Tile
 * @see com.github.naoghuman.lib.tile.core.internal.DefaultTileValidator
 * @see javafx.scene.layout.Background
 * @see javafx.scene.image.Image
 */
public Background loadAsBackground(final TileLoader loader, final Tile tile)
```


```java
/**
 * Loads the given {@link com.github.naoghuman.lib.tile.core.Tile} with the
 * {@link com.github.naoghuman.lib.tile.core.TileLoader} as an {@link javafx.scene.image.Image}.
 * <p />
 * Internal the parameter from the <code>Tile</code> will be checked with 
 * the {@link com.github.naoghuman.lib.tile.core.internal.DefaultTileValidator} 
 * against following rules a) is a {@link java.lang.Double} greater then 0.0d 
 * or b) if a {@link java.lang.String} isn't NULL or EMPTY.
 * <p />
 * Following parameters in the <code>Tile</code> will be checked by default:
 * <ul>
 * <li>imageName, title, width, height</li>
 * </ul>
 *
 * @param loader loads the given {@link com.github.naoghuman.lib.tile.core.Tile} 
 * as an {@link javafx.scene.image.Image}.
 * @param tile the {@link com.github.naoghuman.lib.tile.core.Tile} which
 * should be loaded as an {@link javafx.scene.image.Image}.
 * @return the loaded {@link javafx.scene.image.Image}.
 * @see com.github.naoghuman.lib.tile.core.TileLoader
 * @see com.github.naoghuman.lib.tile.core.Tile
 * @see com.github.naoghuman.lib.tile.core.internal.DefaultTileValidator
 * @see javafx.scene.image.Image
 */
public Image loadAsImage(final TileLoader loader, final Tile tile)
```


<br />
### com.github.naoghuman.lib.tile.core.TileProvider<a name="TiPr" />

```Java
/**
 * With this <code>Interface</code> its possible to create a <code>TileValidator</code> 
 * which can be used to validate a {@link java.lang.Double} or a {@link java.lang.String} 
 * against still to be defined rules.
 * <p />
 * A concrete implementation from this <code>Interface</code> can be found in
 * the class {@link com.github.naoghuman.lib.tile.core.internal.DefaultTileValidator}
 * which validates if a) is a {@link java.lang.Double} greater then 0.0d or b)
 * if a {@link java.lang.String} isn't NULL or EMPTY. The class <code>DefaultTileValidator</code> 
 * can be accessed over {@link com.github.naoghuman.lib.tile.core.TileProvider#getDefaultTileValidator()}
 * if needed.
 *
 * @author Naoghuman
 * @see com.github.naoghuman.lib.tile.core.TileProvider#getDefaultTileValidator()
 * @see com.github.naoghuman.lib.tile.core.internal.DefaultTileValidator
 */
public interface TileValidator
```


```java
/**
 * Validates if the parameter <code>value</code> isn't NULL.
 *
 * @param value the parameter which should be validated.
 * @throws NullPointerException if (value == NULL).
 */
public default void validateIsNotNull(String value) throws NullPointerException
```


```java
/**
 * This method validates if the parameter <code>value</code> valid against
 * still to be defined rules.
 *
 * @param value the parameter which should be validated.
 * @throws IllegalArgumentException if the validation fails.
 */
public void validate(double value) throws IllegalArgumentException
```


```java
/**
 * This method validates if the parameter <code>value</code> isn't NULL or EMPTY.
 *
 * @param value the parameter which should be validated.
 * @throws NullPointerException if (value == NULL).
 * @throws IllegalArgumentException if the validation fails.
 */
public void validate(String value) throws NullPointerException, IllegalArgumentException
```


<br />
Internal<a name="In" />
---


<br />
### com.github.naoghuman.lib.tile.core.internal.DefaultTileValidator<a name="DeTiVa" />

```Java
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
public final class DefaultTileValidator implements TileValidator
```


```java
private static final Optional<DefaultTileValidator> instance = Optional.of(new DefaultTileValidator());

/**
 * Returns a singleton instance from the class <code>DefaultTileValidator</code>.
 *
 * @return a singleton instance from this class.
 */
public static final DefaultTileValidator getDefault()
```



<br />
License<a name="License" />
---

The project `Lib-Tile` and all sub-projects are licensed under [General Public License 3.0].



<br />
Autor<a name="Autor" />
---

The project `Lib-Tile` and all sub-projects are maintained by me, Peter Rogge. 
See [Contact](#Contact).



<br />
Contact<a name="Contact" />
---

You can reach me under <peter.rogge@yahoo.de>.



[//]: # (Images)



[//]: # (Links)
[Background]:https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/Background.html
[Download]:https://github.com/Naoghuman/lib-tile/blob/master/README.md#Download
[General Public License 3.0]:http://www.gnu.org/licenses/gpl-3.0.en.html
[Image]:https://docs.oracle.com/javase/8/javafx/api/javafx/scene/image/Image.html
[Installation]:https://github.com/Naoghuman/lib-tile/blob/master/README.md#Installation
[Lib-Tile]:https://github.com/Naoghuman/lib-tile
[Requirements]:https://github.com/Naoghuman/lib-tile/blob/master/README.md#Requirements
[Tile]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-Core/src/main/java/com/github/naoghuman/lib/tile/core/Tile.java
[TileLoader]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-Core/src/main/java/com/github/naoghuman/lib/tile/core/TileLoader.java
[TileProvider]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-Core/src/main/java/com/github/naoghuman/lib/tile/core/TileProvider.java
