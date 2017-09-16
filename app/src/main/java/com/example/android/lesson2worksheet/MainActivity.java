package com.example.android.lesson2worksheet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO Question 1
        //Create a recyclerview with a linear layout

        /* YOUR CODE HERE */

        ArrayList<Company> computerCompanies = new ArrayList<>();

        //TODO Question 2
        //add 4 companies: apples, asus, dell, and microsoft

        /* YOUR CODE HERE */

        //TODO Question 3
        //set the adapter using the constructor

        /* YOUR CODE HERE */

        //TODO Question 3.5??
        //guided row_view layout

    }
}
