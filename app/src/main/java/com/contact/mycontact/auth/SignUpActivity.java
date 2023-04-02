package com.contact.mycontact.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.contact.mycontact.R;

public class SignUpActivity extends AppCompatActivity {

    private EditText email, password;
    private Button signUpBtn;
    private RelativeLayout relativeLayout;
    private ProgressBar progressBar;
    private TextView alreadyAccBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        relativeLayout = findViewById(R.id.sign_up_relative);
        progressBar = findViewById(R.id.sign_up_progress_bar);
        email = findViewById(R.id.sign_up_email);
        password = findViewById(R.id.sign_up_password);
        signUpBtn = findViewById(R.id.sign_up_btn);
        alreadyAccBtn = findViewById(R.id.sign_up_already_account);

        alreadyAccBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        });


    }
}