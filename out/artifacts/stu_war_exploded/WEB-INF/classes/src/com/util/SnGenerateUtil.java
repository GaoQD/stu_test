package com.util;

/**
 * @ClassName SnGenerateUtil
 * @Author THINK
 * @Date 2019/9/11 10:02
 */

public class SnGenerateUtil {

    public static String generateSn(int clazzId) {
        String sn = "";
        sn = "S" + clazzId + System.currentTimeMillis();
        return sn;
    }

    public static String generateTeaSn(int clazzId) {
        String sn = "";
        sn = "T" + clazzId + System.currentTimeMillis();
        return sn;
    }
}
