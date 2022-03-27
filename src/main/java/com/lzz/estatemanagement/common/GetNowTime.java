package com.lzz.estatemanagement.common;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: lzz
 * @DATE: 2022/3/20
 */
public class GetNowTime {
    public static String getNowTime(){
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(now);
    }
}
