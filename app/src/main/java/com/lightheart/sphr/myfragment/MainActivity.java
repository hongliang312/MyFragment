package com.lightheart.sphr.myfragment;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

import com.lightheart.sphr.myfragment.fragment.HomeFragment;
import com.lightheart.sphr.myfragment.fragment.ThreeFragment;
import com.lightheart.sphr.myfragment.fragment.TwoFragment;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    private TextView tv_nearby;
    private TextView tv_recomment;
    private TextView tv_tochen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       setFragment(new HomeFragment());

       intiData();
       oclick();
    }

    private void oclick() {
        tv_nearby.setOnClickListener(this);
        tv_recomment.setOnClickListener(this);
        tv_tochen.setOnClickListener(this);
    }

    private void intiData() {
        tv_nearby = findViewById(R.id.tv_nearby);
        tv_recomment = findViewById(R.id.tv_recomment);
        tv_tochen = findViewById(R.id.tv_aa);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_recomment:
                setFragment(new HomeFragment());
                break;
            case R.id.tv_nearby:
                setFragment(new TwoFragment());
                break;
            case R.id.tv_aa:
                setFragment(new ThreeFragment());

        }
    }

    /**
     * 切换Fragment
     */
    private void setFragment(Fragment f) {
        getSupportFragmentManager().beginTransaction().replace(R.id.home_page_fragment,f).commit();
    }


}
