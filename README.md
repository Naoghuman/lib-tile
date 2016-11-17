Lib-Tile
===



<br />
Intention
---

`Lib-Tile` is a multi [Maven] project written in [JavaFX] and [NetBeans IDE] 8.0.2 
and provides the functionalities to use and handle easily [Tile]s in your [JavaFX] 
application.

A [Tile] is per definition a little transparent [Image] which overlay a 
background-color or -image with the help of repetitions from the image in a layer.

The current `version` is `0.1.0` from 08.14.2016.

<br />
_Image:_ Crimson Night &#040;Dark / Landscape&#041; with different tile images

> __Hint__  
> Normally only one [Tile] can shown simultaneously. For demonstration purpose 
> I have merge different [Tile]s in one picture.

![different-tile-images.png][different-tile-images]

> __Hint__  
> This image is from the webpage https://wall.alphacoders.com. The image haven't 
> neither a `created by` or `shared by` flag &#040;see http://alphacoders.com/site/faq &#041;. 
> If anyone is the autor and won't that I use this image here in my open souce 
> project plz send me an email &#040;see [Contact](#Contact)&#041; and I will 
> remove it. Thanks for your great work :smiley:.



<br />
Content
---

* [Demo](#Demo)
* [Libraries](#Libraries)
    - [Lib-Tile-Core](#LiTiCo)
    - [Lib-Tile-TransparentTextures](#LiTiTrTe)
    - [Lib-Tile-TransparentTextures-Images](#LiTiTrTeIm)
* [Download](#Download)
* [Requirements](#Requirements)
* [Installation](#Installation)
* [Documentation](#Documentation)
* [Contribution](#Contribution)
* [License](#License)
* [Autor](#Autor)
* [Contact](#Contact)



<br />
Demo<a name="Demo" />
---

The application [Lib-Tile-Demo] shows a `demonstration` how to use and handle 
the features from the libraries in the project `Lib-Tile`. 

<br />
_Image:_ Default demo application
![demo-application-default.png][demo-application-default]

<br />
Momentary the developer have following features during the demo application:
* Choose your own background image.
    * Currently only images from the internet &#040;http or https&#041; with 
      the size 1280x720 are supported.
    * For example: https://cloud.githubusercontent.com/assets/8161815/17748160/601043ba-64b8-11e6-84dd-6e7075dbcf80.jpg
    * In a later version I plan to implement the option to load also local images.
* Define your own background color.
    * Currently only single colors are supported.
    * For a later version I planed the option to define a [LinearGradient] or a 
      [RadialGradient] colors through `css` &#040;[JavaFX CSS Reference Guide]&#041;.
* Browse through all [Tile]s from the tileset `Transparent Textures`.

<br />
For more informations and examples plz see the [ReadMe from Lib-Tile-Demo].



<br />
Libraries<a name="Libraries" />
---

Like I said before `Lib-Tile` is a multi [Maven] project which contains different 
`sub-libraries`. Which sub-libraries are the best for you depends from your 
requirements in your project.

To use `Lib-Tile` in your project you need minimal the library `Lib-Tile-Core` 
plus a concrete implementation from an [TileLoader] which loads your own [Tile]s 
images. How that work will be explained in the sub-project [Lib-Tile-Demo](#LiTiDe) 
or have a look into the class [TransparentTexturesTileLoader] from the library 
[Lib-Tile-TransparentTextures-Images](#LiTiTrTeIm).

Natural you can use additional libraries which contains predefined `tilesets`. 
Currently supported is [Transparent Textures] with the libraries 
[Lib-Tile-TransparentTextures](#LiTiTrTe) and [Lib-Tile-TransparentTextures-Images](#LiTiTrTeIm).


<br />
### Lib-Tile-Core<a name="LiTiCo" />

The library `Lib-Tile-Core` provides the API to load a [Tile] (which is per definition 
a little transparent Image) as a [Background] or an [Image] with a concrete 
implementation from a [TileLoader].

The main point for access the functionalities from this <code>API</code> is the 
class [TileProvider]. For example with the method TileProvider#loadAsBackground(TileLoader, Tile) 
the developer can load a [Tile] as an [Background].

<br />
Class [TileProvider]
```java
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
For more informations and examples plz see the [ReadMe from Lib-Tile-Core].


<br />
### Lib-Tile-TransparentTextures<a name="LiTiTrTe" />

With the library `Lib-Tile-TransparentTextures` the developer have access to the 
tileset `Transparent Textures` from the internet page https://www.transparenttextures.com/ 
through the enum `TransparentTexturesTile`. Momentary that are `396` [Tile]s.

The tile images from this tileset are outsourced in a own library 
`Lib-Tile-TransparentTextures-Images` to reduce the size from this library. One 
more advance is that you can use an `own` [TileLoader] in combination with the 
library `Lib-Tile-TransparentTextures`. So you don't need to include the library 
`Lib-Tile-TransparentTextures-Images` into your project which size is momenatry 
`13MB`.

<br />
Enum [TransparentTexturesTile]
```java
/**
 * The <code>enum</code> TransparentTexturesTile is a collection from 
 * {@link com.github.naoghuman.lib.tile.core.Tile}s which representated the 
 * <code>Tileset</code> from the internet page https://www.transparenttextures.com/.
 * <p />
 * The individual {@link com.github.naoghuman.lib.tile.core.Tile} can be loaded 
 * with the class {@link com.github.naoghuman.lib.tile.transparenttextures.images.TransparentTexturesTileLoader} 
 * from the associated library <code>Lib-Tile-TransparentTextures-Images</code>.
 *
 * @author Naoghuman
 * @see com.github.naoghuman.lib.tile.core.Tile
 * @see com.github.naoghuman.lib.tile.transparenttextures.images.TransparentTexturesTileLoader
 */
public enum TransparentTexturesTile implements Tile {

    /**
     * The <code>Java</code> representation from the tile: 3Px Tile
     */
    TT_3PX_TILE("tt-3px-tile.png", "3Px Tile", 100, 100, "Gre3g", "http://gre3g.livejournal.com/"), // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: 45 Degree Fabric (Dark)
     */
    TT_45_DEGREE_FABRIC_DARK("tt-45-degree-fabric-dark.png", "45 Degree Fabric (Dark)", 315, 315, "Atle Mo", "http://atle.co/"), // NOI18N

    ...
}
```

<br />
For more informations and examples plz see the [ReadMe from Lib-Tile-TransparentTextures].


<br />
### Lib-Tile-TransparentTextures-Images<a name="LiTiTrTeIm" />

The library `Lib-Tile-TransparentTextures-Images` contains all images from the 
tileset `Transparent Textures` and the loader [TransparentTexturesTileLoader] 
which allowed the developer to load a [Tile] image from the `Enum` 
[TransparentTexturesTile].

<br />
Class [TransparentTexturesTileLoader]
```java
/**
 * The singleton <code>TransparentTexturesTileLoader</code> is a concrete implementation 
 * from the <code>Interface</code> {@link com.github.naoghuman.lib.tile.core.TileLoader}.
 * <p />
 * With this class it's possible to load a {@link com.github.naoghuman.lib.tile.core.Tile} 
 * (which is per definition a little transparent Image) from the enum 
 * {@link com.github.naoghuman.lib.tile.transparenttextures.TransparentTexturesTile} as a 
 * {@link javafx.scene.layout.Background} or an {@link javafx.scene.image.Image} with the 
 * help from {@link com.github.naoghuman.lib.tile.core.TileProvider#loadAsBackground(TileLoader, Tile)} 
 * or {@link com.github.naoghuman.lib.tile.core.TileProvider#loadAsImage(TileLoader, Tile)}.
 *
 * @author Naoghuman
 * @see com.github.naoghuman.lib.tile.core.Tile
 * @see com.github.naoghuman.lib.tile.core.TileLoader
 * @see com.github.naoghuman.lib.tile.core.TileProvider
 * @see com.github.naoghuman.lib.tile.transparenttextures.TransparentTexturesTile
 * @see javafx.scene.layout.Background
 * @see javafx.scene.image.Image
 */
public final class TransparentTexturesTileLoader implements TileLoader
```


```java
private static final Optional<TransparentTexturesTileLoader> instance = Optional.of(new TransparentTexturesTileLoader());

/**
 * Returns a singleton instance from the class <code>TransparentTexturesTileLoader</code>.
 * 
 * @return a singleton instance from the class <code>TransparentTexturesTileLoader</code>.
 */
public static final TransparentTexturesTileLoader getDefault()
```

<br />
For more informations and examples plz see the [ReadMe from Lib-Tile-TransparentTextures-Images].



<br />
Download<a name="Download" />
---

There are different `zip` files as download available. Plz choose the right one 
in dependency from your necessities:
* Download Lib-Tile-Core-0.1.0.zip
    * Contains only the library lib-tile-core-0.1.0.jar.
    * You need to define your own [TileLoader] and your own [Tile]s images in 
      your application.
* Download Lib-Tile-Core-And-TransparentTextures-0.1.0.zip
    * Contains the libraries lib-tile-core-0.1.0.jar, lib-tile-transparenttextures-0.1.0.jar, 
      lib-tile-transparenttextures-images-0.1.0.jar.
    * You can use the predefined tileset `Transparent Textures` in your application.
* Download Lib-Tile-Demo-0.1.0-SNAPSHOT.zip
    * Contains the library lib-tile-demo-0.1.0-SNAPSHOT.jar as an executable jar 
      with included libraries lib-tile-core-0.1.0.jar, lib-tile-transparenttextures-0.1.0.jar, 
      lib-tile-transparenttextures-images-0.1.0.jar.
    * Use the demo application as a preview how the chosen [Tile]s will be looks 
      over your chosen background image/-color.

Access to the downloads are here: [Download Lib-Tile]


<br />
Requirements<a name="Requirements" />
---

* On your system you need [JRE 8] or [JDK 8] installed.



<br />
Installation<a name="Installation" />
---

Depends on your necessities you have different options like in the section 
[Download](#Download) is shown. Download the right `zip` file, extract it and 
include the jar file&#040;s&#041; into your project. That was it :smile: .



<br />
Documentation<a name="Documentation" />
---

In general `Lib-Tile` and `Lib-Tile-Demo` haven't an official documentation. But 
you can
* read the `README.md` from every project and
* read the [JavaDoc] in the project and libraries.

where `examples` and the `api` are shown and explained.



<br />
Contribution<a name="Contribution" />
---

* If you find a `Bug` I will be glad if you could report an [Issue].
* If you want to `contribute` to the project plz fork the project and do a [Pull Request].



<br />
License<a name="License" />
---

The project `Lib-Tile` and all sub-projects are licensed under [General Public License 3.0].



<br />
Autor<a name="Autor" />
---

The project `Lib-Tile` and all sub-projects are maintained by me, Peter Rogge. See [Contact](#Contact).



<br />
Contact<a name="Contact" />
---

You can reach me under <peter.rogge@yahoo.de>.



[//]: # (Images)
[demo-application-default]:https://cloud.githubusercontent.com/assets/8161815/17342760/efe5803c-58fa-11e6-905b-f8a0d8ff856d.png
[different-tile-images]:https://cloud.githubusercontent.com/assets/8161815/17412537/8fd2c446-5a7d-11e6-82b2-34aca4f5f870.png



[//]: # (Links)
[Background]:https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/Background.html
[Download Lib-Tile]:https://github.com/Naoghuman/lib-tile/releases
[General Public License 3.0]:http://www.gnu.org/licenses/gpl-3.0.en.html
[Image]:https://docs.oracle.com/javase/8/javafx/api/javafx/scene/image/Image.html
[Issue]:https://github.com/Naoghuman/lib-tile/issues
[JavaDoc]:http://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html
[JavaFX]:http://docs.oracle.com/javase/8/javase-clienttechnologies.htm
[JavaFX CSS Reference Guide]:https://docs.oracle.com/javase/8/javafx/api/javafx/scene/doc-files/cssref.html
[JDK 8]:http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
[JRE 8]:http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html
[Lib-Tile]:https://github.com/Naoghuman/lib-tile
[Lib-Tile-Demo]:https://github.com/Naoghuman/lib-tile-demo
[LinearGradient]:https://docs.oracle.com/javase/8/javafx/api/javafx/scene/paint/LinearGradient.html
[Maven]:http://maven.apache.org/
[NetBeans IDE]:https://netbeans.org/
[Pull Request]:https://help.github.com/articles/using-pull-requests
[RadialGradient]:https://docs.oracle.com/javase/8/javafx/api/javafx/scene/paint/RadialGradient.html
[ReadMe from Lib-Tile-Core]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-Core
[ReadMe from Lib-Tile-Demo]:https://github.com/Naoghuman/lib-tile-demo/blob/master/README.md
[ReadMe from Lib-Tile-TransparentTextures]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-TransparentTextures
[ReadMe from Lib-Tile-TransparentTextures-Images]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-TransparentTextures-Images
[StartApplication]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-Demo/src/main/java/com/github/naoghuman/lib/tile/demo/application/StartApplication.java
[Tile]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-Core/src/main/java/com/github/naoghuman/lib/tile/core/Tile.java
[TileLoader]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-Core/src/main/java/com/github/naoghuman/lib/tile/core/TileLoader.java
[TileProvider]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-Core/src/main/java/com/github/naoghuman/lib/tile/core/TileProvider.java
[Transparent Textures]:https://www.transparenttextures.com/
[TransparentTexturesTile]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-TransparentTextures/src/main/java/com/github/naoghuman/lib/tile/transparenttextures/TransparentTexturesTile.java
[TransparentTexturesTileLoader]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-TransparentTextures-Images/src/main/java/com/github/naoghuman/lib/tile/transparenttextures/images/TransparentTexturesTileLoader.java
