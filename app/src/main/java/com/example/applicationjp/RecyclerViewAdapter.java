package com.example.applicationjp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context context;
    List<Dates> mData;

    public RecyclerViewAdapter(Context context, List<Dates> mData) {
        this.context = context;
        this.mData = mData;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        final Dates dates = mData.get ( i );
        View v;
        //v = LayoutInflater.from ( context ).inflate ( R.layout.item_date,viewGroup,false );
        v = LayoutInflater.from ( viewGroup.getContext () ).inflate ( R.layout.item_date,null,false );

        //final MyViewHolder viewHolder = new MyViewHolder ( v );


        return new MyViewHolder ( v );
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyViewHolder myViewHolder, int i) {

        Dates dates = mData.get ( i );
        myViewHolder.fecha.setText ( dates.getFecha () );
        myViewHolder.equipo1.setText ( dates.getEquipo1 () );
        myViewHolder.equipo2.setText ( dates.getEquipo2 () );
        myViewHolder.hora.setText ( dates.getHora () );
        myViewHolder.bandera1.setImageResource ( dates.getBandera1 () );
        myViewHolder.bandera2.setImageResource ( dates.getBandera2 () );
    }

    @Override
    public int getItemCount() {
        return mData.size ();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView fecha,equipo1,equipo2,hora;
        ImageView bandera1,bandera2;

        public MyViewHolder(@NonNull View itemView) {
            super ( itemView );

            fecha = itemView.findViewById ( R.id.date );
            equipo1 = itemView.findViewById ( R.id.Team1 );
            equipo2 = itemView.findViewById ( R.id.Team2 );
            hora = itemView.findViewById ( R.id.Time );
            bandera1 = itemView.findViewById ( R.id.image1 );
            bandera2 = itemView.findViewById ( R.id.image2 );
        }
    }
}
