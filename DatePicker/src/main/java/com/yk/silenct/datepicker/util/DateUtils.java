package com.yk.silenct.datepicker.util;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

/**
 * 日期时间工具类
 */
@SuppressLint("SimpleDateFormat")
public class DateUtils extends android.text.format.DateUtils {

    public static final SimpleDateFormat SDF = new SimpleDateFormat("yyyyMMdd");
    private static final SimpleDateFormat sdfYear = new SimpleDateFormat("yyyy");
    private static final SimpleDateFormat sdfMonth = new SimpleDateFormat("MM");
    private static final SimpleDateFormat sdfDay = new SimpleDateFormat("dd");


    /**
     * 根据年份及月份计算每月的天数
     */
    public static int calculateDaysInMonth(int year, int month) {
        // 添加大小月月份并将其转换为list,方便之后的判断
        String[] bigMonths = {"1", "3", "5", "7", "8", "10", "12"};
        String[] littleMonths = {"4", "6", "9", "11"};
        List<String> bigList = Arrays.asList(bigMonths);
        List<String> littleList = Arrays.asList(littleMonths);
        // 判断大小月及是否闰年,用来确定"日"的数据
        if (bigList.contains(String.valueOf(month))) {
            return 31;
        } else if (littleList.contains(String.valueOf(month))) {
            return 30;
        } else {
            if (year <= 0) {
                return 29;
            }
            // 是否闰年
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                return 29;
            } else {
                return 28;
            }
        }
    }

    /**
     * 月日时分秒，0-9前补0
     */
    @NonNull
    public static String fillZero(int number) {
        return number < 10 ? "0" + number : "" + number;
    }

    /**
     * 截取掉前缀0以便转换为整数
     *
     * @see #fillZero(int)
     */
    public static int trimZero(@NonNull String text) {
        try {
            if (text.startsWith("0")) {
                text = text.substring(1);
            }
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            LogUtils.warn(e);
            return 0;
        }
    }

    /**
     * 获取年
     */
    public static int getCurrentYear() {
        return Integer.valueOf(sdfYear.format(System.currentTimeMillis()));
    }

    /**
     * 获取月
     */
    public static int getCurrentMonth() {
        return Integer.valueOf(sdfMonth.format(System.currentTimeMillis()));
    }

    /**
     * 获取日
     */
    public static int getCurrentDay() {
        return Integer.valueOf(sdfDay.format(System.currentTimeMillis()));
    }
}
