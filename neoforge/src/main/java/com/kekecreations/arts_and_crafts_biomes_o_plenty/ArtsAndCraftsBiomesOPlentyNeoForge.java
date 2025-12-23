package com.kekecreations.arts_and_crafts_biomes_o_plenty;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class ArtsAndCraftsBiomesOPlentyNeoForge {

    public ArtsAndCraftsBiomesOPlentyNeoForge(IEventBus eventBus) {

        // This method is invoked by the NeoForge mod loader when it is ready
        // to load your mod. You can access NeoForge and Common code in this
        // project.

        // Use NeoForge to bootstrap the Common mod.
        Constants.LOG.info("Hello NeoForge world!");
        ArtsAndCraftsBiomesOPlenty.init();

    }
}