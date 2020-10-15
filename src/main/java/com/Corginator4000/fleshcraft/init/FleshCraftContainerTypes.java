package com.Corginator4000.fleshcraft.init;

import com.Corginator4000.fleshcraft.FleshCraft;
import com.Corginator4000.fleshcraft.container.AdiposeStorageContainer;
import com.Corginator4000.fleshcraft.container.EndothermicFurnaceContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FleshCraftContainerTypes {

    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = DeferredRegister.create(ForgeRegistries.CONTAINERS, FleshCraft.MOD_ID);

    public static final RegistryObject<ContainerType<AdiposeStorageContainer>> ADIPOSE_STORAGE = CONTAINER_TYPES
            .register("adipose_storage", () -> IForgeContainerType.create(AdiposeStorageContainer::new));

    public static final RegistryObject<ContainerType<EndothermicFurnaceContainer>> ENDOTHERMIC_FURNACE = CONTAINER_TYPES
            .register("endothermic_furnace", () -> IForgeContainerType.create(EndothermicFurnaceContainer::new));
}
