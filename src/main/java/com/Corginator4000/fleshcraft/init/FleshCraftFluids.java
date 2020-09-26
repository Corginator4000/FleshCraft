package com.Corginator4000.fleshcraft.init;

import com.Corginator4000.fleshcraft.FleshCraft;
import com.Corginator4000.fleshcraft.fluids.FluidResources;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FleshCraftFluids {

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, FleshCraft.MOD_ID);

    // Fluids
    public static final RegistryObject<FlowingFluid> BLOOD_FLUID = FLUIDS.register("blood_fluid",
            () -> new ForgeFlowingFluid.Source(FluidResources.BLOOD_PROPERTIES));

    public static final RegistryObject<FlowingFluid> BLOOD_FLOWING = FLUIDS.register("blood_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidResources.BLOOD_PROPERTIES));

    public static final RegistryObject<FlowingFluid> DIGESTIVE_FLUID = FLUIDS.register("digestive_fluid",
            () -> new ForgeFlowingFluid.Source(FluidResources.DIGESTIVE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> DIGESTIVE_FLOWING = FLUIDS.register("digestive_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidResources.DIGESTIVE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> BILE_FLUID = FLUIDS.register("bile_fluid",
            () -> new ForgeFlowingFluid.Source(FluidResources.BILE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> BILE_FLOWING = FLUIDS.register("bile_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidResources.BILE_PROPERTIES));
}
