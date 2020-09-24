package com.Corginator4000.fleshcraft.library.mantle.multiblock;

import net.minecraft.util.math.BlockPos;

public interface IMasterLogic {

    /**
     * Called when servants change their state
     *
     * @param pos servant position
     */
    void notifyChange(IServantLogic servant, BlockPos pos);
}
