package com.example.rudra.constraintlayoutdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text1;
    private TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);

        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setVisibility(View.GONE);
            }
        });


    }
}
