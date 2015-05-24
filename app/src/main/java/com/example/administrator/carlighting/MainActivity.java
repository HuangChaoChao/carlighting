package com.example.administrator.carlighting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.carlighting.mine.RentingRecordActivity;
import com.example.administrator.carlighting.mine.WalletActivity;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rent_car_white);

        // configure the SlidingMenu
        /*SlidingMenu menu = new SlidingMenu(this);
        menu.setMode(SlidingMenu.LEFT);
        menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        menu.setShadowWidthRes(R.dimen.shadow_width);
        menu.setShadowDrawable(R.drawable.shadow);
        menu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
        menu.setFadeDegree(0.35f);
        menu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
        menu.setMenu(R.layout.menu);*/

        SlidingMenu slidingMenu = new SlidingMenu(this);
        slidingMenu.setMode(SlidingMenu.LEFT);
        slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        slidingMenu.setBehindWidthRes(R.dimen.slidingmenu_offset);
        slidingMenu.setMenu(R.layout.slidingmenu);
        slidingMenu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
    }

    public void click_to_login(View v) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        intent.putExtras(bundle);
        intent.setClass(this, LoginActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.push_right_in,
                R.anim.push_right_out);

    }

    public void click_to_order_car(View v) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        intent.putExtras(bundle);
        intent.setClass(this, OrderCarActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.push_right_in,
                R.anim.push_right_out);
    }

    public void click_to_use_car(View v) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        intent.putExtras(bundle);
        intent.setClass(this, UseCarActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.push_right_in,
                R.anim.push_right_out);
    }

    //todo 我的个人信息页面没有图片样式
    public void click_to_info(View v) {

    }

    public void click_to_wallet(View v) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        intent.putExtras(bundle);
        intent.setClass(this, WalletActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.push_right_in,
                R.anim.push_right_out);
    }

    public void click_to_record(View v) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        intent.putExtras(bundle);
        intent.setClass(this, RentingRecordActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.push_right_in,
                R.anim.push_right_out);
    }

    //todo 环保贡献没有图片样式
    public void click_to_contribute(View v) {

    }



}
