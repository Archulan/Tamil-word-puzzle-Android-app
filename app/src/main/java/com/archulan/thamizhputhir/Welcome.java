package com.archulan.thamizhputhir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Welcome extends AppCompatActivity {

    Button play1;
    Button play2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        play1 =(Button) findViewById(R.id.button);
        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(Welcome.this,R.anim.blink_anim);
                play1.startAnimation(animation);
                game1();
            }
        });

        play2 =(Button) findViewById(R.id.button2);
        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(Welcome.this,R.anim.blink_anim);
                play2.startAnimation(animation);
                game2();
            }
        });

    }

    void game1() {
        Intent i = new Intent(this,Game2.class);
        startActivity(i);
    }

    void game2() {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
