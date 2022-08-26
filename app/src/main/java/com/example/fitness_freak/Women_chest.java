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

public class Women_chest extends AppCompatActivity {
    private ListView listview;
    private String[] names={"Incline Push-Ups","Wide Arm Push-Ups","Tricep Dips","Jumping Jacks","Chest Stretch",
            "Push-Ups"};
    private int [] images={R.drawable.women_incline_pushups,R.drawable.women_widearm,R.drawable.women_tricep_dips,
            R.drawable.women_jumpingjack,R.drawable.women_chest_stretch,R.drawable.women_push};
    private String [] times={"X6","X5","X6","30 Sec","20 Sec","X6"};
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
