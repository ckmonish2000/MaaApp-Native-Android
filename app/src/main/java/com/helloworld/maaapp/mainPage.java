package com.helloworld.maaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class mainPage extends AppCompatActivity {
//declaration


    Button switchbtn,submitbtn1,submitbtn2;
    EditText userMail,userPwd,hotelMail,hotelPwd;
    ConstraintLayout userlogin,hotellogin;
    int switchcount=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

//initialization

        //switch btns and constrains
                    switchbtn=(Button) findViewById(R.id.switchbtn);
                    userlogin=(ConstraintLayout)findViewById(R.id.userLogin);
                    hotellogin=(ConstraintLayout)findViewById(R.id.hotellogin);

       //editfields and submit btn
                userMail=(EditText)findViewById(R.id.email);
                userPwd=(EditText)findViewById(R.id.pwd);
                submitbtn1=(Button)findViewById(R.id.submitbtn);

                hotelMail=(EditText)findViewById(R.id.hotelemail);
                hotelPwd=(EditText)findViewById(R.id.hotelpwd);
                submitbtn2=(Button)findViewById(R.id.hotelsubmitbtn);



//switch btn logic
        switchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switchcount==0){
                    hotellogin.animate().alpha(0);
                    userlogin.animate().alpha(1);
                    switchbtn.setText("Restaurant LOGIN");
                    switchcount=1;
                }else if(switchcount==1){
                    userlogin.animate().alpha(0);
                    hotellogin.animate().alpha(1);
                    switchbtn.setText(R.string.log_in);
                    switchcount=0;

                }
            }
        });

//user submition btn logic

        submitbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent userDash=new Intent(mainPage.this, com.helloworld.maaapp.userlogin.class);
                startActivity(userDash);
            }
        });


        submitbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotelDash=new Intent(mainPage.this, hotelLogin.class);
                startActivity(hotelDash);
            }
        });



    }
}
