package com.example.beresin_uts_10119120;
/**
 * NIM : 10119120
 * NAMA : REICHAN MUHAMMAD MAULANA
 * KELAS : IF3
 * **/
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashActivity.this,ViewPagerActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}