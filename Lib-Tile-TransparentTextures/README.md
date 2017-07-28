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
    * [com.github.naoghuman.lib.tile.transparenttextures.TransparentTexturesTile](#TrTeTi)
    * [Cheat-Sheet TransparentTextures](#ChShTrTe)
* [License](#License)
* [Autor](#Autor)
* [Contact](#Contact)



Examples<a name="Examples" />
---

TODO Add in later version examples how to use this `api`.



Api<a name="Api" />
---

### com.github.naoghuman.lib.tile.transparenttextures.TransparentTexturesTile<a name="TrTeTi" />

```Java
/**
 * The <code>enum</code> TransparentTexturesTile is a collection from 
 * {@link com.github.naoghuman.lib.tile.core.Tile}s which representated the 
 * <code>Tileset</code> from the internet page <a href="https://www.transparenttextures.com/">https://www.transparenttextures.com/</a>.
 * <p />
 * The individual {@link com.github.naoghuman.lib.tile.core.Tile} can be loaded over the class 
 * {@link com.github.naoghuman.lib.tile.core.TileProvider} with the help from the concrete class 
 * {@link com.github.naoghuman.lib.tile.transparenttextures.images.TransparentTexturesTileLoader}.
 * <br />
 * See there the methods 
 * {@link com.github.naoghuman.lib.tile.core.TileProvider#loadAsBackground(com.github.naoghuman.lib.tile.core.TileLoader, com.github.naoghuman.lib.tile.core.Tile) }
 * and {@link com.github.naoghuman.lib.tile.core.TileProvider#loadAsImage(com.github.naoghuman.lib.tile.core.TileLoader, com.github.naoghuman.lib.tile.core.Tile) }.
 * <p>
 * Additional informations:
 * <br />
 * The parameters from the initialisation in this <code>Tileset</code> will be validate with the class 
 * {@link com.github.naoghuman.lib.tile.core.internal.DefaultTileValidator}. <code>DefaultTileValidator</code> 
 * allowed basic checks, for example if a {@link java.lang.String} is <code>NULL</code> or <code>EMPTY</code>.
 * 
 * @author Naoghuman
 * @see com.github.naoghuman.lib.tile.core.Tile
 * @see com.github.naoghuman.lib.tile.core.TileLoader
 * @see com.github.naoghuman.lib.tile.core.TileProvider
 * @see com.github.naoghuman.lib.tile.core.TileValidator
 * @see com.github.naoghuman.lib.tile.core.internal.DefaultTileValidator
 * @see com.github.naoghuman.lib.tile.transparenttextures.images.TransparentTexturesTileLoader
 */
public enum TransparentTexturesTile implements Tile
```

```Java
/**
 * The <code>Java</code> representation from the tile: 3Px Tile
 */
TT_3PX_TILE("tt-3px-tile.png", "3Px Tile", 100, 100, "Gre3g", "http://gre3g.livejournal.com/"), // NOI18N
    
/**
 * The <code>Java</code> representation from the tile: 45 Degree Fabric (Dark)
 */
TT_45_DEGREE_FABRIC_DARK("tt-45-degree-fabric-dark.png", "45 Degree Fabric (Dark)", 315, 315, "Atle Mo", "http://atle.co/"), // NOI18N

...
```


### Cheat-Sheet TransparentTextures<a name="ChShTrTe" />

In the [Cheat-Sheet from TransparentTextures] all `396` [Tile]s from the webpage 
https://www.transparenttextures.com/ are listed in the enum `TransparentTexturesTile`.



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
