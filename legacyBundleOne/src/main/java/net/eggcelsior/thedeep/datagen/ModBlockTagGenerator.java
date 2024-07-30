package net.eggcelsior.thedeep.datagen;

import net.eggcelsior.thedeep.TheDeepMod;
import net.eggcelsior.thedeep.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
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
                        ModBlocks.WEATHERED_UNDERSTONE_BRICKS.get());

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
                        ModBlocks.UNDERSTONE_PILLAR.get());
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
