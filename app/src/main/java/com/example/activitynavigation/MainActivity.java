package com.example.activitynavigation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNext = findViewById(R.id.btnNext);

        // Navigate to SecondActivity using explicit Intent
        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(
                    MainActivity.this,
                    SecondActivity.class
            );
            startActivity(intent);
        });
    }
}
