package com.example.lenovo.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

/**
 * Created by zengpengcheng on 2017/9/20.
 */

public class marqueeactivity extends AppCompatActivity implements View.OnClickListener{

    private TextView tv_marquee;
    private boolean bPause = false;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marquee);
        tv_marquee = (TextView) findViewById(R.id.tv_marquee);
        tv_marquee.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        if (v.getId() == R.id.tv_marquee)
        {
            bPause = !bPause;
            if (bPause)
            {
                tv_marquee.setFocusable(false);
                tv_marquee.setFocusableInTouchMode(false);
            }
            else
            {
                tv_marquee.setFocusable(true);
                tv_marquee.setFocusableInTouchMode(true);
            }
        }
    }
}
