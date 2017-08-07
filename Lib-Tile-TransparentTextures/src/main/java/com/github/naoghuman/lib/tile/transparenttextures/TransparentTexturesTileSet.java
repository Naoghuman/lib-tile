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
package com.github.naoghuman.lib.tile.transparenttextures;

import com.github.naoghuman.lib.tile.core.Tile;
import com.github.naoghuman.lib.tile.core.TileProvider;
import com.github.naoghuman.lib.tile.core.TileSet;
import com.github.naoghuman.lib.tile.transparenttextures.images.TransparentTexturesTileLoader;
import java.util.Optional;

/**
 * The <code>enum</code> TransparentTexturesTileSet is a collection from 
 {@link com.github.naoghuman.lib.tile.core.Tile}s which representated the 
 * <code>Tileset</code> from the internet page <a href="https://www.transparenttextures.com/">https://www.transparenttextures.com/</a>.
 * <p>
 * The individual {@link com.github.naoghuman.lib.tile.core.Tile} can be loaded over the class 
 * {@link com.github.naoghuman.lib.tile.core.TileProvider} with the help from the concrete class 
 * {@link com.github.naoghuman.lib.tile.transparenttextures.images.TransparentTexturesTileLoader}.<br>
 * See there the methods 
 * {@link com.github.naoghuman.lib.tile.core.TileProvider#loadAsBackground(com.github.naoghuman.lib.tile.core.TileLoader, com.github.naoghuman.lib.tile.core.Tile) }
 * and {@link com.github.naoghuman.lib.tile.core.TileProvider#loadAsImage(com.github.naoghuman.lib.tile.core.TileLoader, com.github.naoghuman.lib.tile.core.Tile) }.
 * <p>
 * Additional informations:<br>
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
public final class TransparentTexturesTileSet extends TileSet {
    
    private static final String SCOPE = TransparentTexturesTileLoader.getDefault().getScope();

    /**
     * The <code>Java</code> representation from the tile: 3Px Tile
     */
    public static final Tile TT_3PX_TILE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-3px-tile.png", "3Px Tile", 100, 100, "Gre3g", "http://gre3g.livejournal.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: 45 Degree Fabric (Dark)
     */
    public static final Tile TT_45_DEGREE_FABRIC_DARK = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-45-degree-fabric-dark.png", "45 Degree Fabric (Dark)", 315, 315, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: 45 Degree Fabric (Light)
     */
    public static final Tile TT_45_DEGREE_FABRIC_LIGHT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-45-degree-fabric-light.png", "45 Degree Fabric (Light)", 315, 315, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: 60° lines
     */
    public static final Tile TT_60_LINES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-60-lines.png", "60° lines", 31, 31, "Atle Mo", "http://atle.co/"); // NOI18N

    /**
     * The <code>Java</code> representation from the tile: Absurdity
     */
    public static final Tile TT_ABSURDITY = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-absurdity.png", "Absurdity", 4, 4, "Carlos Valdez", "http://saveder.blogspot.de/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: AG Square
     */
    public static final Tile TT_AG_SQUARE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-ag-square.png", "AG Square", 50, 50, "Erikdel", "http://www.erikdel.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Always Grey
     */
    public static final Tile TT_ALWAYS_GREY = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-always-grey.png", "Always Grey", 35, 35, "Stefan Aleksic", "http://www.facebook.com/stefanaleksic88"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Arabesque
     */
    public static final Tile TT_ARABESQUE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-arabesque.png", "Arabesque", 110, 110, "David Sanchez", "http://www.twitter.com/davidsancar"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Arches
     */
    public static final Tile TT_ARCHES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-arches.png", "Arches", 103, 23, "Kim Ruddock"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Argyle
     */
    public static final Tile TT_ARGYLE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-argyle.png", "Argyle", 106, 96, "Will Monson"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Asfalt (Dark)
     */
    public static final Tile TT_ASFALT_DARK = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-asfalt-dark.png", "Asfalt (Dark)", 466, 349, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Asfalt (Light)
     */
    public static final Tile TT_ASFALT_LIGHT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-asfalt-light.png", "Asfalt (Light)", 466, 349, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Assault
     */
    public static final Tile TT_ASSAULT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-assault.png", "Assault", 154, 196, "Hendrik Lammers", "http://www.hendriklammers.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Axiom Pattern
     */
    public static final Tile TT_AXIOM_PATTERN = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-axiom-pattern.png", "Axiom Pattern", 81, 81, "Struck Axiom", "http://struck.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Az Subtle
     */
    public static final Tile TT_AZ_SUBTLE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-az-subtle.png", "Az Subtle", 100, 100, "Anli.", "http://azmind.com/"); // NOI18N

    /**
     * The <code>Java</code> representation from the tile: Back Pattern
     */
    public static final Tile TT_BACK_PATTERN = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-back-pattern.png", "Back Pattern", 28, 28, "M"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Basketball
     */
    public static final Tile TT_BASKETBALL = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-basketball.png", "Basketball", 227, 196, "Mike Hearn", "https://www.mikehearn.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Batthern
     */
    public static final Tile TT_BATTHERN = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-batthern.png", "Batthern", 100, 99, "Factorio.us Collective", "http://www.factorious.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Bedge Grunge
     */
    public static final Tile TT_BEDGE_GRUNGE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-bedge-grunge.png", "Bedge Grunge", 588, 375, "Alex Tapein", "http://www.tapein.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Beige Paper
     */
    public static final Tile TT_BEIGE_PAPER = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-beige-paper.png", "Beige Paper", 200, 200, "Konstantin Ivanov", "http://twitter.com/phenix_h_k"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Billie Holiday
     */
    public static final Tile TT_BILLIE_HOLIDAY = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-billie-holiday.png", "Billie Holiday", 100, 100, "Thomas Myrman", "http://thomasmyrman.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Binding Dark
     */
    public static final Tile TT_BINDING_DARK = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-binding-dark.png", "Binding Dark", 180, 180, "Tia Newbury"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Binding Light
     */
    public static final Tile TT_BINDING_LIGTH = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-binding-light.png", "Binding Light", 180, 180, "Tia Newbury"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Black Felt
     */
    public static final Tile TT_BLACK_FELT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-black-felt.png", "Black Felt", 531, 337, "E. van Zummeren", "http://evanzummeren.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Black Linen
     */
    public static final Tile TT_BLACK_LINEN_1 = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-black-linen-1.png", "Black Linen", 482, 490, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Black Linen 2
     */
    public static final Tile TT_BLACK_LINEN_2 = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-black-linen-2.png", "Black Linen 2", 640, 640, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Black Mamba
     */
    public static final Tile TT_BLACK_MAMBA = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-black-mamba.png", "Black Mamba", 192, 192, "Federica Pelzel", "https://about.me/federicca"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Black Orchid"
     */
    public static final Tile TT_BLACK_ORCHID = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-black-orchid.png", "Black Orchid", 300, 300, "Hybridixstudio", "https://www.hybridixstudio.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Black Paper"
     */
    public static final Tile TT_BLACK_PAPER = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-black-paper.png", "Black Paper", 400, 400, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Black Scales
     */
    public static final Tile TT_BLACK_SCALES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-black-scales.png", "Black Scales", 40, 40, "Alex Parker", "http://twitter.com/misterparker"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Black Thread
     */
    public static final Tile TT_BLACK_THREAD = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-black-thread.png", "Black Thread", 49, 28, "Listvetra", "http://www.listvetra.ru/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Black Thread (Light)
     */
    public static final Tile TT_BLACK_THREAD_LIGHT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-black-thread-light.png", "Black Thread (Light)", 49, 28, "Listvetra", "http://www.listvetra.ru/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Black Twill
     */
    public static final Tile TT_BLACK_TWILL = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-black-twill.png", "Black Twill", 14, 14, "Cary Fleming"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Blizzard
     */
    public static final Tile TT_BLIZZARD = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-blizzard.png", "Blizzard", 25, 25, "Alexandre Naud", "http://www.alexandrenaud.fr/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Blu Stripes
     */
    public static final Tile TT_BLU_STRIPES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-blu-stripes.png", "Blu Stripes", 100, 100, "Seb Jachec", "http://twitter.com/iamsebj"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Bo Play
     */
    public static final Tile TT_BO_PLAY = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-bo-play.png", "Bo Play", 42, 22, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Brick Wall
     */
    public static final Tile TT_BRICK_WALL = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-brick-wall.png", "Brick Wall", 110, 69, "Benjamin Ward"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Brick Wall (Dark)
     */
    public static final Tile TT_BRICK_WALL_DARK = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-brick-wall-dark.png", "Brick Wall (Dark)", 110, 69, "Benjamin Ward"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Bright Squares
     */
    public static final Tile TT_BRIGHT_SQUARES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-bright-squares.png", "Bright Squares", 297, 297, "Waseem Dahman", "http://twitter.com/dwaseem"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Brilliant
     */
    public static final Tile TT_BRILLIANT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-brilliant.png", "Brilliant", 3, 3, "Carlos Valdez", "http://saveder.blogspot.de/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Broken Noise
     */
    public static final Tile TT_BROKEN_NOISE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-broken-noise.png", "Broken Noise", 476, 476, "Vincent Klaiber", "http://vincentklaiber.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Brushed Alum
     */
    public static final Tile TT_BRUSHED_ALUM = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-brushed-alum.png", "Brushed Alum", 400, 400, "Tim Ward", "http://www.MentalWardDesign.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Brushed Alum Dark
     */
    public static final Tile TT_BRUSHED_ALUM_DARK = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-brushed-alum-dark.png", "Brushed Alum Dark", 400, 400, "Tim Ward", "http://www.MentalWardDesign.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Buried
     */
    public static final Tile TT_BURIED = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-buried.png", "Buried", 350, 350, "Hendrik Lammers", "http://www.hendriklammers.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Candyhole
     */
    public static final Tile TT_CANDYHOLE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-candyhole.png", "Candyhole", 25, 25, "Josh Green", "https://joshgreendesign.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Carbon Fibre
     */
    public static final Tile TT_CARBON_FIBRE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-carbon-fibre.png", "Carbon Fibre", 24, 22, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Carbon Fibre Big
     */
    public static final Tile TT_CARBON_FIBRE_BIG = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-carbon-fibre-big.png", "Carbon Fibre Big", 20, 22, "Factorio.us Collective", "http://www.factorious.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Carbon Fibre V2
     */
    public static final Tile TT_CARBON_FIBRE_V2 = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-carbon-fibre-v2.png", "Carbon Fibre V2", 32, 36, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Cardboard
     */
    public static final Tile TT_CARDBOARD = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-cardboard.png", "Cardboard", 600, 600, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Cardboard Flat
     */
    public static final Tile TT_CARDBOARD_FLAT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-cardboard-flat.png", "Cardboard Flat", 256, 256, "Appleshadow"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Cartographer
     */
    public static final Tile TT_CARTOGRAPHER = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-cartographer.png", "Cartographer", 500, 499, "Sam Feyaerts", "http://sam.feyaerts.me/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Checkered Light Emboss
     */
    public static final Tile TT_CHECKERED_LIGHT_EMBOSS = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-checkered-light-emboss.png", "Checkered Light Emboss", 60, 60, "Alex Parker", "https://twitter.com/misterparker"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Checkered Pattern
     */
    public static final Tile TT_CHECKERED_PATTERN = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-checkered-pattern.png", "Checkered Pattern", 72, 72, "Radoslaw Rzepecki", "http://designcocktails.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Church
     */
    public static final Tile TT_CHURCH = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-church.png", "Church", 100, 100, "j Boo"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Circles
     */
    public static final Tile TT_CIRCLES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-circles.png", "Circles", 16, 22, "Blunia", "http://www.es.blunia.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Classy Fabric
     */
    public static final Tile TT_CLASSY_FABRIC = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-classy-fabric.png", "Classy Fabric", 102, 102, "Richard Tabor", "http://purtypixels.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Clean Gray Paper
     */
    public static final Tile TT_CLEAN_GRAY_PAPER = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-clean-gray-paper.png", "Clean Gray Paper", 512, 512, "Paul Phönixweiß", "http://phoenixweiss.me"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Clean Textile
     */
    public static final Tile TT_CLEAN_TEXTILE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-clean-textile.png", "Clean Textile", 420, 420, "N8rx"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Climpek
     */
    public static final Tile TT_CLIMPEK = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-climpek.png", "Climpek", 44, 44, "Wassim", "http://www.blugraphic.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Cloth Alike
     */
    public static final Tile TT_CLOTH_ALIKE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-cloth-alike.png", "Cloth Alike", 102, 78, "Peax Webdesign", "http://www.peax-webdesign.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Concrete Wall
     */
    public static final Tile TT_CONCRETE_WALL = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-concrete-wall.png", "Concrete Wall", 520, 520, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Concrete Wall 2
     */
    public static final Tile TT_CONCRETE_WALL_2 = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-concrete-wall-2.png", "Concrete Wall 2", 597, 545, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Concrete Wall 3
     */
    public static final Tile TT_CONCRETE_WALL_3 = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-concrete-wall-3.png", "Concrete Wall 3", 400, 299, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Connected
     */
    public static final Tile TT_CONNECTED = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-connected.png", "Connected", 160, 160, "Mark Collins", "http://pixxel.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Corrugation
     */
    public static final Tile TT_CORRUGATION = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-corrugation.png", "Corrugation", 8, 5, "Anna Litvinuk", "https://graphicriver.net/user/annalitviniuk"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Cream Dust
     */
    public static final Tile TT_CREAM_DUST = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-cream-dust.png", "Cream Dust", 50, 50, "Thomas Myrman", "http://thomasmyrman.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Cream Paper
     */
    public static final Tile TT_CREAM_PAPER = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-cream-paper.png", "Cream Paper", 158, 144, "Devin Holmes", "http://www.strick9design.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Cream Pixels
     */
    public static final Tile TT_CREAM_PIXELS = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-cream-pixels.png", "Cream Pixels", 160, 160, "Mizanur Rahman", "https://www.behance.net/rexmizan"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Crisp Paper Ruffles
     */
    public static final Tile TT_CRISP_PAPER_RUFFLES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-crisp-paper-ruffles.png", "Crisp Paper Ruffles", 481, 500, "Tish"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Crissxcross
     */
    public static final Tile TT_CRISSXCROSS = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-crissxcross.png", "Crissxcross", 512, 512, "Ashton"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Crossword
     */
    public static final Tile TT_CROSSWORD = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-crossword.png", "Crossword", 400, 400, "Ideawebme", "http://www.ideaweb.me/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Cross Scratches
     */
    public static final Tile TT_CROSS_SCRATCHES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-cross-scratches.png", "Cross Scratches", 256, 256, "Andrey Ovcharov", "https://www.ovcharov.me/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Cross Stripes
     */
    public static final Tile TT_CROSS_STRIPES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-cross-stripes.png", "Cross Stripes", 6, 6, "Stefan Aleksic", "http://www.facebook.com/stefanaleksic88"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Cubes
     */
    public static final Tile TT_CUBES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-cubes.png", "Cubes", 67, 100, "Sander Ottens", "http://experimint.nl/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Cutcube
     */
    public static final Tile TT_CUTCUBE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-cutcube.png", "Cutcube", 20, 36, "Michael Atkins", "http://cubecolour.co.uk/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Dark Brick Wall
     */
    public static final Tile TT_DARK_BRICK_WALL = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-dark-brick-wall.png", "Dark Brick Wall", 96, 96, "Alex Parker", "http://www.alexparker.me/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Dark Circles
     */
    public static final Tile TT_DARK_CIRCLES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-dark-circles.png", "Dark Circles", 10, 12, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Dark Denim
     */
    public static final Tile TT_DARK_DENIM = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-dark-denim.png", "Dark Denim", 145, 145, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Dark Denim 3
     */
    public static final Tile TT_DARK_DENIM_3 = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-dark-denim-3.png", "Dark Denim 3", 420, 326, "Brandon Jacoby", "http://www.brandonjacoby.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Dark Dot
     */
    public static final Tile TT_DARK_DOT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-dark-dot.png", "Dark Dot", 5, 5, "Tsvetelin Nikolov", "https://dribbble.com/bscsystem"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Dark Dotted 2
     */
    public static final Tile TT_DARK_DOTTED_2 = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-dark-dotted-2.png", "Dark Dotted 2", 7, 7, "Venam", "http://venam.1.ai"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Dark Exa
     */
    public static final Tile TT_DARK_EXA = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-dark-exa.png", "Dark Exa", 18, 30, "Venam", "http://venam.1.ai"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Dark Fish Skin
     */
    public static final Tile TT_DARK_FISH_SKIN = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-dark-fish-skin.png", "Dark Fish Skin", 6, 12, "Petr Sulc", "http://www.petrsulc.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Dark Geometric
     */
    public static final Tile TT_DARK_GEOMETRIC = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-dark-geometric.png", "Dark Geometric", 70, 70, "Mike Warner", "http://miketheindian.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Dark Leather
     */
    public static final Tile TT_DARK_LEATHER = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-dark-leather.png", "Dark Leather", 398, 484, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Dark Matter
     */
    public static final Tile TT_DARK_MATTER = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-dark-matter.png", "Dark Matter", 7, 7, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Dark Mosaic
     */
    public static final Tile TT_DARK_MOSAIC = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-dark-mosaic.png", "Dark Mosaic", 300, 295, "John Burks"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Dark Stripes
     */
    public static final Tile TT_DARK_STRIPES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-dark-stripes.png", "Dark Stripes", 50, 50, "Stefan Aleksic", "https://www.facebook.com/stefanaleksic88"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Dark Stripes (Light)
     */
    public static final Tile TT_DARK_STRIPES_LIGHT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-dark-stripes-light.png", "Dark Stripes (Light)", 50, 50, "Stefan Aleksic", "https://www.facebook.com/stefanaleksic88"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Dark Tire
     */
    public static final Tile TT_DARK_TIRE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-dark-tire.png", "Dark Tire", 250, 250, "Wilmotte Bastien", "https://dribbble.com/bastienwilmotte"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Dark Wall
     */
    public static final Tile TT_DARK_WALL = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-dark-wall.png", "Dark Wall", 300, 300, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Dark Wood
     */
    public static final Tile TT_DARK_WOOD = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-dark-wood.png", "Dark Wood", 512, 512, "Omar Alvarado", "http://www.oaadesigns.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Darth Stripe
     */
    public static final Tile TT_DARTH_STRIPE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-darth-stripe.png", "Darth Stripe", 511, 511, "Ashton"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Debut Dark
     */
    public static final Tile TT_DEBUT_DARK = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-debut-dark.png", "Debut Dark", 200, 200, "Luke McDonald", "https://www.lukemcdonald.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Debut Light
     */
    public static final Tile TT_DEBUT_LIGHT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-debut-light.png", "Debut Light", 200, 200, "Luke McDonald", "https://www.lukemcdonald.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Diagmonds (Dark)
     */
    public static final Tile TT_DIAGMONDS_DARK = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-diagmonds-dark.png", "Diagmonds (Dark)", 141, 142, "INS", "https://www.flickr.com/photos/ins"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Diagmonds (Light)
     */
    public static final Tile TT_DIAGMONDS_LIGHT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-diagmonds-light.png", "Diagmonds (Light)", 141, 142, "INS", "https://www.flickr.com/photos/ins"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Diagonales Decalees
     */
    public static final Tile TT_DIAGONALES_DECALEES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-diagonales-decalees.png", "Diagonales Decalees", 144, 48, "Graphiste", "http://www.peax-webdesign.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Diagonal Noise
     */
    public static final Tile TT_DIAGONAL_NOISE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-diagonal-noise.png", "Diagonal Noise", 100, 100, "Christopher Burton", "http://ChristopherBurton.net"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Diagonal Striped Brick
     */
    public static final Tile TT_DIAGONAL_STRIPED_BRICK = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-diagonal-striped-brick.png", "Diagonal Striped Brick", 150, 150, "Alex Smith"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Diagonal Waves
     */
    public static final Tile TT_DIAGONAL_WAVES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-diagonal-waves.png", "Diagonal Waves", 38, 38, "CoolPatterns", "http://coolpatterns.net/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Diamonds Are Forever
     */
    public static final Tile TT_DIAMONDS_ARE_FOREVER = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-diamonds-are-forever.png", "Diamonds Are Forever", 24, 18, "Tom Neal", "http://imaketees.co.uk"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Diamond Eyes
     */
    public static final Tile TT_DIAMOND_EYES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-diamond-eyes.png", "Diamond Eyes", 33, 25, "AJ Troxell", "http://ajtroxell.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Diamond Upholstery
     */
    public static final Tile TT_DIAMOND_UPHOLSTERY = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-diamond-upholstery.png", "Diamond Upholstery", 200, 200, "Dimitar Karaytchev"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Dimension
     */
    public static final Tile TT_DIMENSION = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-dimension.png", "Dimension", 43, 50, "Luuk van Baars", "http://luuk.ca/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Dirty Old Black Shirt
     */
    public static final Tile TT_DIRTY_OLD_BLACK_SHIRT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-dirty-old-black-shirt.png", "Dirty Old Black Shirt", 250, 250, "Paul Reulat", "https://twitter.com/PaulReulat"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Dotnoise Light Grey
     */
    public static final Tile TT_DOTNOISE_LIGHT_GREY = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-dotnoise-light-grey.png", "Dotnoise Light Grey", 100, 100, "Nikolalek"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Double Lined"
     */
    public static final Tile TT_DOUBLE_LINED = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-double-lined.png", "Double Lined", 150, 64, "Adam Anlauf", "http://www.depcore.pl"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Dust
     */
    public static final Tile TT_DUST = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-dust.png", "Dust", 400, 300, "Dominik Kiss", "http://werk.sk/w/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Ecailles
     */
    public static final Tile TT_ECAILLES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-ecailles.png", "Ecailles", 48, 20, "Graphiste", "http://www.peax-webdesign.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Egg Shell
     */
    public static final Tile TT_EGG_SHELL = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-egg-shell.png", "Egg Shell", 256, 256, "Paul Phönixweiß", "http://phoenixweiss.me"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Elastoplast
     */
    public static final Tile TT_ELASTOPLAST = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-elastoplast.png", "Elastoplast", 37, 37, "Josh Green", "https://joshgreendesign.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Elegant Grid
     */
    public static final Tile TT_ELEGANT_GRID = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-elegant-grid.png", "Elegant Grid", 16, 28, "GraphicsWall", "http://www.graphicswall.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Embossed Paper
     */
    public static final Tile TT_EMBOSSED_PAPER = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-embossed-paper.png", "Embossed Paper", 8, 10, "Badhon Ebrahim", "http://dribbble.com/graphcoder"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Escheresque
     */
    public static final Tile TT_ESCHERESQUE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-escheresque.png", "Escheresque", 46, 29, "Jan Meeus", "https://dribbble.com/janmeeus"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Escheresque Dark
     */
    public static final Tile TT_ESCHERESQUE_DARK = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-escheresque-dark.png", "Escheresque Dark", 46, 29, "Ste Patten"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Exclusive Paper"
     */
    public static final Tile TT_EXCLUSIVE_PAPER = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-exclusive-paper.png", "Exclusive Paper", 560, 420, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Fabric 1 (Dark)
     */
    public static final Tile TT_FABRIC_1_DARK = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-fabric-1-dark.png", "Fabric 1 (Dark)", 400, 400, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Fabric 1 (Light)
     */
    public static final Tile TT_FABRIC_1_LIGHT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-fabric-1-light.png", "Fabric 1 (Light)", 400, 400, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Fabric Of Squares
     */
    public static final Tile TT_FABRIC_OF_SQUARES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-fabric-of-squares.png", "Fabric Of Squares", 410, 410, "Heliodor Jalba", "https://about.me/heliodor"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Fabric (Plaid)
     */
    public static final Tile TT_FABRIC_PLAID = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-fabric-plaid.png", "Fabric (Plaid)", 200, 200, "James Basoo", "https://twitter.com/jbasoo"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Fake Brick
     */
    public static final Tile TT_FAKE_BRICK = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-fake-brick.png", "Fake Brick", 76, 76, "Marat"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Fake Luxury
     */
    public static final Tile TT_FAKE_LUXURY = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-fake-luxury.png", "Fake Luxury", 16, 26, "Factorio.us Collective", "http://www.factorious.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Fancy Deboss
     */
    public static final Tile TT_FANCY_DEBOSS = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-fancy-deboss.png", "Fancy Deboss", 18, 13, "Daniel Beaton", "http://danielbeaton.tumblr.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Farmer
     */
    public static final Tile TT_FARMER = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-farmer.png", "Farmer", 349, 349, "Fabian Schultz", "http://fabianschultz.de"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Felt
     */
    public static final Tile TT_FELT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-felt.png", "Felt", 500, 466, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: First Aid Kit
     */
    public static final Tile TT_FIRST_AID_KIT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-first-aid-kit.png", "First Aid Kit", 99, 99, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Flowers
     */
    public static final Tile TT_FLOWERS = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-flowers.png", "Flowers", 150, 150, "Unknown"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Flower Trail
     */
    public static final Tile TT_FLOWER_TRAIL = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-flower-trail.png", "Flower Trail", 16, 16, "Paridhi"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Foggy Birds"
     */
    public static final Tile TT_FOGGY_BIRDS = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-foggy-birds.png", "Foggy Birds", 206, 206, "Pete Fecteau", "http://buttonpresser.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Food
     */
    public static final Tile TT_FOOD = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-food.png", "Food", 300, 300, "Ilya"); // NOI18N
    
    // football-no-lines are 2 pictures (dark-light) tweak it TODO
    /**
     * The <code>Java</code> representation from the tile: Football (No Yardlines)
     */
    public static final Tile TT_FOOTBALL_NO_LINES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-football-no-lines.png", "Football (No Yardlines)", 714, 240, "Mike Hearn", "https://www.mikehearn.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: French Stucco
     */
    public static final Tile TT_FRENCH_STUCCO = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-french-stucco.png", "French Stucco", 400, 355, "Christopher Buecheler", "http://cwbuecheler.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Fresh Snow
     */
    public static final Tile TT_FRESH_SNOW = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-fresh-snow.png", "Fresh Snow", 500, 500, "Kerstkaarten", "https://www.fotokaarten.nl/kerst.html"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Gold Scale
     */
    public static final Tile TT_GOLD_SCALE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-gold-scale.png", "Gold Scale", 25, 25, "Josh Green", "https://joshgreendesign.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Gplay
     */
    public static final Tile TT_GPLAY = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-gplay.png", "Gplay", 188, 178, "Dimitrie Hoekstra", "http://dhesign.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Gradient Squares
     */
    public static final Tile TT_GRADIENT_SQUARES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-gradient-squares.png", "Gradient Squares", 202, 202, "Brankic1979", "http://www.brankic1979.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Graphcoders Lil Fiber
     */
    public static final Tile TT_GRAPHCODERS_LIL_FIBER = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-graphcoders-lil-fiber.png", "Graphcoders Lil Fiber", 21, 35, "Badhon Ebrahim", "http://dribbble.com/graphcoder"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Graphy (Dark)
     */
    public static final Tile TT_GRAPHY_DARK = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-graphy-dark.png", "Graphy (Dark)", 80, 160, "We Are Pixel8", "http://www.wearepixel8.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Graphy (Light)
     */
    public static final Tile TT_GRAPHY_LIGHT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-graphy-light.png", "Graphy (Light)", 80, 160, "We Are Pixel8", "http://www.wearepixel8.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Gravel
     */
    public static final Tile TT_GRAVEL = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-gravel.png", "Gravel", 222, 206, "Mike Hearn", "http://www.mikehearn.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Gray Floral
     */
    public static final Tile TT_GRAY_FLORAL = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-gray-floral.png", "Gray Floral", 150, 124, "Lauren", "http://laurenharrison.org"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Gray Lines
     */
    public static final Tile TT_GRAY_LINES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-gray-lines.png", "Gray Lines", 150, 150, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Gray Sand
     */
    public static final Tile TT_GRAY_SAND = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-gray-sand.png", "Gray Sand", 211, 211, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Green Cup
     */
    public static final Tile TT_GREEN_CUP = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-green-cup.png", "Green Cup", 400, 400, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Green Dust and Scratches
     */
    public static final Tile TT_GREEN_DUST_AND_SCRATCHES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-green-dust-and-scratches.png", "Green Dust and Scratches", 296, 300, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Green Fibers
     */
    public static final Tile TT_GREEN_FIBERS = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-green-fibers.png", "Green Fibers", 200, 200, "Matteo Di Capua", "http://www.matteodicapua.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Green Gobbler
     */
    public static final Tile TT_GREEN_GOBBLER = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-green-gobbler.png", "Green Gobbler", 39, 39, "Simon Meek", "http://www.simonmeek.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Greyzz
     */
    public static final Tile TT_GREYZZ = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-greyzz.png", "Greyzz", 149, 139, "Infographiste", "http://www.peax-webdesign.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Grey Jean
     */
    public static final Tile TT_GREY_JEAN = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-grey-jean.png", "Grey Jean", 150, 150, "Omur Uluask", "http://mr.pn"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Grey Sandbag
     */
    public static final Tile TT_GREY_SANDBAG = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-grey-sandbag.png", "Grey Sandbag", 100, 98, "Diogo Silva", "http://www.diogosilva.net"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Grey Washed Wall
     */
    public static final Tile TT_GREY_WASHED_WALL = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-grey-washed-wall.png", "Grey Washed Wall", 350, 259, "Sagive SEO", "http://www.sagive.co.il"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Grid
     */
    public static final Tile TT_GRID = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-grid.png", "Grid", 310, 310, "Dominik Kiss", "http://www.werk.sk"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Grid Me
     */
    public static final Tile TT_GRID_ME = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-grid-me.png", "Grid Me", 50, 50, "Arno Gregorian", "http://www.gobigbang.nl"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Grid Noise
     */
    public static final Tile TT_GRID_NOISE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-grid-noise.png", "Grid Noise", 98, 98, "Daivid Serif"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Grilled Noise
     */
    public static final Tile TT_GRILLED_NOISE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-grilled-noise.png", "Grilled Noise", 170, 180, "Dertig Media", "http://30.nl"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Groovepaper
     */
    public static final Tile TT_GROOVEPAPER = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-groovepaper.png", "Groovepaper", 300, 300, "Isaac", "http://graphicriver.net/user/krispdesigns"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Grunge Wall
     */
    public static final Tile TT_GRUNGE_WALL = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-grunge-wall.png", "Grunge Wall", 500, 375, "Adam Anlauf", "http://www.depcore.pl"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Gun Metal
     */
    public static final Tile TT_GUN_METAL = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-gun-metal.png", "Gun Metal", 10, 10, "Nikolay Boltachev", "http://www.zigzain.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Handmade Paper
     */
    public static final Tile TT_HANDMADE_PAPER = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-handmade-paper.png", "Handmade Paper", 100, 100, "Le Marquis"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Hexabump
     */
    public static final Tile TT_HEXABUMP = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-hexabump.png", "Hexabump", 19, 33, "Norbert Levajsics", "http://spom.me"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Hexellence
     */
    public static final Tile TT_HEXELLENCE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-hexellence.png", "Hexellence", 150, 173, "Kim Ruddock", "http://www.webdesigncreare.co.uk"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Hixs Evolution
     */
    public static final Tile TT_HIXS_EVOLUTION = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-hixs-evolution.png", "Hixs Evolution", 35, 34, "Damian Rivas", "http://www.hybridixstudio.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Hoffman
     */
    public static final Tile TT_HOFFMAN = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-hoffman.png", "Hoffman", 16, 16, "Josh Green", "https://joshgreendesign.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Honey I'm Subtle
     */
    public static final Tile TT_HONEY_IM_SUBTLE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-honey-im-subtle.png", "Honey I'm Subtle", 179, 132, "Alex M. Balling", "http://www.blof.dk"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Ice Age
     */
    public static final Tile TT_ICE_AGE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-ice-age.png", "Ice Age", 400, 400, "Gjermund Gustavsen", "http://tight.no"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Inflicted
     */
    public static final Tile TT_INFLICTED = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-inflicted.png", "Inflicted", 240, 240, "Hugo Loning", "http://www.inflicted.nl"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Inspiration Geometry
     */
    public static final Tile TT_INSPIRATION_GEOMETRY = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-inspiration-geometry.png", "Inspiration Geometry", 412, 412, "Welsley", "http://www.pdmb.org/work"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Iron Grip
     */
    public static final Tile TT_IRON_GRIP = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-iron-grip.png", "Iron Grip", 300, 301, "Tony Kinard", "http://www.tonykinard.net"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Kinda Jean
     */
    public static final Tile TT_KINDA_JEAN = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-kinda-jean.png", "Kinda Jean", 147, 147, "Graphiste", "http://www.peax-webdesign.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Knitted Netting
     */
    public static final Tile TT_KNITTED_NETTING = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-knitted-netting.png", "Knitted Netting", 8, 8, "Anna Litvinuk", "http://graphicriver.net/user/Naf_Naf?ref=Naf_Naf"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Knitted Sweater
     */
    public static final Tile TT_KNITTED_SEATER = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-knitted-sweater.png", "Knitted Sweater", 250, 250, "Victoria Spahn", "https://twitter.com/VictoriaSpahn"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Kuji
     */
    public static final Tile TT_KUJI = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-kuji.png", "Kuji", 30, 30, "Josh Green", "https://joshgreendesign.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Large Leather
     */
    public static final Tile TT_LARGE_LEATHER = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-large-leather.png", "Large Leather", 400, 343, "Elemis", "http://elemisfreebies.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Leather
     */
    public static final Tile TT_LEATHER = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-leather.png", "Leather", 300, 300, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Light Aluminum
     */
    public static final Tile TT_LIGHT_ALUMINUM = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-light-aluminum.png", "Light Aluminum", 282, 282, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Light Gray
     */
    public static final Tile TT_LIGHT_GRAY = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-light-gray.png", "Light Gray", 301, 621, "Brenda Lay", "http://poisones.tumblr.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Light Grey Floral Motif
     */
    public static final Tile TT_LIGHT_GREY_FLORAL_MOTIF = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-light-grey-floral-motif.png", "Light Grey Floral Motif", 32, 56, "GraphicsWall", "http://www.graphicswall.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Light Honeycomb
     */
    public static final Tile TT_LIGHT_HONEYCOMB = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-light-honeycomb.png", "Light Honeycomb", 270, 289, "Federica Pelzel", "http://about.me/federicca"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Light Honeycomb (Dark)
     */
    public static final Tile TT_LIGHT_HONEYCOMB_DARK = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-light-honeycomb-dark.png", "Light Honeycomb (Dark)", 270, 289, "Federica Pelzel", "http://about.me/federicca"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Light Mesh
     */
    public static final Tile TT_LIGHT_MESH = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-light-mesh.png", "Light Mesh", 256, 256, "Wilmotte Bastien", "http://dribbble.com/bastienwilmotte"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Light Paper Fibers
     */
    public static final Tile TT_LIGHT_PAPER_FIBERS = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-light-paper-fibers.png", "Light Paper Fibers", 500, 300, "Jorge Fuentes", "http://www.jorgefuentes.net"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Light Sketch
     */
    public static final Tile TT_LIGHT_SKETCH = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-light-sketch.png", "Light Sketch", 600, 600, "Dan Kruse", "http://dankruse.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Light Toast
     */
    public static final Tile TT_LIGHT_TOAST = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-light-toast.png", "Light Toast", 200, 200, "Pippin Lee", "https://twitter.com/#!/pippinlee"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Light Wool
     */
    public static final Tile TT_LIGHT_WOOL = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-light-wool.png", "Light Wool", 190, 191, "Andy", "http://www.tall.me.uk"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Lined Paper
     */
    public static final Tile TT_LINED_PAPER = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-lined-paper.png", "Lined Paper", 300, 224, "Are Sundnes", "http://www.paranaiv.no"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Lined Paper 2
     */
    public static final Tile TT_LINED_PAPER_2 = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-lined-paper-2.png", "Lined Paper 2", 412, 300, "Gjermund Gustavsen", "http://www.tight.no"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Little Knobs
     */
    public static final Tile TT_LITTLE_KNOBS = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-little-knobs.png", "Little Knobs", 10, 10, "Amos", "http://www.freepx.net"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Little Pluses
     */
    public static final Tile TT_LITTLE_PLUSES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-little-pluses.png", "Little Pluses", 300, 300, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Little Triangles
     */
    public static final Tile TT_LITTLE_TRIANGLES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-little-triangles.png", "Little Triangles", 10, 11, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Low Contrast Linen
     */
    public static final Tile TT_LOW_CONTRAST_LINEN = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-low-contrast-linen.png", "Low Contrast Linen", 256, 256, "Jordan Pittman"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Lyonnette
     */
    public static final Tile TT_LYONNETTE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-lyonnette.png", "Lyonnette", 90, 90, "Tish", "http://www.ayonnette.blogspot.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Maze Black
     */
    public static final Tile TT_MAZE_BLACK = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-maze-black.png", "Maze Black", 46, 23, "Peax", "http://www.peax-webdesign.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Maze White
     */
    public static final Tile TT_MAZE_WHITE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-maze-white.png", "Maze White", 46, 23, "Peax", "http://www.peax-webdesign.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Mbossed
     */
    public static final Tile TT_MBOSSED = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-mbossed.png", "Mbossed", 26, 26, "Alex Parker", "http://twitter.com/misterparker"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Medic Packaging Foil
     */
    public static final Tile TT_MEDIC_PACKAGING_FOIL = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-medic-packaging-foil.png", "Medic Packaging Foil", 8, 8, "pixilated", "http://be.net/pixilated"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Merely Cubed
     */
    public static final Tile TT_MERELY_CUBED = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-merely-cubed.png", "Merely Cubed", 16, 16, "Etienne Rallion", "http://www.etiennerallion.fr"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Micro Carbon
     */
    public static final Tile TT_MICRO_CARBON = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-micro-carbon.png", "Micro Carbon", 4, 4, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Mirrored Squares
     */
    public static final Tile TT_MIRRORED_SQUARES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-mirrored-squares.png", "Mirrored Squares", 166, 166, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Mocha Grunge
     */
    public static final Tile TT_MOCHA_GRUNGE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-mocha-grunge.png", "Mocha Grunge", 400, 400, "Joel Klein", "http://www.evelt.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Mooning
     */
    public static final Tile TT_MOONING = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-mooning.png", "Mooning", 400, 400, "Joel Klein", "http://www.evelt.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Moulin
     */
    public static final Tile TT_MOULING = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-moulin.png", "Moulin", 20, 20, "Venam", "http://venam.1.ai"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: My Little Plaid (Dark)
     */
    public static final Tile TT_MY_LITTLE_PLAID_DARK = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-my-little-plaid-dark.png", "My Little Plaid (Dark)", 54, 54, "Pete Fecteau", "http://buttonpresser.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: My Little Plaid (Light)
     */
    public static final Tile TT_MY_LITTLE_PLAID_LIGHT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-my-little-plaid-light.png", "My Little Plaid (Light)", 54, 54, "Pete Fecteau", "http://buttonpresser.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Nami
     */
    public static final Tile TT_NAMI = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-nami.png", "Nami", 16, 16, "Dertig Media", "http://30.nl"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Nasty Fabric
     */
    public static final Tile TT_NASTY_FABRIC = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-nasty-fabric.png", "Nasty Fabric", 198, 200, "Badhon Ebrahim", "http://dribbble.com/graphcoder"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Natural Paper
     */
    public static final Tile TT_NATURAL_PAPER = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-natural-paper.png", "Natural Paper", 523, 384, "Mihaela Hinayon"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Navy
     */
    public static final Tile TT_NAVY = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-navy.png", "Navy", 600, 385, "Ethan Hamilton", "http://ultranotch.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Nice Snow
     */
    public static final Tile TT_NICE_SNOW = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-nice-snow.png", "Nice Snow", 250, 250, "Kerstkaarten", "http://www.fotokaarten.nl/kerst.html"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Nistri
     */
    public static final Tile TT_NISTRI = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-nistri.png", "Nistri", 38, 38, "Markus Reiter", "http://reitermark.us/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Noise Lines
     */
    public static final Tile TT_NOISE_LINES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-noise-lines.png", "Noise Lines", 60, 59, "Thomas Zucx"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Noise Pattern With Subtle Cross Lines
     */
    public static final Tile TT_NOISE_PATTERN_WITH_SUBTLE_CROSS_LINES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-noise-pattern-with-subtle-cross-lines.png", "Noise Pattern With Subtle Cross Lines", 240, 240, "Viszt Peter", ""); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Noisy
     */
    public static final Tile TT_NOISY = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-noisy.png", "Noisy", 300, 300, "Mladjan Antic", "http://anticdesign.info/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Noisy Grid
     */
    public static final Tile TT_NOISY_GRID = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-noisy-grid.png", "Noisy Grid", 150, 150, "Vectorpile", "http://www.vectorpile.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Noisy Net
     */
    public static final Tile TT_NOISY_NET = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-noisy-net.png", "Noisy Net", 200, 200, "Tom McArdle", "http://twitter.com/_mcrdl"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Norwegian Rose"
     */
    public static final Tile TT_NORWEGIAN_ROSE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-norwegian-rose.png", "Norwegian Rose", 48, 48, "Fredrik Scheide"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Notebook
     */
    public static final Tile TT_NOTEBOOK = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-notebook.png", "Notebook", 300, 154, "HQvectors", "http://www.hqvectors.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Notebook (Dark)
     */
    public static final Tile TT_NOTEBOOK_DARK = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-notebook-dark.png", "Notebook (Dark)", 300, 154, "HQvectors", "http://www.hqvectors.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Office
     */
    public static final Tile TT_OFFICE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-office.png", "Office", 70, 70, "Andres Rigo", "http://www.andresrigo.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Old Husks
     */
    public static final Tile TT_OLD_HUSKS = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-old-husks.png", "Old Husks", 500, 500, "Josh Green", "https://joshgreendesign.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Old Map
     */
    public static final Tile TT_OLD_MAP = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-old-map.png", "Old Map", 256, 256, "Andreas Föhl", "http://www.netzfeld.de"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Old Mathematics
     */
    public static final Tile TT_OLD_MATHEMATICS = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-old-mathematics.png", "Old Mathematics", 200, 200, "Josh Green", "https://joshgreendesign.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Old Moon
     */
    public static final Tile TT_OLD_MOON = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-old-moon.png", "Old Moon", 300, 300, "Nick Batchelor", "http://www.italicsbold.com.au"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Old Wall
     */
    public static final Tile TT_OLD_WALL = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-old-wall.png", "Old Wall", 300, 300, "Bartosz Kaszubowski", "http://twitter.com/simek"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Otis Redding
     */
    public static final Tile TT_OTIS_REDDING = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-otis-redding.png", "Otis Redding", 100, 100, "Thomas Myrman", "http://thomasmyrman.com\""); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Outlets
     */
    public static final Tile TT_OUTLETS = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-outlets.png", "Outlets", 4, 8, "Michal Chovanec", "http://michalchovanec.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: P1
     */
    public static final Tile TT_P1 = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-p1.png", "P1", 8, 9, "Dima Shiper", "http://www.epictextures.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: P2
     */
    public static final Tile TT_P2 = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-p2.png", "P2", 4, 5, "Dima Shiper", "http://www.epictextures.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: P4
     */
    public static final Tile TT_P4 = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-p4.png", "P4", 8, 8, "Dima Shiper", "http://www.epictextures.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: P5
     */
    public static final Tile TT_P5 = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-p5.png", "P5", 8, 8, "Dima Shiper", "http://www.epictextures.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: P6
     */
    public static final Tile TT_P6 = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-p6.png", "P6", 8, 8, "Dima Shiper", "http://www.epictextures.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Padded
     */
    public static final Tile TT_PADDED = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-padded.png", "Padded", 160, 160, "Chris Baldie", "http://papertank.co.uk"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Padded (Light)
     */
    public static final Tile TT_PADDED_LIGHT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-padded-light.png", "Padded (Light)", 160, 160, "Chris Baldie", "http://papertank.co.uk"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Paper
     */
    public static final Tile TT_PAPER = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-paper.png", "Paper", 500, 593, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Paper 1
     */
    public static final Tile TT_PAPER_1 = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-paper-1.png", "Paper 1", 400, 400, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Paper 2
     */
    public static final Tile TT_PAPER_2 = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-paper-2.png", "Paper 2", 280, 280, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Paper 3
     */
    public static final Tile TT_PAPER_3 = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-paper-3.png", "Paper 3", 276, 276, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Paper Fibers
     */
    public static final Tile TT_PAPER_FIBERS = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-paper-fibers.png", "Paper Fibers", 410, 410, "Heliodor jalba", "http://about.me/heliodor"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Josh Green
     */
    public static final Tile TT_PAVEN = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-paven.png", "Paven", 20, 20, "Josh Green", "https://joshgreendesign.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Perforated White Leather
     */
    public static final Tile TT_PERFORATED_WHITE_LEATHER = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-perforated-white-leather.png", "Perforated White Leather", 300, 300, "Dmitry"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Pineapple Cut
     */
    public static final Tile TT_PINEAPPLE_CUT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-pineapple-cut.png", "Pineapple Cut", 36, 62, "Audee Mirza", "http://audeemirza.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Pinstriped Suit
     */
    public static final Tile TT_PINSTRIPED_SUIT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-pinstriped-suit.png", "Pinstriped Suit", 400, 333, "Alex Berkowitz", "http://www.alexberkowitz.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Pinstripe (Dark)
     */
    public static final Tile TT_PINSTRIPE_DARK = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-pinstripe-dark.png", "Pinstripe (Dark)", 50, 500, "Brandon", "http://extrast.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Pinstripe (Light)
     */
    public static final Tile TT_PINSTRIPE_LIGHT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-pinstripe-light.png", "Pinstripe (Light)", 50, 500, "Brandon", "http://extrast.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Pixel Weave
     */
    public static final Tile TT_PIXEL_WEAVE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-pixel-weave.png", "Pixel Weave", 64, 64, "Dax Kieran", "http://daxkieran.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Polaroid
     */
    public static final Tile TT_POLAROID = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-polaroid.png", "Polaroid", 58, 36, "Daniel Beaton", "http://danielbeaton.tumblr.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Polonez Pattern
     */
    public static final Tile TT_POLONEZ_PATTERN = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-polonez-pattern.png", "Polonez Pattern", 300, 300, "Radoslaw Rzepecki", "Radoslaw Rzepecki"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Polyester Lite
     */
    public static final Tile TT_POLYESTER_LITE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-polyester-lite.png", "Polyester Lite", 17, 22, "Jeremy", "http://dribbble.com/jeremyelder"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Pool Table
     */
    public static final Tile TT_POOL_TABLE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-pool-table.png", "Pool Table", 256, 256, "Caveman", "http://caveman.chlova.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Project Paper
     */
    public static final Tile TT_PROJECT_PAPER = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-project-paper.png", "Project Paper", 105, 105, "Rafael Almeida", "http://www.fotografiaetc.com.br/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Psychedelic
     */
    public static final Tile TT_PSYCHEDELIC = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-psychedelic.png", "Psychedelic", 84, 72, "Pixeden", "http://www.pixeden.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Ps Neutral
     */
    public static final Tile TT_PS_NEUTRAL = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-ps-neutral.png", "Ps Neutral", 16, 16, "Gluszczenko", "http://www.gluszczenko.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Purty Wood
     */
    public static final Tile TT_PURTY_WOOD = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-purty-wood.png", "Purty Wood", 400, 400, "Richard Tabor", "http://www.purtypixels.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Pw Pattern
     */
    public static final Tile TT_PW_PATTERN = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-pw-pattern.png", "Pw Pattern", 188, 188, "Peax", "http://www.peax-webdesign.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Pyramid
     */
    public static final Tile TT_PYRAMID = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-pyramid.png", "Pyramid", 16, 16, "Jeff Wall"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Josh Green
     */
    public static final Tile TT_QUILT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-quilt.png", "Quilt", 25, 24, "Josh Green", "https://joshgreendesign.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Random Grey Variations
     */
    public static final Tile TT_RANOM_GREY_VARIATIONS = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-random-grey-variations.png", "Random Grey Variations", 200, 200, "Stefan Aleksic", "http://www.MentalWardDesign.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Ravenna
     */
    public static final Tile TT_RAVENNA = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-ravenna.png", "Ravenna", 387, 201, "Sentel", "http://sentel.co"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Real Carbon Fibre
     */
    public static final Tile TT_REAL_CARBON_FIBRE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-real-carbon-fibre.png", "Real Carbon Fibre", 56, 56, "Alfred Lee"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Rebel
     */
    public static final Tile TT_REBEL = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-rebel.png", "Rebel", 320, 360, "Hendrik Lammers", "http://www.hendriklammers.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Redox 01
     */
    public static final Tile TT_REDOX_01 = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-redox-01.png", "Redox 01", 600, 375, "Hendrik Lammers", "http://www.hendriklammers.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Redox 02
     */
    public static final Tile TT_REDOX_02 = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-redox-02.png", "Redox 02", 600, 340, "Hendrik Lammers", "http://www.hendriklammers.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Reticular Tissue
     */
    public static final Tile TT_RETICULAR_TISSUE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-reticular-tissue.png", "Reticular Tissue", 25, 25, "Anna Litvinuk", "http://graphicriver.net/user/Naf_Naf?ref=Naf_Naf"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Retina Dust
     */
    public static final Tile TT_RETINA_DUST = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-retina-dust.png", "Retina Dust", 200, 200, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Retina Wood
     */
    public static final Tile TT_RETINA_WOOD = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-retina-wood.png", "Retina Wood", 512, 512, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Retro Intro
     */
    public static final Tile TT_RETRO_INTRO = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-retro-intro.png", "Retro Intro", 109, 109, "Bilal Ketab", "http://www.twitter.com/Creartinc"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Rice Paper
     */
    public static final Tile TT_RICE_PAPER = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-rice-paper.png", "Rice Paper", 500, 500, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Rice Paper #2
     */
    public static final Tile TT_RICE_PAPER_2 = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-rice-paper-2.png", "Rice Paper #2", 485, 485, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Rice Paper #3
     */
    public static final Tile TT_RICE_PAPER_3 = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-rice-paper-3.png", "Rice Paper #3", 250, 250, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Robots
     */
    public static final Tile TT_ROBOTS = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-robots.png", "Robots", 200, 200, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Rocky Wall
     */
    public static final Tile TT_ROCKY_WALL = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-rocky-wall.png", "Rocky Wall", 500, 500, "Projecteightyfive", "http://projecteightyfive.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Rough Cloth
     */
    public static final Tile TT_ROUGH_CLOTH = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-rough-cloth.png", "Rough Cloth", 320, 320, "Bartosz Kaszubowski", "http://twitter.com/simek"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Rough Cloth (Light)
     */
    public static final Tile TT_ROUGH_CLOTH_LIGHT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-rough-cloth-light.png", "Rough Cloth (Light)", 320, 320, "Bartosz Kaszubowski", "http://twitter.com/simek"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Rough Diagonal
     */
    public static final Tile TT_ROUGH_DIAGONAL = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-rough-diagonal.png", "Rough Diagonal", 256, 256, "Jorick van Hees", "http://jorickvanhees.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Rubber Grip
     */
    public static final Tile TT_RUBBER_GRIP = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-rubber-grip.png", "Rubber Grip", 5, 20, "Sinisha", "http://be.net/pixilated"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Sandpaper
     */
    public static final Tile TT_SANDPAPER = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-sandpaper.png", "Sandpaper", 348, 500, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Satin Weave
     */
    public static final Tile TT_SATIN_WEAVE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-satin-weave.png", "Satin Weave", 24, 12, "Merrin Macleod", "http://www.merxplat.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Scribble Light
     */
    public static final Tile TT_SCRIBBLE_LIGHT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-scribble-light.png", "Scribble Light", 304, 306, "Tegan Male", "http://thelovelyfox.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Shattered (Dark)
     */
    public static final Tile TT_SHATTERED_DARK = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-shattered-dark.png", "Shattered (Dark)", 500, 500, "Luuk van Baars", "http://luukvanbaars.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Shattered (Light)
     */
    public static final Tile TT_SHATTERED_LIGHT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-shattered-light.png", "Shattered (Light)", 500, 500, "Luuk van Baars", "http://luukvanbaars.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Shine Caro
     */
    public static final Tile TT_SHINE_CARO = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-shine-caro.png", "Shine Caro", 9, 9, "mediumidee", "http://www.mediumidee.de"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Shine Dotted
     */
    public static final Tile TT_SHINE_DOTTED = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-shine-dotted.png", "Shine Dotted", 6, 5, "mediumidee", "http://www.mediumidee.de"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Shley Tree 1
     */
    public static final Tile TT_SHLEY_TREE_1 = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-shley-tree-1.png", "Shley Tree 1", 300, 409, "Derek Ramsey", "http://en.wikipedia.org/wiki/User:Ram-Man"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Shley Tree 2
     */
    public static final Tile TT_SHLEY_TREE_2 = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-shley-tree-2.png", "Shley Tree 2", 400, 414, "Mike Hearn", "http://www.mikehearn.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Silver Scales
     */
    public static final Tile TT_SILVER_SCALES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-silver-scales.png", "Silver Scales", 40, 40, "Alex Parker", "http://twitter.com/misterparker"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Simple Dashed
     */
    public static final Tile TT_SIMPLE_DASHED = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-simple-dashed.png", "Simple Dashed", 14, 14, "Venam", "http://venam.1.ai"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Simple Horizontal Light
     */
    public static final Tile TT_SIMPLE_HORIZONTAL_LIGHT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-simple-horizontal-light.png", "Simple Horizontal Light", 4, 4, "Fabricio"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Skeletal Weave
     */
    public static final Tile TT_SKELETAL_WEAVE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-skeletal-weave.png", "Skeletal Weave", 25, 25, "Angelica", "http://fleeting_days.livejournal.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Skewed Print
     */
    public static final Tile TT_SKEWED_PRINT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-skewed-print.png", "Skewed Print", 330, 320, "Hendrik Lammers", "http://www.hendriklammers.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Skin Side Up
     */
    public static final Tile TT_SKIN_SIDE_UP = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-skin-side-up.png", "Skin Side Up", 320, 360, "Hendrik Lammers", "http://www.hendriklammers.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Skulls
     */
    public static final Tile TT_SKULLS = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-skulls.png", "Skulls", 400, 400, "Adam"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Slash It
     */
    public static final Tile TT_SLASH_IT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-slash-it.png", "Slash It", 9, 9, "Venam", "http://venam.1.ai"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Small Crackle Bright
     */
    public static final Tile TT_SMALL_CRACKLE_BRIGHT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-small-crackle-bright.png", "Small Crackle Bright", 14, 14, "Markus Tinner", "http://www.markustinner.ch"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Small Crosses
     */
    public static final Tile TT_SMALL_CROSSES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-small-crosses.png", "Small Crosses", 10, 10, "Ian Dmitry"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Smooth Wall (Dark)
     */
    public static final Tile TT_SMOOTH_WALL_DARK = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-smooth-wall-dark.png", "Smooth Wall (Dark)", 358, 358, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Smooth Wall (Light)
     */
    public static final Tile TT_SMOOTH_WALL_LIGHT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-smooth-wall-light.png", "Smooth Wall (Light)", 358, 358, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Sneaker Mesh Fabric
     */
    public static final Tile TT_SNEAKER_MESH_FABRIC = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-sneaker-mesh-fabric.png", "Sneaker Mesh Fabric", 150, 111, "Victor Bejar", "http://victorbejar.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Snow
     */
    public static final Tile TT_SNOW = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-snow.png", "Snow", 500, 500, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Soft Circle Scales
     */
    public static final Tile TT_SOFT_CIRCLE_SCALES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-soft-circle-scales.png", "Soft Circle Scales", 256, 56, "Ian Soper", "http://iansoper.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Soft Kill
     */
    public static final Tile TT_SOFT_KILL = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-soft-kill.png", "Soft Kill", 28, 48, "Factorio.us Collective", "http://www.factorio.us"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Soft Pad
     */
    public static final Tile TT_SOFT_PAD = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-soft-pad.png", "Soft Pad", 8, 8, "Badhon Ebrahim", "http://dribbble.com/graphcoder"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Soft Wallpaper
     */
    public static final Tile TT_SOFT_WALLPAPER = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-soft-wallpaper.png", "Soft Wallpaper", 666, 666, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Solid
     */
    public static final Tile TT_SOLID = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-solid.png", "Solid", 500, 500, "Hendrik Lammers", "http://www.hendriklammers.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Sos
     */
    public static final Tile TT_SOS = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-sos.png", "Sos", 25, 25, "JBasoo", "https://twitter.com/JBasoo"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Sprinkles
     */
    public static final Tile TT_SPRINKLES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-sprinkles.png", "Sprinkles", 10, 5, "Rebecca Litt", "http://yellowmangodesign.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Squairy
     */
    public static final Tile TT_SQUAIRY = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-squairy.png", "Squairy", 200, 200, "Tia Newbury"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Squared Metal
     */
    public static final Tile TT_SQUARED_METAL = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-squared-metal.png", "Squared Metal", 132, 132, "doot0", "http://twitter.com/doot0"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Squares
     */
    public static final Tile TT_SQUARES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-squares.png", "Squares", 32, 32, "Jaromir Kavan", "http://www.toshtak.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Stacked Circles
     */
    public static final Tile TT_STACKED_CIRCLES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-stacked-circles.png", "Stacked Circles", 9, 9, "Saqib", "http://www.960development.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Stardust
     */
    public static final Tile TT_STARDUST = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-stardust.png", "Stardust", 798, 798, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Starring
     */
    public static final Tile TT_STARRING = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-starring.png", "Starring", 35, 39, "Agus Riyadi", "http://logosmile.net/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Stitched Wool
     */
    public static final Tile TT_STITCHED_WOOL = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-stitched-wool.png", "Stitched Wool", 224, 128, "Badhon Ebrahim", "http://dribbble.com/graphcoder"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Strange Bullseyes
     */
    public static final Tile TT_STRANGE_BULLSEYES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-strange-bullseyes.png", "Strange Bullseyes", 300, 300, "Christopher Buecheler", "http://cwbuecheler.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Straws
     */
    public static final Tile TT_STRAWS = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-straws.png", "Straws", 16, 16, "Pavel", "http://evaluto.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Stressed Linen
     */
    public static final Tile TT_STRESSED_LINEN = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-stressed-linen.png", "Stressed Linen", 256, 256, "Jordan Pittman"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Bartosz Kaszubowski
     */
    public static final Tile TT_STUCCO = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-stucco.png", "Stucco", 250, 249, "Bartosz Kaszubowski", "http://twitter.com/#!/simek"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Subtlenet
     */
    public static final Tile TT_SUBTLENET = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-subtlenet.png", "Subtlenet", 60, 60, "Designova", "http://www.designova.net"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Subtle Carbon
     */
    public static final Tile TT_SUBTLE_CARBON = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-subtle-carbon.png", "Subtle Carbon", 18, 15, "Designova", "http://www.designova.net"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Subtle Dark Vertical
     */
    public static final Tile TT_SUBTLE_DARK_VERTICAL = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-subtle-dark-vertical.png", "Subtle Dark Vertical", 40, 40, "Cody L", "http://tirl.tk/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Subtle Dots
     */
    public static final Tile TT_SUBTLE_DOTS = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-subtle-dots.png", "Subtle Dots", 27, 15, "Designova", "http://www.designova.net"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Subtle Freckles
     */
    public static final Tile TT_SUBTLE_FRECKLES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-subtle-freckles.png", "Subtle Freckles", 198, 198, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Subtle Grey
     */
    public static final Tile TT_SUBTLE_GREY = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-subtle-grey.png", "Subtle Grey", 397, 322, "Haris Sumic"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Subtle Grunge
     */
    public static final Tile TT_SUBTLE_GRUNGE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-subtle-grunge.png", "Subtle Grunge", 400, 400, "Breezi", "http://breezi.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Subtle Stripes
     */
    public static final Tile TT_SUBTLE_STRIPES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-subtle-stripes.png", "Subtle Stripes", 40, 40, "Raasa", "http://cargocollective.com/raasa"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Subtle Surface
     */
    public static final Tile TT_SUBTLE_SURFACE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-subtle-surface.png", "Subtle Surface", 16, 8, "Designova", "http://www.designova.net"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Subtle White Feathers
     */
    public static final Tile TT_SUBTLE_WHITE_FEATHERS = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-subtle-white-feathers.png", "Subtle White Feathers", 500, 333, "Viahorizon", "http://therapywarsaw.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Subtle Zebra 3D
     */
    public static final Tile TT_SUBTLE_ZEBRA_3D = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-subtle-zebra-3d.png", "Subtle Zebra 3D", 121, 38, "Mike Warner", "http://www.miketheindian.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Swirl
     */
    public static final Tile TT_SWIRL = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-swirl.png", "Swirl", 200, 200, "Peter Chon", "http://peterchondesign.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Tactile Noise (Dark)
     */
    public static final Tile TT_TACTILE_NOISE_DARK = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-tactile-noise-dark.png", "Tactile Noise (Dark)", 48, 48, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Tactile Noise (Light)
     */
    public static final Tile TT_TACTILE_NOISE_LIGHT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-tactile-noise-light.png", "Tactile Noise (Light)", 48, 48, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Tapestry
     */
    public static final Tile TT_TAPESTRY = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-tapestry.png", "Tapestry", 72, 61, "Pixeden", "http://www.pixeden.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Tasky
     */
    public static final Tile TT_TASKY = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-tasky.png", "Tasky", 10, 10, "Michal Chovanec", "http://michalchovanec.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Tex2Res1
     */
    public static final Tile TT_TEX2RES1 = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-tex2res1.png", "Tex2Res1", 500, 500, "Janos Koos", "http://joxadesign.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Tex2Res2
     */
    public static final Tile TT_TEX2RES2 = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-tex2res2.png", "Tex2Res2", 500, 500, "Janos Koos", "http://joxadesign.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Tex2Res3
     */
    public static final Tile TT_TEX2RES3 = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-tex2res3.png", "Tex2Res3", 500, 500, "Janos Koos", "http://joxadesign.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Tex2Res4
     */
    public static final Tile TT_TEX2RES4 = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-tex2res4.png", "Tex2Res4", 500, 500, "Janos Koos", "http://joxadesign.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Tex2Res5
     */
    public static final Tile TT_TEX2RES5 = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-tex2res5.png", "Tex2Res5", 500, 500, "Janos Koos", "http://joxadesign.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Textured Paper
     */
    public static final Tile TT_TEXTURED_PAPER = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-textured-paper.png", "Textured Paper", 500, 500, "Stephen Gilbert", "http://stephen.io"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Textured Stripes
     */
    public static final Tile TT_TEXTURED_STRIPES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-textured-stripes.png", "Textured Stripes", 256, 256, "V Hartikainen", "http://tiled-bg.blogspot.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Texturetastic Gray
     */
    public static final Tile TT_TEXTURETASTIC_GRAY = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-texturetastic-gray.png", "Texturetastic Gray", 476, 476, "Adam Pickering", "http://www.adampickering.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Laura Gilbert Gilardenghi
     */
    public static final Tile TT_TICKS = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-ticks.png", "Ticks", 400, 400, "Laura Gilbert Gilardenghi", "http://rossomenta.blogspot.it/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Tileable Wood
     */
    public static final Tile TT_TILEABLE_WOOD = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-tileable-wood.png", "Tileable Wood", 400, 317, "Elemis", "http://elemisfreebies.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Tileable Wood Colored
     */
    public static final Tile TT_TILEABLE_WOOD_COLORED = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-tileable-wood-colored.png", "Tileable Wood Colored", 400, 317, "Elemis", "http://elemisfreebies.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Tiny Grid
     */
    public static final Tile TT_TINY_GRID = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-tiny-grid.png", "Tiny Grid", 26, 26, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Translucent Fibres
     */
    public static final Tile TT_TRANSLUCENT_FIBRES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-translucent-fibres.png", "Translucent Fibres", 16, 16, "Angelica", "http://fleeting_days.livejournal.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Transparent Square Tiles
     */
    public static final Tile TT_TRANSPARENT_SQUARE_TILES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-transparent-square-tiles.png", "Transparent Square Tiles", 252, 230, "Nathan Spady", "http://nspady.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Tree Bark
     */
    public static final Tile TT_TREE_BARK = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-tree-bark.png", "Tree Bark", 350, 350, "GetDiscount", "http://getdiscount.co.uk/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Triangles
     */
    public static final Tile TT_TRIANGLES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-triangles.png", "Triangles", 33, 36, "Ivan Ginev", "http://coggraphics.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Triangles 2
     */
    public static final Tile TT_TRIANGLES_2 = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-triangles-2.png", "Triangles 2", 72, 72, "Pixeden", "http://www.pixeden.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Triangular
     */
    public static final Tile TT_TRIANGULAR = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-triangular.png", "Triangular", 60, 60, "Dax Kieran", "http://daxkieran.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Tweed
     */
    public static final Tile TT_TWEED = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-tweed.png", "Tweed", 200, 200, "Simon Leo"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Twinkle Twinkle
     */
    public static final Tile TT_TWINKLE_TWINKLE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-twinkle-twinkle.png", "Twinkle Twinkle", 360, 300, "Badhon Ebrahim", "http://dribbble.com/graphcoder"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Txture
     */
    public static final Tile TT_TXTURE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-txture.png", "Txture", 400, 300, "Anatoli Nicolae", "http://designchomp.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Type
     */
    public static final Tile TT_TYPE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-type.png", "Type", 200, 200, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Use Your Illusion
     */
    public static final Tile TT_USE_YOUR_ILLUSION = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-use-your-illusion.png", "Use Your Illusion", 54, 58, "Mohawk Studios", "http://www.mohawkstudios.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Vaio
     */
    public static final Tile TT_VAIO = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-vaio.png", "Vaio", 37, 28, "Zigzain", "http://www.zigzain.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Vertical Cloth
     */
    public static final Tile TT_VERTICAL_CLOTH = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-vertical-cloth.png", "Vertical Cloth", 399, 400, "Krisp Designs", "http://dribbble.com/krisp"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Vichy
     */
    public static final Tile TT_VICHY = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-vichy.png", "Vichy", 70, 70, "Olivier Pineda", "http://www.olivierpineda.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Vintage Speckles
     */
    public static final Tile TT_VINTAGE_SPECKLES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-vintage-speckles.png", "Vintage Speckles", 400, 300, "David Pomfret", "http://simpleasmilk.co.uk"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Wall #4 Light
     */
    public static final Tile TT_WALL_4_LIGHT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-wall-4-light.png", "Wall #4 Light", 300, 300, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Washi
     */
    public static final Tile TT_WASHI = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-washi.png", "Washi", 100, 100, "Carolynne", "http://www.sweetstudio.co.uk"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Wavecut
     */
    public static final Tile TT_WAVECUT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-wavecut.png", "Wavecut", 162, 15, "Ian Soper", "http://iansoper.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Wave Grid
     */
    public static final Tile TT_WAVE_GRID = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-wave-grid.png", "Wave Grid", 100, 100, "DomainsInfo", "http://www.domainsinfo.org/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Weave
     */
    public static final Tile TT_WEAVE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-weave.png", "Weave", 35, 31, "Catherine", "http://wellterned.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Wet Snow
     */
    public static final Tile TT_WET_SNOW = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-wet-snow.png", "Wet Snow", 250, 250, "Kerstkaarten", "http://www.fotokaarten.nl/kerst.html"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Whitey
     */
    public static final Tile TT_WHITEY = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-whitey.png", "Whitey", 654, 654, "Ant Eksiler", "http://www.turkhitbox.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: White Bed Sheet
     */
    public static final Tile TT_WHITE_BED_SHEET = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-white-bed-sheet.png", "White Bed Sheet", 54, 54, "Badhon Ebrahim", "http://dribbble.com/graphcoder"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: White Brick Wall
     */
    public static final Tile TT_WHITE_BRICK_WALL = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-white-brick-wall.png", "White Brick Wall", 24, 16, "Listvetra", "http://www.listvetra.ru"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: White Brushed
     */
    public static final Tile TT_WHITE_BRUSHED = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-white-brushed.png", "White Brushed", 114, 114, "Andre Schouten", "http://uniqappz.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: White Carbon
     */
    public static final Tile TT_WHITE_CARBON = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-white-carbon.png", "White Carbon", 8, 8, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: White Carbonfiber
     */
    public static final Tile TT_WHITE_CARBONFIBER = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-white-carbonfiber.png", "White Carbonfiber", 4, 4, "Badhon Ebrahim", "http://dribbble.com/graphcoder"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: White Diamond (Dark)
     */
    public static final Tile TT_WHITE_DIAMOND_DARK = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-white-diamond-dark.png", "White Diamond (Dark)", 128, 224, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: White Diamond
     */
    public static final Tile TT_WHITE_DIAMOND_LIGHT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-white-diamond-light.png", "White Diamond", 128, 224, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: White Leather
     */
    public static final Tile TT_WHITE_LEATHER = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-white-leather.png", "White Leather", 300, 300, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: White Linen
     */
    public static final Tile TT_WHITE_LINEN = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-white-linen.png", "White Linen", 400, 300, "Fabian Schultz", "http://fabianschultz.de/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: White Paperboard
     */
    public static final Tile TT_WHITE_PAPERBOARD = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-white-paperboard.png", "White Paperboard", 256, 252, "Chaos"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: White Plaster
     */
    public static final Tile TT_WHITE_PLASTER = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-white-plaster.png", "White Plaster", 300, 300, "Phil Maurer", "http://aurer.co.uk"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile:White Sand 
     */
    public static final Tile TT_WHITE_SAND = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-white-sand.png", "White Sand", 211, 211, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: White Texture
     */
    public static final Tile TT_WHITE_TEXTURE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-white-texture.png", "White Texture", 102, 102, "Dmitry"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: White Tiles
     */
    public static final Tile TT_WHITE_TILES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-white-tiles.png", "White Tiles", 800, 250, "Another One", "http://www.anotherone.fr/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: White Wall
     */
    public static final Tile TT_WHITE_WALL = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-white-wall.png", "White Wall", 800, 600, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: White Wall 3
     */
    public static final Tile TT_WHITE_WALL_3 = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-white-wall-3.png", "White Wall 3", 150, 150, "Viahorizon", "http://centrumpar.pl/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: White Wall 3[2]
     */
    public static final Tile TT_WHITE_WALL_3_2 = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-white-wall-3-2.png", "White Wall 3[2]", 500, 500, "Luca", "http://skymbu.info/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: White Wave
     */
    public static final Tile TT_WHITE_WAVE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-white-wave.png", "White Wave", 23, 12, "Rohit Arun Rao"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Wide Rectangles
     */
    public static final Tile TT_WIDE_RECTANGLES = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-wide-rectangles.png", "Wide Rectangles", 32, 14, "Petr Sulc", "http://www.petrsulc.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Wild Flowers
     */
    public static final Tile TT_WILD_FLOWERS = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-wild-flowers.png", "Wild Flowers", 350, 350, "Themes Tube", "http://themestube.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Wild Oliva
     */
    public static final Tile TT_WILD_OLIVA = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-wild-oliva.png", "Wild Oliva", 198, 200, "Badhon Ebrahim", "http://dribbble.com/graphcoder"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Wine Cork
     */
    public static final Tile TT_WINE_CORK = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-wine-cork.png", "Wine Cork", 300, 300, "Atle Mo", "http://atle.co/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Wood
     */
    public static final Tile TT_WOOD = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-wood.png", "Wood", 700, 700, "Cloaks", "http://cloaks.deviantart.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Wood Pattern
     */
    public static final Tile TT_WOOD_PATTERN = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-wood-pattern.png", "Wood Pattern", 203, 317, "Alexey Usoltsev"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Worn Dots
     */
    public static final Tile TT_WORN_DOTS = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-worn-dots.png", "Worn Dots", 200, 200, "Matt McDaniel", "http://mattmcdaniel.me"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Woven
     */
    public static final Tile TT_WOVEN = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-woven.png", "Woven", 42, 42, "Max Rudberg", "http://www.maxthemes.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Woven (Light)
     */
    public static final Tile TT_WOVEN_LIGHT = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-woven-light.png", "Woven (Light)", 42, 42, "Max Rudberg", "http://www.maxthemes.com"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: Xv
     */
    public static final Tile TT_XV = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-xv.png", "Xv", 294, 235, "Lasma", "http://www.oddfur.com"); // NOI18N

    /**
     * The <code>Java</code> representation from the tile: 
     */
    public static final Tile TT_ZIG_ZAG = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-zig-zag.png", "Zig Zag", 10, 10, "Dmitriy Prodchenko", "http://www.behance.net/dmpr0"); // NOI18N

    private static final Optional<TransparentTexturesTileSet> instance = Optional.of(new TransparentTexturesTileSet());

    /**
     * Returns a singleton instance from the class <code>TransparentTexturesTileLoader</code>.
     * 
     * @return a singleton instance from the class <code>TransparentTexturesTileLoader</code>.
     */
    public static final TransparentTexturesTileSet getDefault() {
        return instance.get();
    }

    private TransparentTexturesTileSet() {
        super();
    }

    @Override
    protected void configureTileLoaders() {
        super.addTileLoader(TransparentTexturesTileLoader.getDefault());
    }

    @Override
    protected void configureTiles() {
        super.addTile(TT_3PX_TILE);
        super.addTile(TT_45_DEGREE_FABRIC_DARK);
        super.addTile(TT_45_DEGREE_FABRIC_LIGHT);
        super.addTile(TT_60_LINES);
        super.addTile(TT_ABSURDITY);
        super.addTile(TT_AG_SQUARE);
        super.addTile(TT_ALWAYS_GREY);
        super.addTile(TT_ARABESQUE);
        super.addTile(TT_ARCHES);
        super.addTile(TT_ARGYLE);
        super.addTile(TT_ASFALT_DARK);
        super.addTile(TT_ASFALT_LIGHT);
        super.addTile(TT_ASSAULT);
        super.addTile(TT_AXIOM_PATTERN);
        super.addTile(TT_AZ_SUBTLE);
        super.addTile(TT_BACK_PATTERN);
        super.addTile(TT_BASKETBALL);
        super.addTile(TT_BATTHERN);
        super.addTile(TT_BEDGE_GRUNGE);
        super.addTile(TT_BEIGE_PAPER);
        super.addTile(TT_BILLIE_HOLIDAY);
        super.addTile(TT_BINDING_DARK);
        super.addTile(TT_BINDING_LIGTH);
        super.addTile(TT_BLACK_FELT);
        super.addTile(TT_BLACK_LINEN_1);
        super.addTile(TT_BLACK_LINEN_2);
        super.addTile(TT_BLACK_MAMBA);
        super.addTile(TT_BLACK_ORCHID);
        super.addTile(TT_BLACK_PAPER);
        super.addTile(TT_BLACK_SCALES);
        super.addTile(TT_BLACK_THREAD);
        super.addTile(TT_BLACK_THREAD_LIGHT);
        super.addTile(TT_BLACK_TWILL);
        super.addTile(TT_BLIZZARD);
        super.addTile(TT_BLU_STRIPES);
        super.addTile(TT_BO_PLAY);
        super.addTile(TT_BRICK_WALL);
        super.addTile(TT_BRICK_WALL_DARK);
        super.addTile(TT_BRIGHT_SQUARES);
        super.addTile(TT_BRILLIANT);
        super.addTile(TT_BROKEN_NOISE);
        super.addTile(TT_BRUSHED_ALUM);
        super.addTile(TT_BRUSHED_ALUM_DARK);
        super.addTile(TT_BURIED);
        super.addTile(TT_CANDYHOLE);
        super.addTile(TT_CARBON_FIBRE);
        super.addTile(TT_CARBON_FIBRE_BIG);
        super.addTile(TT_CARBON_FIBRE_V2);
        super.addTile(TT_CARDBOARD);
        super.addTile(TT_CARDBOARD_FLAT);
        super.addTile(TT_CARTOGRAPHER);
        super.addTile(TT_CHECKERED_LIGHT_EMBOSS);
        super.addTile(TT_CHECKERED_PATTERN);
        super.addTile(TT_CHURCH);
        super.addTile(TT_CIRCLES);
        super.addTile(TT_CLASSY_FABRIC);
        super.addTile(TT_CLEAN_GRAY_PAPER);
        super.addTile(TT_CLEAN_TEXTILE);
        super.addTile(TT_CLIMPEK);
        super.addTile(TT_CLOTH_ALIKE);
        super.addTile(TT_CONCRETE_WALL);
        super.addTile(TT_CONCRETE_WALL_2);
        super.addTile(TT_CONCRETE_WALL_3);
        super.addTile(TT_CONNECTED);
        super.addTile(TT_CORRUGATION);
        super.addTile(TT_CREAM_DUST);
        super.addTile(TT_CREAM_PAPER);
        super.addTile(TT_CREAM_PIXELS);
        super.addTile(TT_CRISP_PAPER_RUFFLES);
        super.addTile(TT_CRISSXCROSS);
        super.addTile(TT_CROSSWORD);
        super.addTile(TT_CROSS_SCRATCHES);
        super.addTile(TT_CROSS_STRIPES);
        super.addTile(TT_CUBES);
        super.addTile(TT_CUTCUBE);
        super.addTile(TT_DARK_BRICK_WALL);
        super.addTile(TT_DARK_CIRCLES);
        super.addTile(TT_DARK_DENIM);
        super.addTile(TT_DARK_DENIM_3);
        super.addTile(TT_DARK_DOT);
        super.addTile(TT_DARK_DOTTED_2);
        super.addTile(TT_DARK_EXA);
        super.addTile(TT_DARK_FISH_SKIN);
        super.addTile(TT_DARK_GEOMETRIC);
        super.addTile(TT_DARK_LEATHER);
        super.addTile(TT_DARK_MATTER);
        super.addTile(TT_DARK_MOSAIC);
        super.addTile(TT_DARK_STRIPES);
        super.addTile(TT_DARK_STRIPES_LIGHT);
        super.addTile(TT_DARK_TIRE);
        super.addTile(TT_DARK_WALL);
        super.addTile(TT_DARK_WOOD);
        super.addTile(TT_DARTH_STRIPE);
        super.addTile(TT_DEBUT_DARK);
        super.addTile(TT_DEBUT_LIGHT);
        super.addTile(TT_DIAGMONDS_DARK);
        super.addTile(TT_DIAGMONDS_LIGHT);
        super.addTile(TT_DIAGONALES_DECALEES);
        super.addTile(TT_DIAGONAL_NOISE);
        super.addTile(TT_DIAGONAL_STRIPED_BRICK);
        super.addTile(TT_DIAGONAL_WAVES);
        super.addTile(TT_DIAMONDS_ARE_FOREVER);
        super.addTile(TT_DIAMOND_EYES);
        super.addTile(TT_DIAMOND_UPHOLSTERY);
        super.addTile(TT_DIMENSION);
        super.addTile(TT_DIRTY_OLD_BLACK_SHIRT);
        super.addTile(TT_DOTNOISE_LIGHT_GREY);
        super.addTile(TT_DOUBLE_LINED);
        super.addTile(TT_DUST);
        super.addTile(TT_ECAILLES);
        super.addTile(TT_EGG_SHELL);
        super.addTile(TT_ELASTOPLAST);
        super.addTile(TT_ELEGANT_GRID);
        super.addTile(TT_EMBOSSED_PAPER);
        super.addTile(TT_ESCHERESQUE);
        super.addTile(TT_ESCHERESQUE_DARK);
        super.addTile(TT_EXCLUSIVE_PAPER);
        super.addTile(TT_FABRIC_1_DARK);
        super.addTile(TT_FABRIC_1_LIGHT);
        super.addTile(TT_FABRIC_OF_SQUARES);
        super.addTile(TT_FABRIC_PLAID);
        super.addTile(TT_FAKE_BRICK);
        super.addTile(TT_FAKE_LUXURY);
        super.addTile(TT_FANCY_DEBOSS);
        super.addTile(TT_FARMER);
        super.addTile(TT_FELT);
        super.addTile(TT_FIRST_AID_KIT);
        super.addTile(TT_FLOWERS);
        super.addTile(TT_FLOWER_TRAIL);
        super.addTile(TT_FOGGY_BIRDS);
        super.addTile(TT_FOOD);
        super.addTile(TT_FOOTBALL_NO_LINES);
        super.addTile(TT_FRENCH_STUCCO);
        super.addTile(TT_FRESH_SNOW);
        super.addTile(TT_GOLD_SCALE);
        super.addTile(TT_GPLAY);
        super.addTile(TT_GRADIENT_SQUARES);
        super.addTile(TT_GRAPHCODERS_LIL_FIBER);
        super.addTile(TT_GRAPHY_DARK);
        super.addTile(TT_GRAPHY_LIGHT);
        super.addTile(TT_GRAVEL);
        super.addTile(TT_GRAY_FLORAL);
        super.addTile(TT_GRAY_LINES);
        super.addTile(TT_GRAY_SAND);
        super.addTile(TT_GREEN_CUP);
        super.addTile(TT_GREEN_DUST_AND_SCRATCHES);
        super.addTile(TT_GREEN_FIBERS);
        super.addTile(TT_GREEN_GOBBLER);
        super.addTile(TT_GREYZZ);
        super.addTile(TT_GREY_JEAN);
        super.addTile(TT_GREY_SANDBAG);
        super.addTile(TT_GREY_WASHED_WALL);
        super.addTile(TT_GRID);
        super.addTile(TT_GRID_ME);
        super.addTile(TT_GRID_NOISE);
        super.addTile(TT_GRILLED_NOISE);
        super.addTile(TT_GROOVEPAPER);
        super.addTile(TT_GRUNGE_WALL);
        super.addTile(TT_GUN_METAL);
        super.addTile(TT_HANDMADE_PAPER);
        super.addTile(TT_HEXABUMP);
        super.addTile(TT_HEXELLENCE);
        super.addTile(TT_HIXS_EVOLUTION);
        super.addTile(TT_HOFFMAN);
        super.addTile(TT_HONEY_IM_SUBTLE);
        super.addTile(TT_ICE_AGE);
        super.addTile(TT_INFLICTED);
        super.addTile(TT_INSPIRATION_GEOMETRY);
        super.addTile(TT_IRON_GRIP);
        super.addTile(TT_KINDA_JEAN);
        super.addTile(TT_KNITTED_NETTING);
        super.addTile(TT_KNITTED_SEATER);
        super.addTile(TT_KUJI);
        super.addTile(TT_LARGE_LEATHER);
        super.addTile(TT_LEATHER);
        super.addTile(TT_LIGHT_ALUMINUM);
        super.addTile(TT_LIGHT_GRAY);
        super.addTile(TT_LIGHT_GREY_FLORAL_MOTIF);
        super.addTile(TT_LIGHT_HONEYCOMB);
        super.addTile(TT_LIGHT_HONEYCOMB_DARK);
        super.addTile(TT_LIGHT_MESH);
        super.addTile(TT_LIGHT_PAPER_FIBERS);
        super.addTile(TT_LIGHT_SKETCH);
        super.addTile(TT_LIGHT_TOAST);
        super.addTile(TT_LIGHT_WOOL);
        super.addTile(TT_LINED_PAPER);
        super.addTile(TT_LINED_PAPER_2);
        super.addTile(TT_LITTLE_KNOBS);
        super.addTile(TT_LITTLE_PLUSES);
        super.addTile(TT_LITTLE_TRIANGLES);
        super.addTile(TT_LOW_CONTRAST_LINEN);
        super.addTile(TT_LYONNETTE);
        super.addTile(TT_MAZE_BLACK);
        super.addTile(TT_MAZE_WHITE);
        super.addTile(TT_MBOSSED);
        super.addTile(TT_MEDIC_PACKAGING_FOIL);
        super.addTile(TT_MERELY_CUBED);
        super.addTile(TT_MICRO_CARBON);
        super.addTile(TT_MIRRORED_SQUARES);
        super.addTile(TT_MOCHA_GRUNGE);
        super.addTile(TT_MOONING);
        super.addTile(TT_MOULING);
        super.addTile(TT_MY_LITTLE_PLAID_DARK);
        super.addTile(TT_MY_LITTLE_PLAID_LIGHT);
        super.addTile(TT_NAMI);
        super.addTile(TT_NASTY_FABRIC);
        super.addTile(TT_NATURAL_PAPER);
        super.addTile(TT_NAVY);
        super.addTile(TT_NICE_SNOW);
        super.addTile(TT_NISTRI);
        super.addTile(TT_NOISE_LINES);
        super.addTile(TT_NOISE_PATTERN_WITH_SUBTLE_CROSS_LINES);
        super.addTile(TT_NOISY);
        super.addTile(TT_NOISY_GRID);
        super.addTile(TT_NOISY_NET);
        super.addTile(TT_NORWEGIAN_ROSE);
        super.addTile(TT_NOTEBOOK);
        super.addTile(TT_NOTEBOOK_DARK);
        super.addTile(TT_OFFICE);
        super.addTile(TT_OLD_HUSKS);
        super.addTile(TT_OLD_MAP);
        super.addTile(TT_OLD_MATHEMATICS);
        super.addTile(TT_OLD_MOON);
        super.addTile(TT_OLD_WALL);
        super.addTile(TT_OTIS_REDDING);
        super.addTile(TT_OUTLETS);
        super.addTile(TT_P1);
        super.addTile(TT_P2);
        super.addTile(TT_P4);
        super.addTile(TT_P5);
        super.addTile(TT_P6);
        super.addTile(TT_PADDED);
        super.addTile(TT_PADDED_LIGHT);
        super.addTile(TT_PAPER);
        super.addTile(TT_PAPER_1);
        super.addTile(TT_PAPER_2);
        super.addTile(TT_PAPER_3);
        super.addTile(TT_PAPER_FIBERS);
        super.addTile(TT_PAVEN);
        super.addTile(TT_PERFORATED_WHITE_LEATHER);
        super.addTile(TT_PINEAPPLE_CUT);
        super.addTile(TT_PINSTRIPED_SUIT);
        super.addTile(TT_PINSTRIPE_DARK);
        super.addTile(TT_PINSTRIPE_LIGHT);
        super.addTile(TT_PIXEL_WEAVE);
        super.addTile(TT_POLAROID);
        super.addTile(TT_POLONEZ_PATTERN);
        super.addTile(TT_POLYESTER_LITE);
        super.addTile(TT_POOL_TABLE);
        super.addTile(TT_PROJECT_PAPER);
        super.addTile(TT_PSYCHEDELIC);
        super.addTile(TT_PS_NEUTRAL);
        super.addTile(TT_PURTY_WOOD);
        super.addTile(TT_PW_PATTERN);
        super.addTile(TT_PYRAMID);
        super.addTile(TT_QUILT);
        super.addTile(TT_RANOM_GREY_VARIATIONS);
        super.addTile(TT_RAVENNA);
        super.addTile(TT_REAL_CARBON_FIBRE);
        super.addTile(TT_REBEL);
        super.addTile(TT_REDOX_01);
        super.addTile(TT_REDOX_02);
        super.addTile(TT_RETICULAR_TISSUE);
        super.addTile(TT_RETINA_DUST);
        super.addTile(TT_RETINA_WOOD);
        super.addTile(TT_RETRO_INTRO);
        super.addTile(TT_RICE_PAPER);
        super.addTile(TT_RICE_PAPER_2);
        super.addTile(TT_RICE_PAPER_3);
        super.addTile(TT_ROBOTS);
        super.addTile(TT_ROCKY_WALL);
        super.addTile(TT_ROUGH_CLOTH);
        super.addTile(TT_ROUGH_CLOTH_LIGHT);
        super.addTile(TT_ROUGH_DIAGONAL);
        super.addTile(TT_RUBBER_GRIP);
        super.addTile(TT_SANDPAPER);
        super.addTile(TT_SATIN_WEAVE);
        super.addTile(TT_SCRIBBLE_LIGHT);
        super.addTile(TT_SHATTERED_DARK);
        super.addTile(TT_SHATTERED_LIGHT);
        super.addTile(TT_SHINE_CARO);
        super.addTile(TT_SHINE_DOTTED);
        super.addTile(TT_SHLEY_TREE_1);
        super.addTile(TT_SHLEY_TREE_2);
        super.addTile(TT_SILVER_SCALES);
        super.addTile(TT_SIMPLE_DASHED);
        super.addTile(TT_SIMPLE_HORIZONTAL_LIGHT);
        super.addTile(TT_SKELETAL_WEAVE);
        super.addTile(TT_SKEWED_PRINT);
        super.addTile(TT_SKIN_SIDE_UP);
        super.addTile(TT_SKULLS);
        super.addTile(TT_SLASH_IT);
        super.addTile(TT_SMALL_CRACKLE_BRIGHT);
        super.addTile(TT_SMALL_CROSSES);
        super.addTile(TT_SMOOTH_WALL_DARK);
        super.addTile(TT_SMOOTH_WALL_LIGHT);
        super.addTile(TT_SNEAKER_MESH_FABRIC);
        super.addTile(TT_SNOW);
        super.addTile(TT_SOFT_CIRCLE_SCALES);
        super.addTile(TT_SOFT_KILL);
        super.addTile(TT_SOFT_PAD);
        super.addTile(TT_SOFT_WALLPAPER);
        super.addTile(TT_SOLID);
        super.addTile(TT_SOS);
        super.addTile(TT_SPRINKLES);
        super.addTile(TT_SQUAIRY);
        super.addTile(TT_SQUARED_METAL);
        super.addTile(TT_SQUARES);
        super.addTile(TT_STACKED_CIRCLES);
        super.addTile(TT_STARDUST);
        super.addTile(TT_STARRING);
        super.addTile(TT_STITCHED_WOOL);
        super.addTile(TT_STRANGE_BULLSEYES);
        super.addTile(TT_STRAWS);
        super.addTile(TT_STRESSED_LINEN);
        super.addTile(TT_STUCCO);
        super.addTile(TT_SUBTLENET);
        super.addTile(TT_SUBTLE_CARBON);
        super.addTile(TT_SUBTLE_DARK_VERTICAL);
        super.addTile(TT_SUBTLE_DOTS);
        super.addTile(TT_SUBTLE_FRECKLES);
        super.addTile(TT_SUBTLE_GREY);
        super.addTile(TT_SUBTLE_GRUNGE);
        super.addTile(TT_SUBTLE_STRIPES);
        super.addTile(TT_SUBTLE_SURFACE);
        super.addTile(TT_SUBTLE_WHITE_FEATHERS);
        super.addTile(TT_SUBTLE_ZEBRA_3D);
        super.addTile(TT_SWIRL);
        super.addTile(TT_TACTILE_NOISE_DARK);
        super.addTile(TT_TACTILE_NOISE_LIGHT);
        super.addTile(TT_TAPESTRY);
        super.addTile(TT_TASKY);
        super.addTile(TT_TEX2RES1);
        super.addTile(TT_TEX2RES2);
        super.addTile(TT_TEX2RES3);
        super.addTile(TT_TEX2RES4);
        super.addTile(TT_TEX2RES5);
        super.addTile(TT_TEXTURED_PAPER);
        super.addTile(TT_TEXTURED_STRIPES);
        super.addTile(TT_TEXTURETASTIC_GRAY);
        super.addTile(TT_TICKS);
        super.addTile(TT_TILEABLE_WOOD);
        super.addTile(TT_TILEABLE_WOOD_COLORED);
        super.addTile(TT_TINY_GRID);
        super.addTile(TT_TRANSLUCENT_FIBRES);
        super.addTile(TT_TRANSPARENT_SQUARE_TILES);
        super.addTile(TT_TREE_BARK);
        super.addTile(TT_TRIANGLES);
        super.addTile(TT_TRIANGLES_2);
        super.addTile(TT_TRIANGULAR);
        super.addTile(TT_TWEED);
        super.addTile(TT_TWINKLE_TWINKLE);
        super.addTile(TT_TXTURE);
        super.addTile(TT_TYPE);
        super.addTile(TT_USE_YOUR_ILLUSION);
        super.addTile(TT_VAIO);
        super.addTile(TT_VERTICAL_CLOTH);
        super.addTile(TT_VICHY);
        super.addTile(TT_VINTAGE_SPECKLES);
        super.addTile(TT_WALL_4_LIGHT);
        super.addTile(TT_WASHI);
        super.addTile(TT_WAVECUT);
        super.addTile(TT_WAVE_GRID);
        super.addTile(TT_WEAVE);
        super.addTile(TT_WET_SNOW);
        super.addTile(TT_WHITEY);
        super.addTile(TT_WHITE_BED_SHEET);
        super.addTile(TT_WHITE_BRICK_WALL);
        super.addTile(TT_WHITE_BRUSHED);
        super.addTile(TT_WHITE_CARBON);
        super.addTile(TT_WHITE_CARBONFIBER);
        super.addTile(TT_WHITE_DIAMOND_DARK);
        super.addTile(TT_WHITE_DIAMOND_LIGHT);
        super.addTile(TT_WHITE_LEATHER);
        super.addTile(TT_WHITE_LINEN);
        super.addTile(TT_WHITE_PAPERBOARD);
        super.addTile(TT_WHITE_PLASTER);
        super.addTile(TT_WHITE_SAND);
        super.addTile(TT_WHITE_TEXTURE);
        super.addTile(TT_WHITE_TILES);
        super.addTile(TT_WHITE_WALL);
        super.addTile(TT_WHITE_WALL_3);
        super.addTile(TT_WHITE_WALL_3_2);
        super.addTile(TT_WHITE_WAVE);
        super.addTile(TT_WIDE_RECTANGLES);
        super.addTile(TT_WILD_FLOWERS);
        super.addTile(TT_WILD_OLIVA);
        super.addTile(TT_WINE_CORK);
        super.addTile(TT_WOOD);
        super.addTile(TT_WOOD_PATTERN);
        super.addTile(TT_WORN_DOTS);
        super.addTile(TT_WOVEN);
        super.addTile(TT_WOVEN_LIGHT);
        super.addTile(TT_XV);
        super.addTile(TT_ZIG_ZAG);
    }
    
}
