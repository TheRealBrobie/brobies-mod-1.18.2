package net.therealbrobie.brobiesmod.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.therealbrobie.brobiesmod.BrobiesMod;
import net.therealbrobie.brobiesmod.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {

public static final List<OreFeatureConfig.Target> OVERWORLD_BROBIUM_ORES = List.of(
        OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BROBIUM_ORE.getDefaultState()),
        OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_BROBIUM_ORE.getDefaultState()));

public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> BROBIUM_ORE = ConfiguredFeatures.register("brobium_ore",
        Feature.ORE, new OreFeatureConfig(OVERWORLD_BROBIUM_ORES, 10, 0.5f));

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfigurationFeatures for " + BrobiesMod.MOD_ID);
    }
}
