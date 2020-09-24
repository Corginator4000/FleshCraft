package com.Corginator4000.fleshcraft.library.mantle.item;

import com.Corginator4000.fleshcraft.library.mantle.util.TranslationHelper;
import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class BlockTooltipItem extends BlockItem {
    public BlockTooltipItem(Block blockIn, Properties builder) {
        super(blockIn, builder);
    }

    @OnlyIn(Dist.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        TranslationHelper.addOptionalTooltip(stack, tooltip);
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
