package com.Corginator4000.fleshcraft.library.registration;

import com.Corginator4000.fleshcraft.library.mantle.registration.object.ItemObject;
import net.minecraft.item.Item;
import net.minecraft.util.IStringSerializable;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ItemDeferredRegister extends DeferredRegisterWrapper<Item> {

    public ItemDeferredRegister(String modID) {
        super(ForgeRegistries.ITEMS, modID);
    }

    public <I extends Item> ItemObject<I> register(String name, Supplier<? extends I> sup) {
        return new ItemObject(this.register.register(name, sup));
    }

    public ItemObject<Item> register(String name, Item.Properties props) {
        return this.register(name, () -> {
            return new Item(props);
        });
    }

    /*public <T extends Enum<T> & IStringSerializable, I extends Item> EnumObject<T, I> registerEnum(T[] values, String name, Function<T, ? extends I> mapper) {
        return registerEnum((Enum[])values, (String)name, (BiFunction)((fullName, type) -> {
            return this.register(fullName, () -> {
                return (Item)mapper.apply(type);
            });
        }));
    }*/

    /*public <T extends Enum<T> & IStringSerializable, I extends Item> EnumObject<T, I> registerEnum(String name, T[] values, Function<T, ? extends I> mapper) {
        return registerEnum((String)name, (Enum[])values, (BiFunction)((fullName, type) -> {
            return this.register(fullName, () -> {
                return (Item)mapper.apply(type);
            });
        }));
    }*/
}
