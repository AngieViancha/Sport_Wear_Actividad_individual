package com.example.sport_wear;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class confirmation extends AppCompatActivity {
    public TextView nombreconf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        nombreconf = findViewById(R.id.NombreConf);

        Bundle RecibirDatos = getIntent().getExtras();
        String info = RecibirDatos.getString("KeyDatos");

        nombreconf.setText(info);





    }
}