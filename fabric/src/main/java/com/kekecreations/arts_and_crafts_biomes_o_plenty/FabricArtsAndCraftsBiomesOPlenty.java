package com.kekecreations.arts_and_crafts_biomes_o_plenty;

import biomesoplenty.api.block.BOPBlocks;
import com.kekecreations.arts_and_crafts.common.block.ACFlowerPotBlock;
import com.kekecreations.arts_and_crafts_biomes_o_plenty.registry.ACBOPBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.DyeColor;

public class FabricArtsAndCraftsBiomesOPlenty implements ModInitializer {
    
    @Override
    public void onInitialize() {
        ArtsAndCraftsBiomesOPlenty.init();

        UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
                    //Because Fabric has weird issue where plant block will be considered null when registering potted flowers
                    for (DyeColor colour : DyeColor.values()) {
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.ORIGIN_SAPLING, ACBOPBlocks.getDyedOriginFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.FLOWERING_OAK_SAPLING, ACBOPBlocks.getDyedFloweringOakSapling(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.CYPRESS_SAPLING, ACBOPBlocks.getDyedCypressFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.SNOWBLOSSOM_SAPLING, ACBOPBlocks.getDyedSnowblossomFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.RAINBOW_BIRCH_SAPLING, ACBOPBlocks.getDyedRainbowBirchFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.FIR_SAPLING, ACBOPBlocks.getDyedFirFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.PINE_SAPLING, ACBOPBlocks.getDyedPineFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.RED_MAPLE_SAPLING, ACBOPBlocks.getDyedRedMapleFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.ORANGE_MAPLE_SAPLING, ACBOPBlocks.getDyedOrangeMapleFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.YELLOW_MAPLE_SAPLING, ACBOPBlocks.getDyedYellowMapleFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.REDWOOD_SAPLING, ACBOPBlocks.getDyedRedwoodFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.MAHOGANY_SAPLING, ACBOPBlocks.getDyedMahoganyFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.JACARANDA_SAPLING, ACBOPBlocks.getDyedJacarandaFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.PALM_SAPLING, ACBOPBlocks.getDyedPalmFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.WILLOW_SAPLING, ACBOPBlocks.getDyedWillowFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.DEAD_SAPLING, ACBOPBlocks.getDyedDeadFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.MAGIC_SAPLING, ACBOPBlocks.getDyedMagicFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.UMBRAN_SAPLING, ACBOPBlocks.getDyedUmbranFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.HELLBARK_SAPLING, ACBOPBlocks.getDyedHellbarkFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.EMPYREAL_SAPLING, ACBOPBlocks.getDyedEmpyrealFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.ROSE, ACBOPBlocks.getDyedRoseFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.VIOLET, ACBOPBlocks.getDyedVioletFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.LAVENDER, ACBOPBlocks.getDyedLavenderFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.WHITE_LAVENDER, ACBOPBlocks.getDyedWhiteLavenderFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.ORANGE_COSMOS, ACBOPBlocks.getDyedOrangeCosmosFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.PINK_DAFFODIL, ACBOPBlocks.getDyedPinkDaffodilFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.PINK_HIBISCUS, ACBOPBlocks.getDyedPinkHibiscusFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.GLOWFLOWER, ACBOPBlocks.getDyedGlowflowerFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.WILTED_LILY, ACBOPBlocks.getDyedWiltedLilyFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.BURNING_BLOSSOM, ACBOPBlocks.getDyedBurningBlossomFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.ENDBLOOM, ACBOPBlocks.getDyedEndbloomFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.SPROUT, ACBOPBlocks.getDyedSproutFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.TINY_CACTUS, ACBOPBlocks.getDyedTinyCactusFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.TOADSTOOL, ACBOPBlocks.getDyedToadstoolFlowerPot(colour));
                        ACFlowerPotBlock.POTTED_MAPS.get(colour).putIfAbsent(BOPBlocks.GLOWSHROOM, ACBOPBlocks.getDyedGlowshroomFlowerPot(colour));
                    }
                    return InteractionResult.PASS;
                }
        );
    }
}
