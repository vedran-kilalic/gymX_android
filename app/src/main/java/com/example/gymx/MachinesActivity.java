package com.example.gymx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class MachinesActivity extends AppCompatActivity {

    MaterialButton fullMachinesButton, barsAndWeightsButton, calisthenicsButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machines);

        fullMachinesButton = findViewById(R.id.full_equipment_button);
        barsAndWeightsButton = findViewById(R.id.bars_and_weights_button);
        calisthenicsButton = findViewById(R.id.calisthenics_button);

        fullMachinesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MachinesActivity.this, MusclesFullActivity.class);
                startActivity(intent);
            }
        });

        barsAndWeightsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MachinesActivity.this, MusclesBarActivity.class);
                startActivity(intent);
            }
        });

        calisthenicsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MachinesActivity.this, MusclesCalisthenicsActivity.class);
                startActivity(intent);
            }
        });



    }


}