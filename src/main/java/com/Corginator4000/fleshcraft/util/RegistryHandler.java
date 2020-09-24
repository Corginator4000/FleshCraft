package com.Corginator4000.fleshcraft.util;

import com.Corginator4000.fleshcraft.FleshCraft;
import com.Corginator4000.fleshcraft.blocks.BiomassBlock;
import com.Corginator4000.fleshcraft.blocks.BlockItemBase;
import com.Corginator4000.fleshcraft.fluids.FluidResources;
import com.Corginator4000.fleshcraft.items.AkulothWorm;
import com.Corginator4000.fleshcraft.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FleshCraft.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FleshCraft.MOD_ID);
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, FleshCraft.MOD_ID);


    public static void Init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        FLUIDS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> BIOMASS = ITEMS.register("biomass", ItemBase::new);
    public static final RegistryObject<AkulothWorm> AKULOTH_WORM = ITEMS.register("akuloth_worm", AkulothWorm::new);

    // Blocks
    public static final RegistryObject<Block> BIOMASS_BLOCK = BLOCKS.register("biomass_block", BiomassBlock::new);

    // Block Items
    public static final RegistryObject<Item> BIOMASS_BLOCK_ITEM = ITEMS.register("biomass_block", () -> new BlockItemBase(BIOMASS_BLOCK.get()));

    // Fluids
    public static final RegistryObject<FlowingFluid> BLOOD_FLUID = FLUIDS.register("blood_fluid",
            () -> new ForgeFlowingFluid.Source(FluidResources.BLOOD_PROPERTIES));

    public static final RegistryObject<FlowingFluid> BLOOD_FLOWING = FLUIDS.register("blood_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidResources.BLOOD_PROPERTIES));

    public static final RegistryObject<FlowingFluid> DIGESTIVE_FLUID = FLUIDS.register("digestive_fluid",
            () -> new ForgeFlowingFluid.Source(FluidResources.DIGESTIVE_PROPERTIES));

    public static final RegistryObject<FlowingFluid> DIGESTIVE_FLOWING = FLUIDS.register("digestive_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidResources.DIGESTIVE_PROPERTIES));

    // Fluid Block
    public static final RegistryObject<FlowingFluidBlock> BLOOD_BLOCK = BLOCKS.register("blood",
            () -> new FlowingFluidBlock(() -> BLOOD_FLUID.get(), Block.Properties.create(Material.WATER)
                    .doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops()));

    public static final RegistryObject<FlowingFluidBlock> DIGESTIVE_BLOCK = BLOCKS.register("digestive_acid",
            () -> new FlowingFluidBlock(() -> DIGESTIVE_FLUID.get(), Block.Properties.create(Material.LAVA)
                    .doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops()));

    // Fluid Bucket
    public static final RegistryObject<BucketItem> BLOOD_BUCKET = ITEMS.register("blood_bucket",
            () -> new BucketItem(() -> BLOOD_FLUID.get(),
                    new Item.Properties().group(FleshCraft.TAB).maxStackSize(16)));

    public static final RegistryObject<BucketItem> DIGESTIVE_BUCKET = ITEMS.register("digestive_acid_bucket",
            () -> new BucketItem(() -> DIGESTIVE_FLUID.get(),
                    new Item.Properties().group(FleshCraft.TAB).maxStackSize(16)));
}
