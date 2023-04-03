package com.example.a03272023;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Map;
import java.util.Set;

public class MainActivity extends Menu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText fNameEdit = (EditText) findViewById(R.id.fNameTxtEdit);
        EditText lNameEdit = (EditText) findViewById(R.id.lNameTxtEdit);
        EditText emailEdit = (EditText) findViewById(R.id.emailTxtEdit);

        Button updateButton = (Button) findViewById(R.id.updateBtn);
        Button verifyButton = (Button) findViewById(R.id.verifyBtn);

        verifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You've been verified!", Toast.LENGTH_LONG).show();
            }
        });

        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fName = fNameEdit.getText().toString();
                String lName = lNameEdit.getText().toString();
                String email = emailEdit.getText().toString();
                SharedPreferences sharedPreferences = getSharedPreferences("Person", MODE_PRIVATE);
                SharedPreferences.Editor spEditor = sharedPreferences.edit();
                spEditor.putString("First Name", fName);
                spEditor.putString("Last Name", lName);
                spEditor.putString("Email Address", email);
                spEditor.apply();
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });
    }
}