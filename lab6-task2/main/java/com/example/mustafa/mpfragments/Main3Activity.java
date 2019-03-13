package com.example.mustafa.mpfragments;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Main3Activity extends Fragment {

    View view;
    TextView secondfrag;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        view = inflater.inflate(R.layout.activity_main3 , container, false);
       secondfrag=view.findViewById(R.id.secondfrag);

        return view;

    }
}
