package com.example.projetofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btn_entrar = findViewById(R.id.button_entrar);
        EditText txt_usuario = findViewById(R.id.eTextEmail);
        EditText txt_senha = findViewById(R.id.eTextSenha);

        btn_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("admin@dominio.com".equals(txt_usuario.getText().toString()) && "123".equals(txt_senha.getText().toString())) {
                    startActivity(new Intent(Login.this, Home.class));
                }else {
                    Toast.makeText(Login.this, "Credenciais inválidas", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}