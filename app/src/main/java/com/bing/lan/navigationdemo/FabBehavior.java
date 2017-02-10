package com.bing.lan.navigationdemo;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author 蓝兵
 * @time 2017/2/3  15:10
 */
public class FabBehavior extends CoordinatorLayout.Behavior<FloatingActionButton> {
    private int mFrameMaxHeight = 100;
    private int mStartY;
    private int mStartX;
    public FabBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, FloatingActionButton child, View dependency) {
        return dependency instanceof Toolbar;
    }

    @Override public boolean onDependentViewChanged(CoordinatorLayout parent, FloatingActionButton child,
            View dependency) {
        //记录开始的Y坐标  也就是toolbar起始Y坐标
        if(mStartY == 0) {
            mStartY = (int) dependency.getY();
        }
        if (mStartX == 0) {
            mStartX = (int) child.getY();
        }

        //计算toolbar从开始移动到最后的百分比
        float percent = dependency.getY()/mStartY;

        int height = child.getHeight();
        float v = height * percent;

        int width = dependency.getWidth();

        int i = width / 2;

        int i1 = mStartX - i;
        float v1 = i1 * percent;

        child.setX(i+(i1-v1));

        //改变child的坐标(从消失，到可见)
        // child.setY(-v);
        return true;
    }
}