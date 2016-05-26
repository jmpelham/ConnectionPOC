package com.morethanwinners.connectionpoc1;

import android.location.Address;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.morethanwinners.business.Business;

import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    @Ignore
    public void createBusinesses() throws Exception {
        ArrayList<Business> businessList = new ArrayList<>() ;

        businessList.add(new Business("McDonalds","555-0000","Food"));
        businessList.add(new Business("Chick Fil A","555-0001","Food"));
        businessList.add(new Business("Red Lobster","555-0002","Food"));
        businessList.add(new Business("Subway","555-0003","Food"));
        businessList.add(new Business("Bojangles","555-0004","Food"));
        businessList.add(new Business("Handy Man","555-0005","Service"));
        businessList.add(new Business("Lawn Care Plus","555-0006","Service"));
        businessList.add(new Business("Car Detailers","555-0007","Service"));
        businessList.add(new Business("McDonalds","555-0008","Food"));
        businessList.add(new Business("Brokers 4 Brothas","555-0009","Financial"));
        businessList.add(new Business("Super Tax","555-0010","Financial"));
        businessList.add(new Business("Black Folk Loans","555-0011","Financial"));

        //ListAdapter listAdapter = new ArrayAdapter <String> (this, android.R.layout., businessList);
       // ListView byNameListView = (ListView)findViewById(R.id.byNameListView);
       // byNameListView.setAdapter(listAdapter);

    }
}