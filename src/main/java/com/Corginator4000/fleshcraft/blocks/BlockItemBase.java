package com.Corginator4000.fleshcraft.blocks;

import com.Corginator4000.fleshcraft.FleshCraft;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(FleshCraft.TAB));
    }
}
