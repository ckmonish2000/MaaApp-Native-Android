package com.helloworld.maaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class hotelLogin extends AppCompatActivity {
    TextView title,orders,menu;
    ListView ordersitem,menuitems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_login);

        ordersitem=(ListView) findViewById(R.id.orderlist);
        menuitems=(ListView)findViewById(R.id.menuItems);
        ArrayList arrays=new ArrayList<String>();
        ArrayAdapter adapt= new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrays);

        arrays.add("1.chicken butter masala");
        arrays.add("2.paneer butter masala");
        arrays.add("3.masaladosa");


        ordersitem.setAdapter(adapt);


        ArrayList arrays2=new ArrayList<String>();
        arrays.add("1.chicken butter masala");
        arrays.add("2.paneer butter masala");
        arrays.add("3.masaladosa");

        ArrayAdapter adapt2=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrays2);

        menuitems.setAdapter(adapt2);






    }
}
