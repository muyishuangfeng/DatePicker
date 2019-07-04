package com.yk.silenct.datepicker.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MonthUtils {



    public static final int January=1;
    public static final int February=2;
    public static final int March=3;
    public static final int April=4;
    public static final int May=5;
    public static final int June=6;
    public static final int July=7;
    public static final int August=8;
    public static final int September=9;
    public static final int October=10;
    public static final int November=11;
    public static final int December=12;



    /**
     * 初始化月份
     */
    public static ArrayList<String> getMonth(){
        ArrayList<String> months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");
        return months;
    }
    /**
     * 初始化月份
     */
    public static void initMonth(){
        ArrayList<String> months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");
    }

    public static int findMonthIndex(ArrayList<String> items, int item) {
        //折半查找有序元素的索引
        int index = Collections.binarySearch(items, item, new Comparator<Object>() {
            @Override
            public int compare(Object lhs, Object rhs) {
                String lhsStr = lhs.toString();
                String rhsStr = rhs.toString();
                //lhsStr = lhsStr.startsWith("0") ? lhsStr.substring(1) : lhsStr;
                //rhsStr = rhsStr.startsWith("0") ? rhsStr.substring(1) : rhsStr;
                return Integer.parseInt(lhsStr) - Integer.parseInt(rhsStr);
            }
        });
        if (index < 0) {
            throw new IllegalArgumentException("Item[" + item + "] out of range");
        }
        return index;
    }
}
