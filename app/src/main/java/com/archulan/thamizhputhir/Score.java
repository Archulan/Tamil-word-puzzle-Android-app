package com.archulan.thamizhputhir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Score extends AppCompatActivity {

    TextView scoreOut;
    TextView time;

    String marks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        marks = Integer.toString(MainActivity.score);
        scoreOut = findViewById(R.id.Score);
        scoreOut.setText(marks);

        time = findViewById(R.id.time);
        time.setText("Time elapsed : " + String.valueOf(MainActivity.finminutes) + " min  " + String.valueOf(MainActivity.finseconds + " sec"));
    }

    public void goBack(View view) {
        Intent i = new Intent(this,Welcome.class);
        startActivity(i);
    }

    public void result(View view) {
        finish();
    }

    public void tryAgain(View view) {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
