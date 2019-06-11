package com.example.applicationjp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DatesActivity extends AppCompatActivity {

    private DatesAdapter datesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dates);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.Recycler_View_Dates);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<Date> myDataset = new ArrayList<>();
        myDataset.add ( new Date ( "Fase de Grupos","Fecha 1","Brasil","Bolivia","Vie 14/06","7:30 pm" ) );
        myDataset.add ( new Date ( "Fase de Grupos","Fecha 1","Venezuela","Peru","Sab 15/06","2:00 pm" ) );
        myDataset.add ( new Date ( "Fase de Grupos","Fecha 1","Argentina","Colombia","Sab 15/06","5:00 pm" ) );

        datesAdapter = new DatesAdapter(myDataset);
        recyclerView.setAdapter(datesAdapter);
    }
}
