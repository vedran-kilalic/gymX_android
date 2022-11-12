package com.example.gymx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import java.util.Random;

public class RoutineFullChestActivity extends AppCompatActivity {

    MaterialButton generateRoutine;
    TextView routine;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine_full_chest);

        generateRoutine = findViewById(R.id.gen_routine_full_chest_button);
        routine = findViewById(R.id.routine_full_chest);


        generateRoutine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int number = random.nextInt(3);
                if(number == 0){
                routine.setText("4x10 Flat Bench Press \n" +
                        "4x10 Incline Bench Press \n" +
                        "4x10 Decline Bench Press ");
                }
                if(number == 1){
                    routine.setText("4x10 Flat Bench Press \n" +
                            "4x20 push ups \n" +
                            "4x10 mines \n");
                }
                if(number == 2){
                    routine.setText("4x10 Decline Bench Press \n" +
                            "4x10 dips \n" +
                            "4x10 Flat Bench Press");
                }

            }
        });
    }
}