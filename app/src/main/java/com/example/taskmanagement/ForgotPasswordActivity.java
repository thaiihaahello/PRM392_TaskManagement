package com.example.taskmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ForgotPasswordActivity extends AppCompatActivity implements View.OnClickListener {

    EditText email;
    Button sendLink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgotpassword);

        email = findViewById(R.id.edtEmail);
        sendLink = findViewById(R.id.btnSendLink);

        sendLink.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        if(viewId == R.id.btnSendLink) {
            Intent intent = new Intent(ForgotPasswordActivity.this, ResetPasswordActivity.class); //OTPActivity
            startActivity(intent);
        }
    }
}