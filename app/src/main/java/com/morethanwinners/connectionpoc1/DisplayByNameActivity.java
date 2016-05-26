package com.morethanwinners.connectionpoc1;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.morethanwinners.business.Business;

import java.util.ArrayList;

public class DisplayByNameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_by_name);

        Intent intent = getIntent();

        ArrayList<Business> businessList = new ArrayList<Business>();
        //ArrayList<Business> businessList = intent.getParcelableArrayListExtra("data");

        businessList.add(new Business("McDonalds","555-0000","Food"));
        businessList.add(new Business("Chick Fil A","555-0001","Food"));
        businessList.add(new Business("Red Lobster","555-0002","Food"));
        businessList.add(new Business("Subway","555-0003","Food"));
        businessList.add(new Business("Bojangles","555-0004","Food"));
        businessList.add(new Business("Handy Man","555-0005","Service"));
        businessList.add(new Business("Lawn Care Plus","555-0006","Service"));
        businessList.add(new Business("Car Detailers","555-0007","Service"));
        businessList.add(new Business("Salon","555-0008","Service"));
        businessList.add(new Business("Brokers 4 Brothas","555-0009","Financial"));
        businessList.add(new Business("Super Tax","555-0010","Financial"));
        businessList.add(new Business("Black Folk Loans","555-0011","Financial"));

        ListAdapter listAdapter = new ArrayAdapter<Business>(this, android.R.layout.simple_list_item_1, businessList);
        ListView byNameListView = (ListView)findViewById(R.id.byNameListView);
        byNameListView.setAdapter(listAdapter);

    }
}
