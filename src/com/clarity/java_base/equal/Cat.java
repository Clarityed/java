package com.clarity.java_base.equal;

/**
 * 猫实体类
 *
 * @author: clarity
 * @date: 2022年09月02日 15:47
 */
public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 探究 equals
     * @param args
     */
    public static void main(String[] args) {
        Cat c1 = new Cat("cat");
        Cat c2 = new Cat("cat");
        System.out.println(c1.equals(c2)); // false
    }

}
