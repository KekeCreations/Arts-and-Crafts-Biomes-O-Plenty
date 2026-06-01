package com.kekecreations.arts_and_crafts_biomes_o_plenty;


import com.kekecreations.arts_and_crafts_biomes_o_plenty.platform.Services;
import com.kekecreations.arts_and_crafts_biomes_o_plenty.registry.ACBOPBlocks;

public class ArtsAndCraftsBiomesOPlenty {


    public static void init() {
        if (Services.PLATFORM.isModLoaded("biomesoplenty")) {
            ACBOPBlocks.register();
        }
    }
}