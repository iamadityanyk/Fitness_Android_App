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

public class men_abs extends AppCompatActivity {
    private ListView listview;
    private String[] names={"Russina Twist","Abdominal Crunches","Leg Raises","Plank","Heel Touch",
            "Spine Lumbar Twist Right","Spine Lumbar Twist Left"};
    private int [] images={R.drawable.men_russina_twist,R.drawable.men_abdominal_crunch,R.drawable.men_leg_raise
            ,R.drawable.men_plank,R.drawable.men_heeltouch,R.drawable.men_spinelumber_right,
            R.drawable.men_spinelumber_left};
    private String [] times={"X30","X20","X20","30 Sec","X30","45 Sec","45 Sec"};
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
