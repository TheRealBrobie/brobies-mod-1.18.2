package net.therealbrobie.brobiesmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.therealbrobie.brobiesmod.BrobiesMod;

public class ModItems {

    public static final Item LIQUID_SLIME = registerItem("liquid_slime",
            new Item(new FabricItemSettings().group(ModItemGroup.BROBIE)));

    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.BROBIE)));

    public static final Item BLUE_STEEL_INGOT = registerItem("blue_steel_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.BROBIE)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(BrobiesMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        BrobiesMod.LOGGER.info("Registering Mod Items for " + BrobiesMod.MOD_ID);
    }

}
