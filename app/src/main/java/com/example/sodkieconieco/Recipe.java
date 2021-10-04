package com.example.sodkieconieco;

public class Recipe {
    private String name;
    private int category;
    private String ingredients;
    private int pictureId;

    public Recipe(String name, int category, String ingredients, int pictureId) {
        this.name = name;
        this.category = category;
        this.ingredients = ingredients;
        this.pictureId = pictureId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }

    @Override
    public String toString() {
        return name;
    }
}
