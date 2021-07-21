package sg.edu.rp.c346.id20014063.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<AndroidVersion> al;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);
        al = new ArrayList<>();

        //Adding object into al method 1
        AndroidVersion av1 = new AndroidVersion("Pie", "9.0");
        al.add(av1);
        //Adding obejct into al method 2
        al.add(new AndroidVersion("Burger", "10.0"));
        al.add(new AndroidVersion("Oreo", "7.0"));
        al.add(new AndroidVersion("Cake", "9.0"));



        //aa = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, al);
        adapter = new CustomAdapter(MainActivity.this, R.layout.row, al);

        lv.setAdapter(adapter);
    }
}