package dev.lpsmods.spawnercraft;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class SpawnerCraft {

    public SpawnerCraft(IEventBus eventBus) {
        Bootstrap.init();
    }
}