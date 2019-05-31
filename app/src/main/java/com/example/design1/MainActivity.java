package com.example.design1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rec1);
        List<String> l1 = new ArrayList<>();

        for(int i=0;i<10;i++) {
            l1.add("Category"+i);
        }

        RecyclerAdapterForHome recyclerAdapterForHome = new RecyclerAdapterForHome(l1);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(recyclerAdapterForHome);
    }

    public void seeContests(View view) {
        Intent intent = new Intent(this, ContestActivity.class);
        startActivity(intent);
    }
}
