package com.example.user.actionbarproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
Toolbar toolbar;

    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolb);
        listview=findViewById(R.id.listv);
        setSupportActionBar(toolbar);
        getSupportActionBar().setLogo(R.drawable.search);
        ArrayList<String> list = new ArrayList<String>();
    for (int i=0;i<50;i++){
list.add("F16SW"+i);
}
final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,android.R.id.text1,list);
listview.setAdapter(adapter);
listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view,int position, long id){
    String pos = (String) listview.getItemAtPosition(position);
        Toast.makeText(getApplicationContext(),"User Clicked " + pos , Toast.LENGTH_LONG).show();





    }


});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inf =getMenuInflater();
        inf.inflate(R.menu.menu, menu);
return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
   switch (item.getItemId()) {
       case R.id.aboutitem:
           Toast.makeText(this, "You have selected About Menu", Toast.LENGTH_LONG).show();
           return true;
       case R.id.helpitem:
           Toast.makeText(this, "You have selected Help Menu", Toast.LENGTH_LONG).show();
           return true;
       case R.id.settingsitem:
           Toast.makeText(this, "You have selected Settings Menu", Toast.LENGTH_LONG).show();
           return true;
           default:
               return false;

   }


   }









    }
