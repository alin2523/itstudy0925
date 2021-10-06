package com.itstudy.homework.day4;

import java.util.Scanner;

public class W4hw4 {
    public static void main(String[] args) {

        String[] shengxiao = {"鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊", "猴", "鸡", "狗", "猪"};
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        int index = year % 12 - 4;//年份除以12，鼠年余数为4

        System.out.println(shengxiao[index]);


    }
}
