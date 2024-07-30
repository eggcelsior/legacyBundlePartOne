package net.eggcelsior.thedeep.datagen;

import net.eggcelsior.thedeep.TheDeepMod;
import net.eggcelsior.thedeep.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

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

        stairsBlock((StairBlock) ModBlocks.UNDERSTONE_TILE_STAIRS.get(), blockTexture(ModBlocks.UNDERSTONE_TILES.get()));

        stairsBlock((StairBlock) ModBlocks.DEPTHSTONE_STAIRS.get(), blockTexture(ModBlocks.DEPTHSTONE.get()));
        stairsBlock((StairBlock) ModBlocks.POLISHED_DEPTHSTONE_STAIRS.get(), blockTexture(ModBlocks.POLISHED_DEPTHSTONE.get()));
        stairsBlock((StairBlock) ModBlocks.DEPTHSTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.DEPTHSTONE_BRICKS.get()));

        slabBlock(((SlabBlock) ModBlocks.DEPTHSTONE_SLAB.get()), blockTexture(ModBlocks.DEPTHSTONE.get()), blockTexture(ModBlocks.DEPTHSTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.POLISHED_DEPTHSTONE_SLAB.get()), blockTexture(ModBlocks.POLISHED_DEPTHSTONE.get()), blockTexture(ModBlocks.POLISHED_DEPTHSTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.DEPTHSTONE_BRICK_SLAB.get()), blockTexture(ModBlocks.DEPTHSTONE_BRICKS.get()), blockTexture(ModBlocks.DEPTHSTONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.UNDERSTONE_TILE_SLAB.get()), blockTexture(ModBlocks.UNDERSTONE_TILES.get()), blockTexture(ModBlocks.UNDERSTONE_TILES.get()));

        blockItem(ModBlocks.DEPTHSTONE_STAIRS);
        blockItem(ModBlocks.POLISHED_DEPTHSTONE_STAIRS);
        blockItem(ModBlocks.DEPTHSTONE_BRICK_STAIRS);

        blockItem(ModBlocks.DEPTHSTONE_SLAB);
        blockItem(ModBlocks.POLISHED_DEPTHSTONE_SLAB);
        blockItem(ModBlocks.DEPTHSTONE_BRICK_SLAB);

        blockItem(ModBlocks.UNDERSTONE_TILE_STAIRS);
        blockItem(ModBlocks.UNDERSTONE_TILE_SLAB);
        blockItem(ModBlocks.UNDERSTONE_PILLAR);

        axisBlock((RotatedPillarBlock) ModBlocks.UNDERSTONE_PILLAR.get(), blockTexture(ModBlocks.UNDERSTONE_PILLAR.get()), new ResourceLocation(TheDeepMod.MOD_ID, "block/understone_pillar_top"));
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
}
