package com.Corginator4000.fleshcraft.init;

import com.Corginator4000.fleshcraft.FleshCraft;
import com.Corginator4000.fleshcraft.tileentity.AdiposeStorageTileEntity;
import com.Corginator4000.fleshcraft.tileentity.EndothermicFurnaceTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FleshCraftTileEntityTypes {

    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, FleshCraft.MOD_ID);

    public static final RegistryObject<TileEntityType<EndothermicFurnaceTileEntity>> ENDOTHERMIC_FURNACE = TILE_ENTITY_TYPES
            .register("endothermic_furnace", () -> TileEntityType.Builder
                    .create(EndothermicFurnaceTileEntity::new, FleshCraftBlocks.ENDOTHERMIC_FURNACE.get()).build(null));

    public static final RegistryObject<TileEntityType<AdiposeStorageTileEntity>> ADIPOSE_STORAGE = TILE_ENTITY_TYPES
            .register("adipose_storage", () -> TileEntityType.Builder
                    .create(AdiposeStorageTileEntity::new, FleshCraftBlocks.ADIPOSE_STORAGE.get()).build(null));

}
