package com.clarity.java_base.stringBufferandBuilder;

/**
 * 如何将字符串反转？
 *
 * @author: clarity
 * @date: 2022年09月11日 11:12
 */
public class Main {
    public static void main(String[] args) {
        StringBuffer strBf = new StringBuffer();
        strBf.append("123456789");
        System.out.println(strBf.reverse());

        StringBuilder strBd = new StringBuilder();
        strBd.append("987654321");
        System.out.println(strBd.reverse());
    }
}
