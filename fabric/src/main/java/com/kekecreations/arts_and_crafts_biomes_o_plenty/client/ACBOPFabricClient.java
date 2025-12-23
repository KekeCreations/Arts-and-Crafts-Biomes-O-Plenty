package com.kekecreations.arts_and_crafts_biomes_o_plenty.client;

import com.kekecreations.arts_and_crafts_biomes_o_plenty.registry.ACBOPBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.DyeColor;

@Environment(EnvType.CLIENT)
public class ACBOPFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        registerBlockLayers();
    }


    public static void registerBlockLayers() {
        for (DyeColor colour : DyeColor.values()) {
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedOriginFlowerPot(colour), RenderType.cutout());
        }
    }

    /*
    public static void registerBlockColours() {
        for (DyeColor colours : DyeColor.values()) {
            ColorProviderRegistry.BLOCK.register((blockState, blockAndTintGetter, blockPos, i) -> {
                if (blockAndTintGetter == null || blockPos == null) {
                    return GrassColor.getDefaultColor();
                }
                return BiomeColors.getAverageGrassColor(blockAndTintGetter, blockPos);
            }, ACBlocks.getDyedPottedFern(colours));
        }
    }

     */

}