package com.example.marvinloco.interfaz_texto_a_audio_para_personas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Secundaria extends AppCompatActivity{
        Button btn_3;
        @Override
        protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);

            btn_3=(Button)findViewById(R.id.btn_3);

            btn_3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent itemintent=new Intent(Secundaria.this,Menu.class);
                    Secundaria.this.startActivity(itemintent);
                    finish();}
            });

        }
     }
