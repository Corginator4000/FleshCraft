package com.Corginator4000.fleshcraft.util;

import com.Corginator4000.fleshcraft.FleshCraft;
import com.Corginator4000.fleshcraft.client.gui.AdiposeStorageScreen;
import com.Corginator4000.fleshcraft.init.FleshCraftContainerTypes;
import net.minecraft.client.gui.ScreenManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = FleshCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event){
        ScreenManager.registerFactory(FleshCraftContainerTypes.ADIPOSE_STORAGE.get(), AdiposeStorageScreen::new);
    }
}
