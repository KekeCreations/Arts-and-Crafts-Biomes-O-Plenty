package com.kekecreations.arts_and_crafts_biomes_o_plenty.datagen;

import com.kekecreations.arts_and_crafts_biomes_o_plenty.datagen.client.ACBOPModelProvider;
import com.kekecreations.arts_and_crafts_biomes_o_plenty.datagen.server.ACBOPBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ACBOPDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();

        // Server Data
        //pack.addProvider(ACCBlockTagProvider::new);
        //pack.addProvider(ACCLanguageProvider::new);
        //pack.addProvider(ACCItemTagProvider::new);
        //pack.addProvider(ACCRecipeProvider::new);
        pack.addProvider(ACBOPBlockLootTableProvider::new);

        // Client Data
        pack.addProvider(ACBOPModelProvider::new);
    }
}
