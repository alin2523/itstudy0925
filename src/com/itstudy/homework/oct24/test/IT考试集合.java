package com.itstudy.homework.oct24.test;

import java.util.ArrayList;
import java.util.List;

public class IT考试集合 {
    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();
        list.add("ITPasspot");
        list.add("aws");
        list.add("基本情报");
        list.add("Java考证课");
        list.add("基本情报");

        //list.add(3, "数据库考证");

        list.forEach(item -> System.out.println(item));

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals("aws") && list.get(i + 1).equals("基本情报")) {
                list.add(i + 1, "数据库考证");
            }
        }

        System.out.println(list);
        list.remove("基本情报");
        System.out.println(list);


        try {
            list.remove(7);
        } catch (Exception e) {
            System.out.println("元素不存在");
        }


    }
}
