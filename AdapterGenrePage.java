package com.example.bookreview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

public class AdapterGenrePage extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<Item> items;

    public AdapterGenrePage(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.genreName.setText(items.get(i).getGenreName());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
