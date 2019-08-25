package com.example.bancoaztecabeta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class validacion extends AppCompatActivity {

    private ImageView btnIncio;
    private ImageView btnCuenta;
    private ImageView btnDolar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validacion);

        btnCuenta = (ImageView) findViewById(R.id.btnCuenta);
        btnIncio = (ImageView) findViewById(R.id.btnInicio);
        btnDolar = (ImageView) findViewById(R.id.btnDolar);

        btnCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irCuenta();
            }
        });

        btnIncio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irInicio();
            }
        });
    }

    public  void irCuenta(){
        Intent intent = new Intent(this, cuenta.class);
        startActivity(intent);
    }
    public  void irInicio(){
        Intent intent = new Intent(this, validacion.class);
        startActivity(intent);
    }


}
