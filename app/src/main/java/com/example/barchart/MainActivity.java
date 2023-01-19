package com.example.barchart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BarChart barChart= findViewById(R.id.BarChart);//initialization

        ArrayList<BarEntry> visitors = new ArrayList<>();

        visitors.add(new BarEntry(2014,420));
        visitors.add(new BarEntry(2011,491));
        visitors.add(new BarEntry(2017,412));
        visitors.add(new BarEntry(2015,521));
        visitors.add(new BarEntry(2019,364));
        visitors.add(new BarEntry(2012,664));
        visitors.add(new BarEntry(2016,121));
        visitors.add(new BarEntry(2018,330));
        visitors.add(new BarEntry(2022,550));


        BarDataSet barDataSet  = new BarDataSet(visitors, "Visitors");
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(16f);

        BarData barData = new BarData(barDataSet);

        barChart.setFitBars(true);
        barChart.setData(barData);
        barChart.getDescription().setText("Bar Chart Example");//appeared at the end
        barChart.animateY(3000);


    }
}