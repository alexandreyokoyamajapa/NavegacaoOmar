package com.example.navegacaoomar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class AlbaniaMain2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albania_main2);

        Bundle b = getIntent().getExtras();
        if (b!=null) {
            String value = (String) b.get("key");
        }
    }
}