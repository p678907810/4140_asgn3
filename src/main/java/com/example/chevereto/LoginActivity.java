package com.example.chevereto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private EditText usernameOrMail;
    private EditText password;
    public static final String USERTEXT = "chevereto.button";
    public static final String PASSWORDTEXT = "chevereto.button";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameOrMail = findViewById(R.id.editTextName);
        password = findViewById(R.id.editTextPassword);
    }
    public void loginAction(View view){
        Intent intent = new Intent(getApplicationContext(),DisplayActivity.class);
        String userText = usernameOrMail.getText().toString();
        String passwordText = password.getText().toString();
        intent.putExtra(USERTEXT,userText);
        intent.putExtra(PASSWORDTEXT,passwordText);
        startActivity(intent);
    }
}
