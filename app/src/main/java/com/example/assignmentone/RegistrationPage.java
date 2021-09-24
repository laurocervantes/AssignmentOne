package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

/** Second Activity coded to represent
 * the second page of the application.
 * It includes intents to go back to First Activity
 * or Forward to the third one.
 *
 * Bottom button will appear after 5 seconds automatically!
 */
public class RegistrationPage extends AppCompatActivity {

    private TextInputEditText textInputLayoutEmail;
    private TextInputEditText textInputLayoutPass;
    private TextInputEditText textInputLayoutConfirm;
    private ImageButton imageButton5;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);

        // Image button on the upper bar
        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton5);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // At click takes you back to MainPage (First Activity)
                startActivity(new Intent(RegistrationPage.this, MainPage.class));
            }
        });

        // Bottom button image created and binded
        imageButton5 = (ImageButton) findViewById(R.id.imageButtonFinal);

        // Image is set to invisible, but after 5 seconds it becomes VISIBLE
        imageButton5.setVisibility(View.INVISIBLE);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    imageButton5.setVisibility(View.VISIBLE);
                }
            } ,5000); //BUTTON gets visible after 5 seconds!!!

        // New sound for click is created
        // Don't miss out, level up your volume
        MediaPlayer soundTwo = MediaPlayer.create(RegistrationPage.this, R.raw.bun);

        // Made the TextView on bottom Button Clickable
        textView = (TextView) findViewById(R.id.textView28);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // After clicked a new sound gets Activated!
                soundTwo.start();
                Toast.makeText(RegistrationPage.this,"THANKS FOR REGISTERING",
                        Toast.LENGTH_SHORT).show();
                // After click it takes you to ActivityThree (Third one)
                startActivity(new Intent(RegistrationPage.this,ActivityThree.class));
            }
        });
    }
}