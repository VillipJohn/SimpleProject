package com.example.villip.simpleproject.calendar;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.example.villip.simpleproject.R;




public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView card_date;
    public ImageView alarm;
    public ImageView note;

    public RecyclerViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        card_date = (TextView)itemView.findViewById(R.id.card_date);
        alarm = (ImageView)itemView.findViewById(R.id.alarm);
        note = (ImageView)itemView.findViewById(R.id.note);
    }

    @Override
    public void onClick(View view) {
        Context context = view.getContext();
        Intent intent = new Intent(context, ListEventsActivity.class);
        context.startActivity(intent);

        //Toast.makeText(view.getContext(), "Clicked Country Position = " + getPosition(), Toast.LENGTH_SHORT).show();
    }
}