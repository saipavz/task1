package com.example.user.cricapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button run1,run2,run4,run6,run7,run8,run9,run10,total;
private TextView a,b,c,d;
private int total_runs=0,t1=0,t2=0,t4=0,t6=0,t7=0,t8=0,t9=0,t10=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        run1=findViewById(R.id.button1);
        run2=findViewById(R.id.button2);
        run4=findViewById(R.id.button3);
        run6=findViewById(R.id.button4);
        run7=findViewById(R.id.b1);
        run8=findViewById(R.id.b2);
        run9=findViewById(R.id.b3);
        run10=findViewById(R.id.b4);
        total=findViewById(R.id.button5);
        a=findViewById(R.id.ed1);
        b=findViewById(R.id.ed2);
       c=findViewById(R.id.ed4);
        d=findViewById(R.id.ed6);


        run1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1++;
                run1.setText(t1+"");
            }
        });

        run2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2++;
                run2.setText(t2+"");
            }
        });

        run4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t4++;
                run4.setText(t4+"");
            }
        });

        run6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t6++;
                run6.setText(t6+"");
            }
        });
        run7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t7++;
                run7.setText(t7+"");
            }
        });
        run8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t8++;
                run8.setText(t8+"");
            }
        });
        run9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t9++;
                run9.setText(t9+"");
            }
        });
        run10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t10++;
                run10.setText(t10+"");
            }
        });



        total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int x,y;
                x=( t1 + (2 * t2) + (4 * t4)+ (6 * t6));
                y=(t7+(2*t8)+(4*t9)+(6*t10));
                Toast.makeText(MainActivity.this, "total:", Toast.LENGTH_SHORT).show();
                total_runs =(x-y);
                total.setText(total_runs + "");
            }

        });
    }}


