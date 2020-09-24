package com.Corginator4000.fleshcraft.library.digestivechamber;

import net.minecraftforge.fluids.FluidStack;

import javax.annotation.Nullable;
import java.util.List;

public interface IDigestiveTankHandler {
    /**
     * Called when the liquids in the smeltery tank change.
     *
     * @param fluids  All fluids in the tank, new state. Same as tank.getFluids
     * @param changed The fluidstack that got changed or null if all got changed.
     */
    void onTankChanged(List<FluidStack> fluids, FluidStack changed);

    /**
     * Returns a copy of the SmelteryTank of the TE
     * @return Smeltery Tank if active, null if the smeltery is inactive
     */
    @Nullable
    DigestiveTank getTank();

    /**
     * Updates the fluids in the tank with data from the packet, should only be called client side
     */
    void updateFluidsFromPacket(List<FluidStack> liquids);
}
