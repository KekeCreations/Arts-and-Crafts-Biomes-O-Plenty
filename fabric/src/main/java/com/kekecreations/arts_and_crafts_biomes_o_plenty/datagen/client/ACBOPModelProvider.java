package com.kekecreations.arts_and_crafts_biomes_o_plenty.datagen.client;

import com.kekecreations.arts_and_crafts_biomes_o_plenty.datagen.client.util.ACBOPModelTemplate;
import com.kekecreations.arts_and_crafts_biomes_o_plenty.datagen.client.util.ACBOPTextureMapping;
import com.kekecreations.arts_and_crafts_biomes_o_plenty.registry.ACBOPBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;

public class ACBOPModelProvider extends FabricModelProvider {


    public ACBOPModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators generator) {

        for (DyeColor colour : DyeColor.values()) {
            this.createFlowerPot("biomesoplenty", ACBOPBlocks.getDyedOriginFlowerPot(colour), "origin_sapling", colour, generator);
        }

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {

    }

    public final void createFlowerPot(String modID, Block flowerPot, String plant, DyeColor colour, BlockModelGenerators blockModelGenerators) {
        TextureMapping textureMapping = ACBOPTextureMapping.flowerPotTextureMappings(modID, plant, colour);
        ResourceLocation resourceLocation = ACBOPModelTemplate.FLOWER_POT.create(flowerPot, textureMapping, blockModelGenerators.modelOutput);
        blockModelGenerators.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(flowerPot, resourceLocation));
    }
}
