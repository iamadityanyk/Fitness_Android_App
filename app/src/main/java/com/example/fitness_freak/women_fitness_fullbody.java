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

public class women_fitness_fullbody extends AppCompatActivity {
    private ListView listview;
    private String[] names={"Jumping Jacks","Incline Push-UPS","KNEE PUSH-UPS","PUSH-UPS","WIDE ARM PUSH-UPS"
            ,"COBRA STRETCH","CHEST STRETCH"};
    private int [] images={R.drawable.women_jumpingjack,R.drawable.women_incline_pushups,R.drawable.women_knee_pushups
            ,R.drawable.women_pushups,R.drawable.women_cobrastretch,R.drawable.women_chest_stretch};
    private String [] times={"X20","X10","X8","X8","X8","30 Sec","30 Sec"};
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
