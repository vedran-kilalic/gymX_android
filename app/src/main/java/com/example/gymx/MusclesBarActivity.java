package com.example.gymx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class MusclesBarActivity extends AppCompatActivity {

    MaterialButton chest,arms,back,legs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscles_bar);

        chest = findViewById(R.id.chest_bar_button);
        back = findViewById(R.id.back_bar_button);
        arms = findViewById(R.id.arms_bar_button);
        legs = findViewById(R.id.legs_bar_button);

        chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusclesBarActivity.this,RoutineBarChestActivity.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusclesBarActivity.this,RoutineBarBackActivity.class);
                startActivity(intent);
            }
        });
        arms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusclesBarActivity.this,RoutineBarArmsActivity.class);
                startActivity(intent);
            }
        });
        legs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusclesBarActivity.this,RoutineBarLegsActivity.class);
                startActivity(intent);
            }
        });
    }
}