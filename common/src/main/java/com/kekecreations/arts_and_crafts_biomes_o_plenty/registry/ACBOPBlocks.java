package com.kekecreations.arts_and_crafts_biomes_o_plenty.registry;

import biomesoplenty.api.block.BOPBlocks;
import com.kekecreations.arts_and_crafts_biomes_o_plenty.Constants;
import com.kekecreations.arts_and_crafts_biomes_o_plenty.common.block.ACBOPFlowerPotBlock;
import com.kekecreations.jinxedlib.core.util.JinxedRegistryHelper;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;

import java.util.HashMap;
import java.util.function.Supplier;

public class ACBOPBlocks {
    //SAPLINGS
    public static final HashMap<DyeColor, Supplier<Block>> ORIGIN_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> FLOWERING_OAK_SAPLING_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> CYPRESS_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> SNOWBLOSSOM_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> RAINBOW_BIRCH_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> FIR_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> PINE_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> RED_MAPLE_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> ORANGE_MAPLE_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> YELLOW_MAPLE_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> REDWOOD_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> MAHOGANY_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> JACARANDA_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> PALM_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> WILLOW_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DEAD_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> MAGIC_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> UMBRAN_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> HELLBARK_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> EMPYREAL_FLOWER_POTS = new HashMap<>();
    //FLOWERS
    public static final HashMap<DyeColor, Supplier<Block>> ROSE_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> VIOLET_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> LAVENDER_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> WHITE_LAVENDER_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> ORANGE_COSMOS_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> PINK_DAFFODIL_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> PINK_HIBISCUS_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> GLOWFLOWER_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> WILTED_LILY_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> BURNING_BLOSSOM_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> ENDBLOOM_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> SPROUT_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> TINY_CACTUS_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> TOADSTOOL_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> GLOWSHROOM_FLOWER_POTS = new HashMap<>();




    static {
        for (DyeColor colour : DyeColor.values()) {
            ORIGIN_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_origin_sapling",
                    () -> flowerPot(BOPBlocks.ORIGIN_SAPLING, colour)));

