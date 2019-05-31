package com.example.design1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ContestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contest);

        RecyclerView recyclerView = findViewById(R.id.rec2);
        List<String> l1 = new ArrayList<>();
        for(int i=1;i<=10;i++) {
            l1.add("Contest "+i);
        }

        RecyclerAdapterForContest recyclerAdapterForContest = new RecyclerAdapterForContest(l1);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(ContestActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(recyclerAdapterForContest);
    }
}
