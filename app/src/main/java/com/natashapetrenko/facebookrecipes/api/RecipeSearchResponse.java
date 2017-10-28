package com.natashapetrenko.facebookrecipes.api;

import com.natashapetrenko.facebookrecipes.entities.Recipe;

import java.util.List;

/**
 * Created by petrenkonv on 28.10.2017.
 */

class RecipeSearchResponse {
    private int count;
    private List<Recipe> recipes;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    public Recipe getFirstRecipe() {
        Recipe recipe = null;
        if (!recipes.isEmpty()) {
            recipe = recipes.get(0);
        }
        return recipe;
    }
}
