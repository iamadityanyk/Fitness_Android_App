package com.example.fitness_freak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Second_Activity extends AppCompatActivity {
    CardView card1,card2,card3,card4,card5,card6;
    Button btn;
    int value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        card1=findViewById(R.id.Men_Fullbody);
        card2=findViewById(R.id.Men_Arm);
        card3=findViewById(R.id.Men_Chest);
        card4=findViewById(R.id.Men_Abs);
        card5=findViewById(R.id.Men_Leg);
        card6=findViewById(R.id.Men_Back);
        btn=findViewById(R.id.button);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value=1;
            }
        });
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value=1;
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value=2;
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value=3;
            }
        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value=4;
            }
        });
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value=5;
            }
        });
        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value=6;
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (value==1)
                {
                    Intent intent1= new Intent(getApplicationContext(),men_fullbody.class);
                    startActivity(intent1);
                }
                if (value==2)
                {
                    Intent intent1= new Intent(getApplicationContext(),men_arm.class);
                    startActivity(intent1);
                }
                if (value==3)
                {
                    Intent intent1= new Intent(getApplicationContext(),men_chest.class);
                    startActivity(intent1);
                }
                if (value==4)
                {
                    Intent intent1= new Intent(getApplicationContext(),men_abs.class);
                    startActivity(intent1);
                }
                if (value==5)
                {
                    Intent intent1= new Intent(getApplicationContext(),men_leg.class);
                    startActivity(intent1);
                }
                if (value==6)
                {
                    Intent intent1= new Intent(getApplicationContext(),men_back.class);
                    startActivity(intent1);
                }

            }
        });
    }
}