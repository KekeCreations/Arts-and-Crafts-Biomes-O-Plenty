package com.kekecreations.arts_and_crafts_biomes_o_plenty.datagen.server;

import com.kekecreations.arts_and_crafts.common.block.ACFlowerPotBlock;
import com.kekecreations.arts_and_crafts.core.registry.ACBlocks;
import com.kekecreations.arts_and_crafts_biomes_o_plenty.common.block.ACBOPFlowerPotBlock;
import com.kekecreations.arts_and_crafts_biomes_o_plenty.registry.ACBOPBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;


public class ACBOPBlockLootTableProvider extends FabricBlockLootTableProvider {


    public ACBOPBlockLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        for (DyeColor colour : DyeColor.values()) {
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedOriginFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedFloweringOakSapling(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedCypressFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedSnowblossomFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedRainbowBirchFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedFirFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedPineFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedRedMapleFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedOrangeMapleFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedYellowMapleFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedRedwoodFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedMahoganyFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedJacarandaFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedPalmFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedWillowFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedDeadFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedMagicFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedUmbranFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedHellbarkFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedEmpyrealFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedRoseFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedVioletFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedLavenderFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedWhiteLavenderFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedOrangeCosmosFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedPinkDaffodilFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedPinkHibiscusFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedGlowflowerFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedWiltedLilyFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedBurningBlossomFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedEndbloomFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedSproutFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedTinyCactusFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedToadstoolFlowerPot(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACBOPBlocks.getDyedGlowshroomFlowerPot(colour));
        }
    }


    public void dropDyedPotContents(Block flowerPot, Block flowerPotWithPlant) {
        this.add(flowerPotWithPlant, (blockx) -> {
            //Keep generating until it works
            return this.createDyedPotFlowerItemTable(flowerPot, ((ACBOPFlowerPotBlock) blockx).getContent());
        });
    }

    public final LootTable.Builder createDyedPotFlowerItemTable(Block flowerPot, ItemLike itemLike) {
        return LootTable.lootTable().withPool((LootPool.Builder) this.applyExplosionCondition(flowerPot, LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(flowerPot)))).withPool((LootPool.Builder) this.applyExplosionCondition(itemLike, LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(itemLike))));
    }
}