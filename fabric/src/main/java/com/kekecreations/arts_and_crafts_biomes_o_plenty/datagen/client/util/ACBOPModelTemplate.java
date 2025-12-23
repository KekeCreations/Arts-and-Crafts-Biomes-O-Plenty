package com.kekecreations.arts_and_crafts_biomes_o_plenty.datagen.client.util;

import net.minecraft.data.models.model.ModelTemplate;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;

import java.util.Optional;

public class ACBOPModelTemplate {

    public static final ModelTemplate FLOWER_POT = createFlowerPot(TextureSlot.PARTICLE, ACBOPTextureMapping.FLOWER_POT, TextureSlot.PLANT);
    public static final ModelTemplate TINTED_FLOWER_POT = createTintedFlowerPot(TextureSlot.PARTICLE, ACBOPTextureMapping.FLOWER_POT, TextureSlot.PLANT);


    public static ModelTemplate createFlowerPot(TextureSlot... textureSlots) {
        return new ModelTemplate((Optional.of(ResourceLocation.withDefaultNamespace("block/flower_pot_cross"))), Optional.empty(), textureSlots);
    }


    public static ModelTemplate createTintedFlowerPot(TextureSlot... textureSlots) {
        return new ModelTemplate((Optional.of(ResourceLocation.withDefaultNamespace("block/tinted_flower_pot_cross"))), Optional.empty(), textureSlots);
    }
}
