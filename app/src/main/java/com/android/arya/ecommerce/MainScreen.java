package com.android.arya.ecommerce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        Button login= (Button) findViewById(R.id.signin);
        Button create= (Button) findViewById(R.id.sign);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextLogin = new Intent(MainScreen.this , LoginScreen.class);
                startActivity(nextLogin);
            }
        });
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextCreate = new Intent(MainScreen.this , SignupScreen.class);
                startActivity(nextCreate);
            }
        });
    }
}
