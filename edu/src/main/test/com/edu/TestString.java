package com.edu;

import org.junit.Test;

/**
 * @author lzh
 * @create 2018-02-09-9:46
 */
public class TestString {

    @Test
    public void testString() {
        String s = String.format("{%s}", 0);
        String s1 = String.format("#{%s.paramNameValuePairs.%s}", "lzh", "lzh");
        System.out.println(s1);
    }
}
