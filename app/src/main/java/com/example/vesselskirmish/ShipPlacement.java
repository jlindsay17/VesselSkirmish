package com.example.vesselskirmish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ShipPlacement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ship_placement);

        Button undoButton = (Button) findViewById(R.id.undoButton);
        Button returnButton = (Button) findViewById(R.id.returnButton);
        Button confirmButton = (Button) findViewById(R.id.confirmButton);

        undoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                return; //do some stuff with this later
            }
        });

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                ShipPlacement.this.finish();
            }
        });

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check if all chips have been place

                Intent intent = new Intent(ShipPlacement.this, GamePlayActivity.class);
                startActivity(intent);

                //else
                //Toast.makeText(ShipPlacement.this, "You haven't placed all your ships yet!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
