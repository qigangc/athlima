package com.example.aadam.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signUpNext = findViewById(R.id.signUpNext);
        Button signUpBack = findViewById(R.id.signUpBack);

        signUpNext.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                EditText email = findViewById(R.id.editText);
                EditText password = findViewById(R.id.editText2);
                EditText passwordReenter = findViewById(R.id.editText4);
                EditText name = findViewById(R.id.editText5);

                Intent startIntent = new Intent(getApplicationContext(), signUp1.class);
                startActivity(startIntent);
            }
        } );

        signUpBack.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                EditText email = findViewById(R.id.editText);
                EditText password = findViewById(R.id.editText2);
                EditText passwordReenter = findViewById(R.id.editText4);
                EditText name = findViewById(R.id.editText5);

                Intent startIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(startIntent);
            }
        } );
    }
}
