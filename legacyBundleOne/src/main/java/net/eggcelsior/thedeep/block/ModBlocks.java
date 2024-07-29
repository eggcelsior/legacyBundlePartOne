package net.eggcelsior.thedeep.block;

import net.eggcelsior.thedeep.TheDeepMod;
import net.eggcelsior.thedeep.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;
import java.util.function.Supplier;

public class ModBlocks{
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TheDeepMod.MOD_ID);

    public static final RegistryObject<Block> DEPTHSTONE = registerBlock("depthstone",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE), UniformInt.of(1, 2)));

    public static final RegistryObject<Block> DEPTHSTONE_BRICKS = registerBlock("depthstone_bricks",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE), UniformInt.of(1, 2)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
