package com.android.arya.ecommerce;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_screen);
        SignUp();
    }

    void SignUp() {
        final EditText username = (EditText) findViewById(R.id.username);
        final EditText password = (EditText) findViewById(R.id.password);
        Button login_button = (Button) findViewById(R.id.signinbutton);


        login_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (username.getText().toString().equals("user") &&
                                password.getText().toString().equals("123456")) {
                            Toast.makeText(LoginScreen.this, "Username and password is correct",
                                    Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(LoginScreen.this, FirstScreen.class);
                            startActivity(intent);
                        } else {
                            Toast.makeText(LoginScreen.this, "Username and password is NOT correct",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }
}
