package com.example.aadam.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class signUpFinal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signupfinal);

        Button signUpFinalFinish = findViewById(R.id.signUpFinalFinish);
        Button signUpFinalBack = findViewById(R.id.signUpFinalBack);

        signUpFinalFinish.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                Intent startIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(startIntent);
            }
        } );

        signUpFinalBack.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                Intent startIntent = new Intent(getApplicationContext(), signUp1.class);
                startActivity(startIntent);
            }
        } );
    }
}
