package com.natashapetrenko.facebookrecipes.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by petrenkonv on 28.10.2017.
 */

public class RecipeClient {
    private Retrofit retrofit;
    private static final String BASE_URL = "http://food2fork.com/api/";

    public RecipeClient() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public RecipeService getRecipeService() {
        return this.retrofit.create(RecipeService.class);
    }
}
