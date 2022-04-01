package net.therealbrobie.brobiesmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.therealbrobie.brobiesmod.BrobiesMod;
import net.therealbrobie.brobiesmod.item.custom.ModAxeItem;
import net.therealbrobie.brobiesmod.item.custom.ModHoeItem;
import net.therealbrobie.brobiesmod.item.custom.ModPickaxeItem;

import java.util.List;


public class ModItems {

    public static final Item LIQUID_SLIME = registerItem("liquid_slime",
            new Item(new FabricItemSettings().group(ModItemGroup.BROBIE)));

    public static final Item BROBIUM = registerItem("brobium",
            new Item(new FabricItemSettings().group(ModItemGroup.BROBIE)));

    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.BROBIE)));

    public static final Item BLUE_STEEL_INGOT = registerItem("blue_steel_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.BROBIE)));


    //Tools
    public static final Item STEEL_SWORD = registerItem("steel_sword",
            new SwordItem(ModToolMaterials.STEEL, 3, 3f, new FabricItemSettings().group(ModItemGroup.BROBIE)));

    public static final Item STEEL_AXE = registerItem("steel_axe",
            new ModAxeItem(ModToolMaterials.STEEL, 4, 1f, new FabricItemSettings().group(ModItemGroup.BROBIE)));

    public static final Item STEEL_HOE = registerItem("steel_hoe",
            new ModHoeItem(ModToolMaterials.STEEL, 0, 0f, new FabricItemSettings().group(ModItemGroup.BROBIE)));

    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            new ModPickaxeItem(ModToolMaterials.STEEL, 1, 0f, new FabricItemSettings().group(ModItemGroup.BROBIE)));

    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            new ShovelItem(ModToolMaterials.STEEL, 0, 0f, new FabricItemSettings().group(ModItemGroup.BROBIE)));

    public static final Item BLUE_STEEL_SWORD = registerItem("blue_steel_sword",
            new SwordItem(ModToolMaterials.BLUE_STEEL, 3, 3f, new FabricItemSettings().group(ModItemGroup.BROBIE)));

    public static final Item BLUE_STEEL_AXE = registerItem("blue_steel_axe",
            new ModAxeItem(ModToolMaterials.BLUE_STEEL, 4, 1f, new FabricItemSettings().group(ModItemGroup.BROBIE)));

    public static final Item BLUE_STEEL_HOE = registerItem("blue_steel_hoe",
            new ModHoeItem(ModToolMaterials.BLUE_STEEL, 0, 0f, new FabricItemSettings().group(ModItemGroup.BROBIE)));

    public static final Item BLUE_STEEL_PICKAXE = registerItem("blue_steel_pickaxe",
            new ModPickaxeItem(ModToolMaterials.BLUE_STEEL, 1, 0f, new FabricItemSettings().group(ModItemGroup.BROBIE)));

    public static final Item BLUE_STEEL_SHOVEL = registerItem("blue_steel_shovel",
            new ShovelItem(ModToolMaterials.BLUE_STEEL, 0, 0f, new FabricItemSettings().group(ModItemGroup.BROBIE)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(BrobiesMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        BrobiesMod.LOGGER.info("Registering Mod Items for " + BrobiesMod.MOD_ID);
    }

}
