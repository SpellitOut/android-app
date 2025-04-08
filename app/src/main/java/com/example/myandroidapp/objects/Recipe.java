package com.example.myandroidapp.objects;

import java.util.ArrayList;

public class Recipe {

    // a recipe will consist of ingredients and their amounts

    private String name;
    private ArrayList<Ingredient> ingredients;

    //I think ideally we change it so when you create the recipe, each ingredient has it's own quantity,
    //  maybe need a class of some sort like "RecipeIngredient" to contain the quantity as well as ingredient
    private ArrayList<Integer> quantities;

    public Recipe(String name, ArrayList<Ingredient> ingredients, ArrayList<Integer> quantities) {
        this.name = name;
        this.ingredients = ingredients;
        this.quantities = quantities;
    }
}
