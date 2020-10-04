package com.Corginator4000.fleshcraft.init;

import com.Corginator4000.fleshcraft.FleshCraft;
import com.Corginator4000.fleshcraft.blocks.BlockItemBase;
import com.Corginator4000.fleshcraft.items.AkulothWorm;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FleshCraftItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FleshCraft.MOD_ID);

    // Items
    public static final RegistryObject<Item> BIOMASS = ITEMS.register("biomass",
            () -> new Item(new Item.Properties().group(FleshCraft.TAB)));

    public static final RegistryObject<Item> MUSCLE_TISSUE = ITEMS.register("muscle_tissue",
            () -> new Item(new Item.Properties().group(FleshCraft.TAB)));

    public static final RegistryObject<Item> EPITHELIAL_TISSUE = ITEMS.register("epithelial_tissue",
            () -> new Item(new Item.Properties().group(FleshCraft.TAB)));

    public static final RegistryObject<AkulothWorm> AKULOTH_WORM = ITEMS.register("akuloth_worm", AkulothWorm::new);

    // Block Items
    public static final RegistryObject<Item> BIOMASS_BLOCK_ITEM = ITEMS.register("biomass_block",
            () -> new BlockItemBase(FleshCraftBlocks.BIOMASS_BLOCK.get()));

    public static final RegistryObject<Item> EPITHELIAL_BLOCK_ITEM = ITEMS.register("epithelial_block",
            () -> new BlockItemBase(FleshCraftBlocks.EPITHELIAL_BLOCK.get()));

    public static final RegistryObject<Item> BROWN_ADIPOSE_BLOCK_ITEM = ITEMS.register("brown_adipose_block",
            () -> new BlockItemBase(FleshCraftBlocks.BROWN_ADIPOSE_BLOCK.get()));

    public static final RegistryObject<Item> WHITE_ADIPOSE_BLOCK_ITEM = ITEMS.register("white_adipose_block",
            () -> new BlockItemBase(FleshCraftBlocks.WHITE_ADIPOSE_BLOCK.get()));

    public static final RegistryObject<Item> MUSCLE_BLOCK_ITEM = ITEMS.register("muscle_block",
            () -> new BlockItemBase(FleshCraftBlocks.MUSCLE_BLOCK.get()));

    public static final RegistryObject<Item> ADIPOSE_STORAGE_ITEM = ITEMS.register("adipose_storage",
            () -> new BlockItemBase(FleshCraftBlocks.ADIPOSE_STORAGE.get()));

    // Fluid Bucket
    public static final RegistryObject<BucketItem> BLOOD_BUCKET = ITEMS.register("blood_bucket",
            () -> new BucketItem(() -> FleshCraftFluids.BLOOD_FLUID.get(),
                    new Item.Properties().group(FleshCraft.TAB).maxStackSize(16)));

    public static final RegistryObject<BucketItem> DIGESTIVE_BUCKET = ITEMS.register("digestive_acid_bucket",
            () -> new BucketItem(() -> FleshCraftFluids.DIGESTIVE_FLUID.get(),
                    new Item.Properties().group(FleshCraft.TAB).maxStackSize(16)));

    public static final RegistryObject<BucketItem> BILE_BUCKET = ITEMS.register("bile_bucket",
            () -> new BucketItem(() -> FleshCraftFluids.BILE_FLUID.get(),
                    new Item.Properties().group(FleshCraft.TAB).maxStackSize(16)));
}
