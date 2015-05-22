package com.example.administrator.carlighting;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by houfang on 15/5/23.
 */
public class PayActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.band_pay);
    }

    public void click_to_back(View v) {
        finish();
        overridePendingTransition(R.anim.push_right_in,
                R.anim.push_right_out);
    }
}
