package com.lightheart.sphr.myrecycleview;

import android.app.Application;

/**
 * Created by 知足 on 2018/4/28.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ImageLoaderUtils.initConfig(this);
    }
}
