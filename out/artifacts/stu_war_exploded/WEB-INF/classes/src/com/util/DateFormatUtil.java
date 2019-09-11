package com.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DateFormatUtil
 * @Author THINK
 * @Date 2019/9/11 9:55
 */

public class DateFormatUtil {

    public static String getFormatDate(Date date,String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        return simpleDateFormat.format(date);
    }
}
