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

public class women_abs extends AppCompatActivity {
    private ListView listview;
    private String[] names={"Russina Twist","Abdominal Crunches","Leg Raises","Plank","Heel Touch",
            "Spine Lumbar Twist Left","Spine Lumbar Twist Right"};
    private int [] images={R.drawable.women_russian_twist,R.drawable.women_abdominal,R.drawable.women_leg_raise
    ,R.drawable.women_plank,R.drawable.women_heeltouch,R.drawable.women_spine_lumber_twistl,
            R.drawable.womne_spine_lumberr};
    private String [] times={"X20","X16","X16","20 Sec","X20","30 Sec","30 Sec"};
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
