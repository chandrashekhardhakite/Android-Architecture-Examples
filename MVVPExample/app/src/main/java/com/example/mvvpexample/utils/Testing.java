package com.example.mvvpexample.utils;

import android.util.Log;

import com.example.mvvpexample.model.Recipe;

import java.util.List;

public class Testing {

    public static void printRecipes(List<Recipe> recipeList,String TAG){

        for(Recipe item: recipeList){
            Log.d(TAG,"OnChandged - -"+item.getTitle());

        }

    }
}
