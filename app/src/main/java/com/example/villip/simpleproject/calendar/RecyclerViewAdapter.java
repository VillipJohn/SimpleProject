package com.example.villip.simpleproject.calendar;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.villip.simpleproject.MainActivity;
import com.example.villip.simpleproject.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolders> {

    private List<ItemObject> itemList;
    private Context context;

    public RecyclerViewAdapter(Context context, List<ItemObject> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        //setVisibility(View.INVISIBLE)

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_days, null);
        RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
        int date = itemList.get(position).getDate();
        String date_string = Integer.toString(date);
        holder.card_date.setText(date_string);
        holder.alarm.setImageResource(itemList.get(position).getImg_alarm());
        holder.note.setImageResource(itemList.get(position).getImg_note());

    }

        @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
