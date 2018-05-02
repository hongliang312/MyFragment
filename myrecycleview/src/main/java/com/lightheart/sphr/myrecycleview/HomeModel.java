package com.lightheart.sphr.myrecycleview;

import com.google.gson.Gson;

import java.util.Map;

/**
 * Created by 知足 on 2018/4/28.
 */

public class HomeModel {

    public void getJiugeBean(String url, Map<String,String> map, final jiugePresenter jiugePresenter){

        OkHttpUtils.getInstance().doPost(url, map, new CallBack() {
            @Override
            public void onSuccess(String json) {

                Gson gson = new Gson();
                RecycleViewjiugongge recycleViewjiugongge = gson.fromJson(json, RecycleViewjiugongge.class);
                jiugePresenter.jiuSuccess(recycleViewjiugongge);
            }

            @Override
            public void onFailed(String err) {

                jiugePresenter.jiuFailed(err);

            }
        });
    }
}

