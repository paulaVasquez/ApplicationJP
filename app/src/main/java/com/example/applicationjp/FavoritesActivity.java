package com.example.applicationjp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FavoritesActivity extends AppCompatActivity implements View.OnClickListener{
    Button button;
    TextView info;

    private boolean addingNew = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_favorites );

        info = findViewById ( R.id.InfoPlayer );

        button = (Button) findViewById ( R.id.button_events_F );
        button.setOnClickListener ( this );
        button = (Button) findViewById ( R.id.button_Dates_F );
        button.setOnClickListener ( this );
    }

    @Override
    public void onClick(View v) {

        switch (v.getId ()) {
            case R.id.button_events_F:
                Intent intent = new Intent ( FavoritesActivity.this, MainActivity.class );
                startActivity ( intent );
                break;
            case R.id.button_Dates_F:
                intent = new Intent ( FavoritesActivity.this, DatesActivity.class );
                startActivity ( intent );
                break;
            default:
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu ( menu );
        MenuInflater inflater = getMenuInflater ();
        inflater.inflate ( R.menu.menu,menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        super.onOptionsItemSelected ( item );
        switch (item.getItemId ()){
            case (R.id.addQR):{
                addQR();
                return true;
            }
        }
        return false;
    }

    private void addQR() {
        addingNew = true;
        IntentIntegrator integrator = new IntentIntegrator(this);
        integrator.initiateScan();
    }

    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        if (resultCode == RESULT_OK) {
            IntentResult scanResult = IntentIntegrator.parseActivityResult(
                    requestCode, resultCode, intent);
            if (scanResult != null) {
                // Handle successful scan
               String contents = scanResult.getContents();
                info.setText ( contents );
            }
        } else if (resultCode == RESULT_CANCELED) {
            Toast.makeText(this,"Scaneo Cancelado", Toast.LENGTH_SHORT)
                    .show();
        }

    }
}
