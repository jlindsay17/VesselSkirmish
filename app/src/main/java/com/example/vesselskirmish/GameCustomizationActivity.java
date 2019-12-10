//<div>Icons made by <a href="https://www.flaticon.com/authors/darius-dan" title="Darius Dan">Darius Dan</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>
//<div>Icons made by <a href="https://www.flaticon.com/authors/smashicons" title="Smashicons">Smashicons</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>
//<div>Icons made by <a href="https://www.flaticon.com/authors/darius-dan" title="Darius Dan">Darius Dan</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>
//<div>Icons made by <a href="https://www.flaticon.com/authors/dimitry-miroliubov" title="Dimitry Miroliubov">Dimitry Miroliubov</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>
//<div>Icons made by <a href="https://www.flaticon.com/authors/adib-sulthon" title="Adib Sulthon">Adib Sulthon</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>
//<div>Icons made by <a href="https://www.flaticon.com/authors/becris" title="Becris">Becris</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>

package com.example.vesselskirmish;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class GameCustomizationActivity extends AppCompatActivity {
    static final String TAG = "GameCustomTAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_customization);

        Button confirmButton = (Button) findViewById(R.id.confirmSelectionButton);
        Button quitButton = (Button) findViewById(R.id.quitSelectionButton);
        final ImageView playerChoice = (ImageView)  findViewById(R.id.player1VesselChoice);

        playerChoice.setImageResource(R.drawable.user);

        final ImageButton shipChoice1 = (ImageButton) findViewById(R.id.shipChoice1);
        final ImageButton shipChoice2 = (ImageButton) findViewById(R.id.shipChoice2);
        final ImageButton shipChoice3 = (ImageButton) findViewById(R.id.shipChoice3);
        final ImageButton shipChoice4 = (ImageButton) findViewById(R.id.shipChoice5);
        final ImageButton shipChoice5 = (ImageButton) findViewById(R.id.shipChoice6);
        final ImageButton shipChoice6 = (ImageButton) findViewById(R.id.shipChoice7);


        //Listeners for Ship Options
        //**************************************************************************
        //battleship listener
        shipChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerChoice.setImageResource(R.drawable.battleship);
            }
        });

        //pirate ship listener
        shipChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerChoice.setImageResource(R.drawable.pirateship);
            }
        });

        //viking ship listener
        shipChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerChoice.setImageResource(R.drawable.vikingship);
            }
        });

        //submarine  listener
        shipChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerChoice.setImageResource(R.drawable.submarine);
            }
        });

        //space ship listener
        shipChoice5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerChoice.setImageResource(R.drawable.spaceship);
            }
        });

        //ufo listener
        shipChoice6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerChoice.setImageResource(R.drawable.ufo);
            }
        });
        //**************************************************************************

        //THIS DONT WORK
        final int choice;
        if (playerChoice.getDrawable() == shipChoice1.getDrawable()){
            choice = 1;
        }
        else if (playerChoice.getDrawable() == shipChoice2.getDrawable()){
            choice = 2;
        }
        else if (playerChoice.getDrawable() == shipChoice3.getDrawable()){
            choice = 3;
        }
        else if (playerChoice.getDrawable() == shipChoice4.getDrawable()){
            choice = 4;
        }
        else if (playerChoice.getDrawable() == shipChoice5.getDrawable()){
            choice = 5;
        }
        else {
            choice = 6;
        }


//This gahdamnsummabich needs to get its shit together real quick
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "1");
                //THIS DONT WORK
                Drawable userChoiceDrawable = playerChoice.getDrawable();
                Log.d(TAG, "2");
                Drawable otherDrawable = getResources().getDrawable(R.drawable.user);
                Log.d(TAG, "3");
                if (playerChoice.getDrawable() == shipChoice1.getDrawable() || playerChoice.getDrawable() == shipChoice2.getDrawable()
                || playerChoice.getDrawable() == shipChoice3.getDrawable() || playerChoice.getDrawable() == shipChoice4.getDrawable()
                || playerChoice.getDrawable() == shipChoice5.getDrawable() || playerChoice.getDrawable() == shipChoice6.getDrawable()){
                    Log.d(TAG, "4");
                    Log.d(TAG, "onClick: Here in my if statement");
                    Intent intent = new Intent(GameCustomizationActivity.this, ShipPlacement.class);
                    intent.putExtra("choice", choice);
                    startActivity(intent);
                    Toast.makeText(GameCustomizationActivity.this, "Please select a ship type", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(GameCustomizationActivity.this, "Please select a ship type", Toast.LENGTH_SHORT).show();
                }
            }
        });

        quitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "5");
                Intent intent = new Intent();
                GameCustomizationActivity.this.finish();
                Log.d(TAG, "onClick: Quitting");
            }
        });

    }
}
