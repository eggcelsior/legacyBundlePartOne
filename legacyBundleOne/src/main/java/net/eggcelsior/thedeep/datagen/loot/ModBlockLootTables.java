package net.eggcelsior.thedeep.datagen.loot;

import net.eggcelsior.thedeep.block.ModBlocks;
import net.eggcelsior.thedeep.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropOther(ModBlocks.DEPTHSTONE.get(), ModBlocks.COBBLED_DEPTHSTONE.get());
        //this.dropOther(ModBlocks.ULTRAMARINE_ORE.get(), ModBlocks.COBBLED_UNDERSTONE.get());

        this.dropSelf(ModBlocks.DEPTHSTONE_BRICKS.get());
        this.dropSelf(ModBlocks.POLISHED_DEPTHSTONE.get());
        this.dropSelf(ModBlocks.CHISELED_DEPTHSTONE.get());
        this.dropSelf(ModBlocks.CHISELED_DEPTHSTONE_1.get());
        this.dropSelf(ModBlocks.CHISELED_DEPTHSTONE_2.get());
        this.dropSelf(ModBlocks.CHISELED_DEPTHSTONE_3.get());
        this.dropSelf(ModBlocks.CUT_DEPTHSTONE_1.get());
        this.dropSelf(ModBlocks.CUT_DEPTHSTONE_2.get());
        this.dropSelf(ModBlocks.CUT_DEPTHSTONE_3.get());
        this.dropSelf(ModBlocks.CUT_DEPTHSTONE_4.get());
        this.dropSelf(ModBlocks.CUT_DEPTHSTONE_5.get());
        this.dropSelf(ModBlocks.CUT_DEPTHSTONE_6.get());

        this.dropSelf(ModBlocks.CLEAN_DEPTHSTONE_BRICKS.get());
        this.dropSelf(ModBlocks.DARK_DEPTHSTONE_BRICKS.get());
        this.dropSelf(ModBlocks.DARK_DEPTHSTONE_MOSAIC.get());
        this.dropSelf(ModBlocks.DARK_DEPTHSTONE_TILES.get());
        this.dropSelf(ModBlocks.DEPTHSTONE_TILES.get());
        this.dropSelf(ModBlocks.WEATHERED_DEPTHSTONE_BRICKS.get());
        this.dropSelf(ModBlocks.DARK_DEPTHSTONE_PILLAR.get());
        this.dropSelf(ModBlocks.DEPTHSTONE_PILLAR.get());

        this.dropSelf(ModBlocks.CLEAN_DEPTHSTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.DARK_DEPTHSTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.DARK_DEPTHSTONE_MOSAIC_STAIRS.get());
        this.dropSelf(ModBlocks.DARK_DEPTHSTONE_TILES_STAIRS.get());
        this.dropSelf(ModBlocks.DEPTHSTONE_TILES_STAIRS.get());
        this.dropSelf(ModBlocks.WEATHERED_DEPTHSTONE_BRICK_STAIRS.get());

        this.dropSelf(ModBlocks.DEPTHSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.DEPTHSTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_DEPTHSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.COBBLED_DEPTHSTONE.get());

        this.dropOther(ModBlocks.UNDERSTONE.get(), ModBlocks.COBBLED_UNDERSTONE.get());
        this.dropSelf(ModBlocks.UNDERSTONE_PILLAR.get());
        this.dropSelf(ModBlocks.COBBLED_UNDERSTONE.get());
        this.dropSelf(ModBlocks.FITTED_UNDERSTONE_BRICKS.get());
        this.dropSelf(ModBlocks.UNDERSTONE_TILES.get());
        this.dropSelf(ModBlocks.UNDERSTONE_TILE_STAIRS.get());
        this.dropSelf(ModBlocks.WEATHERED_UNDERSTONE_BRICKS.get());
        this.dropSelf(ModBlocks.CLEAN_UNDERSTONE_BRICKS.get());
        this.dropSelf(ModBlocks.UNDERSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.COBBLED_UNDERSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.FITTED_UNDERSTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.WEATHERED_UNDERSTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.CLEAN_UNDERSTONE_BRICK_STAIRS.get());

        this.dropSelf(ModBlocks.CHISELED_ULTRAMARINE.get());
        this.dropSelf(ModBlocks.ULTRAMARINE_BLOCK.get());
        this.dropSelf(ModBlocks.ULTRAMARINE_GRATE.get());
        this.dropSelf(ModBlocks.ULTRAMARINE_LAMP.get());

        this.dropSelf(ModBlocks.CHISELED_UNDERSTONE_1.get());
        this.dropSelf(ModBlocks.CHISELED_UNDERSTONE_2.get());
        this.dropSelf(ModBlocks.CHISELED_UNDERSTONE_3.get());
        this.dropSelf(ModBlocks.CHISELED_UNDERSTONE_4.get());
        this.dropSelf(ModBlocks.CHISELED_UNDERSTONE_5.get());
        this.dropSelf(ModBlocks.CHISELED_UNDERSTONE_6.get());
        this.dropSelf(ModBlocks.CHISELED_UNDERSTONE_7.get());

        this.dropSelf(ModBlocks.ELDERKELP_STEM.get());
        this.dropSelf(ModBlocks.CARVED_ELDERKELP.get());
        this.dropSelf(ModBlocks.ELDERKELP_PLANKS.get());
        this.dropSelf(ModBlocks.WEATHERED_ELDERKELP_PLANKS.get());
        this.dropSelf(ModBlocks.ELDERKELP_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.WEATHERED_ELDERKELP_PLANK_STAIRS.get());
        this.dropSelf(ModBlocks.ELDERKELP_TRAPDOOR.get());

        this.dropSelf(ModBlocks.EXOTIC_SCULK.get());

        this.dropSelf(ModBlocks.BLOOD_ALGAE_FROND.get());
        this.dropSelf(ModBlocks.BLOOD_ALGAE_STEM.get());
        this.dropSelf(ModBlocks.CARVED_SANGUINE_PILLAR.get());
        this.dropSelf(ModBlocks.CARVED_SANGUINE_PLANKS.get());
        this.dropSelf(ModBlocks.SANGUINE_PLANKS.get());

        this.dropSelf(ModBlocks.WEATHERED_UNDERSTONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CLEAN_UNDERSTONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.FITTED_UNDERSTONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.WEATHERED_DEPTHSTONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CLEAN_DEPTHSTONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.DEPTHSTONE_BRICK_WALL.get());

        this.add(ModBlocks.ELDERKELP_DOOR.get(),
                block -> createDoorTable(ModBlocks.ELDERKELP_DOOR.get()));

        this.add(ModBlocks.ELDERKELP_PLANK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ELDERKELP_PLANK_SLAB.get()));
        this.add(ModBlocks.WEATHERED_ELDERKELP_PLANK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WEATHERED_ELDERKELP_PLANK_SLAB.get()));

        this.add(ModBlocks.DEPTHSTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DEPTHSTONE_SLAB.get()));
        this.add(ModBlocks.POLISHED_DEPTHSTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_DEPTHSTONE_SLAB.get()));
        this.add(ModBlocks.DEPTHSTONE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DEPTHSTONE_BRICK_SLAB.get()));
        this.add(ModBlocks.UNDERSTONE_TILE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.UNDERSTONE_TILE_SLAB.get()));
        this.add(ModBlocks.UNDERSTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.UNDERSTONE_SLAB.get()));
        this.add(ModBlocks.COBBLED_UNDERSTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.COBBLED_UNDERSTONE_SLAB.get()));
        this.add(ModBlocks.FITTED_UNDERSTONE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.FITTED_UNDERSTONE_BRICK_SLAB.get()));
        this.add(ModBlocks.WEATHERED_UNDERSTONE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WEATHERED_UNDERSTONE_BRICK_SLAB.get()));
        this.add(ModBlocks.CLEAN_UNDERSTONE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CLEAN_UNDERSTONE_BRICK_SLAB.get()));
        this.add(ModBlocks.ULTRAMARINE_ORE.get(),
                block -> createOreDrop(ModBlocks.ULTRAMARINE_ORE.get(), ModItems.RAW_ULTRAMARINE.get()));

        this.add(ModBlocks.DARK_DEPTHSTONE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DARK_DEPTHSTONE_BRICK_SLAB.get()));
        this.add(ModBlocks.CLEAN_DEPTHSTONE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CLEAN_DEPTHSTONE_BRICK_SLAB.get()));
        this.add(ModBlocks.DARK_DEPTHSTONE_MOSAIC_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DARK_DEPTHSTONE_MOSAIC_SLAB.get()));
        this.add(ModBlocks.DARK_DEPTHSTONE_TILES_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DARK_DEPTHSTONE_TILES_SLAB.get()));
        this.add(ModBlocks.DEPTHSTONE_TILES_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DEPTHSTONE_TILES_SLAB.get()));
        this.add(ModBlocks.WEATHERED_DEPTHSTONE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WEATHERED_DEPTHSTONE_BRICK_SLAB.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
