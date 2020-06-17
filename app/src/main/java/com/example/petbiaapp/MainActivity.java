package com.example.petbiaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView catView;
    private ImageView dogView;
    private ImageView lionView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catView=(ImageView) findViewById(R.id.catViewId);
        dogView=(ImageView) findViewById(R.id.dogViewId);
        lionView=(ImageView) findViewById(R.id.lionId);

        catView.setOnClickListener(this);
        dogView.setOnClickListener(this);
        lionView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.catViewId:
                //go to second activity
                Intent catIntent = new Intent(MainActivity.this, BioActivity.class);
                Intent intent = catIntent.putExtra("name", "jarves"  );
                catIntent.putExtra("bio", "Great cat Loves people and mews a lot!" );
                startActivity(catIntent);
                // Toast.makeText(MainActivity.this,"Cat",Toast.LENGTH_LONG).show();
                break;
            case R.id.dogViewId:
                //go to second Activity
                Intent dogIntent = new Intent(MainActivity.this, BioActivity.class);
                dogIntent.putExtra("name", "Dufus");
                dogIntent.putExtra("bio", "Great dog Loves people and barking a lot!");
                startActivity(dogIntent);
                //Toast.makeText(MainActivity.this,"Dog",Toast.LENGTH_LONG).show();
                break;
            case R.id.lionId:
                Intent lionIntent = new Intent(MainActivity.this, BioActivity.class);
                lionIntent.putExtra("name", "Lion");
                lionIntent.putExtra("bio", "Great lion Loves people gehu  a lot!");
                startActivity(lionIntent);

                break;


        }
    }}