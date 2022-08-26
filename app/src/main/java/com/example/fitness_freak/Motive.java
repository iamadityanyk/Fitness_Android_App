package com.example.fitness_freak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Motive extends AppCompatActivity {
    CardView card1,card2,card3;
    Button btn;
    int value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motive);
        card1=findViewById(R.id.lose);
        card2=findViewById(R.id.building);
        card3=findViewById(R.id.Fit);
        btn=findViewById(R.id.Motive_Confirm);
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
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (value==1){
                    Intent intent = new Intent(getApplicationContext(),Second_Activity.class);
                    startActivity(intent);
                }
                if (value==2){
                    Intent intent = new Intent(getApplicationContext(),Second_Activity.class);
                    startActivity(intent);
                }
                if (value==3){
                    Intent intent = new Intent(getApplicationContext(),Second_Activity.class);
                    startActivity(intent);
                }
            }
        });
    }
}