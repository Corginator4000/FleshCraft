package com.Corginator4000.fleshcraft.events;

import com.Corginator4000.fleshcraft.FleshCraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FleshCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.DEDICATED_SERVER)
public class ModServerEvents {
    //code here
}
