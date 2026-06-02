package com.kekecreations.arts_and_crafts_biomes_o_plenty.datagen.client;

import com.kekecreations.arts_and_crafts_biomes_o_plenty.datagen.client.util.ACBOPMapping;
import com.kekecreations.arts_and_crafts_biomes_o_plenty.datagen.client.util.ACBOPModelTemplate;
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
            this.createFlowerPot("biomesoplenty", ACBOPBlocks.getDyedFloweringOakSapling(colour), "flowering_oak_sapling", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedCypressFlowerPot(colour),
                    "cypress_sapling", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedSnowblossomFlowerPot(colour),
                    "snowblossom_sapling", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedRainbowBirchFlowerPot(colour),
                    "rainbow_birch_sapling", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedFirFlowerPot(colour),
                    "fir_sapling", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedPineFlowerPot(colour),
                    "pine_sapling", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedRedMapleFlowerPot(colour),
                    "red_maple_sapling", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedOrangeMapleFlowerPot(colour),
                    "orange_maple_sapling", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedYellowMapleFlowerPot(colour),
                    "yellow_maple_sapling", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedRedwoodFlowerPot(colour),
                    "redwood_sapling", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedMahoganyFlowerPot(colour),
                    "mahogany_sapling", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedJacarandaFlowerPot(colour),
                    "jacaranda_sapling", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedPalmFlowerPot(colour),
                    "palm_sapling", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedWillowFlowerPot(colour),
                    "willow_sapling", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedDeadFlowerPot(colour),
                    "dead_sapling", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedMagicFlowerPot(colour),
                    "magic_sapling", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedUmbranFlowerPot(colour),
                    "umbran_sapling", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedHellbarkFlowerPot(colour),
                    "hellbark_sapling", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedEmpyrealFlowerPot(colour),
                    "empyreal_sapling", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedRoseFlowerPot(colour),
                    "rose", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedVioletFlowerPot(colour),
                    "violet", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedLavenderFlowerPot(colour),
                    "lavender", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedWhiteLavenderFlowerPot(colour),
                    "white_lavender", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedOrangeCosmosFlowerPot(colour),
                    "orange_cosmos", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedPinkDaffodilFlowerPot(colour),
                    "pink_daffodil", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedPinkHibiscusFlowerPot(colour),
                    "pink_hibiscus", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedGlowflowerFlowerPot(colour),
                    "glowflower", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedWiltedLilyFlowerPot(colour),
                    "wilted_lily", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedBurningBlossomFlowerPot(colour),
                    "burning_blossom", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedEndbloomFlowerPot(colour),
                    "endbloom", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedSproutFlowerPot(colour),
                    "sprout", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedTinyCactusFlowerPot(colour),
                    "tiny_cactus", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedToadstoolFlowerPot(colour),
                    "toadstool", colour, generator);

            this.createFlowerPot("biomesoplenty",
                    ACBOPBlocks.getDyedGlowshroomFlowerPot(colour),
                    "glowshroom", colour, generator);
        }
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {

    }

    public final void createFlowerPot(String modID, Block flowerPot, String plant, DyeColor colour, BlockModelGenerators blockModelGenerators) {
        TextureMapping textureMapping = ACBOPMapping.flowerPotTextureMappings(modID, plant, colour);
        ResourceLocation resourceLocation = ACBOPModelTemplate.FLOWER_POT.create(flowerPot, textureMapping, blockModelGenerators.modelOutput);
        blockModelGenerators.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(flowerPot, resourceLocation));
    }
}
