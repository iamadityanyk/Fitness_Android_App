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

public class women_leg extends AppCompatActivity {
    private ListView listview;
    private String[] names={"Side Hop","Squats","Side-Lying Leg Lift Left","Side-Lying Leg Lift Right",
            "Backward Lunge","Sumo Squat","Knee To Chest Stretch"};
    private int [] images={R.drawable.women_sidehop,R.drawable.women_squats,R.drawable.women_sidelying_leglift,R.drawable.women_sidelying_leglifftright,
    R.drawable.women_backward_lunge,R.drawable.women_sumo_squat,R.drawable.women_knee_chest};
    private String [] times={"30 Sec","X12","X12","X12","X20","X12","30 Sec"};
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
