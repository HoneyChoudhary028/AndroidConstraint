package com.example.rudra.constraintlayoutdemo;

import android.content.Intent;
import android.support.constraint.Group;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private Button bgtnnextactivity,btncontarintchain,btn9,btn3,btn2;
    private Group group;
    private TextView textPhone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        group = findViewById(R.id.group);
       /* textPhone = findViewById(R.id.textPhone);

        textPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                group.setVisibility(View.GONE);
            }
        });*/

        bgtnnextactivity=findViewById(R.id.bgtnnextactivity);
        btncontarintchain=findViewById(R.id.btncontarintchain);
        btn9=findViewById(R.id.btn9);
        btn3=findViewById(R.id.btn3);
        btn2=findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main2Activity.this,GroupActivity.class);
                startActivity(intent);
            }
        });
        bgtnnextactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(intent);
            }
        });
        btncontarintchain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main2Activity.this,ChainActivity.class);
                startActivity(intent);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main2Activity.this,BarrierActivity.class);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Main2Activity.this,GuidelineActivity.class);
                startActivity(intent);
            }
        });
    }
}
