package net.eggcelsior.thedeep.datagen;

import net.eggcelsior.thedeep.TheDeepMod;
import net.eggcelsior.thedeep.block.ModBlocks;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TheDeepMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.DEPTHSTONE);
        blockWithItem(ModBlocks.DEPTHSTONE_BRICKS);
        blockWithItem(ModBlocks.CHISELED_DEPTHSTONE);
        blockWithItem(ModBlocks.POLISHED_DEPTHSTONE);
        blockWithItem(ModBlocks.COBBLED_DEPTHSTONE);
        blockWithItem(ModBlocks.CHISELED_DEPTHSTONE_1);
        blockWithItem(ModBlocks.CHISELED_DEPTHSTONE_2);
        blockWithItem(ModBlocks.CHISELED_DEPTHSTONE_3);
        blockWithItem(ModBlocks.CLEAN_DEPTHSTONE_BRICKS);
        blockWithItem(ModBlocks.DARK_DEPTHSTONE_BRICKS);
        blockWithItem(ModBlocks.DARK_DEPTHSTONE_MOSAIC);
        blockWithItem(ModBlocks.DARK_DEPTHSTONE_TILES);
        blockWithItem(ModBlocks.DEPTHSTONE_TILES);
        blockWithItem(ModBlocks.WEATHERED_DEPTHSTONE_BRICKS);

        blockWithItem(ModBlocks.UNDERSTONE);
        //blockWithItem(ModBlocks.UNDERSTONE_PILLAR);
        blockWithItem(ModBlocks.COBBLED_UNDERSTONE);
        blockWithItem(ModBlocks.FITTED_UNDERSTONE_BRICKS);
        blockWithItem(ModBlocks.UNDERSTONE_TILES);
        blockWithItem(ModBlocks.WEATHERED_UNDERSTONE_BRICKS);
        blockWithItem(ModBlocks.CLEAN_UNDERSTONE_BRICKS);

        blockWithItem(ModBlocks.CHISELED_UNDERSTONE_1);
        blockWithItem(ModBlocks.CHISELED_UNDERSTONE_2);
        blockWithItem(ModBlocks.CHISELED_UNDERSTONE_3);
        blockWithItem(ModBlocks.CHISELED_UNDERSTONE_4);
        blockWithItem(ModBlocks.CHISELED_UNDERSTONE_5);
        blockWithItem(ModBlocks.CHISELED_UNDERSTONE_6);
        blockWithItem(ModBlocks.CHISELED_UNDERSTONE_7);

        blockWithItem(ModBlocks.CHISELED_ULTRAMARINE);
        blockWithItem(ModBlocks.ULTRAMARINE_BLOCK);
        blockWithItem(ModBlocks.ULTRAMARINE_GRATE);
        blockWithItem(ModBlocks.ULTRAMARINE_LAMP);
        blockWithItem(ModBlocks.ULTRAMARINE_ORE);

        blockWithItem(ModBlocks.ELDERKELP_STEM);

        blockItem(ModBlocks.DEPTHSTONE_STAIRS);
        blockItem(ModBlocks.POLISHED_DEPTHSTONE_STAIRS);
        blockItem(ModBlocks.DEPTHSTONE_BRICK_STAIRS);

        blockItem(ModBlocks.DEPTHSTONE_SLAB);
        blockItem(ModBlocks.POLISHED_DEPTHSTONE_SLAB);
        blockItem(ModBlocks.DEPTHSTONE_BRICK_SLAB);

        blockItem(ModBlocks.UNDERSTONE_TILE_STAIRS);
        blockItem(ModBlocks.UNDERSTONE_TILE_SLAB);
        blockItem(ModBlocks.UNDERSTONE_PILLAR);

        blockItem(ModBlocks.CARVED_ELDERKELP);
        blockWithItem(ModBlocks.ELDERKELP_PLANKS);
        blockWithItem(ModBlocks.WEATHERED_ELDERKELP_PLANKS);
        blockItem(ModBlocks.ELDERKELP_PLANK_SLAB);
        blockItem(ModBlocks.ELDERKELP_PLANK_STAIRS);
        blockItem(ModBlocks.WEATHERED_ELDERKELP_PLANK_SLAB);
        blockItem(ModBlocks.WEATHERED_ELDERKELP_PLANK_STAIRS);
        blockItem(ModBlocks.UNDERSTONE_SLAB);
        blockItem(ModBlocks.UNDERSTONE_STAIRS);
        blockItem(ModBlocks.COBBLED_UNDERSTONE_SLAB);
        blockItem(ModBlocks.COBBLED_UNDERSTONE_STAIRS);
        blockItem(ModBlocks.FITTED_UNDERSTONE_BRICK_SLAB);
        blockItem(ModBlocks.FITTED_UNDERSTONE_BRICK_STAIRS);
        blockItem(ModBlocks.WEATHERED_UNDERSTONE_BRICK_SLAB);
        blockItem(ModBlocks.WEATHERED_UNDERSTONE_BRICK_STAIRS);
        blockItem(ModBlocks.CLEAN_UNDERSTONE_BRICK_SLAB);
        blockItem(ModBlocks.CLEAN_UNDERSTONE_BRICK_STAIRS);
        blockItem(ModBlocks.CUT_DEPTHSTONE_1);
        blockItem(ModBlocks.CUT_DEPTHSTONE_2);
        blockItem(ModBlocks.CUT_DEPTHSTONE_3);
        blockItem(ModBlocks.CUT_DEPTHSTONE_4);
        blockItem(ModBlocks.CUT_DEPTHSTONE_5);
        blockItem(ModBlocks.CUT_DEPTHSTONE_6);
        blockItem(ModBlocks.DARK_DEPTHSTONE_PILLAR);
        blockItem(ModBlocks.DEPTHSTONE_PILLAR);

        blockItem(ModBlocks.CLEAN_DEPTHSTONE_BRICK_SLAB);
        blockItem(ModBlocks.DARK_DEPTHSTONE_BRICK_SLAB);
        blockItem(ModBlocks.DARK_DEPTHSTONE_MOSAIC_SLAB);
        blockItem(ModBlocks.DARK_DEPTHSTONE_TILES_SLAB);
        blockItem(ModBlocks.DEPTHSTONE_TILES_SLAB);
        blockItem(ModBlocks.WEATHERED_DEPTHSTONE_BRICK_SLAB);

        blockItem(ModBlocks.CLEAN_DEPTHSTONE_BRICK_STAIRS);
        blockItem(ModBlocks.DARK_DEPTHSTONE_BRICK_STAIRS);
        blockItem(ModBlocks.DARK_DEPTHSTONE_MOSAIC_STAIRS);
        blockItem(ModBlocks.DARK_DEPTHSTONE_TILES_STAIRS);
        blockItem(ModBlocks.DEPTHSTONE_TILES_STAIRS);
        blockItem(ModBlocks.WEATHERED_DEPTHSTONE_BRICK_STAIRS);

        stairsBlock((StairBlock) ModBlocks.UNDERSTONE_TILE_STAIRS.get(), blockTexture(ModBlocks.UNDERSTONE_TILES.get()));
        stairsBlock((StairBlock) ModBlocks.UNDERSTONE_STAIRS.get(), blockTexture(ModBlocks.UNDERSTONE.get()));
        stairsBlock((StairBlock) ModBlocks.COBBLED_UNDERSTONE_STAIRS.get(), blockTexture(ModBlocks.COBBLED_UNDERSTONE.get()));
        stairsBlock((StairBlock) ModBlocks.FITTED_UNDERSTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.FITTED_UNDERSTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.WEATHERED_UNDERSTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.WEATHERED_UNDERSTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.CLEAN_UNDERSTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.CLEAN_UNDERSTONE_BRICKS.get()));

        stairsBlock((StairBlock) ModBlocks.DEPTHSTONE_STAIRS.get(), blockTexture(ModBlocks.DEPTHSTONE.get()));
        stairsBlock((StairBlock) ModBlocks.POLISHED_DEPTHSTONE_STAIRS.get(), blockTexture(ModBlocks.POLISHED_DEPTHSTONE.get()));
        stairsBlock((StairBlock) ModBlocks.DEPTHSTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.DEPTHSTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.ELDERKELP_PLANK_STAIRS.get(), blockTexture(ModBlocks.ELDERKELP_PLANKS.get()));
        stairsBlock((StairBlock) ModBlocks.WEATHERED_ELDERKELP_PLANK_STAIRS.get(), blockTexture(ModBlocks.WEATHERED_ELDERKELP_PLANKS.get()));

        stairsBlock((StairBlock) ModBlocks.CLEAN_DEPTHSTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.CLEAN_DEPTHSTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.DARK_DEPTHSTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.DARK_DEPTHSTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.DARK_DEPTHSTONE_MOSAIC_STAIRS.get(), blockTexture(ModBlocks.DARK_DEPTHSTONE_MOSAIC.get()));
        stairsBlock((StairBlock) ModBlocks.DARK_DEPTHSTONE_TILES_STAIRS.get(), blockTexture(ModBlocks.DARK_DEPTHSTONE_TILES.get()));
        stairsBlock((StairBlock) ModBlocks.DEPTHSTONE_TILES_STAIRS.get(), blockTexture(ModBlocks.DEPTHSTONE_TILES.get()));
        stairsBlock((StairBlock) ModBlocks.WEATHERED_DEPTHSTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.WEATHERED_DEPTHSTONE_BRICKS.get()));

        slabBlock(((SlabBlock) ModBlocks.DEPTHSTONE_SLAB.get()), blockTexture(ModBlocks.DEPTHSTONE.get()), blockTexture(ModBlocks.DEPTHSTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.POLISHED_DEPTHSTONE_SLAB.get()), blockTexture(ModBlocks.POLISHED_DEPTHSTONE.get()), blockTexture(ModBlocks.POLISHED_DEPTHSTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.DEPTHSTONE_BRICK_SLAB.get()), blockTexture(ModBlocks.DEPTHSTONE_BRICKS.get()), blockTexture(ModBlocks.DEPTHSTONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.UNDERSTONE_TILE_SLAB.get()), blockTexture(ModBlocks.UNDERSTONE_TILES.get()), blockTexture(ModBlocks.UNDERSTONE_TILES.get()));
        slabBlock(((SlabBlock) ModBlocks.ELDERKELP_PLANK_SLAB.get()), blockTexture(ModBlocks.ELDERKELP_PLANKS.get()), blockTexture(ModBlocks.ELDERKELP_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.WEATHERED_ELDERKELP_PLANK_SLAB.get()), blockTexture(ModBlocks.WEATHERED_ELDERKELP_PLANKS.get()), blockTexture(ModBlocks.WEATHERED_ELDERKELP_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.UNDERSTONE_SLAB.get()), blockTexture(ModBlocks.UNDERSTONE.get()), blockTexture(ModBlocks.UNDERSTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.COBBLED_UNDERSTONE_SLAB.get()), blockTexture(ModBlocks.COBBLED_UNDERSTONE.get()), blockTexture(ModBlocks.COBBLED_UNDERSTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.FITTED_UNDERSTONE_BRICK_SLAB.get()), blockTexture(ModBlocks.FITTED_UNDERSTONE_BRICKS.get()), blockTexture(ModBlocks.FITTED_UNDERSTONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.WEATHERED_UNDERSTONE_BRICK_SLAB.get()), blockTexture(ModBlocks.WEATHERED_UNDERSTONE_BRICKS.get()), blockTexture(ModBlocks.WEATHERED_UNDERSTONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.CLEAN_UNDERSTONE_BRICK_SLAB.get()), blockTexture(ModBlocks.CLEAN_UNDERSTONE_BRICKS.get()), blockTexture(ModBlocks.CLEAN_UNDERSTONE_BRICKS.get()));

        slabBlock(((SlabBlock) ModBlocks.CLEAN_DEPTHSTONE_BRICK_SLAB.get()), blockTexture(ModBlocks.CLEAN_DEPTHSTONE_BRICKS.get()), blockTexture(ModBlocks.CLEAN_DEPTHSTONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.DARK_DEPTHSTONE_BRICK_SLAB.get()), blockTexture(ModBlocks.DARK_DEPTHSTONE_BRICKS.get()), blockTexture(ModBlocks.DARK_DEPTHSTONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.DARK_DEPTHSTONE_MOSAIC_SLAB.get()), blockTexture(ModBlocks.DARK_DEPTHSTONE_MOSAIC.get()), blockTexture(ModBlocks.DARK_DEPTHSTONE_MOSAIC.get()));
        slabBlock(((SlabBlock) ModBlocks.DARK_DEPTHSTONE_TILES_SLAB.get()), blockTexture(ModBlocks.DARK_DEPTHSTONE_TILES.get()), blockTexture(ModBlocks.DARK_DEPTHSTONE_TILES.get()));
        slabBlock(((SlabBlock) ModBlocks.DEPTHSTONE_TILES_SLAB.get()), blockTexture(ModBlocks.DEPTHSTONE_TILES.get()), blockTexture(ModBlocks.DEPTHSTONE_TILES.get()));
        slabBlock(((SlabBlock) ModBlocks.WEATHERED_DEPTHSTONE_BRICK_SLAB.get()), blockTexture(ModBlocks.WEATHERED_DEPTHSTONE_BRICKS.get()), blockTexture(ModBlocks.WEATHERED_DEPTHSTONE_BRICKS.get()));


        axisBlock((RotatedPillarBlock) ModBlocks.UNDERSTONE_PILLAR.get(), blockTexture(ModBlocks.UNDERSTONE_PILLAR.get()), new ResourceLocation(TheDeepMod.MOD_ID, "block/understone_pillar_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.CARVED_ELDERKELP.get(), blockTexture(ModBlocks.CARVED_ELDERKELP.get()), new ResourceLocation(TheDeepMod.MOD_ID, "block/carved_elderkelp_top"));

        axisBlock((RotatedPillarBlock) ModBlocks.DARK_DEPTHSTONE_PILLAR.get(), blockTexture(ModBlocks.DARK_DEPTHSTONE_PILLAR.get()), new ResourceLocation(TheDeepMod.MOD_ID, "block/dark_depthstone_pillar_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.DEPTHSTONE_PILLAR.get(), blockTexture(ModBlocks.DEPTHSTONE_PILLAR.get()), new ResourceLocation(TheDeepMod.MOD_ID, "block/depthstone_pillar_top"));

        glazedTerracottaBlock(ModBlocks.CUT_DEPTHSTONE_1.get(), "cut_depthstone_1");
        glazedTerracottaBlock(ModBlocks.CUT_DEPTHSTONE_2.get(), "cut_depthstone_2");
        glazedTerracottaBlock(ModBlocks.CUT_DEPTHSTONE_3.get(), "cut_depthstone_3");
        glazedTerracottaBlock(ModBlocks.CUT_DEPTHSTONE_4.get(), "cut_depthstone_4");
        glazedTerracottaBlock(ModBlocks.CUT_DEPTHSTONE_5.get(), "cut_depthstone_5");
        glazedTerracottaBlock(ModBlocks.CUT_DEPTHSTONE_6.get(), "cut_depthstone_6");

        wallBlock((WallBlock) ModBlocks.WEATHERED_UNDERSTONE_BRICK_WALL.get(), blockTexture(ModBlocks.WEATHERED_UNDERSTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.CLEAN_UNDERSTONE_BRICK_WALL.get(), blockTexture(ModBlocks.CLEAN_UNDERSTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.FITTED_UNDERSTONE_BRICK_WALL.get(), blockTexture(ModBlocks.FITTED_UNDERSTONE_BRICKS.get()));

        wallBlock((WallBlock) ModBlocks.WEATHERED_DEPTHSTONE_BRICK_WALL.get(), blockTexture(ModBlocks.WEATHERED_DEPTHSTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.CLEAN_DEPTHSTONE_BRICK_WALL.get(), blockTexture(ModBlocks.CLEAN_DEPTHSTONE_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.DEPTHSTONE_BRICK_WALL.get(), blockTexture(ModBlocks.DEPTHSTONE_BRICKS.get()));

        doorBlockWithRenderType((DoorBlock) ModBlocks.ELDERKELP_DOOR.get(), modLoc("block/elderkelp_door_bottom"), modLoc("block/elderkelp_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.ELDERKELP_TRAPDOOR.get(), modLoc("block/elderkelp_trapdoor"), true, "cutout");
        //trapdoorBlock((TrapDoorBlock) ModBlocks.ELDERKELP_TRAPDOOR.get(), modLoc("block/elderkelp_trapdoor"), true);
        blockItem(ModBlocks.ELDERKELP_TRAPDOOR, "_bottom");
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("thedeep:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("thedeep:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void glazedTerracottaBlock(Block block, String name) {
        ModelFile model = models().cubeAll(name, new ResourceLocation(TheDeepMod.MOD_ID, "block/" + name));
        getVariantBuilder(block)
                .partialState().with(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH).modelForState().modelFile(model).addModel()
                .partialState().with(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST).modelForState().modelFile(model).rotationY(90).addModel()
                .partialState().with(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH).modelForState().modelFile(model).rotationY(180).addModel()
                .partialState().with(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST).modelForState().modelFile(model).rotationY(270).addModel();
    }
}
