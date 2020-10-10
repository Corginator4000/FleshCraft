package com.Corginator4000.fleshcraft.init;

import com.Corginator4000.fleshcraft.FleshCraft;
import com.Corginator4000.fleshcraft.library.registration.TileEntityTypeDeferredRegister;
import com.Corginator4000.fleshcraft.library.mantle.registration.object.BuildingBlockObject;
import com.Corginator4000.fleshcraft.tileentity.ChamberComponentTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import com.google.common.collect.ImmutableSet;

public class FleshCraftSpecialTileEntity {


    public static final  TileEntityTypeDeferredRegister SPECIAL_TILE_ENTITIES = new TileEntityTypeDeferredRegister(FleshCraft.MOD_ID);

    //TODO: find a way to add multiple blocks to a list for this
    //Digestive Chamber
    public static final RegistryObject<TileEntityType<ChamberComponentTileEntity>> DigestiveComponent = SPECIAL_TILE_ENTITIES.register("chamber_component", ChamberComponentTileEntity::new, (set) -> {
        //set.addAll((FleshCraftBlocks.EPITHELIAL_BLOCK.BuildingBlockObject.values()));
        //set.addAll(searedCobble.values());
        //set.addAll(searedBricks.values());
        //set.addAll(searedCrackedBricks.values());
        //set.addAll(searedFancyBricks.values());
        //set.addAll(searedSquareBricks.values());
        //set.addAll(searedSmallBricks.values());
        //set.addAll(searedTriangleBricks.values());
        //set.addAll(searedCreeper.values());
        //set.addAll(searedPaver.values());
        //set.addAll(searedRoad.values());
        //set.addAll(searedTile.values());
    });
}
