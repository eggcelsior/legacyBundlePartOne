package net.eggcelsior.thedeep.datagen;

import net.eggcelsior.thedeep.TheDeepMod;
import net.eggcelsior.thedeep.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TheDeepMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.DEPTHSTONE.get(),
                        ModBlocks.DEPTHSTONE_BRICKS.get(),
                        ModBlocks.CHISELED_DEPTHSTONE.get(),
                        ModBlocks.POLISHED_DEPTHSTONE.get(),
                        ModBlocks.DEPTHSTONE_STAIRS.get(),
                        ModBlocks.POLISHED_DEPTHSTONE_STAIRS.get(),
                        ModBlocks.DEPTHSTONE_BRICK_STAIRS.get(),
                        ModBlocks.DEPTHSTONE_SLAB.get(),
                        ModBlocks.POLISHED_DEPTHSTONE_SLAB.get(),
                        ModBlocks.DEPTHSTONE_BRICK_SLAB.get(),
                        ModBlocks.UNDERSTONE.get(),
                        ModBlocks.UNDERSTONE_PILLAR.get(),
                        ModBlocks.COBBLED_UNDERSTONE.get(),
                        ModBlocks.FITTED_UNDERSTONE_BRICKS.get(),
                        ModBlocks.UNDERSTONE_TILES.get(),
                        ModBlocks.WEATHERED_UNDERSTONE_BRICKS.get(),
                        ModBlocks.WEATHERED_UNDERSTONE_BRICKS.get(),
                        ModBlocks.UNDERSTONE_TILE_STAIRS.get(),
                        ModBlocks.UNDERSTONE_TILE_SLAB.get(),
                        ModBlocks.ULTRAMARINE_BLOCK.get(),
                        ModBlocks.ULTRAMARINE_GRATE.get(),
                        ModBlocks.CLEAN_UNDERSTONE_BRICKS.get(),
                        ModBlocks.COBBLED_DEPTHSTONE.get(),
                        ModBlocks.CHISELED_UNDERSTONE_1.get(),
                        ModBlocks.CHISELED_UNDERSTONE_2.get(),
                        ModBlocks.CHISELED_UNDERSTONE_3.get(),
                        ModBlocks.CHISELED_UNDERSTONE_4.get(),
                        ModBlocks.CHISELED_UNDERSTONE_5.get(),
                        ModBlocks.CHISELED_UNDERSTONE_6.get(),
                        ModBlocks.CHISELED_UNDERSTONE_7.get(),
                        ModBlocks.ULTRAMARINE_LAMP.get(),
                        ModBlocks.UNDERSTONE_SLAB.get(),
                        ModBlocks.UNDERSTONE_STAIRS.get(),
                        ModBlocks.COBBLED_UNDERSTONE_SLAB.get(),
                        ModBlocks.COBBLED_UNDERSTONE_STAIRS.get(),
                        ModBlocks.FITTED_UNDERSTONE_BRICK_SLAB.get(),
                        ModBlocks.FITTED_UNDERSTONE_BRICK_STAIRS.get(),
                        ModBlocks.WEATHERED_UNDERSTONE_BRICK_SLAB.get(),
                        ModBlocks.WEATHERED_UNDERSTONE_BRICK_STAIRS.get(),
                        ModBlocks.CLEAN_UNDERSTONE_BRICK_SLAB.get(),
                        ModBlocks.CLEAN_UNDERSTONE_BRICK_STAIRS.get(),
                        ModBlocks.ULTRAMARINE_ORE.get(),
                        ModBlocks.CHISELED_DEPTHSTONE_1.get(),
                        ModBlocks.CHISELED_DEPTHSTONE_2.get(),
                        ModBlocks.CHISELED_DEPTHSTONE_3.get(),
                        ModBlocks.CUT_DEPTHSTONE_1.get(),
                        ModBlocks.CUT_DEPTHSTONE_2.get(),
                        ModBlocks.CUT_DEPTHSTONE_3.get(),
                        ModBlocks.CUT_DEPTHSTONE_4.get(),
                        ModBlocks.CUT_DEPTHSTONE_5.get(),
                        ModBlocks.CUT_DEPTHSTONE_6.get(),
                        ModBlocks.CLEAN_DEPTHSTONE_BRICKS.get(),
                        ModBlocks.DARK_DEPTHSTONE_BRICKS.get(),
                        ModBlocks.DARK_DEPTHSTONE_MOSAIC.get(),
                        ModBlocks.DARK_DEPTHSTONE_TILES.get(),
                        ModBlocks.DEPTHSTONE_TILES.get(),
                        ModBlocks.WEATHERED_DEPTHSTONE_BRICKS.get(),
                        ModBlocks.DARK_DEPTHSTONE_PILLAR.get(),
                        ModBlocks.DEPTHSTONE_PILLAR.get(),
                        ModBlocks.CLEAN_DEPTHSTONE_BRICK_SLAB.get(),
                        ModBlocks.DARK_DEPTHSTONE_BRICK_SLAB.get(),
                        ModBlocks.DARK_DEPTHSTONE_MOSAIC_SLAB.get(),
                        ModBlocks.DARK_DEPTHSTONE_TILES_SLAB.get(),
                        ModBlocks.DEPTHSTONE_TILES_SLAB.get(),
                        ModBlocks.WEATHERED_DEPTHSTONE_BRICK_SLAB.get(),
                        ModBlocks.CLEAN_DEPTHSTONE_BRICK_STAIRS.get(),
                        ModBlocks.DARK_DEPTHSTONE_BRICK_STAIRS.get(),
                        ModBlocks.DARK_DEPTHSTONE_MOSAIC_STAIRS.get(),
                        ModBlocks.DARK_DEPTHSTONE_TILES_STAIRS.get(),
                        ModBlocks.DEPTHSTONE_TILES_STAIRS.get(),
                        ModBlocks.WEATHERED_DEPTHSTONE_BRICK_STAIRS.get());

        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.ELDERKELP_STEM.get(),
                        ModBlocks.CARVED_ELDERKELP.get(),
                        ModBlocks.ELDERKELP_PLANKS.get(),
                        ModBlocks.WEATHERED_ELDERKELP_PLANKS.get(),
                        ModBlocks.ELDERKELP_PLANK_STAIRS.get(),
                        ModBlocks.ELDERKELP_PLANK_SLAB.get(),
                        ModBlocks.WEATHERED_ELDERKELP_PLANK_STAIRS.get(),
                        ModBlocks.WEATHERED_ELDERKELP_PLANK_SLAB.get(),
                        ModBlocks.ELDERKELP_DOOR.get(),
                        ModBlocks.ELDERKELP_TRAPDOOR.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.DEPTHSTONE.get(),
                        ModBlocks.DEPTHSTONE_BRICKS.get(),
                        ModBlocks.CHISELED_DEPTHSTONE.get(),
                        ModBlocks.POLISHED_DEPTHSTONE.get(),
                        ModBlocks.DEPTHSTONE_STAIRS.get(),
                        ModBlocks.POLISHED_DEPTHSTONE_STAIRS.get(),
                        ModBlocks.DEPTHSTONE_BRICK_STAIRS.get(),
                        ModBlocks.DEPTHSTONE_SLAB.get(),
                        ModBlocks.POLISHED_DEPTHSTONE_SLAB.get(),
                        ModBlocks.DEPTHSTONE_BRICK_SLAB.get(),
                        ModBlocks.UNDERSTONE.get(),
                        ModBlocks.UNDERSTONE_PILLAR.get(),
                        ModBlocks.UNDERSTONE_PILLAR.get(),
                        ModBlocks.UNDERSTONE_TILE_STAIRS.get(),
                        ModBlocks.UNDERSTONE_TILE_SLAB.get(),
                        ModBlocks.ULTRAMARINE_BLOCK.get(),
                        ModBlocks.ULTRAMARINE_GRATE.get(),
                        ModBlocks.CLEAN_UNDERSTONE_BRICKS.get(),
                        ModBlocks.COBBLED_DEPTHSTONE.get(),
                        ModBlocks.CHISELED_UNDERSTONE_1.get(),
                        ModBlocks.CHISELED_UNDERSTONE_2.get(),
                        ModBlocks.CHISELED_UNDERSTONE_3.get(),
                        ModBlocks.CHISELED_UNDERSTONE_4.get(),
                        ModBlocks.CHISELED_UNDERSTONE_5.get(),
                        ModBlocks.CHISELED_UNDERSTONE_6.get(),
                        ModBlocks.CHISELED_UNDERSTONE_7.get(),
                        ModBlocks.ULTRAMARINE_LAMP.get(),
                        ModBlocks.ELDERKELP_STEM.get(),
                        ModBlocks.CARVED_ELDERKELP.get(),
                        ModBlocks.ELDERKELP_PLANKS.get(),
                        ModBlocks.WEATHERED_ELDERKELP_PLANKS.get(),
                        ModBlocks.ELDERKELP_PLANK_STAIRS.get(),
                        ModBlocks.ELDERKELP_PLANK_SLAB.get(),
                        ModBlocks.WEATHERED_ELDERKELP_PLANK_STAIRS.get(),
                        ModBlocks.WEATHERED_ELDERKELP_PLANK_SLAB.get(),
                        ModBlocks.UNDERSTONE_SLAB.get(),
                        ModBlocks.UNDERSTONE_STAIRS.get(),
                        ModBlocks.COBBLED_UNDERSTONE_SLAB.get(),
                        ModBlocks.COBBLED_UNDERSTONE_STAIRS.get(),
                        ModBlocks.FITTED_UNDERSTONE_BRICK_SLAB.get(),
                        ModBlocks.FITTED_UNDERSTONE_BRICK_STAIRS.get(),
                        ModBlocks.WEATHERED_UNDERSTONE_BRICK_SLAB.get(),
                        ModBlocks.WEATHERED_UNDERSTONE_BRICK_STAIRS.get(),
                        ModBlocks.CLEAN_UNDERSTONE_BRICK_SLAB.get(),
                        ModBlocks.CLEAN_UNDERSTONE_BRICK_STAIRS.get(),
                        ModBlocks.ELDERKELP_DOOR.get(),
                        ModBlocks.ELDERKELP_TRAPDOOR.get(),
                        ModBlocks.ULTRAMARINE_ORE.get(),
                        ModBlocks.CHISELED_DEPTHSTONE_1.get(),
                        ModBlocks.CHISELED_DEPTHSTONE_2.get(),
                        ModBlocks.CHISELED_DEPTHSTONE_3.get(),
                        ModBlocks.CUT_DEPTHSTONE_1.get(),
                        ModBlocks.CUT_DEPTHSTONE_2.get(),
                        ModBlocks.CUT_DEPTHSTONE_3.get(),
                        ModBlocks.CUT_DEPTHSTONE_4.get(),
                        ModBlocks.CUT_DEPTHSTONE_5.get(),
                        ModBlocks.CUT_DEPTHSTONE_6.get(),
                        ModBlocks.CLEAN_DEPTHSTONE_BRICKS.get(),
                        ModBlocks.DARK_DEPTHSTONE_BRICKS.get(),
                        ModBlocks.DARK_DEPTHSTONE_MOSAIC.get(),
                        ModBlocks.DARK_DEPTHSTONE_TILES.get(),
                        ModBlocks.DEPTHSTONE_TILES.get(),
                        ModBlocks.WEATHERED_DEPTHSTONE_BRICKS.get(),
                        ModBlocks.DARK_DEPTHSTONE_PILLAR.get(),
                        ModBlocks.DEPTHSTONE_PILLAR.get(),
                        ModBlocks.CLEAN_DEPTHSTONE_BRICK_SLAB.get(),
                        ModBlocks.DARK_DEPTHSTONE_BRICK_SLAB.get(),
                        ModBlocks.DARK_DEPTHSTONE_MOSAIC_SLAB.get(),
                        ModBlocks.DARK_DEPTHSTONE_TILES_SLAB.get(),
                        ModBlocks.DEPTHSTONE_TILES_SLAB.get(),
                        ModBlocks.WEATHERED_DEPTHSTONE_BRICK_SLAB.get(),
                        ModBlocks.CLEAN_DEPTHSTONE_BRICK_STAIRS.get(),
                        ModBlocks.DARK_DEPTHSTONE_BRICK_STAIRS.get(),
                        ModBlocks.DARK_DEPTHSTONE_MOSAIC_STAIRS.get(),
                        ModBlocks.DARK_DEPTHSTONE_TILES_STAIRS.get(),
                        ModBlocks.DEPTHSTONE_TILES_STAIRS.get(),
                        ModBlocks.WEATHERED_DEPTHSTONE_BRICK_STAIRS.get());
        /*this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlocks.ALEXANDRITE_ORE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ALEXANDRITE_BLOCK.get(),
                        ModBlocks.RAW_ALEXANDRITE_BLOCK.get(),
                        ModBlocks.ALEXANDRITE_ORE.get(),
                        ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get(),
                        ModBlocks.END_STONE_ALEXANDRITE_ORE.get(),
                        ModBlocks.NETHER_ALEXANDRITE_ORE.get(),
                        ModBlocks.SOUND_BLOCK.get(),
                        ModBlocks.ALEXANDRITE_STAIRS.get(),
                        ModBlocks.ALEXANDRITE_SLAB.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ALEXANDRITE_BLOCK.get(),
                        ModBlocks.RAW_ALEXANDRITE_BLOCK.get(),
                        ModBlocks.ALEXANDRITE_ORE.get(),
                        ModBlocks.SOUND_BLOCK.get(),
                        ModBlocks.ALEXANDRITE_STAIRS.get(),
                        ModBlocks.ALEXANDRITE_SLAB.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get(),
                        ModBlocks.END_STONE_ALEXANDRITE_ORE.get());

        this.tag(ModTags.Blocks.NEEDS_ALEXANDRITE_TOOL)
                .add(ModBlocks.NETHER_ALEXANDRITE_ORE.get());

        this.tag(ModTags.Blocks.PAXEL_MINEABLE)
                .addTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .addTag(BlockTags.MINEABLE_WITH_AXE)
                .addTag(BlockTags.MINEABLE_WITH_SHOVEL);


        this.tag(BlockTags.FENCES)
                .add(ModBlocks.ALEXANDRITE_FENCE.get());
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.ALEXANDRITE_WALL.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.ALEXANDRITE_FENCE_GATE.get());*/
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}
