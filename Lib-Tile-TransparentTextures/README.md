Lib-Tile-TransparentTextures
===



<br />
Intention
---

With the library `Lib-Tile-TransparentTextures` the developer have access to the 
tileset `Transparent Textures` from the internet page https://www.transparenttextures.com/ 
through the enum `TransparentTexturesTile`. Momentary that are `396` [Tiles]s.

The tile images from this tileset are outsourced in a own library 
[Lib-Tile-TransparentTextures-Images] to reduce the size from this library. One 
more advance is that you can use an `own` [AbstractTileLoader] in combination 
with the library `Lib-Tile-TransparentTextures`. So you don't need to include the 
library [Lib-Tile-TransparentTextures-Images] into your project which size is 
momenatry `13MB`.

> __Hint__  
> This libray is a part from the project [Lib-Tile]. Plz see for additional 
> informations like [Download], [Requirements] or [Installation] there. Thanks :smile:



<br />
Content
---

* [Examples](#Examples)
* [Api](#Api)
    * [com.github.naoghuman.lib.tile.transparenttextures.TransparentTexturesTile](#TrTeTi)
    * [Cheat-Sheet TransparentTextures](#ChShTrTe)
* [License](#License)
* [Autor](#Autor)
* [Contact](#Contact)



<br />
Examples<a name="Examples" />
---



<br />
Api<a name="Api" />
---


<br />
### com.github.naoghuman.lib.tile.transparenttextures.TransparentTexturesTile<a name="TrTeTi" />

```Java
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
```


<br />
### Cheat-Sheet TransparentTextures<a name="ChShTrTe" />

In the [Cheat-Sheet from TransparentTextures] all [Tile]s from the webpage 
https://www.transparenttextures.com/ are listed with the `name` from the value 
in the enum `TransparentTexturesTile`. Momentary that are `396` [Tiles]s defined.



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
[Cheat-Sheet from TransparentTextures]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-TransparentTextures/Cheat-Sheet-TransparentTextures.md
[Download]:https://github.com/Naoghuman/lib-tile/blob/master/README.md#Download
[General Public License 3.0]:http://www.gnu.org/licenses/gpl-3.0.en.html
[Installation]:https://github.com/Naoghuman/lib-tile/blob/master/README.md#Installation
[Lib-Tile]:https://github.com/Naoghuman/lib-tile
[Lib-Tile-TransparentTextures-Images]:https://github.com/Naoghuman/lib-tile-transparenttextures-images
[Requirements]:https://github.com/Naoghuman/lib-tile/blob/master/README.md#Requirements
[Tile]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-Core/src/main/java/com/github/naoghuman/lib/tile/core/Tile.java
