package com.kekecreations.arts_and_crafts_biomes_o_plenty.registry;

import biomesoplenty.api.block.BOPBlocks;
import com.kekecreations.arts_and_crafts.common.block.ACFlowerPotBlock;
import com.kekecreations.arts_and_crafts_biomes_o_plenty.Constants;
import com.kekecreations.jinxedlib.core.util.JinxedRegistryHelper;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;

import java.util.HashMap;
import java.util.function.Supplier;

public class ACBOPBlocks {

    public static final HashMap<DyeColor, Supplier<Block>> ORIGIN_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> FLOWERING_OAK_SAPLING_FLOWER_POTS = new HashMap<>();


    static {
        for (DyeColor colour : DyeColor.values()) {
            ORIGIN_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_origin_sapling",
                    () -> flowerPot(BOPBlocks.ORIGIN_SAPLING, colour)));

            FLOWERING_OAK_SAPLING_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_flowering_oak_sapling",
                    () -> flowerPot(BOPBlocks.FLOWERING_OAK_SAPLING, colour)));
        }
    }

    public static Block getDyedOriginFlowerPot(DyeColor colour) {
        return ORIGIN_FLOWER_POTS.get(colour).get();
    }

    public static Block getDyedFloweringOakSapling(DyeColor colour) {
        return FLOWERING_OAK_SAPLING_FLOWER_POTS.get(colour).get();
    }

    public static void register() {}

    private static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> blockSupplier) {
        return JinxedRegistryHelper.registerBlock(Constants.MOD_ID, name, false, blockSupplier);
    }

    private static ACFlowerPotBlock flowerPot(Block block, DyeColor dyeColor) {
        BlockBehaviour.Properties properties = BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY);
        return new ACFlowerPotBlock(block, dyeColor, properties);
    }
}
