package com.lightheart.sphr.myfragment.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hjm.bottomtabbar.BottomTabBar;
import com.lightheart.sphr.myfragment.FF.F1;
import com.lightheart.sphr.myfragment.FF.F2;
import com.lightheart.sphr.myfragment.FF.F3;
import com.lightheart.sphr.myfragment.FF.F4;
import com.lightheart.sphr.myfragment.R;

/**
 * Created by 知足 on 2018/4/27.
 */

public class HomeFragment extends Fragment {

    private View view;
    private BottomTabBar mb;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.homeframgent, null, false);
        intData();
        Fragme(new ThreeFragment());
        return view;
    }

    private void intData() {

        mb=(BottomTabBar)view.findViewById(R.id.bottom_tab_bar);

        mb.init(getActivity().getSupportFragmentManager())
                .setImgSize(50,50)
                .setFontSize(8)
                .setTabPadding(4,6,10)
                .setChangeColor(Color.RED,Color.DKGRAY)
                .addTabItem("月光茶人",R.mipmap.ic_launcher, F1.class)
                .addTabItem("优惠",R.mipmap.ic_launcher, F2.class)
                .addTabItem("购物车",R.mipmap.ic_launcher, F3.class)
                .addTabItem("我的",R.mipmap.ic_launcher, F4.class)
                .isShowDivider(false)
                .setOnTabChangeListener(new BottomTabBar.OnTabChangeListener() {
                    @Override
                    public void onTabChange(int position, String name) {

                    }
                });

    }

    public void Fragme(Fragment fragment){
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment,fragment).commit();
    }

}
