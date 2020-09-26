package com.Corginator4000.fleshcraft.init;

import com.Corginator4000.fleshcraft.FleshCraft;
import com.Corginator4000.fleshcraft.blocks.BiomassBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FleshCraftBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FleshCraft.MOD_ID);

    // Blocks
    public static final RegistryObject<Block> BIOMASS_BLOCK = BLOCKS.register("biomass_block", BiomassBlock::new);

    // Fluid Block
    public static final RegistryObject<FlowingFluidBlock> BLOOD_BLOCK = BLOCKS.register("blood",
            () -> new FlowingFluidBlock(() -> FleshCraftFluids.BLOOD_FLUID.get(), Block.Properties.create(Material.WATER)
                    .doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops()));

    public static final RegistryObject<FlowingFluidBlock> DIGESTIVE_BLOCK = BLOCKS.register("digestive_acid",
            () -> new FlowingFluidBlock(() -> FleshCraftFluids.DIGESTIVE_FLUID.get(), Block.Properties.create(Material.LAVA)
                    .doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops()));

    public static final RegistryObject<FlowingFluidBlock> BILE_BLOCK = BLOCKS.register("bile",
            () -> new FlowingFluidBlock(() -> FleshCraftFluids.BILE_FLUID.get(), Block.Properties.create(Material.LAVA)
                    .doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops()));
}
