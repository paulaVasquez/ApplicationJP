package com.example.applicationjp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById ( R.id.button_Dates );
        button.setOnClickListener ( this );
        button = (Button) findViewById ( R.id.button_favorites );
        button.setOnClickListener ( this );
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
