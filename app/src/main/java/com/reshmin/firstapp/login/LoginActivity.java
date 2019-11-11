package com.reshmin.firstapp.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.reshmin.firstapp.R;
import com.reshmin.firstapp.textpage.TextActivity;

public class LoginActivity extends AppCompatActivity {
private EditText name_ed;
private EditText password_ed;
private Button login_bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        name_ed=findViewById(R.id.nameText);
        password_ed=findViewById(R.id.passwordText);
        login_bt=findViewById(R.id.loginBtn);
    }

    public void loginClick(View view) {
        String name=name_ed.getText().toString().trim();
        String password=password_ed.getText().toString().trim();
        //define which activity to go
        Intent intent=new Intent(LoginActivity.this, TextActivity.class);

        if(password.equals("123456")){
            intent.putExtra("key",name);
            startActivity(intent);
            finish();
        }

    }
}
