package com.example.vesselskirmish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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

    public void onClick(View view){
        switch (view.getId()){
            case R.id.t00:
                Toast.makeText(this, "Button 00", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t01:
                Toast.makeText(this, "Button 01", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t02:
                Toast.makeText(this, "Button 02", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t03:
                Toast.makeText(this, "Button 03", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t04:
                Toast.makeText(this, "04", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t05:
                Toast.makeText(this, "05", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t06:
                Toast.makeText(this, "06", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t07:
                Toast.makeText(this, "07", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
