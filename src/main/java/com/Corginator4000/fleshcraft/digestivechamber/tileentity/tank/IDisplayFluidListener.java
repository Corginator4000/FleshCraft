package com.Corginator4000.fleshcraft.digestivechamber.tileentity.tank;

import net.minecraft.fluid.Fluid;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.model.data.ModelProperty;

/**
 * Interface for blocks to be notified when the smeltery has a new bottommost fluid
 */
public interface IDisplayFluidListener {
    /** Property for fluid models */
    ModelProperty<Fluid> PROPERTY = new ModelProperty<>();

    /**
     * Called when the display fluid changes
     * @param fluid New display fluid
     */
    void notifyDisplayFluidUpdated(Fluid fluid);

    /**
     * Gets the position of the listener
     * @return  Position of listener
     */
    BlockPos getListenerPos();
}
