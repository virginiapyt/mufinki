package com.example.sodkieconieco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_RECIPEID = "recipeId";
    public static final String EXTRA_RECIPECAT = "recipeCat";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AdapterView.OnItemClickListener choosen = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View view, int i, long l) {
                String choose = "kliknieto" + Integer.toString(i);
                String category = listView.getItemAtPosition(i).toString();
                Toast.makeText(MainActivity.this, category, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, RecipesListActivity.class);
                intent.putExtra(EXTRA_RECIPEID, (int) i);
                intent.putExtra(EXTRA_RECIPECAT, category);
                startActivity(intent);
            }
        };

        ListView listView=(ListView) findViewById(R.id.list);
        listView.setOnItemClickListener(choosen);

    }
}