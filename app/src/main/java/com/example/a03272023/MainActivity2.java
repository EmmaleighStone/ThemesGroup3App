package com.example.a03272023;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends Menu
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

            SharedPreferences sharedPreferences = getSharedPreferences("Person", MODE_PRIVATE);
            String myString1 = sharedPreferences.getString("First Name","");
            String myString2 = sharedPreferences.getString("Last Name","");
            String myString3 = sharedPreferences.getString("Email Address","");
//        Toast.makeText(this, myString, Toast.LENGTH_LONG.show());
            TextView txtWelcome = (TextView) findViewById(R.id.txtWelcome); //change to correct id
            TextView txtEmail = (TextView) findViewById(R.id.txtEmail); //change to correct id

            txtWelcome.setText("Welcome, " + myString1 + " " + myString2 + "!");
            txtEmail.setText("Your email address is " + myString3 + ".");
        }
    }

