package com.example.mvvpexample.request.responses;

import com.example.mvvpexample.model.Recipe;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RecipeDetails {

    @SerializedName("recipe")
    @Expose()
    private Recipe recipe;

    public Recipe getRecipe(){
        return recipe;
    }

    @Override
    public String toString() {
        return "RecipeDetailsResponse{" +
                "recipe=" + recipe +
                '}';
    }

}
