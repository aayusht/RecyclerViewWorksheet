package com.example.android.lesson2worksheet;

import android.content.Context;
import android.content.Intent;
import android.media.Rating;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by JustinKim on 2/8/17.
 */

public class CompaniesAdapter extends RecyclerView.Adapter<CompaniesAdapter.CustomViewHolder> {
    //TODO Question 4
    //Create a constructor with two arguments. What would they be?
    //Hint: You need to know what the ____ is to be able to manipulate the UI. Also need data to display!

    Context context;
    ArrayList<Company> companies = new ArrayList<>();

    public CompaniesAdapter(Context context, ArrayList<Company> companies) {
        this.context = context;
        this.companies = new ArrayList<Company>(companies);
    }

    //TODO Question 5
    //Override the onCreateViewHolder method
    //Hint: we want a layout inflater from the context of its parent and inflate the row_view
    // layout from the parent, then pass that into our custom view holder

    @Override
    public CompaniesAdapter.CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_view, parent, false);
        return new CustomViewHolder(view);
    }


    //TODO Question 6
    //Bind the data to the holder based on the position

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        final Company company = companies.get(position);
        holder.textView.setText(company.companyName);
        holder.ratingBar.setRating(company.likeCompany);
        holder.imageView.setImageResource(company.imageResId);
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Main2Activity.class);
                intent.putExtra("name", company.companyName);
                context.startActivity(intent);
            }
        });
    }


    //TODO Question 7
    //Override the item size method

    @Override
    public int getItemCount() {
        return companies.size();
    }


    //TODO Question 8
    //Create a CustomViewHolder class that extends the base RecyclerView.ViewHolder
    //Override its constructor class with the following signature:
    //CustomViewHolder(View view) {
    //    super(view);
    //    ...
    //}
    //and create instance variables for the UI elements in the layout file
    //Hint: findViewById is a method of the View class

    class CustomViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        RatingBar ratingBar;
        TextView textView;
        CustomViewHolder(View view) {
            super(view);
            textView = (TextView) view.findViewById(R.id.textView);
            ratingBar = (RatingBar) view.findViewById(R.id.ratingBar);
            imageView = (ImageView) view.findViewById(R.id.imageView);
        }
    }

}


