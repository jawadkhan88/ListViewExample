package com.example.administrator.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity
{
    HashMap<String, String> record;
    private ArrayList<HashMap<String, String>> list;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*
        Android ListView is a view which groups several items and display them in vertical scrollable list. The list items are automatically inserted to the list using an Adapter that pulls content from a source such as an array or database. It’s one of the basic and most used UI components of android. The most common usages include displaying data in the form of a vertical scrolling list.
        (Name "hassan",Gender "Male",Age "24",Status "Unmarried")
        (Name "Ali", Gender "male", Age "21", Status, "Married")
         */
       // HashMap<String,String> hash=new HashMap<String,String>();
       // hash.put("Name","Hassan");
        list = new ArrayList< HashMap<String, String>  >();

        record = new HashMap<String, String>();
        record.put("name", "Ali");
        record.put("gender", "Male");
        record.put("age", "22");
        record.put("status", "Married");
        list.add(record);

        record = new HashMap<String, String>();
        record.put("name", "Javed");
        record.put("gender", "Male");
        record.put("age", "40");
        record.put("status", "UnMarried");
        list.add(record);

        record = new HashMap<String, String>();
        record.put("name", "Shazia");
        record.put("gender", "Female");
        record.put("age", "18");
        record.put("status", "UnMarried");
        list.add(record);

        record = new HashMap<String, String>();
        record.put("name", "Sana");
        record.put("gender", "Female");
        record.put("age", "20");
        record.put("status", "Married");
        list.add(record);


        ListViewAdapter adapter = new ListViewAdapter(this, list);
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                String s1 = ((TextView)view.findViewById(R.id.textViewName)).getText().toString();
                String s2 = ((TextView)view.findViewById(R.id.textViewGender)).getText().toString();
                String s3 = ((TextView)view.findViewById(R.id.textViewAge)).getText().toString();
                String s4 = ((TextView)view.findViewById(R.id.textViewStatus)).getText().toString();

                Toast.makeText(MainActivity.this, String.valueOf(i) + " " + s1 + " " + s2 + " " + s3 + " " + s4, Toast.LENGTH_SHORT).show();
            }
        });



    }
}
