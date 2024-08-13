package net.eggcelsior.thedeep.datagen;

import net.eggcelsior.thedeep.TheDeepMod;
import net.eggcelsior.thedeep.block.ModBlocks;
import net.eggcelsior.thedeep.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    private static final List<ItemLike> ULTRAMARINE_SMELTABLES = List.of(ModItems.RAW_ULTRAMARINE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        stonecutterResultFromBase(pWriter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.UNDERSTONE_TILE_SLAB.get(), ModBlocks.UNDERSTONE.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.UNDERSTONE_TILE_STAIRS.get(), ModBlocks.UNDERSTONE.get(), 6);
        stonecutterResultFromBase(pWriter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.UNDERSTONE_TILE_SLAB.get(), ModBlocks.UNDERSTONE_TILES.get(), 2);
        stonecutterResultFromBase(pWriter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.UNDERSTONE_TILE_STAIRS.get(), ModBlocks.UNDERSTONE_TILES.get(), 6);
        stonecutterResultFromBase(pWriter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.UNDERSTONE_TILES.get(), ModBlocks.UNDERSTONE.get(), 1);

        oreSmelting(pWriter, ULTRAMARINE_SMELTABLES, RecipeCategory.MISC, Items.NETHERITE_INGOT, 0.25f, 200, "ultramarine");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ELDERKELP_PLANKS.get(), 4).requires(ModBlocks.ELDERKELP_STEM.get())
                .unlockedBy("has_elderkelp_stem", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ELDERKELP_STEM.get()).build()))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer,
                                     List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime,
                    pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, TheDeepMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

}
