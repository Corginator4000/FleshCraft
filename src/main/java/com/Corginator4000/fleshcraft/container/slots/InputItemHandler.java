package com.Corginator4000.fleshcraft.container.slots;

import com.Corginator4000.fleshcraft.tileentity.EndothermicFurnaceTileEntity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class InputItemHandler extends SlotItemHandler {

    //TODO: Set actual implementations

    private EndothermicFurnaceTileEntity te;

    public InputItemHandler(IItemHandler itemHandler, int index, int xPosition, int yPosition, EndothermicFurnaceTileEntity tileentity)
    {
        super(itemHandler, index, xPosition, yPosition);
        this.te = tileentity;
    }

    @Override
    public void onSlotChanged()
    {
        super.onSlotChanged();
        this.te.markDirty();
    }
}
