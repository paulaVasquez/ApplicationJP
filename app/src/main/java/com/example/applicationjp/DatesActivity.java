package com.example.applicationjp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class DatesActivity extends AppCompatActivity implements View.OnClickListener{
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dates);

        button = (Button) findViewById ( R.id.button_events_D );
        button.setOnClickListener ( this );
        button = (Button) findViewById ( R.id.button_favorites_D );
        button.setOnClickListener ( this );
    }

    @Override
    public void onClick(View v) {
        switch (v.getId ()) {
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
