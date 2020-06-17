
package com.example.petbiaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {
    private ImageView petImageView;
    private TextView petName;
    private TextView petBio;
    private Bundle extras;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);
        petImageView=(ImageView) findViewById(R.id.picBioId);
        petName=(TextView) findViewById(R.id.nameId);
        petBio=(TextView) findViewById(R.id.bioId);


        extras=getIntent().getExtras();
        if (extras!=null){
            String name =extras.getString("name");
            String bio =extras.getString("bio");
            setUp(name, bio );
        }

    }
    public void setUp(String name, String bio ){
        if (name.equals("Dufus")){
            //we show dog Stuff
            petImageView.setImageDrawable(getResources().getDrawable(R.drawable.dog_png));
            petName.setText(name);
            petBio.setText(bio);

        }else if (name.equals("jarves")){
            //we show cat stuff
            petImageView.setImageDrawable(getResources().getDrawable(R.drawable.cat_png));
            petName.setText(name);
            petBio.setText(bio);

        }else if (name.equals("Lion")){
            petImageView.setImageDrawable(getResources().getDrawable(R.drawable.lion_png));
            petName.setText(name);
            petBio.setText(bio);
        }

    }
}