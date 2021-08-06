package com.bu.yoyo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class Join extends AppCompatActivity {
    ImageButton Login, Sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Login = (ImageButton) findViewById(R.id.login);
        Sign = (ImageButton) findViewById(R.id.signup);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
            }
        });

        Sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Sign.class);
                startActivity(intent);
            }
        });


    }
}