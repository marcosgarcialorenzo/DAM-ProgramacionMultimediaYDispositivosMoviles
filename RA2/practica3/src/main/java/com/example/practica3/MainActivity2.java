package com.example.practica3;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    int num1 = 0;
    int num2 = 0;
    int memoria = 0;
    TextView tvPantalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.activity_main2);
        tvPantalla = findViewById(R.id.tvPantalla);
        registerForContextMenu(tvPantalla);
        tvPantalla.setText(String.valueOf(memoria));
        Button btn0 = findViewById(R.id.btn0);
        btn0.setOnClickListener(v -> tvPantalla.setText(tvPantalla.getText().toString().equals("0")
                ? "0" : tvPantalla.getText().toString() + "0"));
        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(v -> tvPantalla.setText(tvPantalla.getText().toString().equals("0")
                ? "1" : tvPantalla.getText().toString() + "1"));

        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(v -> tvPantalla.setText(tvPantalla.getText().toString().equals("0")
                ? "2" : tvPantalla.getText().toString() + "2"));

        Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(v -> tvPantalla.setText(tvPantalla.getText().toString().equals("0")
                ? "3" : tvPantalla.getText().toString() + "3"));

        Button btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(v -> tvPantalla.setText(tvPantalla.getText().toString().equals("0")
                ? "4" : tvPantalla.getText().toString() + "4"));

        Button btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(v -> tvPantalla.setText(tvPantalla.getText().toString().equals("0")
                ? "5" : tvPantalla.getText().toString() + "5"));

        Button btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(v -> tvPantalla.setText(tvPantalla.getText().toString().equals("0")
                ? "6" : tvPantalla.getText().toString() + "6"));

        Button btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener(v -> tvPantalla.setText(tvPantalla.getText().toString().equals("0")
                ? "7" : tvPantalla.getText().toString() + "7"));

        Button btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(v -> tvPantalla.setText(tvPantalla.getText().toString().equals("0")
                ? "8" : tvPantalla.getText().toString() + "8"));

        Button btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener(v -> tvPantalla.setText(tvPantalla.getText().toString().equals("0")
                ? "9" : tvPantalla.getText().toString() + "9"));
        Button btnC = findViewById(R.id.btnC);
        btnC.setOnClickListener(v -> tvPantalla.setText("0"));
        Button btnMas = findViewById(R.id.btnMas);
        btnMas.setOnClickListener(v -> tvPantalla.setText(tvPantalla.getText().toString() + "+"));
        Button btnMenos = findViewById(R.id.btnMenos);
        btnMenos.setOnClickListener(v -> tvPantalla.setText(tvPantalla.getText().toString() + "-"));
        Button btnIgual = findViewById(R.id.btnIgual);
        btnIgual.setOnClickListener(v -> {
            String expresion = tvPantalla.getText().toString();
            if (expresion.contains("+")) {
                String[] partes = expresion.split("\\+");
                num1 = Integer.parseInt(partes[0]);
                num2 = Integer.parseInt(partes[1]);
                tvPantalla.setText(String.valueOf(num1 + num2));
            } else if (expresion.contains("-")) {
                String[] partes = expresion.split("-");
                num1 = Integer.parseInt(partes[0]);
                num2 = Integer.parseInt(partes[1]);
                tvPantalla.setText(String.valueOf(num1 - num2));
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.opcionesmenu, menu);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.opcionesmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String msj = "";
        int aux = 0;
        int itemId = item.getItemId();
        if (itemId == R.id.menu1) {
            tvPantalla.setText(String.valueOf(0));
        } else if (itemId == R.id.menu2_1 && memoria != 0) {
            tvPantalla.setText(String.valueOf(memoria + "-"));
            return true;
        } else if (itemId == R.id.menu2_2 && memoria != 0) {
            tvPantalla.setText(String.valueOf(memoria + "-"));
            return true;
        } else if (itemId == R.id.menu2_3) {
            memoria = 0;
            return true;
        } else if (itemId == R.id.menu2_4) {
            memoria = Integer.parseInt(tvPantalla.getText().toString());
        }
        return false;
    }
}