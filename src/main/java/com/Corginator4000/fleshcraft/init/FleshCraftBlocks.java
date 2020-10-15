package com.Corginator4000.fleshcraft.init;

import com.Corginator4000.fleshcraft.FleshCraft;
import com.Corginator4000.fleshcraft.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FleshCraftBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FleshCraft.MOD_ID);

    // Blocks
    public static final RegistryObject<Block> BIOMASS_BLOCK = BLOCKS.register("biomass_block", BiomassBlock::new);
    //public static final RegistryObject<Block> EPITHELIAL_BLOCK = BLOCKS.register("epithelial_block", EpithelialBlock::new);
    public static final RegistryObject<Block> BROWN_ADIPOSE_BLOCK = BLOCKS.register("brown_adipose_block", BrownAdiposeBlock::new);
    public static final RegistryObject<Block> WHITE_ADIPOSE_BLOCK = BLOCKS.register("white_adipose_block", WhiteAdiposeBlock::new);
    public static final RegistryObject<Block> MUSCLE_BLOCK = BLOCKS.register("muscle_block", MuscleBlock::new);

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

    //Tile Entity
    public static final RegistryObject<Block> ADIPOSE_STORAGE = BLOCKS.register("adipose_storage",
            () -> new AdiposeStorageBlock(Block.Properties.from(WHITE_ADIPOSE_BLOCK.get())));

    public static final RegistryObject<Block> ENDOTHERMIC_FURNACE = BLOCKS.register("endothermic_furnace",
            () -> new EndothermicFurnaceBlock(Block.Properties.from(Blocks.FURNACE)));
}