            FLOWERING_OAK_SAPLING_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_flowering_oak_sapling",
                    () -> flowerPot(BOPBlocks.FLOWERING_OAK_SAPLING, colour)));

            CYPRESS_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_cypress_sapling",
                    () -> flowerPot(BOPBlocks.CYPRESS_SAPLING, colour)));

            SNOWBLOSSOM_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_snowblossom_sapling",
                    () -> flowerPot(BOPBlocks.SNOWBLOSSOM_SAPLING, colour)));

            RAINBOW_BIRCH_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_rainbow_birch_sapling",
                    () -> flowerPot(BOPBlocks.RAINBOW_BIRCH_SAPLING, colour)));

            FIR_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_fir_sapling",
                    () -> flowerPot(BOPBlocks.FIR_SAPLING, colour)));

            PINE_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_pine_sapling",
                    () -> flowerPot(BOPBlocks.PINE_SAPLING, colour)));

            RED_MAPLE_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_red_maple_sapling",
                    () -> flowerPot(BOPBlocks.RED_MAPLE_SAPLING, colour)));

            ORANGE_MAPLE_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_orange_maple_sapling",
                    () -> flowerPot(BOPBlocks.ORANGE_MAPLE_SAPLING, colour)));

            YELLOW_MAPLE_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_yellow_maple_sapling",
                    () -> flowerPot(BOPBlocks.YELLOW_MAPLE_SAPLING, colour)));

            REDWOOD_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_redwood_sapling",
                    () -> flowerPot(BOPBlocks.REDWOOD_SAPLING, colour)));

            MAHOGANY_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_mahogany_sapling",
                    () -> flowerPot(BOPBlocks.MAHOGANY_SAPLING, colour)));

            JACARANDA_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_jacaranda_sapling",
                    () -> flowerPot(BOPBlocks.JACARANDA_SAPLING, colour)));

            PALM_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_palm_sapling",
                    () -> flowerPot(BOPBlocks.PALM_SAPLING, colour)));

            WILLOW_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_willow_sapling",
                    () -> flowerPot(BOPBlocks.WILLOW_SAPLING, colour)));

            DEAD_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_dead_sapling",
                    () -> flowerPot(BOPBlocks.DEAD_SAPLING, colour)));

            MAGIC_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_magic_sapling",
                    () -> flowerPot(BOPBlocks.MAGIC_SAPLING, colour)));

            UMBRAN_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_umbran_sapling",
                    () -> flowerPot(BOPBlocks.UMBRAN_SAPLING, colour)));

            HELLBARK_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_hellbark_sapling",
                    () -> flowerPot(BOPBlocks.HELLBARK_SAPLING, colour)));

            EMPYREAL_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_empyreal_sapling",
                    () -> flowerPot(BOPBlocks.EMPYREAL_SAPLING, colour)));

            ROSE_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_rose",
                    () -> flowerPot(BOPBlocks.ROSE, colour)));

            VIOLET_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_violet",
                    () -> flowerPot(BOPBlocks.VIOLET, colour)));

            LAVENDER_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_lavender",
                    () -> flowerPot(BOPBlocks.LAVENDER, colour)));

            WHITE_LAVENDER_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_white_lavender",
                    () -> flowerPot(BOPBlocks.WHITE_LAVENDER, colour)));

            ORANGE_COSMOS_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_orange_cosmos",
                    () -> flowerPot(BOPBlocks.ORANGE_COSMOS, colour)));

            PINK_DAFFODIL_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_pink_daffodil",
                    () -> flowerPot(BOPBlocks.PINK_DAFFODIL, colour)));

            PINK_HIBISCUS_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_pink_hibiscus",
                    () -> flowerPot(BOPBlocks.PINK_HIBISCUS, colour)));

            GLOWFLOWER_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_glowflower",
                    () -> flowerPot(BOPBlocks.GLOWFLOWER, colour)));

            WILTED_LILY_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_wilted_lily",
                    () -> flowerPot(BOPBlocks.WILTED_LILY, colour)));

            BURNING_BLOSSOM_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_burning_blossom",
                    () -> flowerPot(BOPBlocks.BURNING_BLOSSOM, colour)));

            ENDBLOOM_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_endbloom",
                    () -> flowerPot(BOPBlocks.ENDBLOOM, colour)));

            SPROUT_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_sprout",
                    () -> flowerPot(BOPBlocks.SPROUT, colour)));

            TINY_CACTUS_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_tiny_cactus",
                    () -> flowerPot(BOPBlocks.TINY_CACTUS, colour)));

            TOADSTOOL_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_toadstool",
                    () -> flowerPot(BOPBlocks.TOADSTOOL, colour)));

            GLOWSHROOM_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_glowshroom",
                    () -> flowerPot(BOPBlocks.GLOWSHROOM, colour)));


        }
    }

    public static Block getDyedOriginFlowerPot(DyeColor colour) {
        return ORIGIN_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedFloweringOakSapling(DyeColor colour) {
        return FLOWERING_OAK_SAPLING_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedCypressFlowerPot(DyeColor colour) {
        return CYPRESS_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedSnowblossomFlowerPot(DyeColor colour) {
        return SNOWBLOSSOM_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedRainbowBirchFlowerPot(DyeColor colour) {
        return RAINBOW_BIRCH_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedFirFlowerPot(DyeColor colour) {
        return FIR_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedPineFlowerPot(DyeColor colour) {
        return PINE_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedRedMapleFlowerPot(DyeColor colour) {
        return RED_MAPLE_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedOrangeMapleFlowerPot(DyeColor colour) {
        return ORANGE_MAPLE_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedYellowMapleFlowerPot(DyeColor colour) {
        return YELLOW_MAPLE_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedRedwoodFlowerPot(DyeColor colour) {
        return REDWOOD_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedMahoganyFlowerPot(DyeColor colour) {
        return MAHOGANY_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedJacarandaFlowerPot(DyeColor colour) {
        return JACARANDA_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedPalmFlowerPot(DyeColor colour) {
        return PALM_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedWillowFlowerPot(DyeColor colour) {
        return WILLOW_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedDeadFlowerPot(DyeColor colour) {
        return DEAD_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedMagicFlowerPot(DyeColor colour) {
        return MAGIC_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedUmbranFlowerPot(DyeColor colour) {
        return UMBRAN_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedHellbarkFlowerPot(DyeColor colour) {
        return HELLBARK_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedEmpyrealFlowerPot(DyeColor colour) {
        return EMPYREAL_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedRoseFlowerPot(DyeColor colour) {
        return ROSE_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedVioletFlowerPot(DyeColor colour) {
        return VIOLET_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedLavenderFlowerPot(DyeColor colour) {
        return LAVENDER_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedWhiteLavenderFlowerPot(DyeColor colour) {
        return WHITE_LAVENDER_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedOrangeCosmosFlowerPot(DyeColor colour) {
        return ORANGE_COSMOS_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedPinkDaffodilFlowerPot(DyeColor colour) {
        return PINK_DAFFODIL_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedPinkHibiscusFlowerPot(DyeColor colour) {
        return PINK_HIBISCUS_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedGlowflowerFlowerPot(DyeColor colour) {
        return GLOWFLOWER_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedWiltedLilyFlowerPot(DyeColor colour) {
        return WILTED_LILY_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedBurningBlossomFlowerPot(DyeColor colour) {
        return BURNING_BLOSSOM_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedEndbloomFlowerPot(DyeColor colour) {
        return ENDBLOOM_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedSproutFlowerPot(DyeColor colour) {
        return SPROUT_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedTinyCactusFlowerPot(DyeColor colour) {
        return TINY_CACTUS_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedToadstoolFlowerPot(DyeColor colour) {
        return TOADSTOOL_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedGlowshroomFlowerPot(DyeColor colour) {
        return GLOWSHROOM_FLOWER_POTS.get(colour).get();
    }

    public static void register() {
    }

    private static Supplier<Block> registerBlock(String name, Supplier<Block> blockSupplier) {
        return JinxedRegistryHelper.registerBlock(Constants.MOD_ID, name, false, blockSupplier);
    }

    private static ACBOPFlowerPotBlock flowerPot(Block block, DyeColor dyeColor) {
        BlockBehaviour.Properties properties = BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY);
        return new ACBOPFlowerPotBlock(block, dyeColor, properties);
    }
}
