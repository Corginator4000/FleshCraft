package com.Corginator4000.fleshcraft.library.registration;

import com.Corginator4000.fleshcraft.library.mantle.registration.object.BuildingBlockObject;
import com.Corginator4000.fleshcraft.library.mantle.registration.object.ItemObject;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.IStringSerializable;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Function;
import java.util.function.Supplier;

public class BlockDeferredRegister extends DeferredRegisterWrapper<Block> {

    private final DeferredRegister<Item> itemRegister;

    public BlockDeferredRegister(String modID) {
        super(ForgeRegistries.BLOCKS, modID);
        this.itemRegister = DeferredRegister.create(ForgeRegistries.ITEMS, modID);
    }

    public void register(IEventBus bus) {
        super.register(bus);
        this.itemRegister.register(bus);
    }

    public <B extends Block> RegistryObject<B> registerNoItem(String name, Supplier<? extends B> block) {
        return this.register.register(name, block);
    }

    public RegistryObject<Block> registerNoItem(String name, AbstractBlock.Properties props) {
        return this.registerNoItem(name, () -> {
            return new Block(props);
        });
    }

    public <B extends Block> ItemObject<B> register(String name, Supplier<? extends B> block, Function<? super B, ? extends BlockItem> item) {
        RegistryObject<B> blockObj = this.registerNoItem(name, block);
        this.itemRegister.register(name, () -> {
            return (BlockItem)item.apply(blockObj.get());
        });
        return new ItemObject(blockObj);
    }

    public ItemObject<Block> register(String name, AbstractBlock.Properties blockProps, Function<? super Block, ? extends BlockItem> item) {
        return this.register(name, () -> {
            return new Block(blockProps);
        }, item);
    }

    public BuildingBlockObject registerBuilding(String name, AbstractBlock.Properties props, Function<? super Block, ? extends BlockItem> item) {
        ItemObject<Block> blockObj = this.register(name, props, item);
        return new BuildingBlockObject(blockObj, this.register(name + "_slab", () -> {
            return new SlabBlock(props);
        }, item), this.register(name + "_stairs", () -> {
            return new StairsBlock(() -> {
                return ((Block)blockObj.get()).getDefaultState();
            }, props);
        }, item));
    }

    /*public WallBuildingBlockObject registerWallBuilding(String name, AbstractBlock.Properties props, Function<? super Block, ? extends BlockItem> item) {
        return new WallBuildingBlockObject(this.registerBuilding(name, props, item), this.register(name + "_wall", () -> {
            return new WallBlock(props);
        }, item));
    }*/

    /*public FenceBuildingBlockObject registerFenceBuilding(String name, AbstractBlock.Properties props, Function<? super Block, ? extends BlockItem> item) {
        return new FenceBuildingBlockObject(this.registerBuilding(name, props, item), this.register(name + "_fence", () -> {
            return new FenceBlock(props);
        }, item));
    }*/

    /*public <T extends Enum<T> & IStringSerializable, B extends Block> EnumObject<T, B> registerEnum(T[] values, String name, Function<T, ? extends B> mapper, Function<? super B, ? extends BlockItem> item) {
        return registerEnum(values, name, (fullName, value) -> {
            return this.register(fullName, () -> {
                return (Block)mapper.apply(value);
            }, item);
        });
    }*/

    /*public <T extends Enum<T> & IStringSerializable, B extends Block> EnumObject<T, B> registerEnum(String name, T[] values, Function<T, ? extends B> mapper, Function<? super B, ? extends BlockItem> item) {
        return registerEnum(name, values, (fullName, value) -> {
            return this.register(fullName, () -> {
                return (Block)mapper.apply(value);
            }, item);
        });
    }*/
}
