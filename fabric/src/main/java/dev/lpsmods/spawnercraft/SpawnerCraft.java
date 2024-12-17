package dev.lpsmods.spawnercraft;

import net.fabricmc.api.ModInitializer;

public class SpawnerCraft implements ModInitializer {
    
    @Override
    public void onInitialize() {
        Bootstrap.init();
    }
}
