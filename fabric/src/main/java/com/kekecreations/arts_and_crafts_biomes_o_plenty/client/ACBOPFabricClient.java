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
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedFloweringOakSapling(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedCypressFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedSnowblossomFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedRainbowBirchFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedFirFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedPineFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedRedMapleFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedOrangeMapleFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedYellowMapleFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedRedwoodFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedMahoganyFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedJacarandaFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedPalmFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedWillowFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedDeadFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedMagicFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedUmbranFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedHellbarkFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedEmpyrealFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedRoseFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedVioletFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedLavenderFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedWhiteLavenderFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedOrangeCosmosFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedPinkDaffodilFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedPinkHibiscusFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedGlowflowerFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedWiltedLilyFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedBurningBlossomFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedEndbloomFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedSproutFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedTinyCactusFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedToadstoolFlowerPot(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACBOPBlocks.getDyedGlowshroomFlowerPot(colour), RenderType.cutout());
        }
    }
}
