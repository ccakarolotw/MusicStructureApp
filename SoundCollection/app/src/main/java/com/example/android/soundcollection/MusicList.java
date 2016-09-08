package com.example.android.soundcollection;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MusicList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_music_list);

        TextView ceremony = (TextView) findViewById(R.id.ceremony);
        ceremony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent musiclibrary = new Intent(MusicList.this, MusicLibrary.class);
                startActivity(musiclibrary);
            }
        });

        TextView cocktail = (TextView) findViewById(R.id.cocktail);
        cocktail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent musiclibrary = new Intent(MusicList.this, MusicLibrary.class);
                startActivity(musiclibrary);
            }
        });

        TextView play = (TextView) findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlaying = new Intent(MusicList.this, NowPlay.class);
                startActivity(nowPlaying);
            }
        });

        TextView play_cocktail = (TextView) findViewById(R.id.play_cocktail);
        play_cocktail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlaying = new Intent(MusicList.this, NowPlay.class);
                startActivity(nowPlaying);
            }
        });
    }
}
