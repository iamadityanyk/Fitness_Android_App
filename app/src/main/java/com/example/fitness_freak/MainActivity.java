package com.example.fitness_freak;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    Button male,female,confirm;
    ConstraintLayout rl1;
    int choose_val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choosing);
        male=findViewById(R.id.Male);
        confirm=findViewById(R.id.Confirm);
        female=findViewById(R.id.Female);
        rl1=findViewById(R.id.constraintl);
        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rl1.setBackgroundResource(R.drawable.womne_choose);
                choose_val=1;
            }
        });
        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choose_val=2;
                rl1.setBackgroundResource(R.drawable.men_choose);
            }
        });
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choose_val==2)
                {
                    Intent intent=new Intent(getApplicationContext(),Motive.class);
                    startActivity(intent);
                }
                else {
                    Intent intent = new Intent(getApplicationContext(),Motive2.class);
                    startActivity(intent);
                }
            }
        });
    }
}