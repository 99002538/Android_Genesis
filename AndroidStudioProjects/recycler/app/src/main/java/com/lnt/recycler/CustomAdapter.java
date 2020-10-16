package com.lnt.recycler;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.lnt.recycler.R;
import java.util.ArrayList;


public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {


    private ArrayList<DataModel> dataSet;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textview;
        TextView textview2;
        ImageView imageViewIcon;

        public MyViewHolder(View itemView) {

            super(itemView);

            this.textview = (TextView) itemView.findViewById(R.id.textView4);
            this.textview2 = (TextView) itemView.findViewById(R.id.textView5);
            this.imageViewIcon = (ImageView) itemView.findViewById(R.id.imageView4);

        }


    }


    public CustomAdapter(ArrayList<DataModel> data) {

        this.dataSet = data;


    }


    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowlayout, parent, false);

        view.setOnClickListener(MainActivity.myOnClickListener);

        MyViewHolder myViewHolder = new MyViewHolder(view);

        MyViewHolder vh = new MyViewHolder(view);


        return vh;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int listPosition) {
        TextView textView = holder.textview;

        TextView textView2 = holder.textview2;

        ImageView imageViewIcon = holder.imageViewIcon;

        //

        textView.setText(dataSet.get(listPosition).getName());

        textView2.setText(dataSet.get(listPosition).getVersion());

        imageViewIcon.setImageResource(dataSet.get(listPosition).getImage());
    }

        @Override
        public int getItemCount () {
            return dataSet.size();
        }


    }

