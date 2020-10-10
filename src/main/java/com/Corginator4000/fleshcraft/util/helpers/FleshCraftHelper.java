package com.Corginator4000.fleshcraft.util.helpers;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;

public class FleshCraftHelper {

    /**
     * We use this builder to ensure that our blocks all have the most important properties set.
     * This way it'll stick out if a block doesn't have a tooltype or sound set.
     * It may be a bit less clear at first, since the actual builder methods tell you what each value means,
     * but as long as we don't statically import the enums it should be just as readable.
     */
    public static Block.Properties builder(Material material, @Nullable ToolType toolType, SoundType soundType) {
        //noinspection ConstantConditions
        return Block.Properties.create(material).harvestTool(toolType).sound(soundType);
    }
}
