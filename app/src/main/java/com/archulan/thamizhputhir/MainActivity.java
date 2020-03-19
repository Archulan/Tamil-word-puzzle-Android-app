package com.archulan.thamizhputhir;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AlertDialog;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    TextInputEditText aa;
    TextInputEditText ab;
    TextInputEditText ac;
    TextInputEditText ad;
    TextInputEditText ae;
    TextInputEditText af;

    TextInputEditText ba;
    TextInputEditText bb;
    TextInputEditText bc;
    TextInputEditText bd;
    TextInputEditText be;
    TextInputEditText bf;

    TextInputEditText ca;
    TextInputEditText cb;
    TextInputEditText cc;
    TextInputEditText cd;
    TextInputEditText ce;
    TextInputEditText cf;

    TextInputEditText da;
    TextInputEditText db;
    TextInputEditText dc;
    TextInputEditText dd;
    TextInputEditText de;
    TextInputEditText df;

    TextInputEditText ea;
    TextInputEditText eb;
    TextInputEditText ec;
    TextInputEditText ed;
    TextInputEditText ee;
    TextInputEditText ef;

    TextInputEditText fa;
    TextInputEditText fb;
    TextInputEditText fc;
    TextInputEditText fd;
    TextInputEditText fe;
    TextInputEditText ff;

    private ArrayList<String> Answer;
    private ArrayList<String> Input;
    private ArrayList<String> toastHint;
    private ArrayList<TextInputEditText> Cell;

    private  ArrayList<String> fbase;

    private int points = 0;

    public static int score = 0;

    private int hintID = 0;

    public int seconds = 00;
    public int minutes = 00;

    public static int finseconds;
    public static int finminutes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        fbase = new ArrayList<String>();
//
//        FirebaseDatabase.getInstance().setPersistenceEnabled(true);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference myRef = database.getReference("message");
//
//        myRef.setValue("hello");

        final TextView hint =(TextView) findViewById(R.id.hint);


