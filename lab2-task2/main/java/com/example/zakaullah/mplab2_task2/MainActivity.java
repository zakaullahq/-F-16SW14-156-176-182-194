package com.example.zakaullah.mplab2_task2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView name, rollno, email;
    ImageView propic;
    String names[] = {"yaseen", "zakaullah", "adeel", "Ahmed", "haseeb"};
    String rollnos[] = {"F16SW14", "F16SW156", "F16SW176", "F16SW182", "F16SW194"};
    String emails[] = {"yaseen@xyz.com", "zakaullah@xyz.com", "adeel@xyz.com", "ahmed@xyz.com", "haseeb@xyz.com"};
    int x=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.textView2);
        rollno = findViewById(R.id.textView3);
        email = findViewById(R.id.textView);
        propic = findViewById(R.id.imageView2);

        name.setText(names[0]);
        rollno.setText(rollnos[0]);
        email.setText(emails[0]);


    }

    public void onNextClick(View view){
        if (x>=4){
            Toast toast = Toast.makeText(getApplicationContext(), "That's it!", Toast.LENGTH_SHORT);
            toast.show();
        }
        else{
            x++;
            name.setText(names[x]);
            rollno.setText(rollnos[x]);
            email.setText(emails[x]);

        }

    }

    public void onBackClick (View view){
        if (x<=0){
            Toast toast = Toast.makeText(getApplicationContext(), "Can't go back!", Toast.LENGTH_SHORT);
            toast.show();
        }
        else{
            x--;
            name.setText(names[x]);
            rollno.setText(rollnos[x]);
            email.setText(emails[x]);
        }

    }
}
