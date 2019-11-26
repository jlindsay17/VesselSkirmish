package com.example.vesselskirmish;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuth = FirebaseAuth.getInstance();
        //not sure
//        firebaseAuth.getCurrentUser(user);
//        var user = firebaseAuth.getCurrentUser()
//        firebaseAuth.getCurrentUser(user);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        //banner add
        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        Button playButton = (Button) findViewById(R.id.playButton);
        final EditText p1EditText = (EditText) findViewById(R.id.usernameEditText);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username1 = p1EditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, GameCustomizationActivity.class);
                intent.putExtra("username1", username1);

                if (username1.length() > 0){
                    startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
                }
                else{
                    Toast.makeText(MainActivity.this, "Please Enter A Valid Username", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
