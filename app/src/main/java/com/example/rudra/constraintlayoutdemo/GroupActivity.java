package com.example.rudra.constraintlayoutdemo;

import android.annotation.SuppressLint;
import android.support.constraint.Group;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GroupActivity extends AppCompatActivity {


    private Button btninvisible;
    private Group group;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        group=findViewById(R.id.group);
        setContentView(R.layout.activity_group);

        btninvisible=findViewById(R.id.btninvisible);

        btninvisible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               group.setVisibility(View.GONE);

            }
        });
    }
}
