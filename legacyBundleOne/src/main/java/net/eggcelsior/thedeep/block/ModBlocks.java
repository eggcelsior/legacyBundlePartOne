package net.eggcelsior.thedeep.block;

import net.eggcelsior.thedeep.TheDeepMod;
import net.eggcelsior.thedeep.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks{
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TheDeepMod.MOD_ID);

    public static final RegistryObject<Block> DEPTHSTONE = registerBlock("depthstone",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE), UniformInt.of(1, 2)));

    public static final RegistryObject<Block> DEPTHSTONE_BRICKS = registerBlock("depthstone_bricks",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE), UniformInt.of(1, 2)));

    public static final RegistryObject<Block> CHISELED_DEPTHSTONE = registerBlock("chiseled_depthstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> POLISHED_DEPTHSTONE = registerBlock("polished_depthstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> DEPTHSTONE_STAIRS = registerBlock("depthstone_stairs",
            () -> new StairBlock(() -> ModBlocks.DEPTHSTONE.get().defaultBlockState() ,BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS)));

    public static final RegistryObject<Block> POLISHED_DEPTHSTONE_STAIRS = registerBlock("polished_depthstone_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_DEPTHSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS)));

    public static final RegistryObject<Block> DEPTHSTONE_BRICK_STAIRS = registerBlock("depthstone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.DEPTHSTONE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS)));

    public static final RegistryObject<Block> DEPTHSTONE_SLAB = registerBlock("depthstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> POLISHED_DEPTHSTONE_SLAB = registerBlock("polished_depthstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> COBBLED_DEPTHSTONE = registerBlock("cobbled_depthstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> DEPTHSTONE_BRICK_SLAB = registerBlock("depthstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> UNDERSTONE = registerBlock("understone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> UNDERSTONE_PILLAR = registerBlock("understone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> COBBLED_UNDERSTONE = registerBlock("cobbled_understone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> FITTED_UNDERSTONE_BRICKS = registerBlock("fitted_understone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> UNDERSTONE_TILES = registerBlock("understone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> WEATHERED_UNDERSTONE_BRICKS = registerBlock("weathered_understone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> CLEAN_UNDERSTONE_BRICKS = registerBlock("clean_understone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> CHISELED_ULTRAMARINE = registerBlock("chiseled_ultramarine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));

    public static final RegistryObject<Block> UNDERSTONE_TILE_STAIRS = registerBlock("understone_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.UNDERSTONE_TILES.get().defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS)));

    public static final RegistryObject<Block> UNDERSTONE_TILE_SLAB = registerBlock("understone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> ULTRAMARINE_BLOCK = registerBlock("ultramarine_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> ULTRAMARINE_GRATE = registerBlock("ultramarine_grate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
    public static final RegistryObject<Block> ULTRAMARINE_LAMP = registerBlock("ultramarine_lantern",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).requiresCorrectToolForDrops().strength(7)));

    //prepare for seven different chiseled understone variants dear god
    public static final RegistryObject<Block> CHISELED_UNDERSTONE_1 = registerBlock("chiseled_understone_1",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CHISELED_UNDERSTONE_2 = registerBlock("chiseled_understone_2",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CHISELED_UNDERSTONE_3 = registerBlock("chiseled_understone_3",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CHISELED_UNDERSTONE_4 = registerBlock("chiseled_understone_4",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CHISELED_UNDERSTONE_5 = registerBlock("chiseled_understone_5",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CHISELED_UNDERSTONE_6 = registerBlock("chiseled_understone_6",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CHISELED_UNDERSTONE_7 = registerBlock("chiseled_understone_7",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    //done for now lmao


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
