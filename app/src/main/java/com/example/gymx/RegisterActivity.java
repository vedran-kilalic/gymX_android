package com.example.gymx;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class RegisterActivity extends AppCompatActivity {

    MaterialButton createAccountButton;
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = findViewById(R.id.register_username_input);
        password = findViewById(R.id.register_password_input);

        createAccountButton = findViewById(R.id.create_account_button);

        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Users users = new Users();
                users.setUsername(username.getText().toString());
                users.setPassword(password.getText().toString());

                if(validateInput(users)){
                    MyDatabase myDatabase = MyDatabase.getInstance(getApplicationContext());
                    UsersDao usersDao = myDatabase.usersDao();
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            usersDao.addUser(users);
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(getApplicationContext(),"User registered", Toast.LENGTH_SHORT).show();
                                }
                            });
                        }
                    }).start();

                }else{
                    Toast.makeText(getApplicationContext(), "Incorrect repeated password or did not fill in all fields.", Toast.LENGTH_SHORT).show();
                }

                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private boolean validateInput(Users users){
        if(users.getUsername().isEmpty()){
            return false;
        }
        return true;
    }
}