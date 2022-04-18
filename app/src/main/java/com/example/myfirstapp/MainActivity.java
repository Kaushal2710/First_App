package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView image;

    int[] pics = {R.drawable.meme1,R.drawable.meme2,R.drawable.meme3,R.drawable.meme4,R.drawable.calculator};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image=(ImageView) findViewById(R.id.picture);
    }

    public void  change(View view)
    {
        Random rand = new Random();
        int rand_int = rand.nextInt(6);
        image.setImageResource(pics[rand_int]);
    }
}