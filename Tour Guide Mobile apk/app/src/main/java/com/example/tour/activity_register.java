package com.example.tour;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.tour.activity_login;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tour.SharedPreferenceHelper;

public class activity_register extends AppCompatActivity {

    EditText editTextName, editTextPassword;
    Button registerButton, loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editTextName = findViewById(R.id.editTextText);
        editTextPassword = findViewById(R.id.editTextNumberPassword);
        registerButton = findViewById(R.id.button);
        loginButton = findViewById(R.id.button2);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Register logic here
                String username = editTextName.getText().toString();
                String password = editTextPassword.getText().toString();
                SharedPreferenceHelper.saveUserData(activity_register.this, username, password);
                // Move to the login activity
                navigateToLogin();
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToLogin();
            }
        });
    }

    private void navigateToLogin() {
        Intent intent = new Intent(activity_register.this, activity_login.class);
        startActivity(intent);
        finish(); // Finish the current activity so that user cannot navigate back to it
    }
}
