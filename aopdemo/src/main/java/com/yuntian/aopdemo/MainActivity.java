package com.yuntian.aopdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.yuntian.aspectjlib.annotation.DebugTrace;

public class MainActivity extends AppCompatActivity {


    private TextView tv_aspect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_aspect=findViewById(R.id.tv_aspect);

        tv_aspect.setOnClickListener((v)->{ testAnnotatedMethod();});

    }

    @DebugTrace
    private void testAnnotatedMethod() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
