package com.example.sport_wear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class register extends AppCompatActivity {
    public EditText Nombresr;
    public EditText Correor;
    public Button IraConfiguracion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Nombresr = findViewById(R.id.Nom);
        Correor = findViewById(R.id.CorreoEle);
        IraConfiguracion = findViewById(R.id.SiguienteaConfirmacion);

        IraConfiguracion.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Bundle EnviarDatos = new Bundle();
                EnviarDatos.putString("KeyDatos",Nombresr.getText().toString());

                Intent intent = new Intent(register.this, confirmation.class);
                intent.putExtras(EnviarDatos);
                startActivity(intent);


            }
        });






    }

}