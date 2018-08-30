package com.android.arya.ecommerce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_screen);
        SignUp();
}
void SignUp(){
   final EditText usernameEditText = (EditText) findViewById(R.id.name);
    final EditText usernameEditText1 = (EditText) findViewById(R.id.email);
    final EditText usernameEditText2 = (EditText) findViewById(R.id.phone);
    final EditText usernameEditText3 = (EditText) findViewById(R.id.pass);
    final EditText usernameEditText4 = (EditText) findViewById(R.id.confirmpass);
    Button back = (Button) findViewById(R.id.SignUpButton);
    back.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(usernameEditText.getText().length()==0 || usernameEditText1.getText().length()==0 || usernameEditText2.getText().length()==0 || usernameEditText3.getText().length()==0 || usernameEditText4.getText().length()==0){
                Toast.makeText(SignupScreen.this , "Enter All The Fields !!" , Toast.LENGTH_LONG).show();
            }
            else{
                Intent next = new Intent(SignupScreen.this , MainScreen.class);
                startActivity(next);
            }
        }
    });

}}
