package com.example.rudra.constraintlayoutdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GuidelineActivity extends AppCompatActivity {
    private Button btngroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guideline);
        btngroup=findViewById(R.id.btngroup);
        btngroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(GuidelineActivity.this,GroupActivity.class);

                startActivity(intent);
            }
        });
    }
}
