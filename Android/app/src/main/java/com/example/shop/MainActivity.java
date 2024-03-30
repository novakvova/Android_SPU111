package com.example.shop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.shop.application.HomeApplication;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //знаходимо елемент на сторінці
        ImageView ivAvatar = findViewById(R.id.ivAvatar);
        //Server ip
        //http://10.0.2.2:5297/images/1.jpg
//        String url = "https://content1.rozetka.com.ua/goods/images/big/415679366.jpg";
//        String url = "http://10.0.2.2:5297/images/1.jpg";
        String url = "https://spu111.itstep.click/images/1.jpg";
        Glide.with(HomeApplication.getAppContext())
                .load(url)
                .apply(new RequestOptions().override(400))
                .into(ivAvatar);
    }
}