package com.reshmin.firstapp.textpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.reshmin.firstapp.R;

public class TextActivity extends AppCompatActivity {
private TextView message_Text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        message_Text=findViewById(R.id.msgText);
        String name=getIntent().getStringExtra("key");
        message_Text.setText("Hello "+name+" !!");
    }
}
