package com.Corginator4000.fleshcraft.library.mantle.item;

import com.Corginator4000.fleshcraft.library.mantle.util.TranslationHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class TooltipItem extends Item {
    public TooltipItem(Properties properties) {
        super(properties);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        TranslationHelper.addOptionalTooltip(stack, tooltip);
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
