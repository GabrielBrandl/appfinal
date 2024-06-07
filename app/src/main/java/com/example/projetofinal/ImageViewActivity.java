package com.example.projetofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView imageView = findViewById(R.id.imageView);

        Glide.with(ImageViewActivity.this).load(getIntent().getStringExtra("image")).into(imageView);
    }
}