package com.example.david.assignment_2;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment implements View.OnClickListener {


    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_one, container, false); //Fills the layout
        View reseButton = v.findViewById(R.id.imageButton2);
        reseButton.setOnClickListener(this);
        return v;
    }

    public void onClick(View v){
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        FragmentTwo fr = new FragmentTwo();
        ft.replace(R.id.mainLayout, fr);
        ft.commit();

    }


}