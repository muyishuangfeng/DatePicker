# DatePicker
[![](https://jitpack.io/v/muyishuangfeng/DatePicker.svg)](https://jitpack.io/#muyishuangfeng/DatePicker)



![DatePicker.png](https://upload-images.jianshu.io/upload_images/1716569-ecd40d1a83f40f0b.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


### 引用

 + 1 、__project 目录下的build__


     allprojects {
      repositories {
        google()
        jcenter()
        maven { url 'https://jitpack.io' }
     }
    }
    
    
+ 2 、__app 目录下的build下__

      implementation 'com.github.muyishuangfeng:DatePicker:1.0.0'
### 用法

    DatePicker picker = new DatePicker(this);
        picker.setCanLoop(true);
        picker.setWheelModeEnable(true);
        picker.setTopPadding(15);
        picker.setCancelText(getResources().getString(R.string.text_cancel));
        picker.setSubmitText(getResources().getString(R.string.text_confirm));
        picker.setRangeStart(1900, 8, 29);
        picker.setRangeEnd(DateUtils.getCurrentYear(), DateUtils.getCurrentMonth(), DateUtils.getCurrentDay());
        picker.setSelectedItem(1990, 6, 12);
        picker.setWeightEnable(true);
        picker.setCancelTextSize(12);
        picker.setCancelTextColor(Color.parseColor("#FF808080"));
        picker.setSubmitTextColor(getResources().getColor(R.color.colorAccent));
        picker.setCancelTextSize(12);
        picker.setSelectedTextColor(getResources().getColor(R.color.colorBlack));
        picker.setUnSelectedTextColor(getResources().getColor(R.color.colorPrimary));
        picker.setLineColor(getResources().getColor(R.color.colorPrimary));
        picker.setOnDatePickListener(new DatePicker.OnYearMonthDayPickListener() {
            @Override
            public void onDatePicked(String year, String month, String day) {
                if ((year + month + day).compareTo(DateUtils.SDF.format(System.currentTimeMillis())) > 0) {
                    mTxtResult.setText("");
                } else {
                    mTxtResult.setText(day + "/" + month + "/" + year);
                }
            }
        });
        picker.show();
