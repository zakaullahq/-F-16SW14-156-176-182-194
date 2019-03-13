package com.example.zakaullah.bluetoth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3;
    BluetoothAdapter BA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.buttonoff);
        b2 = findViewById(R.id.paitbtn);
        b3 = findViewById(R.id.makedescoverable);


    }

    public void turnbluetoothoff(View view) {

        BA.disable();

    }

    public void finddis(View view) {

        Intent i = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
        startActivity(i);
    }

    public void viewpair(View view) {

        Set<BluetoothDevice> paitbtn = BA.getBondedDevices();

        ListView ListpairDevices =  findViewById(R.id.listpairdevices);

        ArrayList pairlist = new ArrayList();
        for (BluetoothDevice bluetoothDevice : paitbtn) {
            pairlist.add(bluetoothDevice.getName());

        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,pairlist);
        ListpairDevices.setAdapter(arrayAdapter);
    }
}
