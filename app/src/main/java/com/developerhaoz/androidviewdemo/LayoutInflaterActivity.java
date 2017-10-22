package com.developerhaoz.androidviewdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by developerHaoz on 2017/10/13.
 */

public class LayoutInflaterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_inflater);
        LayoutInflater layoutInflater = LayoutInflater.from(this);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.inflater_ll);
        View button = layoutInflater.inflate(R.layout.layout_button, null);
        linearLayout.addView(button);
    }
}
