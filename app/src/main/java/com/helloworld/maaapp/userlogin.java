package com.helloworld.maaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class userlogin extends AppCompatActivity {

    ListView orders,offers;
    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlogin);
        orders=(ListView) findViewById(R.id.urOrders);
        offers=(ListView) findViewById(R.id.urOffers);

//adapter1
        ArrayList<String> arrays=new ArrayList<String>();
        ArrayAdapter adapt= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrays);


        arrays.add("1.chicken butter masala");
        arrays.add("2.paneer butter masala");
        arrays.add("3.masaladosa");

        orders.setAdapter(adapt);

//adapter2
        ArrayList<String> arrays2=new ArrayList<String>();
        ArrayAdapter adapt2= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrays2);


        arrays2.add("1.30% Off");
        arrays2.add("2.40% Off");
        arrays2.add("3.50% Off");

        offers.setAdapter(adapt2);








    }
}
