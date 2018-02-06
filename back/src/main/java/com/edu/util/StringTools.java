package com.edu.util;

/**
 * @author: lzh
 * @date: 2018/02/06 10:16
 */
public class StringTools {

    public static boolean isNullOrEmpty(String str) {
        return null == str || str.trim().length() == 0;
    }

    public static boolean isNullOrEmpty(Object obj) {
        return null == obj || "".equals(obj);
    }
}
