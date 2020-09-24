package com.Corginator4000.fleshcraft.digestivechamber.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EpithelialBlock extends Block {
    public EpithelialBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
        // look for a digestive chamber (controller directly or through another epithelial block) and notify it that we exist
        for (Direction direction : Direction.values()) {
            TileEntity tileEntity = worldIn.getTileEntity(pos.offset(direction));

            /*if (tileEntity instanceof IMasterLogic) {
                TileEntity servant = worldIn.getTileEntity(pos);

                if (servant instanceof IServantLogic) {
                    ((IMasterLogic) tileEntity).notifyChange((IServantLogic) servant, pos);
                    break;
                }
            } else if (tileEntity instanceof SmelteryComponentTileEntity) {
                SmelteryComponentTileEntity componentTileEntity = (SmelteryComponentTileEntity) tileEntity;

                if (componentTileEntity.hasValidMaster()) {
                    componentTileEntity.notifyMasterOfChange();
                    break;
                }
            }*/
        }
    }
}
