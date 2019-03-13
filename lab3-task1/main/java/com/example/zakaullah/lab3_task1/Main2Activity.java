package com.example.zakaullah.lab3_task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    String uname, pass, loguname, logpass, gender, dob;
    EditText ufield, pfield;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ufield = findViewById(R.id.editText2);
        pfield = findViewById(R.id.editText6);
        login = findViewById(R.id.button2);

    }

    public void onClick2(View view){

        Intent i2= getIntent();
        uname = i2.getStringExtra("uname");
        pass = i2.getStringExtra("pass");
        gender=i2.getStringExtra("gender");
        dob=i2.getStringExtra("dob");

        Intent i3 = new Intent(this, Main3Activity.class);
        loguname = ufield.getText().toString();
        logpass = pfield.getText().toString();

        if ((uname.equals(loguname)) && (pass.equals(logpass))) {
            i3.putExtra("name", uname);
            i3.putExtra("gender", gender);
            i3.putExtra("dob", dob);
            startActivity(i3);
        }else{
            Toast toast = Toast.makeText(getApplicationContext(), "Invalid Username or Password!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
