package net.biker.wallsnstuff.item.custom;

import net.biker.wallsnstuff.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

public class DetectorItem extends Item {
    public DetectorItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (!context.getWorld().isClient()) {
            BlockPos PositionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean foundBlock = false;

            for (int i = 0; i <= PositionClicked.getY() + 64; i++) {
                BlockState state = context.getWorld().getBlockState(PositionClicked.down(i));

                if (isValuebleBlock(state)) {
                    outputValuableCoordinates(PositionClicked.down(i), player, state.getBlock());
                    foundBlock = true;

                    break;
                }


            }

            if(!foundBlock) {
                player.sendMessage((Text.literal("no wall found.")));
            }
        }

        context.getStack().damage(1, context.getPlayer(),
                playerEntity -> playerEntity.sendToolBreakStatus(playerEntity.getActiveHand()));

        return ActionResult.SUCCESS;
    }

    private void outputValuableCoordinates(BlockPos blockpos, PlayerEntity player, Block block) {
        player.sendMessage(Text.literal("your looking at it."));
    }

    private boolean isValuebleBlock(BlockState state) {
        return state.isIn(ModTags.Blocks.DETECTOR_DETECTABLE_BLOCKS);
    }
}
