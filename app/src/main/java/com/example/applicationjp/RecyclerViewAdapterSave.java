package com.example.applicationjp;

import android.support.constraint.ConstraintLayout;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.applicationjp.Save;
import com.example.applicationjp.boardsDB.ConectionSQLiteHelper;
import com.example.applicationjp.utilities.Utilities;

import java.util.ArrayList;
import java.util.List;


public class RecyclerViewAdapterSave extends RecyclerView.Adapter<RecyclerViewAdapterSave.MyViewHolder> implements View.OnClickListener{

    Context context;
    ArrayList<Save> mData;
    private View.OnClickListener listener;

    public RecyclerViewAdapterSave( ArrayList<Save> mData, Context context) {
        this.context = context;
        this.mData = mData;
    }
    /*public RecyclerViewAdapterSave(ArrayList<Save> mDatas) {
        this.mData = mDatas;
    }*/


    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        //final Save dates = mData.get ( i );
        View view = LayoutInflater.from ( parent.getContext () ).inflate ( R.layout.item_save, parent,false );
        view.setOnClickListener (this);
        return new MyViewHolder ( view );
    }

    @Override
    public void onBindViewHolder( MyViewHolder myViewHolder, int position) {
        //Save dates = mData.get ( position );
        myViewHolder.equipos.setText ( mData.get ( position ).getEquipos () );
        myViewHolder.result1.setText ( mData.get ( position ).getResult1 () );
        myViewHolder.result2.setText ( mData.get ( position ).getResult2 () );
        myViewHolder.bandera1.setImageResource ( mData.get ( position ).getBandera1 () );
        myViewHolder.bandera2.setImageResource ( mData.get ( position ).getBandera2 () );
       // myViewHolder.btnSave.setOnClickListener ( this );

        /*myViewHolder.btnSave.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                registrarItems();
            }
        } );*/

       // ConectionSQLiteHelper conn=new ConectionSQLiteHelper ( context, "bd_item",null,1 );
    }



    @Override
    public int getItemCount() {
        return mData.size ();
    }

   public void setOnClickListener(View.OnClickListener listener){
        this.listener=listener;
    }

    @Override
    public void onClick(View view) {
        if(listener!=null){
            listener.onClick ( view );
        }
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView equipos,result1,result2;
        ImageView bandera1,bandera2;
        ConstraintLayout layout;

        //ConectionSQLiteHelper conn=new ConectionSQLiteHelper ( context, "bd_item",null,1 );


        public MyViewHolder(@NonNull View itemView) {
            super ( itemView );

           //btnSave = (Button) itemView.findViewById ( R.id.button_save1 );

            equipos = itemView.findViewById ( R.id.Teams1 );
            result1 = itemView.findViewById ( R.id.score1_team_1 );
            result2 = itemView.findViewById ( R.id.score1_team_2 );
            bandera1 = itemView.findViewById ( R.id.imageView1 );
            bandera2 = itemView.findViewById ( R.id.imageView2 );
            layout = itemView.findViewById(R.id.itemsave);

            //btnSave.setOnClickListener ( this );

           // campoNombre =  itemView.findViewById ( R.id.Teams1 );
           // campoResultado = itemView.findViewById ( R.id.score1_team_1 );

           // ConectionSQLiteHelper conn=new ConectionSQLiteHelper ( context, "bd_item",null,1 );
        }

       /* @Override
        public void onClick(View view) {

            if (view.getId() == btnSave.getId ()){
                Toast.makeText ( btnSave.getContext (),"Id Registro: ",Toast.LENGTH_SHORT ).show ();
                //MainActivity.registrarItems();
            }else {

            }
        }*/
    }

    /*private void registrarItems() {
        ConectionSQLiteHelper conn = new ConectionSQLiteHelper ( context, "bd_item", null,1 );

        SQLiteDatabase db = conn.getWritableDatabase ();

        ContentValues values=new ContentValues ( );
        values.put ( Utilities.CAMPO_NOMBRE,campoNombre.getText ().toString () );
        values.put ( Utilities.CAMPO_RESULTADO,campoResultado.getText ().toString () );

        Long idResultante=db.insert ( Utilities.TABLA_ITEM,Utilities.CAMPO_NOMBRE,values );
        Toast.makeText ( context,"Id Registro: "+idResultante,Toast.LENGTH_SHORT ).show ();
        db.close ();
    }*/

}
