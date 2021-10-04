package com.example.sodkieconieco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class RecipesListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes_list);

        Intent intent = getIntent();
        int id = (int) intent.getExtras().get(MainActivity.EXTRA_RECIPEID);
        String category=(String) intent.getExtras().get(MainActivity.EXTRA_RECIPECAT);
        //przypidanie nazwy do textview z nazwą kategorii
        TextView textview = (TextView) findViewById(R.id.textView);
        textview.setText(category);
//obiekt, który przyporządkowuje listę przepisów pobraną z klasy RepositoryRecipe
        ArrayAdapter <Recipe> recipeArrayAdapter = new ArrayAdapter<Recipe>
                (this,
                android.R.layout.simple_list_item_1,
                RepositoryRecipe.wybierz(id));


        ListView listRecipes = (ListView) findViewById(R.id.list_recipes);
        listRecipes.setAdapter(recipeArrayAdapter);

        //obiekt nasłuchujący
        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listRecipes, View view, int i, long l) {
                Intent intent =new Intent(RecipesListActivity.this, RecipeDetailsActivity.class);
            intent.putExtra(MainActivity.EXTRA_RECIPEID, (int) i);
                intent.putExtra(MainActivity.EXTRA_RECIPECAT, (int) id);
                startActivity(intent);
            }
        };

        listRecipes.setOnItemClickListener(itemClickListener);
    }
}