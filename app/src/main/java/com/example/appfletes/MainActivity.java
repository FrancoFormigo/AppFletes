package com.example.appfletes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.appfletes.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activarBotones();
    }

    private void activarBotones() {
        Button btSalir = (Button) findViewById(R.id.btSalir);
        btSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                accionBotonSalir();
            }
        });

        Button btUsuario = (Button) findViewById(R.id.btUsuario);
        btUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                accionBotonSoyUsuario();
            }
        });

        Button btFletero = (Button) findViewById(R.id.btFletero);
        btFletero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                accionBotonSoyFletero();
            }
        });
    }

    private void accionBotonSoyUsuario() {
        Intent loginActivity = new Intent(this, LoginActivity.class);
        startActivity(loginActivity);
    }

    private void accionBotonSoyFletero() {
        Intent loginActivity = new Intent(this, LoginActivity.class);
        startActivity(loginActivity);
    }

    private void accionBotonSalir() {
        finish();
    }
}