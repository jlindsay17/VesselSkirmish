//<div>Icons made by <a href="https://www.flaticon.com/authors/darius-dan" title="Darius Dan">Darius Dan</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>
//<div>Icons made by <a href="https://www.flaticon.com/authors/smashicons" title="Smashicons">Smashicons</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>
//<div>Icons made by <a href="https://www.flaticon.com/authors/darius-dan" title="Darius Dan">Darius Dan</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>
//<div>Icons made by <a href="https://www.flaticon.com/authors/dimitry-miroliubov" title="Dimitry Miroliubov">Dimitry Miroliubov</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>
//<div>Icons made by <a href="https://www.flaticon.com/authors/adib-sulthon" title="Adib Sulthon">Adib Sulthon</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>
//<div>Icons made by <a href="https://www.flaticon.com/authors/becris" title="Becris">Becris</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>

package com.example.vesselskirmish;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class GameCustomizationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_customization);

        Button confirmButton = (Button) findViewById(R.id.confirmSelectionButton);
        Button quitButton = (Button) findViewById(R.id.quitSelectionButton);
        final ImageView playerChoice = (ImageView)  findViewById(R.id.player1VesselChoice);
        ImageButton shipChoice1 = (ImageButton) findViewById(R.id.shipChoice1);
        ImageButton shipChoice2 = (ImageButton) findViewById(R.id.shipChoice2);
        ImageButton shipChoice3 = (ImageButton) findViewById(R.id.shipChoice3);
        ImageButton shipChoice4 = (ImageButton) findViewById(R.id.shipChoice5);
        ImageButton shipChoice5 = (ImageButton) findViewById(R.id.shipChoice6);
        ImageButton shipChoice6 = (ImageButton) findViewById(R.id.shipChoice7);


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

        final int choice;
        if (playerChoice.getDrawable() == getResources().getDrawable(R.drawable.battleship)){
            choice = 1;
        }
        else if (playerChoice.getDrawable() == getResources().getDrawable(R.drawable.pirateship)){
            choice = 2;
        }
        else if (playerChoice.getDrawable() == getResources().getDrawable(R.drawable.vikingship)){
            choice = 3;
        }
        else if (playerChoice.getDrawable() == getResources().getDrawable(R.drawable.submarine)){
            choice = 4;
        }
        else if (playerChoice.getDrawable() == getResources().getDrawable(R.drawable.spaceship)){
            choice = 5;
        }
        else {
            choice = 6;
        }



        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameCustomizationActivity.this, GamePlayActivity.class);
                intent.putExtra("choice", choice);
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
