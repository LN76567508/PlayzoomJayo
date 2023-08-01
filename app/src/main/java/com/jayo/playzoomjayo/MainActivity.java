package com.jayo.playzoomjayo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.jayo.playzoomjayo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    //private Button btnGetStarted;
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnGetStarted.setOnClickListener(v -> {
            Toast.makeText(this, "Comenzar", Toast.LENGTH_SHORT).show();
        });
        binding.txtMoview.setText("Mira tu pelicula \n Favorita");


    }
}