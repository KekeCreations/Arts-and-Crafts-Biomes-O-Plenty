package com.kekecreations.arts_and_crafts_biomes_o_plenty;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class ArtsAndCraftsBiomesOPlentyNeoForge {

    public ArtsAndCraftsBiomesOPlentyNeoForge(IEventBus eventBus) {
        ArtsAndCraftsBiomesOPlenty.init();

    }
}