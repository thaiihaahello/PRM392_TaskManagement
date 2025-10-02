package com.example.taskmanagement;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ResetPasswordActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edtNewPassword, edtConfirm;
    Button btnSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resetpassword);

        edtNewPassword = findViewById(R.id.edtNewPassword);
        edtConfirm = findViewById(R.id.edtConfirm);
        btnSave = findViewById(R.id.btnSave);

        btnSave.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String newPassword = edtNewPassword.getText().toString().trim();
        String confirmPassword = edtConfirm.getText().toString().trim();
        if(newPassword.equals(confirmPassword)){
            // Thực hiện thay đổi mật khẩu ở đây
            Toast.makeText(this, "Mật khẩu đã được thay đổi", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Mật khẩu mới không trùng khớp", Toast.LENGTH_SHORT).show();
        }
    }
}