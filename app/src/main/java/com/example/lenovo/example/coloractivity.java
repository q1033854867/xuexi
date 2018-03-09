package com.example.lenovo.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by zengpengcheng on 2017/9/19.
 */

public class coloractivity extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        TextView tv_code_six = (TextView) findViewById(R.id.tv_code_six);
        tv_code_six.setBackgroundColor(0x00ff00);
        TextView tv_code_eight = (TextView) findViewById(R.id.tv_code_eight);
        tv_code_eight.setBackgroundColor(0xff00ff00);
    }
}
