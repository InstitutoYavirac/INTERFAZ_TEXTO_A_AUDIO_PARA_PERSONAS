package com.example.marvinloco.interfaz_texto_a_audio_para_personas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Secundaria extends AppCompatActivity implements View.OnClickListener{
        LinearLayout lay1,lay2;
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


        lay1=(LinearLayout)findViewById(R.id.layout1);
        lay2=(LinearLayout)findViewById(R.id.layout2);


        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);

        }

       @Override
        public void onClick(View view) {
           switch (view.getId()) {
               case R.id.btn_1:
                   if (lay1.getVisibility() == View.GONE) {
                       lay1.setVisibility(View.VISIBLE);
                       lay2.setVisibility(View.GONE);

                   } else {
                       lay1.setVisibility(View.GONE);
                   }
                   break;
               case R.id.btn_2:
                   if (lay2.getVisibility() == View.GONE) {
                       lay2.setVisibility(View.VISIBLE);
                       lay1.setVisibility(View.GONE);

                   } else {
                       lay2.setVisibility(View.GONE);
                   }
                   break;
           }



        }
     }
