package com.clarity.container.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 迭代器怎么使用示例
 *
 * @author: clarity
 * @date: 2022年09月13日 11:49
 */
public class test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("0");
        list.add("1");
        list.add("2");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            iterator.remove();
            System.out.println(str);
        }
        System.out.println(list.size());
    }

}
