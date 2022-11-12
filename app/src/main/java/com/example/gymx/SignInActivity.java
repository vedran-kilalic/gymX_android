package com.example.gymx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class SignInActivity extends AppCompatActivity {

    MaterialButton signInButton;
    EditText username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        username = findViewById(R.id.username_input);
        password = findViewById(R.id.password_input);

        signInButton = findViewById(R.id.sign_in_sign_in_button);


        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameText = username.getText().toString();
                String passwordText = password.getText().toString();
                if( usernameText.isEmpty() || passwordText.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Fill all fields.", Toast.LENGTH_SHORT).show();
                }else {
                    MyDatabase myDatabase = MyDatabase.getInstance(getApplicationContext());
                    UsersDao usersDao = myDatabase.usersDao();
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            Users users = usersDao.login(usernameText, passwordText);
                            if (users == null){
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        Toast.makeText(getApplicationContext(),"Invalid credentials", Toast.LENGTH_SHORT).show();
                                    }
                                });
                            } else {
                                String name = users.getUsername();
                                Intent intent= new Intent(SignInActivity.this,MainMenuActivity.class);
                                startActivity(intent.putExtra("name", name));
                            }
                        }
                    }).start();
                }

            }
        });
    }

}