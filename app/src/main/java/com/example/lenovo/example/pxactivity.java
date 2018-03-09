package com.example.lenovo.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.lenovo.example.util.Utils;


/**
 * Created by zengpengcheng on 2017/9/23.
 */

public class pxactivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_px);

        int dip_10 = Utils.dip2px(this, 10L);
        TextView tv_padding = (TextView) findViewById(R.id.tv_padding);
        tv_padding.setPadding(dip_10, dip_10, dip_10, dip_10);
    }
}
