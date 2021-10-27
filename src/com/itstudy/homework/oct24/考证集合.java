package com.itstudy.homework.oct24;

import java.util.ArrayList;
import java.util.List;

public class 考证集合 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("ITP");
        list.add("aws");
        list.add("基本情报");
        list.add("java考证课");
        list.add("基本情报");

        System.out.println(list);
        //list.add(2,"数据库考证");

        for (int i = 0; i < list.size(); i++) {

            if ( list.get(i).equals("aws")&&list.get(i+1).equals("基本情报"))
                list.add(i+1,"数据库考证");
        }
        System.out.println(list);
        //list.remove("基本情报");
//        for (int i = 0; i < list.size(); i++) {
//            list.remove("基本情报");
//        }
        List<String> list1 = new ArrayList<>();
        list1.add("基本情报");
        list.removeAll(list1);

        System.out.println(list);


        try {
            list.remove(7);
        }catch (Exception e){

            System.out.println("元素不存在");
        }




    }

}
