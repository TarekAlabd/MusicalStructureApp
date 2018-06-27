package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class StoreActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        //create a list of titles
        ArrayList<Title> titles = new ArrayList<Title>();
        titles.add(new Title("Masha' allah", "Maher Zain"));
        titles.add(new Title("Dary ya Alby", "Hamza Namira"));
        titles.add(new Title("Thinkers", "Tarek Alabd"));
        titles.add(new Title("Qreat", "Tarek Alabd"));

        // Create an {@link TitleAdapter}, whose data source is a list of {@link Title}. The
        // adapter knows how to create list items for each item in the list.
        TitleAdapter adapter = new TitleAdapter(this, titles);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called albums, which is declared in the
        // activity_albums.xml layout file.
        ListView listView = (ListView) findViewById(R.id.store);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        assert listView != null;
        listView.setAdapter(adapter);
    }
}
