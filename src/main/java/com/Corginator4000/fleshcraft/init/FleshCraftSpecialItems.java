package com.Corginator4000.fleshcraft.init;

import com.Corginator4000.fleshcraft.FleshCraft;
import com.Corginator4000.fleshcraft.library.mantle.registration.object.ItemObject;
import com.Corginator4000.fleshcraft.library.registration.ItemDeferredRegister;
import net.minecraft.item.Item;

public class FleshCraftSpecialItems {

    public static final ItemDeferredRegister SPECIAL_ITEMS = new ItemDeferredRegister(FleshCraft.MOD_ID);

    private static final Item.Properties DIGESTIVE_PROPS = new Item.Properties().group(FleshCraft.TAB);

    public static final ItemObject<Item> EPITHELIAL_TISSUE = SPECIAL_ITEMS.register("epithelial_tissue", new Item.Properties().group(FleshCraft.TAB));

}
