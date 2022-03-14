package com.example.android_tuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.android_tuan4.Product2;
import com.example.android_tuan4.Product2Adapter;
import com.example.android_tuan4.R;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    GridView gridView;
    ArrayList<Product2> product2s;
    Product2Adapter product2Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        gridView = (GridView) findViewById(R.id.gridView);
        product2s = new ArrayList<>();
        product2s.add(new Product2("Cáp chuyển từ Cổng USB sang PS2","69.000 đ","-39%", R.drawable.giacchuyen_1));
        product2s.add(new Product2("Cáp chuyển từ Cổng USB sang PS2","69.000 đ","-39%",R.drawable.daynguon_1));
        product2s.add(new Product2("Cáp chuyển từ Cổng USB sang PS2","69.000 đ","-39%",R.drawable.dauchuyendoipsps2_1));
        product2s.add(new Product2("Cáp chuyển từ Cổng USB sang PS2","69.000 đ","-39%",R.drawable.dauchuyendoi_1));
        product2s.add(new Product2("Cáp chuyển từ Cổng USB sang PS2","69.000 đ","-39%",R.drawable.carbusbtops2_1));
        product2s.add(new Product2("Cáp chuyển từ Cổng USB sang PS2","69.000 đ","-39%",R.drawable.daucam_1));

        product2Adapter = new Product2Adapter(this,R.layout.grib_sp,product2s);
        gridView.setAdapter(product2Adapter);


    }
}