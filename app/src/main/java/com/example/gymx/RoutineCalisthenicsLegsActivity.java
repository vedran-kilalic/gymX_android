package com.example.gymx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import java.util.Random;

public class RoutineCalisthenicsLegsActivity extends AppCompatActivity {
    MaterialButton generateRoutine;
    TextView routine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine_calisthenics_legs);
        generateRoutine = findViewById(R.id.gen_routine_calisthenics_legs_button);
        routine = findViewById(R.id.routine_calisthenics_legs);


        generateRoutine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int number = random.nextInt(3);
                if(number == 0){
                    routine.setText("Calisthenics \n" +
                            "4x10 Workout 1 \n" +
                            "4x10 Workout 2 \n" +
                            "4x10 Workout 3 ");
                }
                if(number == 1){
                    routine.setText("Calisthenics \n" +
                            "4x10 Workout 4 \n" +
                            "4x20 Workout 5 \n" +
                            "4x10 Workout 6 \n");
                }
                if(number == 2){
                    routine.setText("Calisthenics \n" +
                            "4x10 Workout 7 \n" +
                            "4x10 Workout 8 \n" +
                            "4x10 Workout 9");
                }

            }
        });
    }
}