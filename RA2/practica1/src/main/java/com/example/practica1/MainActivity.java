package com.example.practica1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etNombre, etEdad;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Conectar las variables con los elementos del XML
        etNombre = findViewById(R.id.etNombre);
        etEdad = findViewById(R.id.etEdad);
        btnEnviar = findViewById(R.id.btnEnviar);

        // 2. Qué pasa al pulsar el botón
        btnEnviar.setOnClickListener(v -> {
            String nombre = etNombre.getText().toString().trim();
            String edad = etEdad.getText().toString().trim();

            if (nombre.isEmpty() || edad.isEmpty()) {
                Toast.makeText(this, "Rellena todos los campos", Toast.LENGTH_SHORT).show();
                return;
            }

            // 3. Crear el Intent (el sobre) y meter los datos (la carta)
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("nombre", nombre);
            intent.putExtra("edad", Integer.parseInt(edad));
            startActivity(intent);
        });
    }
}