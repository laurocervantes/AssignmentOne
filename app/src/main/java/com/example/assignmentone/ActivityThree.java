package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;

public class ActivityThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        // This do not need further explanation I feel relieved somewhat lol
        MediaPlayer soundThree = MediaPlayer.create(ActivityThree.this,
                R.raw.halellujah);
        soundThree.start();
    }
}