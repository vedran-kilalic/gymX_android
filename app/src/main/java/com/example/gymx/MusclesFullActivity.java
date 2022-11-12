package com.example.gymx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class MusclesFullActivity extends AppCompatActivity {

    MaterialButton chest,arms,back,legs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscles_full);

        chest = findViewById(R.id.chest_full_button);
        back = findViewById(R.id.back_full_button);
        arms = findViewById(R.id.arms_full_button);
        legs = findViewById(R.id.legs_full_button);

        chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusclesFullActivity.this,RoutineFullChestActivity.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusclesFullActivity.this,RoutineFullBackActivity.class);
                startActivity(intent);
            }
        });
        arms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusclesFullActivity.this,RoutineFullArmsActivity.class);
                startActivity(intent);
            }
        });
        legs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusclesFullActivity.this,RoutineFullLegsActivity.class);
                startActivity(intent);
            }
        });

    }
}