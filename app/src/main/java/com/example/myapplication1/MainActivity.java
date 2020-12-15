package com.example.myapplication1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.accessibility.AccessibilityManagerCompat;

import android.content.ContentProviderClient;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.concurrent.ConcurrentLinkedQueue;

public class MainActivity extends AppCompatActivity {
    EditText etEmail, etPassword;
    Button btLogin;
    String  stringEmail, stringPassword;
    //correct Email=123@gmail.com
    //correct Password=admin

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btLogin = findViewById(R. id.btLogin);
        etEmail = findViewById(R. id.etEmail);
        etPassword = findViewById(R. id.etPassword);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringEmail = etEmail.getText().toString();
                stringPassword = etPassword.getText().toString();
                if (stringEmail.equals("123@gmail.com") && stringPassword.equals("admin")) {
                    Toast.makeText(MainActivity.this, "LOgin sucess", Toast.LENGTH_SHORT).show();
                } else {

                    Toast.makeText(MainActivity.this, "logiun failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}