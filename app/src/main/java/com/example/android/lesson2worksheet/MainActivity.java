package com.example.android.lesson2worksheet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public CompaniesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO Question 1
        //Create a recyclerview with a linear layout

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Company> companies = new ArrayList<>();

        //TODO Question 2
        //add 4 companies: apple, asus, dell, and microsoft

        for (int i = 0; i < 42; i++) {
            companies.add(new Company("apple", 1, R.drawable.apple));
            companies.add(new Company("asus", 2, R.drawable.asus));
            companies.add(new Company("dell", 3, R.drawable.dell));
            companies.add(new Company("microsoft", 4, R.drawable.microsoft));
        }

        //TODO Question 3
        //set the adapter using the constructor

        adapter = new CompaniesAdapter(this, companies);
        recyclerView.setAdapter(adapter);

        //TODO Question 3.5??
        //guided row_view layout

    }
}
