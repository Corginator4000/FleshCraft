package com.Corginator4000.fleshcraft.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BrownAdiposeBlock extends Block {

    public BrownAdiposeBlock() {
        super(AbstractBlock.Properties.create(Material.ORGANIC)
                .hardnessAndResistance(2.0f, 3.0f)
                .sound(SoundType.SLIME)
                .harvestLevel(0)
                .harvestTool(ToolType.AXE));
    }
}
