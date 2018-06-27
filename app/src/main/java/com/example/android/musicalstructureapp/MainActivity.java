package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //find the view that shows the albums activity
        Button albums = (Button) findViewById(R.id.albums);

        //set a click listner on that view
        albums.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the albums view is clicked on
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        //find the view that shows the artists activity
        Button artists = (Button) findViewById(R.id.artists);

        //set a click listner on that view
        artists.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the artists view is clicked on
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });

        //find the view that shows the now playing activity
        Button nowPlaying = (Button) findViewById(R.id.now_playing);

        //set a click listner on that view
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the now playing view is clicked on
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        //find the view that shows the store activity
        Button store = (Button) findViewById(R.id.store);

        //set a click listner on that view
        store.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the store view is clicked on
            @Override
            public void onClick(View view) {
                Intent storeIntent = new Intent(MainActivity.this, StoreActivity.class);
                startActivity(storeIntent);
            }
        });
    }
}
