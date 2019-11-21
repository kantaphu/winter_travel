package com.android.winter_travel;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PlaceDetails2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_details);

        Intent intent = getIntent();
        String placeName = intent.getStringExtra("name");
        int placeImageRes = intent.getIntExtra("image",0);
        int placeImageRes2 = intent.getIntExtra("image2",0);
        String placeText = intent.getStringExtra("text");

        TextView placeTextView = findViewById(R.id.textView);
        placeTextView.setText(placeText);


        ImageView coverImageView2 = findViewById(R.id.cover_image_view2);
        coverImageView2.setImageResource(placeImageRes2);

        ImageView coverImageView = findViewById(R.id.cover_image_view);
        coverImageView.setImageResource(placeImageRes);



        TextView placeNameTextView = findViewById(R.id.place_name_text_view);
        placeNameTextView.setText(placeName);


    }
}
