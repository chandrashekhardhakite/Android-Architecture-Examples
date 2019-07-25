package com.example.mvvpexample.request.responses;

import com.example.mvvpexample.model.Recipe;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.LinkedList;

public class SearchRecipes {

    @SerializedName("count")
    @Expose()
    private int count;

    @SerializedName("recipes")
    @Expose
    private LinkedList<Recipe> recipes = new LinkedList<Recipe>();

    @Override
    public String toString() {
        return "SearchRecipesResponse{" +
                "count=" + count +
                ", recipes=" + recipes +
                '}';
    }

    public int getCount() {
        return count;
    }

    public LinkedList<Recipe> getRecipes() {
        return recipes;
    }
}