//        DatabaseReference database = FirebaseDatabase.getInstance().getReference();
//
//        database.child("hint").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                for (DataSnapshot noteDataSnapshot : dataSnapshot.getChildren()) {
//                    String note = noteDataSnapshot.getValue(String.class);
//                    fbase.add(note);
//                    System.out.println(fbase);
//                }
//                String hint213 = dataSnapshot.getValue(String.class);
//                hint.setText(hint213);
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//            }
//        });

        Input = new  ArrayList<String>();

        Answer = new  ArrayList<String>();

        toastHint = new ArrayList<String>();

        Answer.add("சா");
        Answer.add("வி");
        Answer.add("");
        Answer.add("ரி");
        Answer.add("ப");
        Answer.add("");

        Answer.add("க");
        Answer.add("ல்");
        Answer.add("வி");
        Answer.add("");
        Answer.add("ண்");
        Answer.add("வி");

        Answer.add("ர");
        Answer.add("");
        Answer.add("ட");
        Answer.add("");
        Answer.add("ணை");
        Answer.add("");

        Answer.add("ம்");
        Answer.add("க");
        Answer.add("அ");
        Answer.add("");
        Answer.add("");
        Answer.add("ம");

        Answer.add("");
        Answer.add("வி");
        Answer.add("");
        Answer.add("வா");
        Answer.add("த்");
        Answer.add("து");

        Answer.add("க");
        Answer.add("ன்");
        Answer.add("ன");
        Answer.add("ல்");
        Answer.add("");
        Answer.add("ரை");

        toastHint.add("KEY");
        toastHint.add("HORSE");
        toastHint.add("EDUCATION");
        toastHint.add("SKY");
        toastHint.add("FARM");
        toastHint.add("HOME");
        toastHint.add("DUCK");

        aa = findViewById(R.id.cell1);
        ab = findViewById(R.id.cell2);
        ac = findViewById(R.id.cell3);
        ad = findViewById(R.id.cell4);
        ae = findViewById(R.id.cell5);
        af = findViewById(R.id.cell6);

        ba = findViewById(R.id.cell7);
        bb = findViewById(R.id.cell8);
        bc = findViewById(R.id.cell9);
        bd = findViewById(R.id.cell10);
        be = findViewById(R.id.cell11);
        bf = findViewById(R.id.cell12);

        ca = findViewById(R.id.cell13);
        cb = findViewById(R.id.cell14);
        cc = findViewById(R.id.cell15);
        cd = findViewById(R.id.cell16);
        ce = findViewById(R.id.cell17);
        cf = findViewById(R.id.cell18);

        da = findViewById(R.id.cell19);
        db = findViewById(R.id.cell20);
        dc = findViewById(R.id.cell21);
        dd = findViewById(R.id.cell22);
        de = findViewById(R.id.cell23);
        df = findViewById(R.id.cell24);

        ea = findViewById(R.id.cell25);
        eb = findViewById(R.id.cell26);
        ec = findViewById(R.id.cell27);
        ed = findViewById(R.id.cell28);
        ee = findViewById(R.id.cell29);
        ef = findViewById(R.id.cell30);

        fa = findViewById(R.id.cell31);
        fb = findViewById(R.id.cell32);
        fc = findViewById(R.id.cell33);
        fd = findViewById(R.id.cell34);
        fe = findViewById(R.id.cell35);
        ff = findViewById(R.id.cell36);


        Cell = new ArrayList<TextInputEditText>();
        Cell.add(aa);
        Cell.add(ab);
        Cell.add(ac);
        Cell.add(ad);
        Cell.add(ae);
        Cell.add(af);

        Cell.add(ba);
        Cell.add(bb);
        Cell.add(bc);
        Cell.add(bd);
        Cell.add(be);
        Cell.add(bf);

        Cell.add(ca);
        Cell.add(cb);
        Cell.add(cc);
        Cell.add(cd);
        Cell.add(ce);
        Cell.add(cf);

        Cell.add(da);
        Cell.add(db);
        Cell.add(dc);
        Cell.add(dd);
        Cell.add(de);
        Cell.add(df);

        Cell.add(ea);
        Cell.add(eb);
        Cell.add(ec);
        Cell.add(ed);
        Cell.add(ee);
        Cell.add(ef);

        Cell.add(fa);
        Cell.add(fb);
        Cell.add(fc);
        Cell.add(fd);
        Cell.add(fe);
        Cell.add(ff);

        aa.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start,int before, int count)
            {
                // TODO Auto-generated method stub
                if(aa.getText().toString().length()== 2)     //size as per your requirement
                {
                    ab.requestFocus();
                }
            }
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
                // TODO Auto-generated method stub

            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
            }

        });

        ba.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start,int before, int count)
            {
                // TODO Auto-generated method stub
                if(ba.getText().toString().length()== 2)     //size as per your requirement
                {
                    ca.requestFocus();
                }
            }
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
                // TODO Auto-generated method stub

            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
            }

        });

        ca.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start,int before, int count)
            {
                // TODO Auto-generated method stub
                if(ca.getText().toString().length()== 2)     //size as per your requirement
                {
                    da.requestFocus();
                }
            }
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
                // TODO Auto-generated method stub

            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
            }

        });

        bb.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start,int before, int count)
            {
                // TODO Auto-generated method stub
                if(bb.getText().toString().length()== 2)     //size as per your requirement
                {
                    bc.requestFocus();
                }
            }
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
                // TODO Auto-generated method stub

            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
            }

        });

        ad.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start,int before, int count)
            {
                // TODO Auto-generated method stub
                if(ad.getText().toString().length()== 2)     //size as per your requirement
                {
                    ae.requestFocus();
                }
            }
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
                // TODO Auto-generated method stub

            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
            }

        });


        aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hintID = 0;
                showHint();
            }
        });

        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hintID = 1;
                showHint();
            }
        });

        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hintID = 2;
                showHint();
            }
        });

        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hintID = 3;
                showHint();
            }
        });

        ae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hintID = 4;
                showHint();
            }
        });

        da.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hintID = 5;
                showHint();
            }
        });

        ee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hintID = 6;
                showHint();
            }
        });

        //Declare the timer
        Timer t = new Timer();
        //Set the schedule function and rate
        t.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                runOnUiThread(new Runnable() {

                    @Override
                    public void run() {
                        TextView tv = (TextView) findViewById(R.id.timer);
                        tv.setText(String.valueOf(minutes)+" : "+String.valueOf(seconds));
                        seconds += 1;

                        if(seconds == 59) {
                            tv.setText(String.valueOf(minutes)+" : "+String.valueOf(seconds));
                            seconds=00;
                            minutes=minutes+1;}

                    }
                });
            }
        }, 0, 1000);


        final Button viewAns =(Button) findViewById(R.id.showAns);
        viewAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FloatingActionButton play = (FloatingActionButton) findViewById(R.id.play);
                play.setEnabled(false);

                finminutes = minutes;
                finseconds = seconds;

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("End Game")
                        .setMessage("Do you want to end the current puzzle?")
                        .setCancelable(false)
                        .setPositiveButton("END GAME", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                viewAns();
                                viewAns.setEnabled(false);
                                Button clrPuz =(Button) findViewById(R.id.clrPuz);
                                clrPuz.setEnabled(false);
                                TextView tv = (TextView) findViewById(R.id.timer);
                                tv.setVisibility(View.INVISIBLE);
                            }
                        })
                        .setNegativeButton("RESUME CURRENT GAME", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                //Creating dialog box
                AlertDialog dialog  = builder.create();
                dialog.show();
            }
        });

        Button clrPuz =(Button) findViewById(R.id.clrPuz);
        clrPuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clrPuz();
            }
        });

        final FloatingActionButton play = findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button clrPuz =(Button) findViewById(R.id.clrPuz);
                clrPuz.setEnabled(false);

                Button viewAns =(Button) findViewById(R.id.showAns);
                viewAns.setEnabled(false);

                TextView tv = (TextView) findViewById(R.id.timer);
                tv.setVisibility(View.INVISIBLE);

                finminutes = minutes;
                finseconds = seconds;

                checkWord();
                play.setEnabled(false);

            }
        });
    }

    void showHint() {
        Toast.makeText(this,"English synonym : " + toastHint.get(hintID),Toast.LENGTH_SHORT).show();
    }

    void viewAns() {
        for (int j = 0; j < 36; j++){
            Cell.get(j).setTextColor(Color.parseColor("#1B5E20"));
            Cell.get(j).setText(Answer.get(j));
        }
        Toast.makeText(this,"Game Over",Toast.LENGTH_SHORT).show();

        aa.setEnabled(false);
        ab.setEnabled(false);
        ac.setEnabled(false);
        ad.setEnabled(false);
        ae.setEnabled(false);
        af.setEnabled(false);
        ba.setEnabled(false);
        bb.setEnabled(false);
        bc.setEnabled(false);
        bd.setEnabled(false);
        be.setEnabled(false);
        bf.setEnabled(false);
        ca.setEnabled(false);
        cb.setEnabled(false);
        cc.setEnabled(false);
        cd.setEnabled(false);
        ce.setEnabled(false);
        cf.setEnabled(false);
        da.setEnabled(false);
        db.setEnabled(false);
        dc.setEnabled(false);
        dd.setEnabled(false);
        de.setEnabled(false);
        df.setEnabled(false);
        ea.setEnabled(false);
        eb.setEnabled(false);
        ec.setEnabled(false);
        ed.setEnabled(false);
        ef.setEnabled(false);
        fa.setEnabled(false);
        fb.setEnabled(false);
        fc.setEnabled(false);
        fd.setEnabled(false);
        fe.setEnabled(false);
        ff.setEnabled(false);
    }

    void  clrPuz() {
        for (int k = 0; k < 36; k++) {
            Cell.get(k).getText().clear();
        }
        Toast.makeText(this,"Puzzle cleared",Toast.LENGTH_LONG).show();
    }

    void checkWord() {
        points = 0;
        Input.clear();
        for (Object cell : Cell) {
            Input.add(((TextInputEditText)cell).getText().toString());
        }

        if (Input.equals(Answer))
            Toast.makeText(this,"Excellent! You have completed the puzzle", Toast.LENGTH_LONG).show();

        else for(int i = 0; i < 35; i++){
//            if (Input.get(i).matches("")) {
//                Toast.makeText(this, "Puzzle Incomplete", Toast.LENGTH_SHORT).show();
//            }
            if (Input.get(i).equals(Answer.get(i))) {
                    Cell.get(i).setTextColor(Color.parseColor("#1B5E20"));
                    points += 1;
            }
            else {
                Cell.get(i).setTextColor(Color.parseColor("#D50000"));
                Cell.get(i).setText(Answer.get(i));
            }
        }
        score = points*4 - 44;

        Intent i = new Intent(this,Score.class);
        startActivity(i);

    }
}