package com.example.empresahuaral;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button henrrry;
    Button marcial;
    Button roberto;
    Button machi;
    Button julio;

    Button total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        henrrry = (Button) findViewById(R.id.button05);
        marcial = (Button) findViewById(R.id.button06);
        roberto = (Button) findViewById(R.id.button07);
        machi = (Button) findViewById(R.id.button08);
        julio = (Button) findViewById(R.id.button09);
        total = (Button) findViewById(R.id.btotal);
        henrrry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, henrry.class);
                startActivity(i);
            }
        });
        marcial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, marcial.class);
                startActivity(i);
            }
        });
        roberto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, roberto.class);
                startActivity(i);
            }
        });
        machi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, machi.class);
                startActivity(i);
            }
        });
        julio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, julio.class);
                startActivity(i);
            }
        });
        total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, totalventa.class);
                startActivity(i);
            }
        });
    }
}