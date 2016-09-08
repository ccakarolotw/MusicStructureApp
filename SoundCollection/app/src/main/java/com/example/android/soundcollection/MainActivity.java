package com.example.android.soundcollection;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button listOfMusic = (Button) findViewById(R.id.musicList);
        listOfMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendName(listOfMusic);
            }
        });
    }

    public void sendName(View view) {

        EditText bird1 = (EditText) findViewById(R.id.bird1);
        String nameOfBird1 = bird1.getText().toString();

        EditText bird2 = (EditText) findViewById(R.id.bird2);
        String nameOfBird2 = bird2.getText().toString();

        Intent passName = new Intent(MainActivity.this, MusicList.class);
        passName.putExtra("name1", nameOfBird1);
        passName.putExtra("name2", nameOfBird2);
        startActivity(passName);
    }

}
