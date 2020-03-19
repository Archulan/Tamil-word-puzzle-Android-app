package com.archulan.thamizhputhir;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Timer;

public class Game2 extends AppCompatActivity {

    private ArrayList<String> picAns;

    TextInputEditText picInp;
    ImageView picHint;
    ImageView tick;
    private int counter = 0;
    private int[] pics;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);

        picInp = findViewById(R.id.picAnswer);

        picHint = findViewById(R.id.picHint);

        picAns = new ArrayList<String>();

        picAns.add("அன்னாசி");
        picAns.add("செம்புற்றுப்பழம்");
        picAns.add("முள்ளங்கி");
        picAns.add("வாழை");
        picAns.add("தேங்காய்");
        picAns.add("சோளம்");

        pics = new int[6];

        pics[0] = R.drawable.pineapple;
        pics[1] = R.drawable.strawberry;
        pics[2] = R.drawable.carrot;
        pics[3] = R.drawable.banana;
        pics[4] = R.drawable.coconut;
        pics[5] = R.drawable.corn;

        Button play =(Button) findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkPic();
            }
        });



        Button next = (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextImage();
            }
        });

        Button previous = (Button) findViewById(R.id.previous);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previousImage();
            }
        });
    }

    void checkPic(){
        if (picInp.getText().toString().equals(picAns.get(counter))) {
//            Toast.makeText(this,"EXCELLENT! Correct Answer",Toast.LENGTH_LONG).show();
            picInp.setTextColor(Color.parseColor("#09af00"));
//            picInp.setEnabled(false);

            ImageView tick = (ImageView) findViewById(R.id.tick);
            tick.setVisibility(View.VISIBLE);

            new CountDownTimer(1700, 100) {
                public void onFinish() {
                    nextImage();
                }

                public void onTick(long millisUntilFinished) {
                    // millisUntilFinished    The amount of time until finished.
                }
            }.start();
        }
        else {
            Toast.makeText(this,"TRY AGAIN",Toast.LENGTH_SHORT).show();
            picInp.setTextColor(Color.parseColor("#D50000"));
            picInp.getText().clear();

            ImageView wrong = (ImageView) findViewById(R.id.wrong);
            wrong.setVisibility(View.VISIBLE);

            new CountDownTimer(1000, 1000) {
                public void onFinish() {
                    ImageView wrong = (ImageView) findViewById(R.id.wrong);
                    wrong.setVisibility(View.INVISIBLE);
                }

                public void onTick(long millisUntilFinished) {
                    // millisUntilFinished    The amount of time until finished.
                }
            }.start();
        }
    }

    void nextImage() {
        if (counter < 5) {
            picInp.getText().clear();
            counter += 1;
            picHint.setImageResource(pics[counter]);

            ImageView tick = (ImageView) findViewById(R.id.tick);
            tick.setVisibility(View.INVISIBLE);
        }
    }

    void previousImage() {
        if (counter > 0) {
            picInp.getText().clear();
            counter -= 1;
            picHint.setImageResource(pics[counter]);
        }
    }

    public void goBack(View view) {
        Intent i = new Intent(this,Welcome.class);
        startActivity(i);

    }

//    public void handleAnimation(View view){
//        ObjectAnimator anim = ObjectAnimator.ofFloat(tick,"x",420f);
//
//    }
}
