package com.yk.silenct.datepicker.common;


import com.yk.silenct.datepicker.impl.OnItemPickListener;
import com.yk.silenct.datepicker.wheelView.WheelView;

final public class OnItemPickedRunnable implements Runnable {
    final private WheelView wheelView;
    private OnItemPickListener onItemPickListener;

    public OnItemPickedRunnable(WheelView wheelView, OnItemPickListener onItemPickListener) {
        this.wheelView = wheelView;
        this.onItemPickListener = onItemPickListener;
    }

    @Override
    public final void run() {
        onItemPickListener.onItemPicked(wheelView.getCurrentPosition(),wheelView.getCurrentItem());
    }
}
