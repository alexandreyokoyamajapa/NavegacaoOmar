package com.example.navegacaoomar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lst = findViewById(R.id.Lista);
        lst.setAdapter(new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                new String[]{"Albania", "Andorra", "Armenia"}
        ));



        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                System.out.println(i);

                if(i==0) {
                    Intent it = new Intent(MainActivity.this, AlbaniaMain2.class);
                    it.putExtra("Albania", "value");
                    startActivity(it);
                }
                else if (i==1) {
                    Intent ti = new Intent(MainActivity.this, AndorraMain3.class);
                    ti.putExtra("Andorra", "value");
                    startActivity(ti);
                }
                else{
                    Intent tti = new Intent(MainActivity.this, ArmeniaMain4.class);
                    tti.putExtra("Armenia", "value");
                    startActivity(tti);

                }
            }
        });
    }
}