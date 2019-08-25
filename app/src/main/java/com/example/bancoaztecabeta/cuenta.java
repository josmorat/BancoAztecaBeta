package com.example.bancoaztecabeta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class cuenta extends AppCompatActivity {

    private ImageView btnIr;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta);

        btnIr = (ImageView) findViewById(R.id.btnIr);


        btnIr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ir();
            }
        });
    }

    public void ir(){
        Intent intent = new Intent(this, seguridad.class);
        startActivity(intent);
    }


}
