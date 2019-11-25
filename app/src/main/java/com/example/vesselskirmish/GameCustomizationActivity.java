package com.example.vesselskirmish;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameCustomizationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_customization);

        Button confirmButton = (Button) findViewById(R.id.confirmSelectionButton);
        Button quitButton = (Button) findViewById(R.id.quitSelectionButton);

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameCustomizationActivity.this, GamePlayActivity.class);
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(GameCustomizationActivity.this);
                startActivity(intent, options.toBundle());
            }
        });

        quitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                GameCustomizationActivity.this.finish();
            }
        });

    }
}
