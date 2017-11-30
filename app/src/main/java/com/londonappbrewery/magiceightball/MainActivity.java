package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mButtonAsk;
    private ImageView mImageBall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonAsk = (Button) findViewById(R.id.buttonAsk);
        mButtonAsk.setOnClickListener(this);

        mImageBall = (ImageView) findViewById(R.id.imageBall);


    }

    @Override
    public void onClick(View v) {
        int [] images = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3,
                         R.drawable.ball4, R.drawable.ball5};
        Random random = new Random();
        int number = random.nextInt(5);
        mImageBall.setImageResource(images[number]);

    }
}
