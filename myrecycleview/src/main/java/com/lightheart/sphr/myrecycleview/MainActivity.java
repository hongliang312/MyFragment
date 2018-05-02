package com.lightheart.sphr.myrecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity implements HomeView{

    private RecyclerView recycle;
    private HomePreseter homePreseter;
    private RecyclerView recycleview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycle = findViewById(R.id.recycler);

        homePreseter = new HomePreseter(this,this);
        homePreseter.getgege("http://120.27.23.105/product/getCatagory");
        //设置布局和设置适配器
      //  recycleview.setLayoutManager(new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false));

    }

    @Override
    public void jiuSuccess(RecycleViewjiugongge recycleViewjiugongge) {
        recycle.setLayoutManager(new GridLayoutManager(this,2,GridLayoutManager.HORIZONTAL,false));
        recycle.setAdapter(new jiugeAdapter(recycleViewjiugongge.getData(),this));
    }

    @Override
    public void jiuFailed(String err) {

    }
}
