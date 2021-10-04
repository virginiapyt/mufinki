package com.example.sodkieconieco;

import java.util.ArrayList;

public class RepositoryRecipe {

    public static final Recipe[] recipes = {
           new Recipe("mufinki", 3,"sk",R.drawable.mufinki ),
            new Recipe("Pierniczki",3,"<li>mąka</li><li>cukier</li><li>miód</li>", R.drawable.pier),
            new Recipe("Drożdżówki",3,"<li>mąka</li><li>cukier</li><li>miód</li>", R.drawable.pier),
            new Recipe("Rogaliki",3,"<li>mąka</li><li>cukier</li><li>miód</li>", R.drawable.pier),
            new Recipe("Ptysie",3,"<li>mąka</li><li>cukier</li><li>miód</li>", R.drawable.pier),
            new Recipe("Gofry",1, "<li>mąka</li><li>cukier</li><li>mlek</li><li>olej</li>", R.drawable.mufinki),
            new Recipe("Lody",1, "<li>mąka</li><li>cukier</li><li>mlek</li><li>olej</li>", R.drawable.mufinki)

    };

    public static ArrayList<Recipe>  wybierz( int id){
        ArrayList<Recipe> wybrane = new ArrayList<Recipe>();
        for (Recipe rec: recipes){
            if (rec.getCategory() == id)
                wybrane.add(rec);
        }
        return wybrane;

    }
}
