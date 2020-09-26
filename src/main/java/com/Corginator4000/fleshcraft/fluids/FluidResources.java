package com.Corginator4000.fleshcraft.fluids;

import com.Corginator4000.fleshcraft.FleshCraft;
import com.Corginator4000.fleshcraft.init.FleshCraftBlocks;
import com.Corginator4000.fleshcraft.init.FleshCraftFluids;
import com.Corginator4000.fleshcraft.init.FleshCraftItems;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;

public class FluidResources {

    public static final ResourceLocation BLOOD_STILL = new ResourceLocation(FleshCraft.MOD_ID, "block/fluid/blood_still");
    public static final ResourceLocation BLOOD_FLOWING = new ResourceLocation(FleshCraft.MOD_ID, "block/fluid/blood_flowing");

    public static final ResourceLocation DIGESTIVE_STILL = new ResourceLocation(FleshCraft.MOD_ID, "block/fluid/digestive_acid_still");
    public static final ResourceLocation DIGESTIVE_FLOWING = new ResourceLocation(FleshCraft.MOD_ID, "block/fluid/digestive_acid_flowing");

    public static final ResourceLocation BILE_STILL = new ResourceLocation(FleshCraft.MOD_ID, "block/fluid/bile_still");
    public static final ResourceLocation BILE_FLOWING = new ResourceLocation(FleshCraft.MOD_ID, "block/fluid/bile_flowing");

    public static final ResourceLocation FLUID_OVERLAY = new ResourceLocation(FleshCraft.MOD_ID, "blocks/fluids/fluid_overlay");

    public static final ForgeFlowingFluid.Properties BLOOD_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> FleshCraftFluids.BLOOD_FLUID.get(), () -> FleshCraftFluids.BLOOD_FLOWING.get(),
            FluidAttributes.builder(BLOOD_STILL, BLOOD_FLOWING).color(0xffD10000).density(1200).viscosity(1200)
                    .temperature(336).sound(SoundEvents.BLOCK_WATER_AMBIENT).overlay(FLUID_OVERLAY))
            .block(() -> FleshCraftBlocks.BLOOD_BLOCK.get()).bucket(() -> FleshCraftItems.BLOOD_BUCKET.get());

    public static final ForgeFlowingFluid.Properties DIGESTIVE_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> FleshCraftFluids.DIGESTIVE_FLUID.get(), () -> FleshCraftFluids.DIGESTIVE_FLOWING.get(),
            FluidAttributes.builder(DIGESTIVE_STILL, DIGESTIVE_FLOWING).color(0xffE4CE5F).density(1200)
                    .viscosity(1200).temperature(336).sound(SoundEvents.BLOCK_LAVA_AMBIENT).overlay(FLUID_OVERLAY))
            .block(() -> FleshCraftBlocks.DIGESTIVE_BLOCK.get()).bucket(() -> FleshCraftItems.DIGESTIVE_BUCKET.get());

    public static final ForgeFlowingFluid.Properties BILE_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> FleshCraftFluids.BILE_FLUID.get(), () -> FleshCraftFluids.BILE_FLOWING.get(),
            FluidAttributes.builder(BILE_STILL, BILE_FLOWING).color(0xffC1CE5F).density(1200)
                    .viscosity(1200).temperature(336).sound(SoundEvents.BLOCK_LAVA_AMBIENT).overlay(FLUID_OVERLAY))
            .block(() -> FleshCraftBlocks.BILE_BLOCK.get()).bucket(() -> FleshCraftItems.BILE_BUCKET.get());
}
