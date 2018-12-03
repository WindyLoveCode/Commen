package com.bjx.com.commen.Activity;

import android.app.Activity;
import android.os.Bundle;

import com.bjx.com.commen.R;

import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_main)
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
