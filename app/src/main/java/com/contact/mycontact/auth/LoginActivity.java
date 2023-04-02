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

public class LoginActivity extends AppCompatActivity {


    private RelativeLayout relativeLayout;
    private ProgressBar progressBar;
    private EditText email, password;
    private Button loginBtn;
    private TextView createBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        relativeLayout = findViewById(R.id.relative_login);
        progressBar = findViewById(R.id.login_progress_bar);
        email = findViewById(R.id.login_email);
        password = findViewById(R.id.login_password);
        loginBtn = findViewById(R.id.login_btn);
        createBtn = findViewById(R.id.login_new_user);

        createBtn.setOnClickListener(v->{
            Intent intent = new Intent(this,SignUpActivity.class);
            startActivity(intent);
        });



    }


}