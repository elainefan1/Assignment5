package com.example.assignment5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

;

public class MainActivity extends AppCompatActivity {

    private ListView mainListView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mainListView = (ListView)findViewById(R.id.mainListView);
        initListView();
    }




    private void initListView(){
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_layout_entry,
            R.id.myTextView);
    adapter.add("Item one");
    adapter.add("Item two");
    adapter.add("Item three");
        this.mainListView.setAdapter(adapter);
}

    }

