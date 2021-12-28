package com.seachal.constraintlayoutdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rhino.constraintlayoutdemo.R;

/**
 * 有其他作者发现， BarrierAllowsGoneWidgets  并没有什么效果 [Constraintlayout 新特性：Barrier、Group、Layer、Flow、ImageFilterView等 - f9q - 博客园](https://www.cnblogs.com/sjjg/p/14434334.html)
 */
public class BarrierAllowsGoneWidgets2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.barrier_allows_gone_widgets_2);
    }
}