package com.example.zakaullah.lab3_task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    ImageView image;
    TextView name,gender,dob;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        image=findViewById(R.id.imageView);
        name=findViewById(R.id.name);
        gender=findViewById(R.id.gender);
        dob=findViewById(R.id.dob);

        Intent intent=getIntent();
        name.setText("Username: " + intent.getStringExtra("name"));
        gender.setText("Gender: " + intent.getStringExtra("gender"));
        dob.setText("Date of Birth: " + intent.getStringExtra("dob"));

        image.setImageResource(R.drawable.android);
    }
    public void changePic(View v){
        image.setImageResource(R.drawable.androidpie);
    }
}
