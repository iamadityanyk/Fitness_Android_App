package com.example.fitness_freak;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class women_fitness_arm extends AppCompatActivity {
    private ListView listview;
    private String[] names={"Arm Raise","Side Arm Raise","Tricep Dips","Arm Circles Clockwise",
            "Arm Circles CounterClockwise"
            ,"Diamond Push-Ups","Jumping Jacks","Chest Press Pulse","Leg Barbell Curl Left","Leg Barbell Curl Right",
            "Diagonal Plank",
            "Punches","Push-Ups","Inchworms","Wall Push-Ups","Tricep Stretch Left","Tricep Stretch Right",
            "Standing Biceps Stretch Left","Standing Biceps Stretch Right"};
    private int [] images={R.drawable.women_arm_raise,R.drawable.side_arm_raise,R.drawable.women_tricep_dips,
            R.drawable.women_circles_clock,
    R.drawable.women_circles_clock,R.drawable.women_diamond_gif,R.drawable.women_jumping_j,R.drawable.women_chest_pulse,
    R.drawable.women_leg_left_bar,R.drawable.women_leg_left_bar,R.drawable.women_diagonal_plank,
    R.drawable.women_punches,R.drawable.women_push,R.drawable.women_inch_worm,R.drawable.women_wall_push,
    R.drawable.women_triceps_stretch,R.drawable.women_triceps_stretch,R.drawable.women_bicep_stretch,
            R.drawable.women_bicep_stretch};
    private String [] times={"30 Sec","30 Sec","X8","30 Sec","30 Sec","X6","30 Sec","15 Sec","X8","X8","X10","30 Sec",
            "X10","X8","X12","30 Sec","30 Sec","X30 Sec","30 Sec"};
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_body_women);
        listview=findViewById(R.id.listview);
        adapter adap= new adapter();
        listview.setAdapter(adap);
    }
    public class adapter extends BaseAdapter{
        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view=getLayoutInflater().inflate(R.layout.card_view,viewGroup,false);
            ImageView imageView=view.findViewById(R.id.Imageview);
            TextView textView=view.findViewById(R.id.Exc_Name_Women);
            TextView textView1=view.findViewById(R.id.Women_Times);
            imageView.setImageResource(images[i]);
            textView.setText(names[i]);
            textView1.setText(times[i]);
            return view;
        }
    }
}
