package com.example.david.assignment3.view;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;

import java.util.ArrayList;
import com.example.david.assignment3.ExpFragment;
import com.example.david.assignment3.R;
import com.example.david.assignment3.model.Journey;

public class TestActivity extends ActionBarActivity {
    private ArrayList<Journey> journeyList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.main_activity_layout,new ExpFragment());
        ft.commit();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar
        getMenuInflater().inflate(R.menu.menu_test, menu);
        return true;
    }


}