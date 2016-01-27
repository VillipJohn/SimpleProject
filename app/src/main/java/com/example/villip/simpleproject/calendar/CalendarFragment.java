package com.example.villip.simpleproject.calendar;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.villip.simpleproject.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class CalendarFragment extends Fragment {
    private GridLayoutManager lLayout;

    public CalendarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_calendar, container, false);

        List<ItemObject> rowListItem = getAllItemList();
        lLayout = new GridLayoutManager(getContext(), 7);

        RecyclerView rView = (RecyclerView)rootView.findViewById(R.id.recycler_view);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(getContext(), rowListItem);
        rView.setAdapter(rcAdapter);

        return rootView;
    }

    private List<ItemObject> getAllItemList(){

        List<ItemObject> allItems = new ArrayList<ItemObject>();
        allItems.add(new ItemObject("1", R.drawable.alarm,R.drawable.note ));
        allItems.add(new ItemObject("2", 0, 0));
        allItems.add(new ItemObject("3", 0, 0));
        allItems.add(new ItemObject("4", 0, 0));
        allItems.add(new ItemObject("5", 0, 0));
        allItems.add(new ItemObject("6", R.drawable.alarm,R.drawable.note ));
        allItems.add(new ItemObject("7", 0, 0));
        allItems.add(new ItemObject("8", 0, 0));
        allItems.add(new ItemObject("9", 0, 0));
        allItems.add(new ItemObject("10", 0, 0));
        allItems.add(new ItemObject("11", R.drawable.alarm,R.drawable.note ));
        allItems.add(new ItemObject("12", 0, 0));
        allItems.add(new ItemObject("13", 0, 0));
        allItems.add(new ItemObject("14", R.drawable.alarm,R.drawable.note ));
        allItems.add(new ItemObject("15", 0, 0));
        allItems.add(new ItemObject("16", 0, 0));
        allItems.add(new ItemObject("17", R.drawable.alarm,R.drawable.note ));
        allItems.add(new ItemObject("18", 0, 0));
        allItems.add(new ItemObject("19", 0, 0));
        allItems.add(new ItemObject("20", 0, 0));
        allItems.add(new ItemObject("21", 0, 0));
        allItems.add(new ItemObject("22", R.drawable.alarm,R.drawable.note ));
        allItems.add(new ItemObject("23", 0, 0));
        allItems.add(new ItemObject("24", 0, 0));
        allItems.add(new ItemObject("25", 0, 0));
        allItems.add(new ItemObject("26", 0, 0));
        allItems.add(new ItemObject("27", R.drawable.alarm,R.drawable.note ));
        allItems.add(new ItemObject("28", 0, 0));
        allItems.add(new ItemObject("29", 0, 0));
        allItems.add(new ItemObject("30", R.drawable.alarm,R.drawable.note ));
        allItems.add(new ItemObject("31", 0, 0));

        return allItems;
    }


}
