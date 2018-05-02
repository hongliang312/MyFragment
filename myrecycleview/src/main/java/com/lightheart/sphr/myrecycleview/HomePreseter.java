package com.lightheart.sphr.myrecycleview;

import android.content.Context;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 知足 on 2018/4/28.
 */

public class HomePreseter {

    private Context context;
    private HomeView homeView;
    HomeModel homeModel = new HomeModel();
    Map<String,String> map =new HashMap<>();
    public HomePreseter(Context context, HomeView homeView) {
        this.context = context;
        this.homeView = homeView;
    }

    //得到九宫格的数据
    public void getgege(String url){
        homeModel.getJiugeBean(url, map, new jiugePresenter() {
            @Override
            public void jiuSuccess(RecycleViewjiugongge recycleViewjiugongge) {

                homeView.jiuSuccess(recycleViewjiugongge);

            }

            @Override
            public void jiuFailed(String err) {

                homeView.jiuFailed(err);

            }
        });
    }


    //防止内存泄漏
    public void detach(){
        if(homeView != null){
            homeView = null;
        }
    }

}
