package net.therealbrobie.brobiesmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.therealbrobie.brobiesmod.BrobiesMod;

public class ModItemGroup {
    public static final ItemGroup BROBIE = FabricItemGroupBuilder.build(new Identifier(BrobiesMod.MOD_ID, "brobie"),
            () ->new ItemStack(ModItems.LIQUID_SLIME));
}
