package net.eggcelsior.thedeep.block;

import net.eggcelsior.thedeep.TheDeepMod;
import net.eggcelsior.thedeep.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.imageio.spi.RegisterableService;
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
    public static final RegistryObject<Block> ELDERKELP_STEM = registerBlock("elderkelp_stem",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MELON).requiresCorrectToolForDrops().strength(7)));

    public static final RegistryObject<Block> CARVED_ELDERKELP = registerBlock("carved_elderkelp",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MELON).requiresCorrectToolForDrops().strength(7)));

    public static final RegistryObject<Block> ELDERKELP_PLANKS = registerBlock("elderkelp_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MELON).requiresCorrectToolForDrops().strength(7)));

    public static final RegistryObject<Block> WEATHERED_ELDERKELP_PLANKS = registerBlock("weathered_elderkelp_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MELON).requiresCorrectToolForDrops().strength(7)));

    public static final RegistryObject<Block> ELDERKELP_PLANK_STAIRS = registerBlock("elderkelp_plank_stairs",
            () -> new StairBlock(() -> ModBlocks.ELDERKELP_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.MELON).requiresCorrectToolForDrops().strength(7)));

    public static final RegistryObject<Block> ELDERKELP_PLANK_SLAB = registerBlock("elderkelp_plank_slabs",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MELON).requiresCorrectToolForDrops().strength(7)));

    public static final RegistryObject<Block> WEATHERED_ELDERKELP_PLANK_STAIRS = registerBlock("weathered_elderkelp_plank_stairs",
            () -> new StairBlock(() -> ModBlocks.ELDERKELP_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.MELON).requiresCorrectToolForDrops().strength(7)));

    public static final RegistryObject<Block> WEATHERED_ELDERKELP_PLANK_SLAB = registerBlock("weathered_elderkelp_plank_slabs",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MELON).requiresCorrectToolForDrops().strength(7)));

    public static final RegistryObject<Block> ELDERKELP_DOOR = registerBlock("elderkelp_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.MELON), BlockSetType.WARPED));

    public static final RegistryObject<Block> ELDERKELP_TRAPDOOR = registerBlock("elderkelp_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.MELON), BlockSetType.WARPED));

    //time for all the understone slab/stairs
    public static final RegistryObject<Block> UNDERSTONE_SLAB = registerBlock("understone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> UNDERSTONE_STAIRS = registerBlock("understone_stairs",
            () -> new StairBlock(() -> ModBlocks.UNDERSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> COBBLED_UNDERSTONE_SLAB = registerBlock("cobbled_understone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> COBBLED_UNDERSTONE_STAIRS = registerBlock("cobbled_understone_stairs",
            () -> new StairBlock(() -> ModBlocks.COBBLED_UNDERSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> FITTED_UNDERSTONE_BRICK_SLAB = registerBlock("fitted_understone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> FITTED_UNDERSTONE_BRICK_STAIRS = registerBlock("fitted_understone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.FITTED_UNDERSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> WEATHERED_UNDERSTONE_BRICK_SLAB = registerBlock("weathered_understone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> WEATHERED_UNDERSTONE_BRICK_STAIRS = registerBlock("weathered_understone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.WEATHERED_UNDERSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> CLEAN_UNDERSTONE_BRICK_SLAB = registerBlock("clean_understone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CLEAN_UNDERSTONE_BRICK_STAIRS = registerBlock("clean_understone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.CLEAN_UNDERSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    //

    public static final RegistryObject<Block> ULTRAMARINE_ORE = registerBlock("ultramarine_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops().strength(7), UniformInt.of(3, 100)));

    //buncha depthstone variants incoming
    public static final RegistryObject<Block> CHISELED_DEPTHSTONE_1 = registerBlock("chiseled_depthstone_1",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> CHISELED_DEPTHSTONE_2 = registerBlock("chiseled_depthstone_2",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> CHISELED_DEPTHSTONE_3 = registerBlock("chiseled_depthstone_3",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> CUT_DEPTHSTONE_1 = registerBlock("cut_depthstone_1",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> CUT_DEPTHSTONE_2 = registerBlock("cut_depthstone_2",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> CUT_DEPTHSTONE_3 = registerBlock("cut_depthstone_3",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> CUT_DEPTHSTONE_4 = registerBlock("cut_depthstone_4",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> CUT_DEPTHSTONE_5 = registerBlock("cut_depthstone_5",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> CUT_DEPTHSTONE_6 = registerBlock("cut_depthstone_6",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_GLAZED_TERRACOTTA)));

    public static final RegistryObject<Block> CLEAN_DEPTHSTONE_BRICKS = registerBlock("clean_depthstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> DARK_DEPTHSTONE_BRICKS = registerBlock("dark_depthstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> DARK_DEPTHSTONE_MOSAIC = registerBlock("dark_depthstone_mosaic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> DARK_DEPTHSTONE_TILES = registerBlock("dark_depthstone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> DEPTHSTONE_TILES = registerBlock("depthstone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> WEATHERED_DEPTHSTONE_BRICKS = registerBlock("weathered_depthstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> DARK_DEPTHSTONE_PILLAR = registerBlock("dark_depthstone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> DEPTHSTONE_PILLAR = registerBlock("depthstone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    //

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
