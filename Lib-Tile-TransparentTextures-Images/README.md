Lib-Tile-TransparentTextures-Images
===



<br />
Intention
---

The library `Lib-Tile-TransparentTextures-Images` contains all images from the 
tileset `Transparent Textures` and the loader [TransparentTexturesTileLoader] 
which allowed the developer to load a [Tile] image from the enum 
[TransparentTexturesTile].

> __Hint__  
> This libray is a part from the project [Lib-Tile]. Plz see for additional 
> informations like [Download], [Requirements] or [Installation] there. Thanks :smile:



<br />
Content
---

* [Examples](#Examples)
* [Api](#Api)
    * [com.github.naoghuman.lib.tile.transparenttextures.images.TransparentTexturesTileLoader](#TrTeTiLo)
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
### com.github.naoghuman.lib.tile.transparenttextures.TransparentTexturesTile<a name="TrTeTi" />

```Java
/**
 * The singleton <code>TransparentTexturesTileLoader</code> is a concrete implementation 
 * from the interface {@link com.github.naoghuman.lib.tile.core.AbstractTileLoader}.
 * <p />
 * With this class it's possible to load a {@link com.github.naoghuman.lib.tile.core.Tile} 
 * (which is per definition a little transparent Image) from the enum 
 * {@link com.github.naoghuman.lib.tile.transparenttextures.TransparentTexturesTile} as a 
 * {@link javafx.scene.layout.Background} or an {@link javafx.scene.image.Image}.
 *
 * @author Naoghuman
 * @see com.github.naoghuman.lib.tile.core.AbstractTileLoader
 * @see com.github.naoghuman.lib.tile.core.Tile
 * @see com.github.naoghuman.lib.tile.transparenttextures.TransparentTexturesTile
 * @see javafx.scene.layout.Background
 * @see javafx.scene.image.Image
 */
public final class TransparentTexturesTileLoader implements AbstractTileLoader
```


```Java
private static final Optional<TransparentTexturesTileLoader> instance = Optional.of(new TransparentTexturesTileLoader());

/**
 * Returns a singleton instance from the class <code>TransparentTexturesTileLoader</code>.
 * 
 * @return a singleton instance from the class <code>TransparentTexturesTileLoader</code>.
 */
public static final TransparentTexturesTileLoader getDefault()
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
[Download]:https://github.com/Naoghuman/lib-tile/blob/master/README.md#Download
[General Public License 3.0]:http://www.gnu.org/licenses/gpl-3.0.en.html
[Installation]:https://github.com/Naoghuman/lib-tile/blob/master/README.md#Installation
[Lib-Tile]:https://github.com/Naoghuman/lib-tile
[Requirements]:https://github.com/Naoghuman/lib-tile/blob/master/README.md#Requirements
[Tile]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-Core/src/main/java/com/github/naoghuman/lib/tile/core/Tile.java
[TransparentTexturesTile]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-TransparentTextures/src/main/java/com/github/naoghuman/lib/tile/transparenttextures/TransparentTexturesTile.java
[TransparentTexturesTileLoader]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-TransparentTextures-Images/src/main/java/com/github/naoghuman/lib/tile/transparenttextures/images/TransparentTexturesTileLoader.java
