package com.example.practica1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tvResultado = findViewById(R.id.tvResultado);

        // Abrir el sobre y sacar los datos con las mismas etiquetas
        Intent intent = getIntent();
        String nombre = intent.getStringExtra("nombre");
        int edad = intent.getIntExtra("edad", 0); // 0 = valor por defecto si no llega nada

        tvResultado.setText("Hola " + nombre + ", tienes " + edad + " años");
    }
}