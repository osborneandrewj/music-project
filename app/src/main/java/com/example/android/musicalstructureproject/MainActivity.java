package com.example.android.musicalstructureproject;

import android.content.Intent;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Open the MyLibraryActivity with the myLibraryButton
        Button myLibraryButton = (Button) findViewById(R.id.myLibraryButton);
        myLibraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MyLibraryActivity.class);
                startActivity(intent);
            }
        });
        //Open the ExploreActivity with the exploreButton
        Button exploreButton = (Button) findViewById(R.id.exploreButton);
        exploreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ExploreActivity.class);
                startActivity(intent);
            }
        });
        //Open the NewReleasesActivity with the newReleasesButton
        Button newReleasesButton = (Button) findViewById(R.id.newReleasesButton);
        newReleasesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NewReleasesActivity.class);
                startActivity(intent);

            }
        });
        //Open the SettingsActivity with the settingButton
        Button settingsButton = (Button) findViewById(R.id.settingButton);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);

            }
        });

        /**
         * The following onCLick method adds functionality to the play_button in the main activity.
         */
        final ImageView playButton = (ImageView) findViewById(R.id.play_button);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //If the play button shows the play icon, turn it into the pause icon
                if (playButton.getDrawable().getConstantState().equals(ResourcesCompat.
                        getDrawable(getResources(), R.drawable.ic_play_arrow_white_24dp, null).
                        getConstantState())) {
                    playButton.setImageResource(R.drawable.ic_pause_white_24dp);
                } else {
                    //Or if it shows the pause icon, change it into the play icon
                    playButton.setImageResource(R.drawable.ic_play_arrow_white_24dp);
                }

            }
        });
    }
}
