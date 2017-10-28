package com.natashapetrenko.facebookrecipes.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by petrenkonv on 28.10.2017.
 */

public interface RecipeService {

    @GET("search")
    Call<RecipeSearchResponse> searchRecipes(@Query("key") String key,
                                             @Query("sort") String sort,
                                             @Query("count") int count,
                                             @Query("page") int page);
 }
