package com.Corginator4000.fleshcraft.items;

import com.Corginator4000.fleshcraft.FleshCraft;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class AkulothWorm extends Item {

    public AkulothWorm() {
        super(new Item.Properties()
                .group(FleshCraft.TAB)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(1.2f)
                        .effect(new EffectInstance(Effects.NAUSEA, 200, 1), 0.2f)
                        .setAlwaysEdible()
                        .build())

        );
    }
}
