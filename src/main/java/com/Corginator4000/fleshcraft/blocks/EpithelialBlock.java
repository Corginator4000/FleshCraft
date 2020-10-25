package com.Corginator4000.fleshcraft.blocks;

import com.Corginator4000.fleshcraft.library.mantle.multiblock.IMasterLogic;
import com.Corginator4000.fleshcraft.library.mantle.multiblock.IServantLogic;
import com.Corginator4000.fleshcraft.tileentity.ChamberComponentTileEntity;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

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
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new ChamberComponentTileEntity();
    }

    @Override
    @Deprecated
    public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
        TileEntity tileEntity = worldIn.getTileEntity(pos);

        if (tileEntity instanceof ChamberComponentTileEntity) {
            ((ChamberComponentTileEntity) tileEntity).notifyMasterOfChange();
        }

        super.onReplaced(state, worldIn, pos, newState, isMoving);
        worldIn.removeTileEntity(pos);
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
        // look for a smeltery (controller directly or through another smeltery block) and notify it that we exist
        for (Direction direction : Direction.values()) {
            TileEntity tileEntity = worldIn.getTileEntity(pos.offset(direction));

            if (tileEntity instanceof IMasterLogic) {
                TileEntity servant = worldIn.getTileEntity(pos);

                if (servant instanceof IServantLogic) {
                    ((IMasterLogic) tileEntity).notifyChange((IServantLogic) servant, pos);
                    break;
                }
            } else if (tileEntity instanceof ChamberComponentTileEntity) {
                ChamberComponentTileEntity componentTileEntity = (ChamberComponentTileEntity) tileEntity;

                if (componentTileEntity.hasValidMaster()) {
                    componentTileEntity.notifyMasterOfChange();
                    break;
                }
            }
        }
    }

    @Override
    @Deprecated
    public boolean eventReceived(BlockState state, World worldIn, BlockPos pos, int id, int param) {
        super.eventReceived(state, worldIn, pos, id, param);

        TileEntity tileentity = worldIn.getTileEntity(pos);

        return tileentity != null && tileentity.receiveClientEvent(id, param);
    }
}
