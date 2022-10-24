package com.clarity.container.unmodifiableCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 确保一个集合不能被修改
 *
 * @author: scott
 * @date: 2022年09月13日 11:57
 */
public class test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("0");
        list.add("1");
        list.add("2");
        Collection cList = Collections.unmodifiableCollection(list);
        cList.add("3");
        System.out.println(list.size());
    }

}
