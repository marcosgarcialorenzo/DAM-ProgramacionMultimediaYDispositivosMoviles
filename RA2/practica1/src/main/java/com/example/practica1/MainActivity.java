package com.example.practica1;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

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
    }
}