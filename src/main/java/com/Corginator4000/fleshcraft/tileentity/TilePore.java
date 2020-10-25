package com.Corginator4000.fleshcraft.tileentity;

import com.Corginator4000.fleshcraft.library.IDigestiveTankHandler;

import net.minecraft.state.DirectionProperty;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;

import javax.annotation.Nonnull;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

/**
 * TODO: ALlows I/O from chamber tank
 */

public class TilePore extends ChamberComponentTileEntity{

    //private FluidHandlerExtractOnlyWrapper drainFluidHandler;
    private WeakReference<IDigestiveTankHandler> oldChamberTank;

    //TODO: Find working alternative to "hasCapability" to allow fluid I/O from this block of the multiblock
    /*@Override
    public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable DirectionProperty facing) {
        if(capability == CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY) {
            IDigestiveTankHandler te = getDigestiveTankHandler();
            return te != null && te.getTank() != null;
        }
        return super.hasCapability(capability, facing);
    }*/

    /*@SuppressWarnings("unchecked")
    @Override
    public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing facing) {
        if(capability == CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY) {
            ISmelteryTankHandler te = this.getSmelteryTankHandler();
            if(te == null) {
                return super.getCapability(capability, facing);
            }

            SmelteryTank tank = te.getTank();
            if (tank == null) {
                return super.getCapability(capability, facing);
            }

            if(facing == null) {
                // check if the TE's equal rather than just the position
                // otherwise we could still be referencing a TE from a smeltery that was broken and replaced (garbage collector being slow to grab the TE)
                if(drainFluidHandler == null || oldSmelteryTank.get() == null
                        || oldSmelteryTank == null || !drainFluidHandler.hasParent()
                        || !te.equals(oldSmelteryTank.get())) {
                    drainFluidHandler = new FluidHandlerExtractOnlyWrapper(tank);
                    oldSmelteryTank = new WeakReference<>(te);
                }
                return (T) drainFluidHandler;
            }
            return (T) tank;
        }
        return super.getCapability(capability, facing);
    }*/
}
