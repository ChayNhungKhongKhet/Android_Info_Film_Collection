package com.phamtantb24.infofilmcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {

    EditText userName, password;
    Button loginBtn;
    TextView newUser, forgetPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        mapping();
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = userName.getText().toString().trim();
                String pass = password.getText().toString().trim();
                if (user.equalsIgnoreCase("Pham Ngoc Tan") && pass.equals("123")){
                    Intent intent = new Intent(SignInActivity.this, HomeActivity.class);
                    startActivity(intent);
                }
                else {
                    Context context = getApplicationContext();
                    Toast.makeText(context, "User or password was wrong !", Toast.LENGTH_SHORT).show();
                }
            }
        });
        newUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(intent);
            }
        });
    }
    private void mapping() {
        userName = findViewById(R.id.userNameEditTxt);
        password = findViewById(R.id.passwordEditTxt);
        loginBtn = findViewById(R.id.loginBtn);
        newUser = findViewById(R.id.newUser);
        forgetPass= findViewById(R.id.forgetPass);
    }
}