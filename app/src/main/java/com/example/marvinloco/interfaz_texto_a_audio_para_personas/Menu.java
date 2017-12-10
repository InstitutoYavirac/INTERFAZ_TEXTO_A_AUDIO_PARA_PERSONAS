package com.example.marvinloco.interfaz_texto_a_audio_para_personas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    Button btn_1,btn_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn_1 = (Button) findViewById(R.id.btn_4);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itemintent = new Intent(Menu.this, Audio.class);
                Menu.this.startActivity(itemintent);
                finish();
            }
        });

        btn_2 = (Button) findViewById(R.id.btn_2);

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itemintent = new Intent(Menu.this, Principal.class);
                Menu.this.startActivity(itemintent);
                finish();
            }
        });

    }
}

