package com.example.applicationjp;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.applicationjp.RecyclerViewAdapterSave;
import com.example.applicationjp.Save;
import com.example.applicationjp.boardsDB.ConectionSQLiteHelper;
import com.example.applicationjp.utilities.Utilities;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button button;

    RecyclerView recyclerView;
    ArrayList<Save> listdates;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById ( R.id.button_Dates );
        button.setOnClickListener ( this );
        button = (Button) findViewById ( R.id.button_favorites );
        button.setOnClickListener ( this );

        listdates=new ArrayList<> ( );
        listdates.add( new Save ("Brasil-Bolivia","3","0",R.drawable.brasil, R.drawable.bolivia) );
        listdates.add( new Save ("Colombia-Argentina","2","0",R.drawable.colombia, R.drawable.argentina) );
        recyclerView = (RecyclerView) findViewById ( R.id.recyclerView_Save );
        recyclerView.setLayoutManager ( new LinearLayoutManager(this) );
        recyclerView.setHasFixedSize ( true );

        RecyclerViewAdapterSave adapterSave = new RecyclerViewAdapterSave ( listdates, context );
        adapterSave.setOnClickListener(new View.OnClickListener (){

            @Override
            public void onClick(View view) {
                ConectionSQLiteHelper conn=new ConectionSQLiteHelper ( getApplicationContext (), "bd_item",null,1 );

                SQLiteDatabase db=conn.getWritableDatabase ();
                ContentValues values=new ContentValues ( );
                values.put ( Utilities.CAMPO_EQUIPOS,listdates.get ( recyclerView.getChildAdapterPosition ( view )).getEquipos () );
                values.put ( Utilities.CAMPO_RESULTADO1,listdates.get ( recyclerView.getChildAdapterPosition ( view ) ).getResult1 () );
                values.put ( Utilities.CAMPO_RESULTADO2,listdates.get ( recyclerView.getChildAdapterPosition ( view ) ).getResult2 () );

                //Long idResultante=db.insert ( Utilities.TABLA_ITEM,Utilities.CAMPO_ID,values );
                //Toast.makeText ( getApplicationContext (),"Id Registro: "+idResultante,Toast.LENGTH_SHORT ).show ();
                db.close ();
                Toast.makeText ( getApplicationContext (),"Añadido a Favoritos:",Toast.LENGTH_SHORT).show ();
                //Log.d ("ok", "connected");
            }
        });
        recyclerView.setAdapter ( adapterSave );



    }

    @Override
    public void onClick(View v) {

        switch (v.getId ()){
            case R.id.button_Dates:
                Intent intent = new Intent(MainActivity.this,DatesActivity.class);
                startActivity ( intent );

                break;
            case R.id.button_favorites:
                intent = new Intent ( MainActivity.this, FavoritesActivity.class);
                startActivity ( intent );
                break;
            default:
                break;
        }
    }
}
