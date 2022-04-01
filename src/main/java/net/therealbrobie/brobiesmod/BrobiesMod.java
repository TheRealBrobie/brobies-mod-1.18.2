package net.therealbrobie.brobiesmod;

import net.fabricmc.api.ModInitializer;
import net.therealbrobie.brobiesmod.block.ModBlocks;
import net.therealbrobie.brobiesmod.item.ModItems;
import net.therealbrobie.brobiesmod.util.ModRegistries;
import net.therealbrobie.brobiesmod.world.feature.ModConfiguredFeatures;
import net.therealbrobie.brobiesmod.world.gen.ModWorldGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BrobiesMod implements ModInitializer {
	public static final String MOD_ID = "brobiesmod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();

		ModWorldGen.generateModWorldGen();
	}
}
