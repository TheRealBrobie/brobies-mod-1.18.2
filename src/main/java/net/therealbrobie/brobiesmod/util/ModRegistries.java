package net.therealbrobie.brobiesmod.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.therealbrobie.brobiesmod.BrobiesMod;
import net.therealbrobie.brobiesmod.item.ModItems;

public class ModRegistries {

    public static void registerModStuffs() {
        registerFuels();
    }

        private static void registerFuels(){
            BrobiesMod.LOGGER.info("Registering Fuels for " + BrobiesMod.MOD_ID);
            FuelRegistry registry = FuelRegistry.INSTANCE;

            registry.add(ModItems.BROBIUM, 3200);
        }
}
