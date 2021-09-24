package com.example.assignmentone;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        MediaPlayer sound = MediaPlayer.create(MainPage.this, R.raw.sound);

        TextView textClick = (TextView) findViewById(R.id.textView);
        textClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound.start();
                startActivity(new Intent(MainPage.this, RegistrationPage.class));
            }
        });

        ImageButton button = (ImageButton) findViewById(R.id.imageButton3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage.this, RegistrationPage.class));
            }
        });
    }

}