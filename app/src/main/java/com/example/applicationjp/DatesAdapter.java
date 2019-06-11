package com.example.applicationjp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DatesAdapter extends RecyclerView.Adapter<DatesAdapter.MyViewHolder> {
    private ArrayList<Date> mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        TextView Title1;
        TextView Date1;
        ImageView ImageTeam1;
        ImageView ImageTeam2;
        TextView Team1;
        TextView Team2;
        TextView D1;
        TextView T1;

        MyViewHolder(View v) {
            super(v);
            Title1 = (TextView) v.findViewById(R.id.Title1);
            Date1 = (TextView) v.findViewById(R.id.Date1);
            ImageTeam1 = (ImageView) v.findViewById(R.id.ImageTeam1);
            ImageTeam2 = (ImageView) v.findViewById(R.id.ImageTeam2);
            Team1 = (TextView) v.findViewById(R.id.Team1);
            Team2 = (TextView) v.findViewById(R.id.Team2);
            D1 = (TextView) v.findViewById(R.id.D1);
            T1 = (TextView) v.findViewById(R.id.T1);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public DatesAdapter(ArrayList<Date> myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public DatesAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                        int viewType) {
        // create a new view
        View v = (TextView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_dates, parent, false);

        return new MyViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.Title1.setText(mDataset.get(position).getTitle1());
        holder.Date1.setText(mDataset.get(position).getDate1());
        holder.Team1.setText(mDataset.get(position).getTeam1());
        holder.Team2.setText(mDataset.get(position).getTeam2());
        holder.D1.setText(mDataset.get(position).getD1());
        holder.T1.setText(mDataset.get(position).getT1());

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
