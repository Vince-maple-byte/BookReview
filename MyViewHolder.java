package com.example.bookreview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    Button genreName;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        genreName = itemView.findViewById(R.id.genreName);

    }
}
