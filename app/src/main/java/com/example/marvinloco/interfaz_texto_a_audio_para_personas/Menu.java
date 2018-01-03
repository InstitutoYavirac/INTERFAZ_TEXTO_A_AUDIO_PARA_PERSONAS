package com.example.marvinloco.interfaz_texto_a_audio_para_personas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Menu extends AppCompatActivity {

    ImageButton btn_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn_4 = (ImageButton) findViewById(R.id.btn_4);

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itemintent = new Intent(Menu.this, Audio.class);
                Menu.this.startActivity(itemintent);
                finish();
            }
        });
    }
}

