package com.example.gymx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import java.util.Random;

public class RoutineFullBackActivity extends AppCompatActivity {

    MaterialButton generateRoutine;
    TextView routine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine_full_back);

        generateRoutine = findViewById(R.id.gen_routine_full_back_button);
        routine = findViewById(R.id.routine_full_back);

        generateRoutine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int number = random.nextInt(3);
                if(number == 0){
                    routine.setText("4x10 Seated Cable Rows \n" +
                            "4x10 Front Lat Pulldown \n" +
                            "4x10 Frontal Rows ");
                }
                if(number == 1){
                    routine.setText("4x20 Pull ups \n" +
                            "4x8 Deadlift \n" +
                            "4x10 Good Mornings \n");
                }
                if(number == 2){
                    routine.setText("4x10 Straight Arm Pulldown \n" +
                            "4x10 Lower back machine \n" +
                            "4x20 pull ups");
                }

            }
        });
    }
}