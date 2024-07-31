package net.eggcelsior.thedeep.item;

import net.eggcelsior.thedeep.TheDeepMod;
import net.eggcelsior.thedeep.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheDeepMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DEEP_TAB = CREATIVE_MODE_TABS.register("thedeep",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.KELP))
                    .title(Component.translatable("creativetab.thedeep"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModBlocks.DEPTHSTONE.get());
                        output.accept(ModBlocks.DEPTHSTONE_BRICKS.get());
                        output.accept(ModBlocks.CHISELED_DEPTHSTONE.get());
                        output.accept(ModBlocks.POLISHED_DEPTHSTONE.get());
                        output.accept(ModBlocks.COBBLED_DEPTHSTONE.get());

                        output.accept(ModBlocks.DEPTHSTONE_STAIRS.get());
                        output.accept(ModBlocks.POLISHED_DEPTHSTONE_STAIRS.get());
                        output.accept(ModBlocks.DEPTHSTONE_BRICK_STAIRS.get());

                        output.accept(ModBlocks.DEPTHSTONE_SLAB.get());
                        output.accept(ModBlocks.POLISHED_DEPTHSTONE_SLAB.get());
                        output.accept(ModBlocks.DEPTHSTONE_BRICK_SLAB.get());
                        output.accept(ModBlocks.UNDERSTONE.get());
                        output.accept(ModBlocks.UNDERSTONE_PILLAR.get());
                        output.accept(ModBlocks.COBBLED_UNDERSTONE.get());
                        output.accept(ModBlocks.FITTED_UNDERSTONE_BRICKS.get());
                        output.accept(ModBlocks.UNDERSTONE_TILES.get());
                        output.accept(ModBlocks.WEATHERED_UNDERSTONE_BRICKS.get());
                        output.accept(ModBlocks.UNDERSTONE_TILE_STAIRS.get());
                        output.accept(ModBlocks.UNDERSTONE_TILE_SLAB.get());
                        output.accept(ModBlocks.CLEAN_UNDERSTONE_BRICKS.get());

                        output.accept(ModBlocks.CHISELED_UNDERSTONE_1.get());
                        output.accept(ModBlocks.CHISELED_UNDERSTONE_2.get());
                        output.accept(ModBlocks.CHISELED_UNDERSTONE_3.get());
                        output.accept(ModBlocks.CHISELED_UNDERSTONE_4.get());
                        output.accept(ModBlocks.CHISELED_UNDERSTONE_5.get());
                        output.accept(ModBlocks.CHISELED_UNDERSTONE_6.get());
                        output.accept(ModBlocks.CHISELED_UNDERSTONE_7.get());

                        output.accept(ModBlocks.CHISELED_ULTRAMARINE.get());
                        output.accept(ModBlocks.ULTRAMARINE_BLOCK.get());
                        output.accept(ModBlocks.ULTRAMARINE_GRATE.get());
                        output.accept(ModBlocks.ULTRAMARINE_LAMP.get());

                        output.accept(ModBlocks.ELDERKELP_STEM.get());
                        output.accept(ModBlocks.CARVED_ELDERKELP.get());
                        output.accept(ModBlocks.ELDERKELP_PLANKS.get());
                        output.accept(ModBlocks.ELDERKELP_PLANK_STAIRS.get());
                        output.accept(ModBlocks.ELDERKELP_PLANK_SLABS.get());
                        output.accept(ModBlocks.WEATHERED_ELDERKELP_PLANKS.get());
                        output.accept(ModBlocks.WEATHERED_ELDERKELP_PLANK_STAIRS.get());
                        output.accept(ModBlocks.WEATHERED_ELDERKELP_PLANK_SLABS.get());
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
