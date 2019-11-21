package com.android.winter_travel;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //todo: โค้ดที่ต้องการทำงานหลังจาก delay ครบ 3 วินาที
                //ใน() เป็นชื่อที่เราตั้งชื่อไฟล์
                Intent intent = new Intent(SplashActivity.this, SelectActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}