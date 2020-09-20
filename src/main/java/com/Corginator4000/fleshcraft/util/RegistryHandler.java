package com.Corginator4000.fleshcraft.util;

import com.Corginator4000.fleshcraft.FleshCraft;
import com.Corginator4000.fleshcraft.blocks.BiomassBlock;
import com.Corginator4000.fleshcraft.blocks.BlockItemBase;
import com.Corginator4000.fleshcraft.items.AkulothWorm;
import com.Corginator4000.fleshcraft.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
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
}
