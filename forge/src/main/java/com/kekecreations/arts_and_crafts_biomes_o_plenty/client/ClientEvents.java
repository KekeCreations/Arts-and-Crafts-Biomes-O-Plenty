package com.kekecreations.arts_and_crafts_biomes_o_plenty.client;

import com.kekecreations.arts_and_crafts_biomes_o_plenty.Constants;
import com.kekecreations.arts_and_crafts_biomes_o_plenty.registry.ACBOPBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.DyeColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import javax.annotation.ParametersAreNonnullByDefault;

@SuppressWarnings("deprecation")
@ParametersAreNonnullByDefault
@Mod.EventBusSubscriber(modid = Constants.MOD_ID, bus= Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        for (DyeColor colour : DyeColor.values()) {
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedOriginFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedFloweringOakSapling(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedCypressFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedSnowblossomFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedRainbowBirchFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedFirFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedPineFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedRedMapleFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedOrangeMapleFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedYellowMapleFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedRedwoodFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedMahoganyFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedJacarandaFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedPalmFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedWillowFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedDeadFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedMagicFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedUmbranFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedHellbarkFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedEmpyrealFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedRoseFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedVioletFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedLavenderFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedWhiteLavenderFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedOrangeCosmosFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedPinkDaffodilFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedPinkHibiscusFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedGlowflowerFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedWiltedLilyFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedBurningBlossomFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedEndbloomFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedSproutFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedTinyCactusFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedToadstoolFlowerPot(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACBOPBlocks.getDyedGlowshroomFlowerPot(colour), RenderType.cutout());
        }
    }


}
