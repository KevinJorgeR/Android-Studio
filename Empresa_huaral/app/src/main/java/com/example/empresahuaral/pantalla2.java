package com.example.empresahuaral;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pantalla2 extends AppCompatActivity {

    Button productores;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
        productores=(Button)findViewById(R.id.button0);
        productores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(pantalla2.this, MainActivity2.class);
                startActivity(i);
            }
        });
    }
}