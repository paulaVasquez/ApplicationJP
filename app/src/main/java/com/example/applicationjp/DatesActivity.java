package com.example.applicationjp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.applicationjp.boardsDB.ConectionSQLiteHelper;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class DatesActivity extends AppCompatActivity implements View.OnClickListener{
    Button button;
    TextView txtparseo;
    Button getButton;

    private RecyclerView recyclerView;
    View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dates);

        /*getButton = (Button) findViewById ( R.id.mostrar );*/
        txtparseo = (TextView) findViewById ( R.id.txtParseo );

        ClassConnection connection = new ClassConnection ();
        String response;
        try {
            response= connection.execute ( "https://api.myjson.com/bins/19lbl5").get ();
            JSONArray jsonArray = new JSONArray ( response );
            String parseo="";

            for(int i = 0; i< jsonArray.length (); i++){
                JSONObject jsonObject = jsonArray.getJSONObject ( i );

                parseo +="***:" + jsonObject.getString("teamone") + "   ["+ jsonObject.getString("scoreteamone")+"]   "+"      vs      "+"   ["+ jsonObject.getString("scoreteamtwo")+"]   "+jsonObject.getString("teamtwo")+ "***:\n"+
                        "-----------------------------\n" +    "| Estadio : " + jsonObject.get("stadium")+" |\n" +"-----------------------------\n\n\n";


            }
            txtparseo.setText ( parseo );
            txtparseo.setMovementMethod ( new ScrollingMovementMethod () );

        } catch (ExecutionException e) {
            e.printStackTrace ( );
        } catch (InterruptedException e) {
            e.printStackTrace ();
        } catch (JSONException e) {
            e.printStackTrace ( );
        }


        button = (Button) findViewById ( R.id.button_events_D );
        button.setOnClickListener ( this );
        button = (Button) findViewById ( R.id.button_favorites_D );
        button.setOnClickListener ( this );

        /*ArrayList<Dates>listdates = new ArrayList<Dates> (  );
        listdates.add ( new Dates ( "Vie 14/06","Brasil","Bolivia","7:30p.m", R.drawable.brasil, R.drawable.bolivia) );

        RecyclerView recyclerView = (RecyclerView) findViewById ( R.id.recyclerView_Dates );
        recyclerView.setHasFixedSize ( true );
        LinearLayoutManager layoutManager = new LinearLayoutManager ( getApplicationContext () );
        layoutManager.setOrientation ( LinearLayoutManager.VERTICAL );
        recyclerView.setAdapter ( new RecyclerViewAdapter (getApplicationContext (), listdates ) );
        recyclerView.setLayoutManager ( layoutManager );*/

       // ConectionSQLiteHelper conn=new ConectionSQLiteHelper ( this, "bd_item",null,1 );
    }


    @Override
    public void onClick(View view) {
        switch (view.getId ()) {
            case R.id.button_events_D:
                Intent intent = new Intent ( DatesActivity.this, MainActivity.class );
                startActivity ( intent );
                break;
            case R.id.button_favorites_D:
                intent = new Intent ( DatesActivity.this, FavoritesActivity.class );
                startActivity ( intent );
                break;
            default:
                break;
        }


    }
}
