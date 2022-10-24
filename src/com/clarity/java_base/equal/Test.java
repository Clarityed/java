package com.clarity.java_base.equal;

/**
 * == 和 equals 的区别是什么
 *
 * @author: clarity
 * @date: 2022年09月02日 15:28
 */
public class Test {

    public static void main(String[] args) {

        String x = "clarity";
        String y = "clarity";
        String z = new String("clarity");

        System.out.println("x与y存储单元是否相同" + (x == y));
        System.out.println("x与z存储单元是否相同" + (x == z));

        System.out.println(x.hashCode()); // 853581844
        System.out.println(y.hashCode()); // 853581844
        System.out.println(z.hashCode()); // 853581844
        System.out.println("x与y的值是否相同" + x.equals(y));
        System.out.println("x与z的值是否相同" + x.equals(z));

    }

}
