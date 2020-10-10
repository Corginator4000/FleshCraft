package com.Corginator4000.fleshcraft.library.registration;

import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Util;
import net.minecraft.util.datafix.TypeReferences;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class TileEntityTypeDeferredRegister extends DeferredRegisterWrapper<TileEntityType<?>> {

    public TileEntityTypeDeferredRegister(String modID) {
        super(ForgeRegistries.TILE_ENTITIES, modID);
    }

    @Nullable
    private Type<?> getType(String name) {
        return Util.attemptDataFix(TypeReferences.BLOCK_ENTITY, this.resourceName(name));
    }

    /*public <T extends TileEntity> RegistryObject<TileEntityType<? extends T>> register(String name, Supplier<? extends T> factory, Supplier<? extends Block> block) {
        return this.register.register(name, () -> {
            return TileEntityType.Builder.create(factory, new Block[]{(Block)block.get()}).build(this.getType(name));
        });
    }*/

    /*public <T extends TileEntity> RegistryObject<TileEntityType<T>> register(String name, Supplier<? extends T> factory, EnumObject<?, ? extends Block> blocks) {
        return this.register.register(name, () -> {
            return new TileEntityType(factory, ImmutableSet.copyOf(blocks.values()), this.getType(name));
        });
    }*/

    public <T extends TileEntity> RegistryObject<TileEntityType<T>> register(String name, Supplier<? extends T> factory, Consumer<ImmutableSet.Builder<Block>> blockCollector) {
        return this.register.register(name, () -> {
            com.google.common.collect.ImmutableSet.Builder<Block> blocks = new com.google.common.collect.ImmutableSet.Builder();
            blockCollector.accept(blocks);
            return new TileEntityType(factory, blocks.build(), this.getType(name));
        });
    }
}
