package com.util;

/**
 * @ClassName StringUtil
 * @Author THINK
 * @Date 2019/9/11 10:03
 */

public class StringUtil {

    public static boolean isEmpty(String str) {
        if (str == null || "".equals(str)) {
            return true;
        } else {
            return false;
        }
    }
}
