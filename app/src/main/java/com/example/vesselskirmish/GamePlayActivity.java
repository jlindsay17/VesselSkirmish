package com.example.vesselskirmish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class GamePlayActivity extends AppCompatActivity {
    static final String TAG = "TestTAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_play);


        int choice = 0;
        //Get intent from previous activity
        Intent intent = getIntent();
        if (intent != null){
            choice = intent.getIntExtra("choice", 0);
        }
        Log.d(TAG, "onCreate: " + choice);

        Button quitButton = (Button) findViewById(R.id.quitButton);
        quitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                GamePlayActivity.this.finish();
            }
        });
    }
}
