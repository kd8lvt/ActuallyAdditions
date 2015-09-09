/*
 * This file ("InitBooklet.java") is part of the Actually Additions Mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://github.com/Ellpeck/ActuallyAdditions/blob/master/README.md
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * � 2015 Ellpeck
 */

package ellpeck.actuallyadditions.booklet;

import ellpeck.actuallyadditions.blocks.InitBlocks;
import ellpeck.actuallyadditions.blocks.metalists.TheMiscBlocks;
import ellpeck.actuallyadditions.booklet.page.IBookletPage;
import ellpeck.actuallyadditions.booklet.page.PageCrafting;
import ellpeck.actuallyadditions.booklet.page.PageFurnace;
import ellpeck.actuallyadditions.booklet.page.PageText;
import ellpeck.actuallyadditions.crafting.BlockCrafting;
import ellpeck.actuallyadditions.crafting.FoodCrafting;
import ellpeck.actuallyadditions.crafting.ItemCrafting;
import ellpeck.actuallyadditions.items.InitItems;
import ellpeck.actuallyadditions.items.metalists.TheFoods;
import ellpeck.actuallyadditions.items.metalists.TheMiscItems;
import ellpeck.actuallyadditions.items.metalists.TheSpecialDrops;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;

public class InitBooklet{

    public static ArrayList<BookletIndexEntry> entries = new ArrayList<BookletIndexEntry>();
    public static ArrayList<IBookletPage> pagesWithItemStackData = new ArrayList<IBookletPage>();

    public static BookletChapter chapterIntro;

    public static BookletIndexEntry entryFunctionalNonRF = new BookletIndexEntry("functionalNoRF");
    public static BookletIndexEntry entryFunctionalRF = new BookletIndexEntry("functionalRF");
    public static BookletIndexEntry entryGeneratingRF = new BookletIndexEntry("generatingRF");
    public static BookletIndexEntry entryItemsNonRF = new BookletIndexEntry("itemsNoRF");
    public static BookletIndexEntry entryItemsRF = new BookletIndexEntry("itemsRF");
    public static BookletIndexEntry entryMisc = new BookletIndexEntry("misc");
    public static BookletIndexEntry allAndSearch = new BookletEntryAllSearch("allAndSearch");

