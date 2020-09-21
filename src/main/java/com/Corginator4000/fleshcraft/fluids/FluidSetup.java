package com.Corginator4000.fleshcraft.fluids;

import com.Corginator4000.fleshcraft.FleshCraft;
import com.Corginator4000.fleshcraft.util.RegistryHandler;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;

public class FluidSetup {

    public static final ResourceLocation LIQUID_STILL = new ResourceLocation(FleshCraft.MOD_ID, "block/fluid/liquid_still");
    public static final ResourceLocation LIQUID_FLOWING = new ResourceLocation(FleshCraft.MOD_ID, "block/fluid/liquid_flowing");

    public static final ResourceLocation MOLTEN_STILL = new ResourceLocation(FleshCraft.MOD_ID, "block/fluid/molten_still");
    public static final ResourceLocation MOLTEN_FLOWING = new ResourceLocation(FleshCraft.MOD_ID, "block/fluid/molten_flowing");

    public static final ResourceLocation MILK_STILL = new ResourceLocation(FleshCraft.MOD_ID, "block/fluid/milk_still");
    public static final ResourceLocation MILK_FLOWING = new ResourceLocation(FleshCraft.MOD_ID, "block/fluid/milk_flowing");

    public static final ResourceLocation STONE_STILL = new ResourceLocation(FleshCraft.MOD_ID, "block/fluid/stone_still");
    public static final ResourceLocation STONE_FLOWING = new ResourceLocation(FleshCraft.MOD_ID, "block/fluid/stone_flowing");

    public static final ForgeFlowingFluid.Properties BLOOD_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> RegistryHandler.BLOOD_FLUID.get(), () -> RegistryHandler.BLOOD_FLOWING.get(),
            FluidAttributes.builder(LIQUID_STILL, LIQUID_FLOWING).color(0xffD10000).density(1200).viscosity(1200).temperature(336))
            .block(() -> RegistryHandler.BLOOD_BLOCK.get());
}
