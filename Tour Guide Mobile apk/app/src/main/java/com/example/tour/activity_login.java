package com.example.tour;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class activity_login extends AppCompatActivity {

    EditText editTextName, editTextPassword;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextName = findViewById(R.id.editTextText);
        editTextPassword = findViewById(R.id.editTextNumberPassword);
        loginButton = findViewById(R.id.button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Login logic here
                String username = editTextName.getText().toString();
                String password = editTextPassword.getText().toString();
                String savedUsername = SharedPreferenceHelper.getUsername(activity_login.this);
                String savedPassword = SharedPreferenceHelper.getPassword(activity_login.this);
                if (username.equals(savedUsername) && password.equals(savedPassword)) {
                    navigateToCategory();
                } else {
                    // Handle authentication failure
                }
            }
        });
    }

    private void navigateToCategory() {
        Intent intent = new Intent(activity_login.this, CategoryActivity.class);
        startActivity(intent);
        finish(); // Finish the login activity
    }
}
