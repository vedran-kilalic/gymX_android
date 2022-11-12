package com.example.gymx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class MusclesCalisthenicsActivity extends AppCompatActivity {

    MaterialButton chest,arms,back,legs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscles_calisthenics);

        chest = findViewById(R.id.chest_calisthenics_button);
        back = findViewById(R.id.back_calisthenics_button);
        arms = findViewById(R.id.arms_calisthenics_button);
        legs = findViewById(R.id.legs_calisthenics_button);

        chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusclesCalisthenicsActivity.this,RoutineCalisthenicsChestActivity.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusclesCalisthenicsActivity.this,RoutineCalisthenicsBackActivity.class);
                startActivity(intent);
            }
        });
        arms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusclesCalisthenicsActivity.this,RoutineCalisthenicsArmsActivity.class);
                startActivity(intent);
            }
        });
        legs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MusclesCalisthenicsActivity.this,RoutineCalisthenicsLegsActivity.class);
                startActivity(intent);
            }
        });
    }
}