package com.example.mustafa.mpfragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {
   String rollnum;

   TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        textView=findViewById(R.id.text);
        Intent intent=getIntent();
       rollnum= intent.getStringExtra("rollnumber");
       textView.setText(rollnum);

    }
}
