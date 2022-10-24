package com.clarity.java_base.equal;

/**
 * 两个对象的 hashCode() 相同，则 equals() 也一定为 true，对吗？
 *
 * @author: clarity
 * @date: 2022年09月02日 16:10
 */
public class HashCodeTest {

    public static void main(String[] args) {

        String str1 = "通话";
        String str2 = "重地";

        System.out.println(String.format("str1: %d | str2: %d", str1.hashCode(), str2.hashCode()));
        System.out.println(str1.equals(str2));

    }

}
