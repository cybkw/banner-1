package com.to.aboomy.banner;

import android.view.View;
import android.widget.RelativeLayout;

/**
 * auth aboom
 * date 2018/6/21
 * 可以实现该接口，自定义Indicator 可参考内置的{@link IndicatorView}
 */
public interface Indicator {

    void setViewPager(LoopViewPager viewPager);

    View getView();

    RelativeLayout.LayoutParams getParams();
}
