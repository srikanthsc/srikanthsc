package com.srikanthsc.myapplication;//nom du package

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements Interface_MainActivity {
    View view, view1; // variable view qui permet  de construction de base de l'interface utilisateur

    private Button button; // variable bouton



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);// layout de la page pricipale


        button = (Button) findViewById(R.id.button); // identifiant du bouton
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            } //permet d'ouvrier l'activite
        });


        ImageView Myimageview = findViewById(R.id.imageView2);
          getSupportActionBar().setDisplayShowHomeEnabled(true);
          getSupportActionBar().setIcon(R.drawable.ic_baseline_today_24); // utilisation d'un vector asset dans la bare

    }



    public void ListCountries(View view) { // methode pour la liste des pays


        startActivity(new Intent(getApplicationContext(), Countries.class)); // ouvrir la page

    }

    public void openActivity2(){ //methode pour ouvrir l'activite
        Intent intent = new Intent(this, MyMap.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {

    }
}
