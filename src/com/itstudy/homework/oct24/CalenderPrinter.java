package com.itstudy.homework.oct24;

import java.util.Calendar;

public class CalenderPrinter {

    public static void main(String[] args) {

        printer(2021,10,27);


    }

    public static void printer(int year,int month ,int day){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, 1);
        calendar.get(Calendar.DAY_OF_WEEK);
        calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("\t一\t二\t三\t四\t五\t六\t日");
        for (int i = 2; i < calendar.get(Calendar.DAY_OF_WEEK); i++) {
            System.out.print("\t");
        }
        for (int i = 1; i <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
            if (i==day+1){
                System.out.print("*\t"+i);
            }else {
                System.out.print("\t"+i);
            }

            calendar.set(year, month-1, i);
            if (calendar.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY){
                System.out.println();
            }
        }



    }




}