    static{
        chapterIntro = new BookletChapter("intro", entryMisc, new PageText(1), new PageText(2), new PageCrafting(3, ItemCrafting.recipeBook));

        new BookletChapter("craftingIngs", entryMisc, new PageText(1), new PageCrafting(2, ItemCrafting.recipeCoil), new PageCrafting(3, ItemCrafting.recipeCoilAdvanced), new PageCrafting(4, BlockCrafting.recipeCase), new PageCrafting(5, BlockCrafting.recipeStoneCase), new PageCrafting(6, BlockCrafting.recipeEnderPearlBlock), new PageCrafting(7, BlockCrafting.recipeEnderCase), new PageCrafting(8, ItemCrafting.recipeRing), new PageCrafting(9, ItemCrafting.recipeKnifeHandle), new PageCrafting(10, ItemCrafting.recipeKnifeBlade), new PageCrafting(11, ItemCrafting.recipeKnife), new PageCrafting(12, ItemCrafting.recipeDough), new PageCrafting(13, ItemCrafting.recipeRiceDough));
        new BookletChapter("quartz", entryMisc, new PageText(1).setStack(new ItemStack(InitBlocks.blockMisc, 1, TheMiscBlocks.ORE_QUARTZ.ordinal())), new PageText(2).setStack(new ItemStack(InitItems.itemMisc, 1, TheMiscItems.QUARTZ.ordinal())), new PageCrafting(3, BlockCrafting.recipeQuartzBlock), new PageCrafting(4, BlockCrafting.recipeQuartzPillar), new PageCrafting(5, BlockCrafting.recipeQuartzChiseled));
        new BookletChapter("cloud", entryMisc, new PageText(1), new PageCrafting(2, BlockCrafting.recipeSmileyCloud));
        new BookletChapter("coalStuff", entryMisc, new PageCrafting(1, ItemCrafting.recipeTinyCoal), new PageCrafting(2, ItemCrafting.recipeTinyChar), new PageCrafting(3, BlockCrafting.recipeBlockChar));
        new BookletChapter("lamps", entryMisc, new PageText(1), new PageCrafting(2, BlockCrafting.recipePowerer), new PageCrafting(3, BlockCrafting.recipesLamps[0]), new PageCrafting(4, BlockCrafting.recipesLamps[1]), new PageCrafting(5, BlockCrafting.recipesLamps[2]), new PageCrafting(6, BlockCrafting.recipesLamps[3]), new PageCrafting(7, BlockCrafting.recipesLamps[4]), new PageCrafting(8, BlockCrafting.recipesLamps[5]), new PageCrafting(9, BlockCrafting.recipesLamps[6]), new PageCrafting(10, BlockCrafting.recipesLamps[7]), new PageCrafting(11, BlockCrafting.recipesLamps[8]), new PageCrafting(12, BlockCrafting.recipesLamps[9]), new PageCrafting(13, BlockCrafting.recipesLamps[10]), new PageCrafting(14, BlockCrafting.recipesLamps[11]), new PageCrafting(15, BlockCrafting.recipesLamps[12]), new PageCrafting(16, BlockCrafting.recipesLamps[13]), new PageCrafting(17, BlockCrafting.recipesLamps[14]), new PageCrafting(18, BlockCrafting.recipesLamps[15]));
        new BookletChapter("treasureChest", entryMisc, new PageText(1).setStack(new ItemStack(InitBlocks.blockTreasureChest)));

        new BookletChapter("breaker", entryFunctionalNonRF, new PageCrafting(1, BlockCrafting.recipeBreaker), new PageCrafting(2, BlockCrafting.recipePlacer), new PageCrafting(3, BlockCrafting.recipeLiquidPlacer), new PageCrafting(4, BlockCrafting.recipeLiquidCollector));
        new BookletChapter("phantomfaces", entryFunctionalNonRF, new PageText(1), new PageCrafting(2, BlockCrafting.recipePhantomface), new PageCrafting(3, BlockCrafting.recipeLiquiface), new PageCrafting(4, BlockCrafting.recipeEnergyface), new PageCrafting(5, ItemCrafting.recipePhantomConnector), new PageCrafting(6, BlockCrafting.recipePhantomBooster));
        new BookletChapter("phantomBreaker", entryFunctionalNonRF, new PageText(1), new PageCrafting(2, BlockCrafting.recipePhantomPlacer), new PageCrafting(3, BlockCrafting.recipePhantomBreaker));
        new BookletChapter("esd", entryFunctionalNonRF, new PageText(1), new PageCrafting(2, BlockCrafting.recipeESD), new PageCrafting(3, BlockCrafting.recipeAdvancedESD));
        new BookletChapter("xpSolidifier", entryFunctionalNonRF, new PageText(1).setStack(new ItemStack(InitItems.itemSpecialDrop, 1, TheSpecialDrops.SOLIDIFIED_EXPERIENCE.ordinal())), new PageCrafting(2, BlockCrafting.recipeSolidifier));
        new BookletChapter("greenhouseGlass", entryFunctionalNonRF, new PageText(1), new PageCrafting(2, BlockCrafting.recipeGlass));
        new BookletChapter("fishingNet", entryFunctionalNonRF, new PageText(1), new PageCrafting(2, BlockCrafting.recipeFisher));
        new BookletChapter("feeder", entryFunctionalNonRF, new PageText(1), new PageCrafting(2, BlockCrafting.recipeFeeder));
        new BookletChapter("compost", entryFunctionalNonRF, new PageText(1).setStack(new ItemStack(InitItems.itemFertilizer)), new PageCrafting(2, BlockCrafting.recipeCompost), new PageCrafting(3, ItemCrafting.recipeMashedFood));
        new BookletChapter("crate", entryFunctionalNonRF, new PageCrafting(1, BlockCrafting.recipeCrate));

        new BookletChapter("coffeeMachine", entryFunctionalRF, new PageText(1), new PageText(2), new PageText(3), new PageCrafting(4, BlockCrafting.recipeCoffeeMachine), new PageCrafting(5, ItemCrafting.recipeCup));
        new BookletChapterCrusher("crusher", entryFunctionalRF, new PageText(1), new PageCrafting(2, BlockCrafting.recipeCrusher), new PageCrafting(3, BlockCrafting.recipeDoubleCrusher));
        new BookletChapterFurnace("furnaceDouble", entryFunctionalRF, new PageCrafting(1, BlockCrafting.recipeFurnace));
        new BookletChapter("miner", entryFunctionalRF, new PageText(1), new PageCrafting(2, BlockCrafting.recipeMiner), new PageCrafting(3, BlockCrafting.recipeCasing));
        new BookletChapter("lavaFactory", entryFunctionalRF, new PageText(1), new PageCrafting(2, BlockCrafting.recipeLavaFactory));
        new BookletChapter("energizer", entryFunctionalRF, new PageCrafting(1, BlockCrafting.recipeEnergizer), new PageCrafting(2, BlockCrafting.recipeEnervator));
        new BookletChapter("repairer", entryFunctionalRF, new PageText(1), new PageCrafting(2, BlockCrafting.recipeRepairer));

        new BookletChapter("coalGen", entryGeneratingRF, new PageCrafting(1, BlockCrafting.recipeCoalGen));
        new BookletChapter("solarPanel", entryGeneratingRF, new PageText(1), new PageCrafting(2, BlockCrafting.recipeSolar));
        new BookletChapter("heatCollector", entryGeneratingRF, new PageText(1), new PageCrafting(2, BlockCrafting.recipeHeatCollector));
        new BookletChapter("canola", entryGeneratingRF, new PageText(1), new PageText(2).setStack(new ItemStack(InitItems.itemMisc, 1, TheMiscItems.CANOLA.ordinal())), new PageCrafting(3, BlockCrafting.recipeCanolaPress), new PageCrafting(4, BlockCrafting.recipeFermentingBarrel), new PageCrafting(5, BlockCrafting.recipeOilGen));

        new BookletChapter("wings", entryItemsNonRF, new PageText(1).setStack(new ItemStack(InitItems.itemMisc, 1, TheMiscItems.BAT_WING.ordinal())), new PageCrafting(2, ItemCrafting.recipeWings));
        new BookletChapter("foods", entryItemsNonRF, new PageCrafting(1, FoodCrafting.recipePizza), new PageFurnace(2, new ItemStack(InitItems.itemFoods, 1, TheFoods.RICE_BREAD.ordinal())), new PageCrafting(3, FoodCrafting.recipeHamburger), new PageCrafting(4, FoodCrafting.recipeBigCookie), new PageCrafting(5, FoodCrafting.recipeSubSandwich), new PageCrafting(6, FoodCrafting.recipeFrenchFry), new PageCrafting(7, FoodCrafting.recipeFrenchFries), new PageCrafting(8, FoodCrafting.recipeFishNChips), new PageCrafting(9, FoodCrafting.recipeCheese), new PageCrafting(10, FoodCrafting.recipePumpkinStew), new PageCrafting(11, FoodCrafting.recipeCarrotJuice), new PageCrafting(12, FoodCrafting.recipeSpaghetti), new PageCrafting(13, FoodCrafting.recipeNoodle), new PageCrafting(14, FoodCrafting.recipeChocolate), new PageCrafting(15, FoodCrafting.recipeChocolateCake), new PageCrafting(16, FoodCrafting.recipeToast), new PageFurnace(17, new ItemStack(InitItems.itemFoods, 1, TheFoods.BAGUETTE.ordinal())));

        new BookletChapter("drill", entryItemsRF, new PageText(1), new PageCrafting(2, ItemCrafting.recipeDrill), new PageCrafting(3, ItemCrafting.recipeDrillSpeedI), new PageCrafting(4, ItemCrafting.recipeDrillSpeedII), new PageCrafting(5, ItemCrafting.recipeDrillSpeedIII), new PageCrafting(6, ItemCrafting.recipeDrillFortuneI), new PageCrafting(7, ItemCrafting.recipeDrillFortuneII), new PageCrafting(8, ItemCrafting.recipeDrillSilk), new PageCrafting(9, ItemCrafting.recipeDrillThree), new PageCrafting(10, ItemCrafting.recipeDrillFive), new PageCrafting(11, ItemCrafting.recipeDrillPlacing));
        new BookletChapter("staff", entryItemsRF, new PageText(1), new PageCrafting(2, ItemCrafting.recipeStaff));
        new BookletChapter("magnetRing", entryItemsRF, new PageCrafting(1, ItemCrafting.recipeMagnetRing));
        new BookletChapter("growthRing", entryItemsRF, new PageCrafting(1, ItemCrafting.recipeGrowthRing));
        new BookletChapter("waterRemovalRing", entryItemsRF, new PageCrafting(1, ItemCrafting.recipeWaterRing));
        new BookletChapter("batteries", entryItemsRF, new PageText(1), new PageCrafting(2, ItemCrafting.recipeBattery), new PageCrafting(3, ItemCrafting.recipeBatteryDouble), new PageCrafting(4, ItemCrafting.recipeBatteryTriple), new PageCrafting(5, ItemCrafting.recipeBatteryQuadruple), new PageCrafting(6, ItemCrafting.recipeBatteryQuintuple));
    }
}