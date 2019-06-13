package com.example.applicationjp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FavoritesActivity extends AppCompatActivity implements View.OnClickListener{
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_favorites );

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
}
