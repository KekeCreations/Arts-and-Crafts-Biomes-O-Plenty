package com.kekecreations.arts_and_crafts_biomes_o_plenty.common.block;

import biomesoplenty.api.block.BOPBlocks;
import com.kekecreations.arts_and_crafts.common.block.ACFlowerPotBlock;
import com.kekecreations.arts_and_crafts.core.platform.Services;
import com.kekecreations.arts_and_crafts.core.registry.ACBlocks;
import java.util.HashMap;

import com.kekecreations.arts_and_crafts_biomes_o_plenty.registry.ACBOPBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ACBOPFlowerPotBlock extends Block {
    public static final HashMap<DyeColor, HashMap<Block, Block>> POTTED_MAPS = new HashMap();
    private Block content;
    private final DyeColor colour;
    public static final float AABB_SIZE = 3.0F;
    protected static final VoxelShape SHAPE;

    public ACBOPFlowerPotBlock(Block block, DyeColor dyeColor, BlockBehaviour.Properties properties) {
        super(properties);
        this.content = block;
        this.colour = dyeColor;
        if (block != null) {
            ACFlowerPotBlock.addPotManually(dyeColor, block, this);
        }
    }



    public boolean isEnabled(FeatureFlagSet $$0) {
        return Services.CONFIG.areDyedFlowerPotsEnabled();
    }

    private boolean isEmpty() {
        return this.content == Blocks.AIR;
    }


    @Override
    public InteractionResult use(BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand hand, BlockHitResult blockHitResult) {
        if (this.content == null) {
            for (DyeColor colour : DyeColor.values()) {
                if (this == ACBOPBlocks.getDyedOriginFlowerPot(colour)) {
                    this.content = BOPBlocks.ORIGIN_SAPLING;
                    break;
                }
                if (this == ACBOPBlocks.getDyedFloweringOakSapling(colour)) {
                    this.content = BOPBlocks.FLOWERING_OAK_SAPLING;
                    break;
                }
                if (this == ACBOPBlocks.getDyedCypressFlowerPot(colour)) {
                    this.content = BOPBlocks.CYPRESS_SAPLING;
                    break;
                }
                if (this == ACBOPBlocks.getDyedSnowblossomFlowerPot(colour)) {
                    this.content = BOPBlocks.SNOWBLOSSOM_SAPLING;
                    break;
                }
                if (this == ACBOPBlocks.getDyedRainbowBirchFlowerPot(colour)) {
                    this.content = BOPBlocks.RAINBOW_BIRCH_SAPLING;
                    break;
                }
                if (this == ACBOPBlocks.getDyedFirFlowerPot(colour)) {
                    this.content = BOPBlocks.FIR_SAPLING;
                    break;
                }
                if (this == ACBOPBlocks.getDyedPineFlowerPot(colour)) {
                    this.content = BOPBlocks.PINE_SAPLING;
                    break;
                }
                if (this == ACBOPBlocks.getDyedRedMapleFlowerPot(colour)) {
                    this.content = BOPBlocks.RED_MAPLE_SAPLING;
                    break;
                }
                if (this == ACBOPBlocks.getDyedOrangeMapleFlowerPot(colour)) {
                    this.content = BOPBlocks.ORANGE_MAPLE_SAPLING;
                    break;
                }
                if (this == ACBOPBlocks.getDyedYellowMapleFlowerPot(colour)) {
                    this.content = BOPBlocks.YELLOW_MAPLE_SAPLING;
                    break;
                }
                if (this == ACBOPBlocks.getDyedRedwoodFlowerPot(colour)) {
                    this.content = BOPBlocks.REDWOOD_SAPLING;
                    break;
                }
                if (this == ACBOPBlocks.getDyedMahoganyFlowerPot(colour)) {
                    this.content = BOPBlocks.MAHOGANY_SAPLING;
                    break;
                }
                if (this == ACBOPBlocks.getDyedJacarandaFlowerPot(colour)) {
                    this.content = BOPBlocks.JACARANDA_SAPLING;
                    break;
                }
                if (this == ACBOPBlocks.getDyedPalmFlowerPot(colour)) {
                    this.content = BOPBlocks.PALM_SAPLING;
                    break;
                }
                if (this == ACBOPBlocks.getDyedWillowFlowerPot(colour)) {
                    this.content = BOPBlocks.WILLOW_SAPLING;
                    break;
                }
                if (this == ACBOPBlocks.getDyedDeadFlowerPot(colour)) {
                    this.content = BOPBlocks.DEAD_SAPLING;
                    break;
                }
                if (this == ACBOPBlocks.getDyedMagicFlowerPot(colour)) {
                    this.content = BOPBlocks.MAGIC_SAPLING;
                    break;
                }
                if (this == ACBOPBlocks.getDyedUmbranFlowerPot(colour)) {
                    this.content = BOPBlocks.UMBRAN_SAPLING;
                    break;
                }
                if (this == ACBOPBlocks.getDyedHellbarkFlowerPot(colour)) {
                    this.content = BOPBlocks.HELLBARK_SAPLING;
                    break;
                }
                if (this == ACBOPBlocks.getDyedEmpyrealFlowerPot(colour)) {
                    this.content = BOPBlocks.EMPYREAL_SAPLING;
                    break;
                }
                if (this == ACBOPBlocks.getDyedRoseFlowerPot(colour)) {
                    this.content = BOPBlocks.ROSE;
                    break;
                }
                if (this == ACBOPBlocks.getDyedVioletFlowerPot(colour)) {
                    this.content = BOPBlocks.VIOLET;
                    break;
                }
                if (this == ACBOPBlocks.getDyedLavenderFlowerPot(colour)) {
                    this.content = BOPBlocks.LAVENDER;
                    break;
                }
                if (this == ACBOPBlocks.getDyedWhiteLavenderFlowerPot(colour)) {
                    this.content = BOPBlocks.WHITE_LAVENDER;
                    break;
                }
                if (this == ACBOPBlocks.getDyedOrangeCosmosFlowerPot(colour)) {
                    this.content = BOPBlocks.ORANGE_COSMOS;
                    break;
                }
                if (this == ACBOPBlocks.getDyedPinkDaffodilFlowerPot(colour)) {
                    this.content = BOPBlocks.PINK_DAFFODIL;
                    break;
                }
                if (this == ACBOPBlocks.getDyedPinkHibiscusFlowerPot(colour)) {
                    this.content = BOPBlocks.PINK_HIBISCUS;
                    break;
                }
                if (this == ACBOPBlocks.getDyedGlowflowerFlowerPot(colour)) {
                    this.content = BOPBlocks.GLOWFLOWER;
                    break;
                }
                if (this == ACBOPBlocks.getDyedWiltedLilyFlowerPot(colour)) {
                    this.content = BOPBlocks.WILTED_LILY;
                    break;
                }
                if (this == ACBOPBlocks.getDyedBurningBlossomFlowerPot(colour)) {
                    this.content = BOPBlocks.BURNING_BLOSSOM;
                    break;
                }
                if (this == ACBOPBlocks.getDyedEndbloomFlowerPot(colour)) {
                    this.content = BOPBlocks.ENDBLOOM;
                    break;
                }
                if (this == ACBOPBlocks.getDyedSproutFlowerPot(colour)) {
                    this.content = BOPBlocks.SPROUT;
                    break;
                }
                if (this == ACBOPBlocks.getDyedTinyCactusFlowerPot(colour)) {
                    this.content = BOPBlocks.TINY_CACTUS;
                    break;
                }
                if (this == ACBOPBlocks.getDyedToadstoolFlowerPot(colour)) {
                    this.content = BOPBlocks.TOADSTOOL;
                    break;
                }
                if (this == ACBOPBlocks.getDyedGlowshroomFlowerPot(colour)) {
                    this.content = BOPBlocks.GLOWSHROOM;
                    break;
                }
            }
        }
        if (this.isEmpty()) {
            return InteractionResult.CONSUME;
        } else {
            ItemStack itemStack = new ItemStack(this.content);
            if (!player.addItem(itemStack)) {
                player.drop(itemStack, false);
            }

            level.setBlock(blockPos, ACBlocks.getDyedFlowerPot(this.colour.getId()).defaultBlockState(), 3);
            level.gameEvent(player, GameEvent.BLOCK_CHANGE, blockPos);
            return InteractionResult.sidedSuccess(level.isClientSide);
        }
    }

    public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return SHAPE;
    }

    public RenderShape getRenderShape(BlockState blockState) {
        return RenderShape.MODEL;
    }

    public ItemStack getCloneItemStack(LevelReader levelReader, BlockPos blockPos, BlockState blockState) {
        return this.isEmpty() ? super.getCloneItemStack(levelReader, blockPos, blockState) : new ItemStack(this.content);
    }

    public BlockState updateShape(BlockState blockState, Direction direction, BlockState blockState2, LevelAccessor levelAccessor, BlockPos blockPos, BlockPos blockPos2) {
        return direction == Direction.DOWN && !blockState.canSurvive(levelAccessor, blockPos) ? Blocks.AIR.defaultBlockState() : super.updateShape(blockState, direction, blockState2, levelAccessor, blockPos, blockPos2);
    }

    public Block getContent() {
        return this.content;
    }


    static {
        for(DyeColor colour : DyeColor.values()) {
            POTTED_MAPS.put(colour, new HashMap());
        }

        SHAPE = Block.box((double)5.0F, (double)0.0F, (double)5.0F, (double)11.0F, (double)6.0F, (double)11.0F);
    }
}