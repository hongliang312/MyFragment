package com.lightheart.sphr.myfragment.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lightheart.sphr.myfragment.R;

/**
 * Created by 知足 on 2018/4/27.
 */

public class ThreeFragment extends Fragment {
     private View  view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.threefragment, null, false);
        return view;
    }
}
