package com.kekecreations.arts_and_crafts_biomes_o_plenty.client;

import com.kekecreations.arts_and_crafts_biomes_o_plenty.Constants;
import com.kekecreations.arts_and_crafts_biomes_o_plenty.registry.ACBOPBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.DyeColor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

import javax.annotation.ParametersAreNonnullByDefault;

@SuppressWarnings("deprecation")
@ParametersAreNonnullByDefault
@EventBusSubscriber(modid = Constants.MOD_ID, bus= EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {

    /*
    @SubscribeEvent
    public static void registerBlockColours(RegisterColorHandlersEvent.Block registerColorHandlersEvent) {
        for (DyeColor colours : DyeColor.values()) {
            registerColorHandlersEvent.register((blockState, blockAndTintGetter, blockPos, i) -> {
                if (blockAndTintGetter == null || blockPos == null) {
                    return GrassColor.getDefaultColor();
                }
                return BiomeColors.getAverageGrassColor(blockAndTintGetter, blockPos);
            }, ACBlocks.getDyedPottedFern(colours));
        }
    }

     */

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        for (DyeColor colour : DyeColor.values()) {
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedOriginFlowerPot(colour), RenderType.cutout());
        }
    }


}
