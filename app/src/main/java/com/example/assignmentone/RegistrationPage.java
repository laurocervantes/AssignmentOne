package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
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

        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton5);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegistrationPage.this, MainPage.class));
            }
        });
        imageButton5 = (ImageButton) findViewById(R.id.imageButtonFinal);
        textInputLayoutEmail = (TextInputEditText) findViewById(R.id.email_address);


        imageButton5.setVisibility(View.INVISIBLE);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    imageButton5.setVisibility(View.VISIBLE);
                }
            } ,5000);

        textView = (TextView) findViewById(R.id.textView28);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RegistrationPage.this,"THANKS FOR REGISTERING",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}