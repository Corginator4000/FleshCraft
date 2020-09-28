package com.Corginator4000.fleshcraft.init;

import com.Corginator4000.fleshcraft.FleshCraft;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FleshCraftTileEntityTypes {

    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, FleshCraft.MOD_ID);

    /*public static final RegistryObject<TileEntityType<ExampleFurnaceTileEntity>> EXAMPLE_FURNACE = TILE_ENTITY_TYPES
            .register("example_furnace", () -> TileEntityType.Builder
                    .create(ExampleFurnaceTileEntity::new, BlockInit.EXAMPLE_FURNACE.get()).build(null));*/
}
