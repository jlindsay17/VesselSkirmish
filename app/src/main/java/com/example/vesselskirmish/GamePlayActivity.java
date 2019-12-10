package com.example.vesselskirmish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
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

    ImageButton button00 = (ImageButton) findViewById(R.id.t00);

    //Listener for ALL buttons
    public void onClick(View view){
        switch (view.getId()){
            case R.id.t00:
                button00.setImageResource(R.drawable.user);
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
            case R.id.t10:
                Toast.makeText(this, "Button 00", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t11:
                Toast.makeText(this, "Button 01", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t12:
                Toast.makeText(this, "Button 02", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t13:
                Toast.makeText(this, "Button 03", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t14:
                Toast.makeText(this, "04", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t15:
                Toast.makeText(this, "05", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t16:
                Toast.makeText(this, "06", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t17:
                Toast.makeText(this, "07", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t20:
                Toast.makeText(this, "Button 00", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t21:
                Toast.makeText(this, "Button 01", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t22:
                Toast.makeText(this, "Button 02", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t23:
                Toast.makeText(this, "Button 03", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t24:
                Toast.makeText(this, "04", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t25:
                Toast.makeText(this, "05", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t26:
                Toast.makeText(this, "06", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t27:
                Toast.makeText(this, "07", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t30:
                Toast.makeText(this, "Button 00", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t31:
                Toast.makeText(this, "Button 01", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t32:
                Toast.makeText(this, "Button 02", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t33:
                Toast.makeText(this, "Button 03", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t34:
                Toast.makeText(this, "04", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t35:
                Toast.makeText(this, "05", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t36:
                Toast.makeText(this, "06", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t37:
                Toast.makeText(this, "07", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t40:
                Toast.makeText(this, "Button 00", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t41:
                Toast.makeText(this, "Button 01", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t42:
                Toast.makeText(this, "Button 02", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t43:
                Toast.makeText(this, "Button 03", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t44:
                Toast.makeText(this, "04", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t45:
                Toast.makeText(this, "05", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t46:
                Toast.makeText(this, "06", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t47:
                Toast.makeText(this, "07", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t50:
                Toast.makeText(this, "Button 00", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t51:
                Toast.makeText(this, "Button 01", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t52:
                Toast.makeText(this, "Button 02", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t53:
                Toast.makeText(this, "Button 03", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t54:
                Toast.makeText(this, "04", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t55:
                Toast.makeText(this, "05", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t56:
                Toast.makeText(this, "06", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t57:
                Toast.makeText(this, "07", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t60:
                Toast.makeText(this, "Button 00", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t61:
                Toast.makeText(this, "Button 01", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t62:
                Toast.makeText(this, "Button 02", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t63:
                Toast.makeText(this, "Button 03", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t64:
                Toast.makeText(this, "04", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t65:
                Toast.makeText(this, "05", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t66:
                Toast.makeText(this, "06", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t67:
                Toast.makeText(this, "07", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t70:
                Toast.makeText(this, "Button 70", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t71:
                Toast.makeText(this, "Button 71", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t72:
                Toast.makeText(this, "Button 72", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t73:
                Toast.makeText(this, "Button 73", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t74:
                Toast.makeText(this, "74", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t75:
                Toast.makeText(this, "75", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t76:
                Toast.makeText(this, "76", Toast.LENGTH_SHORT).show();
                break;
            case R.id.t77:
                Toast.makeText(this, "77", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
