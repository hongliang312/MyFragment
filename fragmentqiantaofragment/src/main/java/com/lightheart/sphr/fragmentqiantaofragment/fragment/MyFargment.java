package com.lightheart.sphr.fragmentqiantaofragment.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by 知足 on 2018/5/2.
 */

public class MyFargment extends Fragment {
    public static MyFargment newInstance(String title){
        MyFargment fragment = new MyFargment();
        Bundle args = new Bundle();
        args.putString("title", title);
        fragment.setArguments(args);
        return fragment;
    }
}
