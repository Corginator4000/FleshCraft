package com.Corginator4000.fleshcraft.library.registration;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

public abstract class DeferredRegisterWrapper<T extends IForgeRegistryEntry<T>> {
    protected final DeferredRegister<T> register;
    private final String modID;

    protected DeferredRegisterWrapper(IForgeRegistry<T> reg, String modID) {
        this.register = DeferredRegister.create(reg, modID);
        this.modID = modID;
    }

    public void register(IEventBus bus) {
        this.register.register(bus);
    }

    protected String resourceName(String name) {
        return this.modID + ":" + name;
    }

    //TODO: Find out if these are necesary
    /*protected static <E extends Enum<E> & IStringSerializable, V extends T, T extends IForgeRegistryEntry<T>> EnumObject<E, V> registerEnum(E[] values, String name, BiFunction<String, E, Supplier<? extends V>> register) {
        if (values.length == 0) {
            throw new IllegalArgumentException("Must have at least one value");
        } else {
            Builder<E, V> builder = new Builder(values[0].getDeclaringClass());
            Enum[] var4 = values;
            int var5 = values.length;

            for(int var6 = 0; var6 < var5; ++var6) {
                E value = var4[var6];
                builder.put(value, (Supplier)register.apply(((IStringSerializable)value).getString() + "_" + name, value));
            }

            return builder.build();
        }
    }*/

    /*protected static <E extends Enum<E> & IStringSerializable, V extends T, T extends IForgeRegistryEntry<T>> EnumObject<E, V> registerEnum(String name, E[] values, BiFunction<String, E, Supplier<? extends V>> register) {
        if (values.length == 0) {
            throw new IllegalArgumentException("Must have at least one value");
        } else {
            Builder<E, V> builder = new Builder(values[0].getDeclaringClass());
            Enum[] var4 = values;
            int var5 = values.length;

            for(int var6 = 0; var6 < var5; ++var6) {
                E value = var4[var6];
                builder.put(value, (Supplier)register.apply(name + "_" + ((IStringSerializable)value).getString(), value));
            }

            return builder.build();
        }
    }*/
}
