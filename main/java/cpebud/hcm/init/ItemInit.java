package cpebud.hcm.init;

import java.util.ArrayList;
import java.util.List;

import cpebud.hcm.items.eggs.ItemEggGiantOverworld;
import cpebud.hcm.objects.items.eggs.ItemEggBase;
import cpebud.hcm.objects.items.eggs.ItemEggEnder;
import cpebud.hcm.objects.items.eggs.ItemEggExplosive;
import cpebud.hcm.objects.items.eggs.ItemEggFiery;
import cpebud.hcm.objects.items.eggs.ItemEggGhastly;
import cpebud.hcm.objects.items.eggs.ItemEggPoison;
import cpebud.hcm.objects.items.eggs.ItemEggSkeleton;
import cpebud.hcm.objects.items.eggs.ItemEggUndead;
import cpebud.hcm.objects.items.eggs.ItemEggWither;
import cpebud.hcm.objects.items.launcher.ItemLauncherBasic;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class ItemInit
{
	//Items
    public static final List<Item> ITEMS = new ArrayList<Item>();
    
    //Launchers
    public static final Item LAUNCHER_BASIC = new ItemLauncherBasic("launcher_basic");
    
    //Eggs
    public static final Item EGG_ENDER = new ItemEggEnder("egg_ender");
    public static final Item EGG_EXPLOSIVE = new ItemEggExplosive("egg_explosive");
    public static final Item EGG_FIERY = new ItemEggFiery("egg_fiery");
    public static final Item EGG_GHASTLY = new ItemEggGhastly("egg_ghastly");
    public static final Item EGG_POISON = new ItemEggPoison("egg_poison");
    public static final Item EGG_SKELETON = new ItemEggSkeleton("egg_skeleton");
    public static final Item EGG_UNDEAD = new ItemEggUndead("egg_undead");
    public static final Item EGG_WITHER = new ItemEggWither("egg_wither");
    
    //Giant Eggs
    public static final Item EGG_GIANTOVERWORLD = new ItemEggGiantOverworld(BlockInit.BLOCK_EGGGIANTOVERWORLD);

}
