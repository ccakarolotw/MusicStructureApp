package com.example.android.soundcollection;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MusicLibrary extends AppCompatActivity {

    boolean c_1 = false;
    boolean c_2=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_library);

        final TextView s_1 = (TextView) findViewById(R.id.s_1);
        s_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c_1=true;
                s_1.setAlpha(0.5f);
            }
        });

        final TextView s_2 = (TextView) findViewById(R.id.s_2);
        s_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c_2=true;
                s_2.setAlpha(0.5f);
            }
        });

        TextView add = (TextView) findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MusicLibrary.this, MusicList.class);
                sendSong(c_1, "s_1",getString(R.string.s_1),i);
                sendSong(c_2, "s_2",getString(R.string.s_2),i);
                startActivity(i);

            }
        });
    }


    public void sendSong(boolean s_1,String s, String song_name, Intent i) {

        if (s_1) {

            i.putExtra(s,song_name);
        }
        startActivity(i);
    }
}
