package com.example.bookreview;

import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Got to get images for the different genres
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Fantasy"));
        items.add(new Item("Thriller"));
        items.add(new Item("Children"));
        items.add(new Item("Nonfiction"));
        items.add(new Item("Science Fiction"));
        items.add(new Item("Classics"));

        RecyclerView recyclerView = findViewById(R.id.homePage_recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new AdapterGenrePage(getApplicationContext(), items));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.search_bar:
                Log.d(TAG, "We selected the search bar icon" );

                return true;
            case R.id.settings_bar:
                Log.d(TAG, "We selected the settings icon" );

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void onClickGenreName(View view){
        Log.d(TAG, "This method is supposed to go to a list of books");
    }
}