package net.eggcelsior.thedeep.datagen.loot;

import net.eggcelsior.thedeep.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.DEPTHSTONE.get());
        this.dropSelf(ModBlocks.DEPTHSTONE_BRICKS.get());
        this.dropSelf(ModBlocks.POLISHED_DEPTHSTONE.get());
        this.dropSelf(ModBlocks.CHISELED_DEPTHSTONE.get());

        this.dropSelf(ModBlocks.DEPTHSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.DEPTHSTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_DEPTHSTONE_STAIRS.get());

        this.dropSelf(ModBlocks.UNDERSTONE.get());
        this.dropSelf(ModBlocks.UNDERSTONE_PILLAR.get());
        this.dropSelf(ModBlocks.COBBLED_UNDERSTONE.get());
        this.dropSelf(ModBlocks.FITTED_UNDERSTONE_BRICKS.get());
        this.dropSelf(ModBlocks.UNDERSTONE_TILES.get());
        this.dropSelf(ModBlocks.WEATHERED_UNDERSTONE_BRICKS.get());
        this.dropSelf(ModBlocks.UNDERSTONE_TILE_STAIRS.get());

        this.add(ModBlocks.DEPTHSTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DEPTHSTONE_SLAB.get()));
        this.add(ModBlocks.POLISHED_DEPTHSTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_DEPTHSTONE_SLAB.get()));
        this.add(ModBlocks.DEPTHSTONE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DEPTHSTONE_BRICK_SLAB.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
