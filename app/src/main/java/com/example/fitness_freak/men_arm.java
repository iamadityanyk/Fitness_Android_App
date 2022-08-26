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

public class men_arm extends AppCompatActivity {
    private ListView listview;
    private String[] names={"Arm Raise","Side Arm Raise","Tricep Dips","Arm Circles Clockwise",
            "Arm Circles CounterClockwise"
            ,"Diamond Push-Ups","Jumping Jacks","Bench Press","Leg Barbell Curl Left","Leg Barbell Curl Right",
            "Diagonal Plank",
            "Punches","Push-Ups","Inchworms","Wall Push-Ups","Tricep Stretch Left","Tricep Stretch Right",
            "Standing Biceps Stretch Left","Standing Biceps Stretch Right"};
    private int [] images={R.drawable.men_arm_raise,R.drawable.men_side_armraise,R.drawable.men_tricep_dips
    ,R.drawable.men_arm_circle,R.drawable.men_arm_circle,R.drawable.men_diamond_pushups,
    R.drawable.men_jumping_jack,R.drawable.men_bench_press,R.drawable.men_leg_barbell_left,R.drawable.men_leg_barbell_right
    ,R.drawable.men_diagonal_plank,R.drawable.men_punches,R.drawable.men_pushups,R.drawable.men_inch_worm
    ,R.drawable.men_wall_pushups,R.drawable.men_tricep_stretch_left,R.drawable.men_tricep_stretch_right,
    R.drawable.men_standing_bicep_stretch,R.drawable.men_standing_bicep_stretch};
    private String [] times={"45 Sec","45 Sec","X12","45 Sec","45 Sec","X10","45 Sec","20 Sec","X12","X12","X12","45 Sec",
            "X12","X12","X15","45 Sec","45 Sec","45 Sec","45 Sec"};
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
