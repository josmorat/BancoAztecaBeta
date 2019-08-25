package com.example.bancoaztecabeta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imgViwe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgViwe = (ImageView) findViewById(R.id.imageView2);

        imgViwe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entrar();
            }
        });


    }


    public void entrar(){
        Intent intent = new Intent(this, validacion.class);
        startActivity(intent);
    }


}
