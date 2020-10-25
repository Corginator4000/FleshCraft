package com.Corginator4000.fleshcraft.init;

import com.Corginator4000.fleshcraft.FleshCraft;
import com.Corginator4000.fleshcraft.library.mantle.item.BlockTooltipItem;
import com.Corginator4000.fleshcraft.util.helpers.FleshCraftHelper;
import com.Corginator4000.fleshcraft.library.mantle.registration.object.BuildingBlockObject;
import com.Corginator4000.fleshcraft.library.registration.BlockDeferredRegister;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

import java.util.function.Function;

public class FleshCraftSpecialBlocks {

    public static final BlockDeferredRegister SPECIAL_BLOCKS = new BlockDeferredRegister(FleshCraft.MOD_ID);

    private static final Function<Block,? extends BlockItem> TOOLTIP_BLOCK_ITEM = (b) -> new BlockTooltipItem(b, new Item.Properties().group(FleshCraft.TAB));

    private static final Block.Properties DIGESTIVE_CHAMBER = FleshCraftHelper.builder(Material.ORGANIC, ToolType.AXE, SoundType.SLIME).hardnessAndResistance(3.0F, 9.0F);

    public static final BuildingBlockObject EPITHELIAL_BLOCK = SPECIAL_BLOCKS.registerBuilding("epithelial_block", DIGESTIVE_CHAMBER, TOOLTIP_BLOCK_ITEM);

}
