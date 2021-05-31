package com.Corginator4000.fleshcraft.digestivechamber.tileentity;

import com.Corginator4000.fleshcraft.library.IDigestiveTankHandler;
import com.Corginator4000.fleshcraft.library.mantle.multiblock.MultiServantLogic;
import com.Corginator4000.fleshcraft.init.FleshCraftSpecialTileEntity;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

import javax.annotation.Nullable;

public class ChamberComponentTileEntity  extends MultiServantLogic {

    //get TileEntityType that contains a list of multiple different blocks
    public ChamberComponentTileEntity() {
        this(FleshCraftSpecialTileEntity.DigestiveComponent.get());
    }

    @SuppressWarnings("WeakerAccess")
    protected ChamberComponentTileEntity(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }

    // we send all our info to the client on load
    @Override
    public SUpdateTileEntityPacket getUpdatePacket() {
        CompoundNBT tag = this.write(new CompoundNBT());
        return new SUpdateTileEntityPacket(this.getPos(), -999, tag);
    }

    @Override
    public void onDataPacket(NetworkManager net, SUpdateTileEntityPacket pkt) {
        super.onDataPacket(net, pkt);
        this.read(this.getBlockState(), pkt.getNbtCompound());
    }

    @Override
    public CompoundNBT getUpdateTag() {
        // new tag instead of super since default implementation calls the super of writeToNBT
        return this.write(new CompoundNBT());
    }

    @Override
    public void handleUpdateTag(BlockState state, CompoundNBT tag) {
        this.read(state, tag);
    }

    /**
     * Gets a tile entity at the position of the master that contains a IDigestiveTankHandler
     *
     * @return null if the TE is not an IDigestiveTankHandler or if the master is missing
     */
    @Nullable
    protected IDigestiveTankHandler getDigestiveTankHandler() {
        if (this.getHasMaster() && this.world != null) {
            TileEntity te = this.world.getTileEntity(this.getMasterPosition());
            if (te instanceof IDigestiveTankHandler) {
                return (IDigestiveTankHandler) te;
            }
        }
        return null;
    }
}
