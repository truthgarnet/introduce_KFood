package com.bu.yoyo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spalsh);
        //로딩화면 시작.
        Loadingstart();
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }

    private void Loadingstart() {
        Handler handler = new Handler(Looper.getMainLooper());;
        handler.postDelayed(new Runnable() {
            public void run() {
                Intent intent = new Intent(getApplicationContext(), Map.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
    }

}