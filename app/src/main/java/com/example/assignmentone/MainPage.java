package com.example.assignmentone;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/** Main Activity to represent the first page
 * of the application, it is recommended to run
 * the app on the emulator
 */
public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        // .mp3 sound effect file is being created and loaded
        MediaPlayer sound = MediaPlayer.create(MainPage.this, R.raw.sound);

        TextView textClick = (TextView) findViewById(R.id.textView);
        textClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If Text "Create Account" is clicked sound will get activated
                // Rise up your volume speakers
                sound.start();
                // At click the Intend takes you to RegistrationPage (Second Activity)
                startActivity(new Intent(MainPage.this, RegistrationPage.class));
            }
        });

        // This might sound redundant but you don't know where at the user
        // is going to click, so I made the entire button + text view interactive
        ImageButton button = (ImageButton) findViewById(R.id.imageButton3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // If Text "Create Account" is clicked sound will get activated
                // Rise up your Volume speakers
                sound.start();
                // At click the Intend takes you to RegistrationPage (Second Activity)
                startActivity(new Intent(MainPage.this, RegistrationPage.class));
            }
        });
    }

}
