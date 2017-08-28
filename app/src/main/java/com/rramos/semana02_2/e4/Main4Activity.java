package com.rramos.semana02_2.e4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.rramos.semana02_2.R;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

    }
    public void firstImageButton(View view){
        Toast.makeText(this,"comienzo con funciones en Java",Toast.LENGTH_LONG).show();
    }


    public void secondImageButton(View view) {
        Toast.makeText(this,"comienzo con funciones en Java 2.0",Toast.LENGTH_LONG).show();
    }
}
