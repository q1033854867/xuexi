package com.example.lenovo.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.lenovo.example.util.DisplayUtil;

/**
 * Created by zengpengcheng on 2017/9/19.
 */

public class screenactivity extends AppCompatActivity{

    private TextView tv_screen;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);

        tv_screen = (TextView) findViewById(R.id.tv_screen);
        showScreenInfo();
    }

    private void showScreenInfo() {
        int width = DisplayUtil.getSreenWidth(this);
        int height = DisplayUtil.getSreenHeight(this);
        float density = DisplayUtil.getSreenDensity(this);
        String info = String.format("当前屏幕的宽度是%dpx，高度是%dpx，像素密度是%f",
                width, height, density);
        tv_screen.setText(info);
    }
}
