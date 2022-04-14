package com.example.navegacaoomar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class AndorraMain3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andorra_main3);

        ImageView imgView =findViewById(R.id.imagem);
        imgView.setImageResource(R.drawable.pp);
    }
}