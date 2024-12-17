package dev.lpsmods.spawnercraft;

import dev.lpsmods.spawnercraft.platform.Services;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Items;

public class Bootstrap {
    public static void init() {
        if (Services.PLATFORM.isModLoaded("spawnercraft")) {
            Constants.LOG.info("Hello to spawnercraft");
        }
    }
}