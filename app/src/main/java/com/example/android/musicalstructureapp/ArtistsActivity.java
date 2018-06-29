package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        //find the view that shows the Main Screen
        Button home = (Button) findViewById(R.id.home);

        //set a click listner on that view
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(ArtistsActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        //create a list of titles
        //albumName (in artists) : Singer Name
        //singerName (in artists) : description
        ArrayList<Title> titles = new ArrayList<Title>();
        titles.add(new Title("Maher Zain", "He is an islamic singer and he has a lot of albums"));
        titles.add(new Title("Tarek Alabd", "He is an islamic singer and he has a lot of albums"));
        titles.add(new Title("Hamza Namera", "He is an islamic singer and he has a lot of albums"));
        titles.add(new Title("Mesuit Kurtes", "He is an islamic singer and he has a lot of albums"));

        // Create an {@link TitleAdapter}, whose data source is a list of {@link Title}. The
        // adapter knows how to create list items for each item in the list.
        TitleAdapter adapter = new TitleAdapter(this, titles);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called albums, which is declared in the
        // activity_albums.xml layout file.
        ListView listView = findViewById(R.id.artists);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        assert listView != null;
        listView.setAdapter(adapter);
    }
}
