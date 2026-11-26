package com.example.practica3;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView tvGameOver;
    private Button btnFeedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvGameOver = findViewById(R.id.tvGameOver);
        btnFeedback = findViewById(R.id.btnFeedback);

        Animation miAnimacion = AnimationUtils.loadAnimation(this, R.anim.animacion);
        miAnimacion.setRepeatMode(Animation.RESTART);
        miAnimacion.setRepeatCount(Animation.INFINITE);
        tvGameOver.startAnimation(miAnimacion);

        btnFeedback.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        });

        Toast ts = Toast.makeText(this, "Bienvenido a mi calculadora",Toast.LENGTH_LONG);
        ts.show();

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Alerta").setTitle("MGL");
        AlertDialog dialogo = builder.create();
        dialogo.show();
    }
}