package com.itstudy.homework.oct24.test;

import java.util.Calendar;

public class CalenderPrinter {

    public static void main(String[] args) {


//            System.out.println("输入年份:");
//            int year = sc.nextInt();
//            System.out.println("输入月份:");
//            int month = sc.nextInt();
        int year = 2021;
        int month = 10;
        int day = 12;
        CalenderPrinter.getCalender(year, month, day);


    }


    public static void getCalender(int year, int month, int day) {
        System.out.println("\t\t\t" + year + "年" + month + "月");
        System.out.println("________________________________");
        System.out.println("\t日\t一\t二\t三\t四\t五\t六");
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);
        int totalDay = calendar.getActualMaximum(Calendar.DATE);
        for (int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++) {
            System.out.print("\t");
        }

        for (int i = 1; i <= totalDay; i++) {
            calendar.set(year, month - 1, i);
            System.out.print("\t"+i);
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                System.out.println();
            }

        }

    }

}

