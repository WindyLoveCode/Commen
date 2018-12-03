package com.bjx.com.commen;

import android.app.Application;

import com.bjx.com.commen.share.SharedPreferencesHelper;

/**
 * Created by 994856229 on 2018/11/28.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        SharedPreferencesHelper.init(getApplicationContext());
        super.onCreate();
    }
}
