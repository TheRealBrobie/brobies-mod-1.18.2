package net.therealbrobie.brobiesmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.therealbrobie.brobiesmod.block.custom.SpeedyBlock;
import net.therealbrobie.brobiesmod.item.ModItemGroup;
import net.therealbrobie.brobiesmod.BrobiesMod;
import org.jetbrains.annotations.Nullable;

import java.util.List;


public class ModBlocks {

    public static final Block BROBIE_BLOCK = registerBlock("brobie_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.BROBIE, "tooltip.brobiesmod.brobie_block");

    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.BROBIE);

    public static final Block BLUE_STEEL_BLOCK = registerBlock("blue_steel_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(7f).requiresTool()), ModItemGroup.BROBIE, "tooltip.brobiesmod.blue_steel_block");

    public static final Block SPEEDY_BLOCK = registerBlock("speedy_block",
            new SpeedyBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.BROBIE, "tooltip.brobiesmod.speedy_block");

    private static Block registerBlock(String name, Block block, ItemGroup group, String tooltipKey){
        registerBlockItem(name, block, group, tooltipKey);
        return Registry.register(Registry.BLOCK,new Identifier(BrobiesMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group, String tooltipKey){
        return Registry.register(Registry.ITEM, new Identifier(BrobiesMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)){
                    @Override
                    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                        tooltip.add(new TranslatableText(tooltipKey));
                    }
                });
    }

    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK,new Identifier(BrobiesMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(BrobiesMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks(){
        BrobiesMod.LOGGER.info("Registering ModBlocks for " + BrobiesMod.MOD_ID);
    }
}
