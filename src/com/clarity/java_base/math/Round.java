package com.clarity.java_base.math;

/**
 * Math.round() test
 *
 * @author: Clarity
 * @date: 2022年10月24日 10:48
 */
public class Round {

    public static void main(String[] args) {
        long round1 = Math.round(-1.6);
        System.out.println(round1);
        long round2 = Math.round(-1.5);
        System.out.println(round2);
        long round3 = Math.round(-1.4);
        System.out.println(round3);
        long round4 = Math.round(1.6);
        System.out.println(round4);
        long round5 = Math.round(1.5);
        System.out.println(round5);
        long round6 = Math.round(1.4);
        System.out.println(round6);
    }

}
