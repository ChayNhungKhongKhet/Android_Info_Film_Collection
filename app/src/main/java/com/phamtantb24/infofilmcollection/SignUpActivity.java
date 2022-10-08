package com.phamtantb24.infofilmcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.phamtantb24.infofilmcollection.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    Button createUser;
    ImageView backLogin;
    EditText userNameEditTxt,passwordEditTxt,locationEditTxt,emailEditTxt,phoneEditTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        mapping();
        String userName = userNameEditTxt.getText().toString().trim();
        String password = passwordEditTxt.getText().toString().trim();
        String location = locationEditTxt.getText().toString().trim();
        String email = emailEditTxt.getText().toString().trim();
        String phone = phoneEditTxt.getText().toString().trim();

        backLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SignInActivity.class);
                startActivity(intent);
            }
        });

        createUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    public void mapping() {
        createUser = findViewById(R.id.createUser);
        passwordEditTxt = findViewById(R.id.passwordEditTxt);
        userNameEditTxt = findViewById(R.id.userNameEditTxt);
        phoneEditTxt = findViewById(R.id.phoneEditTxt);
        emailEditTxt = findViewById(R.id.emailEditTxt);
        backLogin = findViewById(R.id.backLogin);
        locationEditTxt = findViewById(R.id.locationEditTxt);
    }



}