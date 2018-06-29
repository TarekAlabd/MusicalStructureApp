package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class StoreActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        //find the view that shows the Main Screen
        Button home = (Button) findViewById(R.id.home);

        //set a click listner on that view
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(StoreActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        //create a list of titles
        ArrayList<Title> titles = new ArrayList<Title>();
        titles.add(new Title("Masha' allah", "Maher Zain"));
        titles.add(new Title("Dary ya Alby", "Hamza Namira"));
        titles.add(new Title("Thinkers", "Tarek Alabd"));
        titles.add(new Title("Qreat", "Tarek Alabd"));

        // Create an {@link TitleAdapter}, whose data source is a list of {@link Title}. The
        // adapter knows how to create list items for each item in the list.
        TitleAdapterStore adapter = new TitleAdapterStore(this, titles);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called albums, which is declared in the
        // activity_albums.xml layout file.
        ListView listView = findViewById(R.id.store);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        assert listView != null;
        listView.setAdapter(adapter);
    }
}
