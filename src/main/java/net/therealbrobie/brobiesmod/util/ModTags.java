package net.therealbrobie.brobiesmod.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.therealbrobie.brobiesmod.BrobiesMod;

public class ModTags {

    public static class Blocks{
        public static final TagKey<Block> STEEL_BLOCKS = createCommonTag("steel_blocks");
        public static final TagKey<Block> BLUE_STEEL_BLOCKS = createCommonTag("blue_steel_blocks");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(BrobiesMod.MOD_ID, name));
        }
        private static TagKey<Block> createCommonTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier("c", name));
        }
    }

    public static class Items{
        public static final TagKey<Item> STEEL_INGOTS = createCommonTag("steel_ingots");
        public static final TagKey<Item> BLUE_STEEL_INGOTS = createCommonTag("blue_steel_ingots");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier(BrobiesMod.MOD_ID, name));
        }
        private static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }
    }
}
