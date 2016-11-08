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

        Button myLibraryButton = (Button)findViewById(R.id.myLibraryButton);
        myLibraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MyLibraryActivity.class);
                startActivity(intent);
            }
        });

        Button exploreButton = (Button)findViewById(R.id.exploreButton);
        exploreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ExploreActivity.class);
                startActivity(intent);
            }
        });

        Button newReleasesButton = (Button)findViewById(R.id.newReleasesButton);
        newReleasesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NewReleasesActivity.class);
                startActivity(intent);

            }
        });

        Button settingsButton = (Button)findViewById(R.id.settingButton);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);

            }
        });

        final ImageView playButton = (ImageView) findViewById(R.id.play_button);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("onClick", "Well, got this far.");
                if (playButton.getDrawable().getConstantState().equals(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_play_arrow_white_24dp, null).getConstantState())) {
                    Log.v("onClick", "Now if");
                    playButton.setImageResource(R.drawable.ic_pause_white_24dp);
                } else {
                    Log.v("onClick", "Now else");
                    playButton.setImageResource(R.drawable.ic_play_arrow_white_24dp);
                }

            }
        });
    }
}
