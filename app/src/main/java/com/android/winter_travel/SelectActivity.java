package com.android.winter_travel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SelectActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        Button myjourney = findViewById(R.id.myj_bot);
        myjourney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectActivity.this, MainActivity.class);
                intent.putExtra("type", 0);
                startActivity(intent);
            }
        });

        Button south = findViewById(R.id.s_bot);
        south.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectActivity.this, PlaceActivity.class);
                intent.putExtra("type", 0);
                startActivity(intent);
            }
        });

        Button north = findViewById(R.id.n_bot);
        north.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectActivity.this, NorthActivity.class);
                intent.putExtra("type", 0);
                startActivity(intent);
            }
        });

    }
}
