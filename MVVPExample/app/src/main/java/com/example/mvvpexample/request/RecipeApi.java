package com.example.mvvpexample.request;

import com.example.mvvpexample.request.responses.RecipeDetails;
import com.example.mvvpexample.request.responses.SearchRecipes;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RecipeApi {

    //Search API
    @GET("api/search")
    Call<SearchRecipes> getSearchRecipese(
            @Query("key") String key,
            @Query("q") String query,
            @Query("page") String page

    );

    // Get recepie detail API‰
    @GET("api/get")
    Call<RecipeDetails> getRecipeDetails(
            @Query("key") String key,
            @Query("rId") String receipe_id
    );


}
