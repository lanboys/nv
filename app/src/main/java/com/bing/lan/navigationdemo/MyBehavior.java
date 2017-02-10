package com.bing.lan.navigationdemo;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author 蓝兵
 * @time 2017/2/3  10:59
 */
public class MyBehavior extends AppBarLayout.ScrollingViewBehavior {

    protected final LogUtil log = LogUtil.getLogUtil(getClass(), LogUtil.LOG_VERBOSE);

    public MyBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, View child, View dependency) {
        log.d("layoutDependsOn(): " + "child: " + child.getClass().getSimpleName() + "  dependency: " + dependency.getClass().getSimpleName());
        return super.layoutDependsOn(parent, child, dependency);
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, View child, View dependency) {
        // log.d("onDependentViewChanged(): " + "child: " + child.getClass().getSimpleName() + "  dependency: " + dependency.getClass().getSimpleName());
        return super.onDependentViewChanged(parent, child, dependency);
    }
}
