package com.Corginator4000.fleshcraft.digestivechamber;

import com.Corginator4000.fleshcraft.library.registration.TileEntityTypeDeferredRegister;
import com.Corginator4000.fleshcraft.FleshCraft;
import com.Corginator4000.fleshcraft.digestivechamber.tileentity.ChamberComponentTileEntity;
import com.Corginator4000.fleshcraft.library.mantle.item.BlockTooltipItem;
import com.Corginator4000.fleshcraft.library.registration.BlockDeferredRegister;
import com.Corginator4000.fleshcraft.library.registration.object.BuildingBlockObject;
import com.Corginator4000.fleshcraft.util.FleshCraftModule;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Function;

public class DigestiveChamber extends FleshCraftModule {

    protected static final BlockDeferredRegister CHAMBER_BLOCKS = new BlockDeferredRegister(FleshCraft.MOD_ID);
    protected static final TileEntityTypeDeferredRegister TILE_ENTITIES = new TileEntityTypeDeferredRegister(FleshCraft.MOD_ID);
    /*
     * Block base properties
     */
    private static final Item.Properties DIGESTIVE_PROPS = new Item.Properties().group(FleshCraft.TAB);
    private static final Function<Block,? extends BlockItem> TOOLTIP_BLOCK_ITEM = (b) -> new BlockTooltipItem(b, DIGESTIVE_PROPS);


    private static final Block.Properties DIGESTIVE_CHAMBER = builder(Material.ROCK, ToolType.PICKAXE, SoundType.METAL).hardnessAndResistance(3.0F, 9.0F);
    public static final BuildingBlockObject epithelialTissue = CHAMBER_BLOCKS.registerBuilding("epithelial_tissue", DIGESTIVE_CHAMBER, TOOLTIP_BLOCK_ITEM);

    /*
     * Tile entities
     */
    public static final RegistryObject<TileEntityType<ChamberComponentTileEntity>> chamberComponent = TILE_ENTITIES.register("chamber_component", ChamberComponentTileEntity::new, (set) -> {
        set.addAll(epithelialTissue.values());
        /*set.addAll(searedStone.values());
        set.addAll(searedCobble.values());
        set.addAll(searedBricks.values());
        set.addAll(searedCrackedBricks.values());
        set.addAll(searedFancyBricks.values());
        set.addAll(searedSquareBricks.values());
        set.addAll(searedSmallBricks.values());
        set.addAll(searedTriangleBricks.values());
        set.addAll(searedCreeper.values());
        set.addAll(searedPaver.values());
        set.addAll(searedRoad.values());
        set.addAll(searedTile.values());*/
    });
}
