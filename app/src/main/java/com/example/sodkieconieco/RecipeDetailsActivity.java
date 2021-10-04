package com.example.sodkieconieco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.TestLooperManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecipeDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_details);

        int recID= (Integer) getIntent().getExtras().get(MainActivity.EXTRA_RECIPEID);
        int kat= (Integer) getIntent().getExtras().get(MainActivity.EXTRA_RECIPECAT);

        ArrayList <Recipe> wybrane = RepositoryRecipe.wybierz(kat);
        Recipe recipe = wybrane.get(recID);

        TextView text_name = (TextView) findViewById(R.id.name_item);
        text_name.setText(recipe.getName());

        TextView text_ingr = (TextView) findViewById(R.id.ingr_item);
        text_ingr.setText(recipe.getIngredients());

        ImageView im_rec= (ImageView) findViewById(R.id.imageView);
        im_rec.setImageResource(recipe.getPictureId());
        im_rec.setContentDescription(recipe.getName());



    }
}