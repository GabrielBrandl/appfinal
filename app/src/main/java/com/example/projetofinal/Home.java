package com.example.projetofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button voltar;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        voltar =(Button) findViewById(R.id.button_voltar);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivities(new Intent[]{new Intent(Home.this, Login.class)});
            }
        });

    }
}