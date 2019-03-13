package com.example.zakaullah.lab3_task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText username, email, password, dob;
    Button signup;
    RadioButton male, female;
    RadioGroup radio;
    String enterusername, enteremail, enterpassword, enterdob, gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.editText3);
        email = findViewById(R.id.editText);
        password = findViewById(R.id.editText4);
        dob = findViewById(R.id.editText5);
        signup = findViewById(R.id.button);
        male = findViewById(R.id.radioButton);
        female = findViewById(R.id.radioButton2);
        radio=findViewById(R.id.radio);



        radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==male.getId()){
                    gender="Male";
                } else if(checkedId==female.getId()){
                    gender="Female";
                }
            }
        });

    }

    public void onClick(View view){
        enterusername = username.getText().toString();
        enteremail = email.getText().toString();
        enterpassword = password.getText().toString();
        enterdob = dob.getText().toString();
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("uname", enterusername);
        i.putExtra("pass", enterpassword);
        i.putExtra("gender", gender);
        i.putExtra("dob", enterdob);
        startActivity(i);

    }
}
