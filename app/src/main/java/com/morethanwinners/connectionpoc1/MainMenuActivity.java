package com.morethanwinners.connectionpoc1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

import com.morethanwinners.business.Business;

import java.util.ArrayList;

public class MainMenuActivity extends AppCompatActivity {

    ArrayList<Business> businessList = new ArrayList<Business>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    public void openByName (View view){
        Intent intent = new Intent(this, DisplayByNameActivity.class);
        //intent.putParcelableArrayListExtra("data", businessList);
        startActivity(intent);
    }

    public void openByType (View view){
        startActivity(new Intent(this, DisplayByTypeActivity.class));
    }
}
