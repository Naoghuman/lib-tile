Lib-Tile-TransparentTextures-Images
===



<br />
Intention
---

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
 * The singleton <code>TransparentTexturesTileLoader</code> is a concrete 
 * implementation from the interface {@link com.github.naoghuman.lib.tile.core.AbstractTileLoader}.
 * <p />
 * With this class it's possible to load a {@link com.github.naoghuman.lib.tile.core.Tile} 
 * which must be defined in the enum 
 * {@link com.github.naoghuman.lib.tile.transparenttextures.TransparentTexturesTile}
 * as a {@link javafx.scene.layout.Background} or an {@link javafx.scene.image.Image}.
 *
 * @author Naoghuman
 * @see com.github.naoghuman.lib.tile.core.AbstractTileLoader
 * @see com.github.naoghuman.lib.tile.core.Tile
 * @see com.github.naoghuman.lib.tile.transparenttextures.TransparentTexturesTile
 * @see javafx.scene.layout.Background
 * @see javafx.scene.image.Image
 */
public final class TransparentTexturesTileLoader implements AbstractTileLoader {
```

<br />
```Java
@Override
public String getPrefix() {
    return "tt-"; // NOI18N
}
```

<br />
```Java
@Override
public boolean isSupported(final Tile tile) {
    final String name = tile.getImageName();
    final boolean isSupported = 
            (name != null)
            && (!name.trim().isEmpty())
            && (name.startsWith(this.getPrefix()));

    return isSupported;
}
```

<br />
```Java
@Override
public Background loadAsBackground(final Tile tile) {
    return DefaultTileLoader.getDefault().loadAsBackground(TransparentTexturesTileLoader.getDefault(), tile);
}
```

<br />
```Java
Override
public Image loadAsImage(final Tile tile) {
    return DefaultTileLoader.getDefault().loadAsImage(TransparentTexturesTileLoader.getDefault(), tile);
}
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

