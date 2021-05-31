package com.Corginator4000.fleshcraft;

import com.Corginator4000.fleshcraft.init.*;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Locale;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("fleshcraft")
public class FleshCraft
{
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "fleshcraft";

    public FleshCraft() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        FleshCraftFluids.FLUIDS.register(FMLJavaModLoadingContext.get().getModEventBus());
        FleshCraftBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        FleshCraftSpecialBlocks.SPECIAL_BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        FleshCraftItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        FleshCraftSpecialItems.SPECIAL_ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        FleshCraftRecipeSerializers.RECIPE_SERIALIZERS.register(FMLJavaModLoadingContext.get().getModEventBus());
        FleshCraftTileEntityTypes.TILE_ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
        FleshCraftSpecialTileEntity.SPECIAL_TILE_ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
        FleshCraftContainerTypes.CONTAINER_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) { }

    private void doClientStuff(final FMLClientSetupEvent event) { }

    public static final ItemGroup TAB = new ItemGroup("fleshcraftTab")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(FleshCraftItems.BIOMASS.get());
        }
    };
}
