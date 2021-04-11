package com.example.chevereto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent intent = getIntent();
        String usertext = intent.getStringExtra(LoginActivity.USERTEXT);
        String passwordtext = intent.getStringExtra(LoginActivity.PASSWORDTEXT);

        //TextView textView = findViewById(R.id.textbutton);
        //textView.setText(text);
    }
}