Lib-Tile-Core
===



<br />
Intention
---

The library `Lib-Tile-Core` provides the main functionalities to load a [Tile] 
(which is per definition a little transparent Image) as a [Background] or an 
[Image] with a concrete implementation from an [AbstractTileLoader].

> __Hint__  
> This libray is a part from the project [Lib-Tile]. Plz see for additional 
> informations like [Download], [Requirements] or [Installation] there. Thanks :smile:



<br />
Content
---

* [Examples](#Examples)
* [Api](#Api)
    * [com.github.naoghuman.lib.tile.core.AbstractTileLoader](#AbTiLo)
    * [com.github.naoghuman.lib.tile.core.DefaultTileLoader](#DeTiLo)
    * [com.github.naoghuman.lib.tile.core.Tile](#Ti)
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
### com.github.naoghuman.lib.tile.core.AbstractTileLoader<a name="AbTiLo" />

```Java
/**
 * This interface defines the minimal functionalities which should be supported
 * by an <code>AbstractTileLoader</code>. With a concrete implementation from
 * this <code>Interface</code> its then be possible to load a
 * {@link com.github.naoghuman.lib.tile.core.Tile} (which is per definition a
 * little transparent Image) as a {@link javafx.scene.layout.Background} or an
 * {@link javafx.scene.image.Image}.
 *
 * @author Naoghuman
 * @see com.github.naoghuman.lib.tile.core.Tile
 * @see javafx.scene.layout.Background
 * @see javafx.scene.image.Image
 */
public interface AbstractTileLoader {
```

<br />
```Java
/**
 * The parameter <code>prefix</code> defines if the
 * {@link com.github.naoghuman.lib.tile.core.Tile} is supported by this
 * <code>AbstractTileLoader</code> or not.
 *
 * @return the prefix which defines if the{@link com.github.naoghuman.lib.tile.core.Tile} 
 * is supported or not by this <code>AbstractTileLoader</code>.
 * @see com.github.naoghuman.lib.tile.core.Tile
 */
public String getPrefix();
```

<br />
```Java
/**
 * Checks the given {@link com.github.naoghuman.lib.tile.core.Tile} if it's
 * supported by this <code>AbstractTileLoader</code>.
 *
 * @param tile the {@link com.github.naoghuman.lib.tile.core.Tile} which
 * should be checked if it's supported by this <code>AbstractTileLoader</code> or not.
 * @return <code>true</code> if the {@link com.github.naoghuman.lib.tile.core.Tile} 
 * is supported by this <code>AbstractTileLoader</code>, otherwise <code>false</code>.
 * @see com.github.naoghuman.lib.tile.core.Tile
 */
public boolean isSupported(Tile tile);
```

<br />
```Java
/**
 * Loads the given {@link com.github.naoghuman.lib.tile.core.Tile} with the
 * {@link com.github.naoghuman.lib.tile.core.AbstractTileLoader} as an
 * {@link javafx.scene.image.Image} which will be converted to a
 * {@link javafx.scene.layout.Background}.
 * <p />
 * This method delegates to the method
 * {@link com.github.naoghuman.lib.tile.core.DefaultTileLoader#loadAsBackground(AbstractTileLoader, Tile)}.
 * For additional information plz see the JavaDoc there.
 * <br />
 * See for an example the method
 * {@link com.github.naoghuman.lib.tile.transparenttextures.images.TransparentTexturesTileLoader#loadAsBackground(Tile)}
 * in the library <code>Lib-Tile-TransparentTextures-Images</code>.
 *
 * @param tile the {@link com.github.naoghuman.lib.tile.core.Tile} which
 * should be loaded as a {@link javafx.scene.layout.Background}.
 * @return the loaded {@link javafx.scene.layout.Background}.
 * @see com.github.naoghuman.lib.tile.core.DefaultTileLoader#loadAsBackground(AbstractTileLoader, Tile)
 * @see com.github.naoghuman.lib.tile.core.Tile
 * @see com.github.naoghuman.lib.tile.transparenttextures.images.TransparentTexturesTileLoader#loadAsBackground(Tile)
 * @see javafx.scene.layout.Background
 * @see javafx.scene.image.Image
 */
public Background loadAsBackground(Tile tile);
```

<br />
```Java
/**
 * Loads the given {@link com.github.naoghuman.lib.tile.core.Tile} with the
 * {@link com.github.naoghuman.lib.tile.core.AbstractTileLoader} as an
 * {@link javafx.scene.image.Image}.
 * <p />
 * This method delegates to the method
 * {@link com.github.naoghuman.lib.tile.core.DefaultTileLoader#loadAsImage(AbstractTileLoader, Tile)}.
 * For additional information plz see the JavaDoc there.
 * <br />
 * See for example the method
 * {@link com.github.naoghuman.lib.tile.transparenttextures.images.TransparentTexturesTileLoader#loadAsImage(Tile)}
 * in the library <code>Lib-Tile-TransparentTextures-Images</code>.
 *
 * @param tile the {@link com.github.naoghuman.lib.tile.core.Tile} which
 * should be loaded as a {@link javafx.scene.image.Image}.
 * @return the loaded {@link javafx.scene.image.Image}.
 * @see com.github.naoghuman.lib.tile.core.DefaultTileLoader#loadAsImage(AbstractTileLoader, Tile)
 * @see com.github.naoghuman.lib.tile.core.Tile
 * @see com.github.naoghuman.lib.tile.transparenttextures.images.TransparentTexturesTileLoader#loadAsImage(Tile)
 * @see javafx.scene.image.Image
 */
public Image loadAsImage(Tile tile);
```


<br />
### com.github.naoghuman.lib.tile.core.DefaultTileLoader<a name="DeTiLo" />

```Java
/**
 * The singleton <code>DefaultTileLoader</code> allowed the developer to load a
 * {@link com.github.naoghuman.lib.tile.core.Tile} (which is per definition a
 * little transparent Image) as a {@link javafx.scene.layout.Background} or an
 * {@link javafx.scene.image.Image} with a concrete implementation from an
 * {@link com.github.naoghuman.lib.tile.core.AbstractTileLoader}.
 *
 * @author Naoghuman
 * @see com.github.naoghuman.lib.tile.core.AbstractTileLoader
 * @see com.github.naoghuman.lib.tile.core.Tile
 * @see javafx.scene.layout.Background
 * @see javafx.scene.image.Image
 */
public final class DefaultTileLoader {
```

<br />
```Java
/**
 * Returns a singleton instance from the class <code>DefaultTileLoader</code>.
 *
 * @return a singleton instance from the class
 * <code>DefaultTileLoader</code>.
 */
public static final DefaultTileLoader getDefault()
```

<br />
```Java
/**
 * Loads the given {@link com.github.naoghuman.lib.tile.core.Tile} with the
 * {@link com.github.naoghuman.lib.tile.core.AbstractTileLoader} as an
 * {@link javafx.scene.image.Image} which will be converted to a
 * {@link javafx.scene.layout.Background}.
 * <p />
 * Internal following checks will be performed:
 * <ul>
 * <li>Checks if the
 * {@link com.github.naoghuman.lib.tile.core.AbstractTileLoader} supports
 * the {@link com.github.naoghuman.lib.tile.core.Tile}. If not an
 * {@link java.lang.UnsupportedOperationException} is thrown.</li>
 * <li>Checks if the parameters 'width' and 'height' from the
 * <code>Tile</code> is greater then 0.0d. If not the a
 * IllegalArgumentException will be thrown.</li>
 * <li>Checks if the parameter 'imageName' from the <code>Tile</code> is not
 * NULL and not empty. Throws otherwise a NullPointerException or a
 * IllegalArgumentException.</li>
 * <li>Checks if the parameter 'title' from the <code>Tile</code> is not
 * NULL and not empty. Throws otherwise a NullPointerException or a
 * IllegalArgumentException.</li>
 * </ul>
 *
 * @param loader loads the given
 * {@link com.github.naoghuman.lib.tile.core.Tile} as an
 * {@link javafx.scene.image.Image} which will then be converted to a
 * {@link javafx.scene.layout.Background}.
 * @param tile the {@link com.github.naoghuman.lib.tile.core.Tile} which
 * should be loaded as a {@link javafx.scene.layout.Background}.
 * @return the loaded {@link javafx.scene.layout.Background}.
 * @see com.github.naoghuman.lib.tile.core.AbstractTileLoader
 * @see com.github.naoghuman.lib.tile.core.Tile
 * @see javafx.scene.layout.Background
 * @see javafx.scene.image.Image
 * @see #checkParameterDimension(double, double)
 * @see #checkParameterImageName(java.lang.String)
 * @see #checkParameterTitle(java.lang.String)
 */
public Background loadAsBackground(final AbstractTileLoader loader, final Tile tile)
```

<br />
```Java
/**
 * Loads the given {@link com.github.naoghuman.lib.tile.core.Tile} with the
 * {@link com.github.naoghuman.lib.tile.core.AbstractTileLoader} as an
 * {@link javafx.scene.image.Image}.
 * <p />
 * Internal following checks will be performed:
 * <ul>
 * <li>Checks if the
 * {@link com.github.naoghuman.lib.tile.core.AbstractTileLoader} supports
 * the {@link com.github.naoghuman.lib.tile.core.Tile}. If not an
 * {@link java.lang.UnsupportedOperationException} is thrown.</li>
 * <li>Checks if the parameters 'width' and 'height' from the
 * <code>Tile</code> is greater then 0.0d. If not the a
 * IllegalArgumentException will be thrown.</li>
 * <li>Checks if the parameter 'imageName' from the <code>Tile</code> is not
 * NULL and not empty. Throws otherwise a NullPointerException or a
 * IllegalArgumentException.</li>
 * <li>Checks if the parameter 'title' from the <code>Tile</code> is not
 * NULL and not empty. Throws otherwise a NullPointerException or a
 * IllegalArgumentException.</li>
 * </ul>
 *
 * @param loader loads the given
 * {@link com.github.naoghuman.lib.tile.core.Tile} as an
 * {@link javafx.scene.image.Image}.
 * @param tile the {@link com.github.naoghuman.lib.tile.core.Tile} which
 * should be loaded as an {@link javafx.scene.image.Image}.
 * @return the loaded {@link javafx.scene.image.Image}.
 * @see com.github.naoghuman.lib.tile.core.AbstractTileLoader
 * @see com.github.naoghuman.lib.tile.core.Tile
 * @see javafx.scene.image.Image
 * @see #checkParameterDimension(double, double)
 * @see #checkParameterImageName(java.lang.String)
 * @see #checkParameterTitle(java.lang.String)
 */
public Image loadAsImage(final AbstractTileLoader loader, final Tile tile)
```


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
public interface Tile {
```

<br />
```Java
/**
 * The autor is the creator from the <code>Tile</code>.
 * <p />
 * This parameter is optional. If this parameter is NULL or empty then the
 * parameter <code>autorUrl</code> won't be evaluated.
 *
 * @return the autor from the <code>Tile</code>.
 * @see #getAutorUrl()
 */
public String getAutor();
```

<br />
```Java
/**
 * The autor url from the <code>Tile</code>.
 * <p />
 * This parameter is optional. If the parameter <code>autor</code> is NULL
 * or empty then this parameter won't be evaluated.
 *
 * @return the autor url from the <code>Tile</code>.
 * @see #getAutor()
 */
public String getAutorUrl();
```

<br />
```Java
/**
 * The height from a single <code>Tile</code> image.
 * <p />
 * This parameter can't be <= 0.0d.
 *
 * @return the height from a single <code>Tile</code> image.
 */
public double getHeight();
```

<br />
```Java
/**
 * The image name from the <code>Tile</code>.
 * <p />
 * This parameter can't be NULL or empty.
 *
 * @return the image name from the <code>Tile</code>.
 */
public String getImageName();
```

<br />
```Java
/**
 * The title from the <code>Tile</code>.
 * <p />
 * This parameter can't be NULL or empty.
 *
 * @return the title from the <code>Tile</code>.
 */
public String getTitle();
```

<br />
```Java
/**
 * The width from a single <code>Tile</code> image.
 * <p />
 * This parameter can't be <= 0.0d.
 *
 * @return the width from a single <code>Tile</code> image.
 */
public double getWidth();
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
[AbstractTileLoader]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-Core/src/main/java/com/github/naoghuman/lib/tile/core/AbstractTileLoader.java
[Background]:https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/Background.html
[Download]:https://github.com/Naoghuman/lib-tile/blob/master/README.md#Download
[General Public License 3.0]:http://www.gnu.org/licenses/gpl-3.0.en.html
[Image]:https://docs.oracle.com/javase/8/javafx/api/javafx/scene/image/Image.html
[Installation]:https://github.com/Naoghuman/lib-tile/blob/master/README.md#Installation
[Lib-Tile]:https://github.com/Naoghuman/lib-tile
[Requirements]:https://github.com/Naoghuman/lib-tile/blob/master/README.md#Requirements
[Tile]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-Core/src/main/java/com/github/naoghuman/lib/tile/core/Tile.java
