Lib-Tile-TransparentTextures
===



Intention
---

With the library `Lib-Tile-TransparentTextures` the developer have access to the 
tileset `Transparent Textures` from the internet page https://www.transparenttextures.com/ 
through the enum `TransparentTexturesTile`. Momentary that are `396` [Tile]s.

The tile images from this tileset are outsourced in a own library 
[Lib-Tile-TransparentTextures-Images] to reduce the size from this library. One 
more advance is that you can use an `own` [TileLoader] in combination with the 
library `Lib-Tile-TransparentTextures`. So you don't need to include the hole 
library (with all 396 images) [Lib-Tile-TransparentTextures-Images] into your 
project which size is momenatry `13MB`.

> __Hint__  
> This libray is a part from the project [Lib-Tile]. Plz see for additional 
> informations like [Download], [Requirements] or [Installation] there. Thanks :smile:



Content
---

* [Examples](#Examples)
* [Api](#Api)
    * [com.github.naoghuman.lib.tile.transparenttextures.TransparentTexturesTileSet](#TrTeTiSe)
    * [com.github.naoghuman.lib.tile.transparenttextures.images.TransparentTexturesTileLoader](#TrTeTiLo)
    * [Cheat-Sheet TransparentTextures](#ChShTrTe)
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

### com.github.naoghuman.lib.tile.transparenttextures.TransparentTexturesTileSet<a name="TrTeTiSe" />

```Java
/**
 * The class {@code TransparentTexturesTileSet} is a collection from 
 * {@link com.github.naoghuman.lib.tile.core.Tile}s which representated the 
 * {@code Tileset} from the internet page <a href="https://www.transparenttextures.com/">https://www.transparenttextures.com/</a>.
 * <p>
 * The individual {@link com.github.naoghuman.lib.tile.core.Tile} can be loaded 
 * with the class {@link com.github.naoghuman.lib.tile.core.TileProvider}.
 * <br>
 * See there the methods
 * <ul>
 * <li>{@link com.github.naoghuman.lib.tile.core.TileProvider#loadAsBackground(com.github.naoghuman.lib.tile.core.TileLoader, com.github.naoghuman.lib.tile.core.Tile)}</li>
 * <li>{@link com.github.naoghuman.lib.tile.core.TileProvider#loadAsImage(com.github.naoghuman.lib.tile.core.TileLoader, com.github.naoghuman.lib.tile.core.Tile)}</li>
 * </ul>
 * 
 * @author Naoghuman
 * @since 0.2.0
 * @see com.github.naoghuman.lib.tile.core.Tile
 * @see com.github.naoghuman.lib.tile.core.TileLoader
 * @see com.github.naoghuman.lib.tile.core.TileProvider
 */
public final class TransparentTexturesTileSet extends TileSet
```

```Java
private static final String SCOPE = TransparentTexturesTileLoader.getDefault().getScope();

/**
 * The {@code Java} representation from the tile: 3Px Tile
 */
public static final Tile TT_3PX_TILE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-3px-tile.png", "3Px Tile", 100, 100, "Gre3g", "http://gre3g.livejournal.com/"); // NOI18N
    
/**
 * The {@code Java} representation from the tile: 45 Degree Fabric (Dark)
 */
public static final Tile TT_45_DEGREE_FABRIC_DARK = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-45-degree-fabric-dark.png", "45 Degree Fabric (Dark)", 315, 315, "Atle Mo", "http://atle.co/"); // NOI18N
    
...
```


### com.github.naoghuman.lib.tile.transparenttextures.images.TransparentTexturesTileLoader<a name="TrTeTiLo" />

```Java
/**
 * The class {@code TransparentTexturesTileLoader} allowed to load a
 * {@link com.github.naoghuman.lib.tile.core.Tile} with the help from the class
 * {@link com.github.naoghuman.lib.tile.core.TileProvider}.
 * <p>
 * A {@code TileLoader} supports a {@code Tile} if gollowing conditions are true:
 * <ul>
 * <li>If the {@code scope} from both ({@code Tile} and {@code TileLoader}) are equals.</li>
 * <li>If this {@code TileLoader} supports the {@code prefix} from the {@code Tile}.</li>
 * </ul>
 * 
 * @author Naoghuman
 * @since 0.2.0
 * @see com.github.naoghuman.lib.tile.core.Tile
 * @see com.github.naoghuman.lib.tile.core.TileLoader
 * @see com.github.naoghuman.lib.tile.core.TileProvider
 */
public final class TransparentTexturesTileLoader extends TileLoader
```

```Java
/**
 * Returns a singleton instance from the class {@code TransparentTexturesTileLoader}.
 * 
 * @return a singleton instance from this class.
 */
public static final TransparentTexturesTileLoader getDefault()
```


### Cheat-Sheet TransparentTextures<a name="ChShTrTe" />

In the [Cheat-Sheet from TransparentTextures] all `396` [Tile]s from the webpage 
https://www.transparenttextures.com/ are listed in the class `TransparentTexturesTileSet`.



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
[Cheat-Sheet from TransparentTextures]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-TransparentTextures/Cheat-Sheet-TransparentTextures.md
[Download]:https://github.com/Naoghuman/lib-tile/blob/master/README.md#Download
[General Public License 3.0]:http://www.gnu.org/licenses/gpl-3.0.en.html
[Installation]:https://github.com/Naoghuman/lib-tile/blob/master/README.md#Installation
[Lib-Tile]:https://github.com/Naoghuman/lib-tile
[Lib-Tile-TransparentTextures-Images]:https://github.com/Naoghuman/lib-tile/tree/master/Lib-Tile-TransparentTextures-Images
[Requirements]:https://github.com/Naoghuman/lib-tile/blob/master/README.md#Requirements
[Tile]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-Core/src/main/java/com/github/naoghuman/lib/tile/core/Tile.java
[TileLoader]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-Core/src/main/java/com/github/naoghuman/lib/tile/core/TileLoader.java
