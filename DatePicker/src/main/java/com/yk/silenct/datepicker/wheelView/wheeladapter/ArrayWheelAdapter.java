package com.yk.silenct.datepicker.wheelView.wheeladapter;

import java.util.List;

/**
 * 滚轮适配器
 */
public class ArrayWheelAdapter<T> implements WheelAdapter {

    /**
     * The default items length
     */
    public static final int DEFAULT_LENGTH = 4;

    // items
    private List<T> items;
    // length
    private int length;

    /**
     * Constructor
     *
     * @param items  the items
     * @param length the max items length
     */
    public ArrayWheelAdapter(List<T> items, int length) {
        this.items = items;
        this.length = length;
    }

    /**
     * Constructor
     *
     * @param items the items
     */
    public ArrayWheelAdapter(List<T> items) {
        this(items, DEFAULT_LENGTH);
    }

    @Override
    public Object getItem(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        }
        return "";
    }

    @Override
    public int getItemsCount() {
        return items.size();
    }

    @Override
    public int indexOf(Object object) {
        return items.indexOf(object);
    }

}
