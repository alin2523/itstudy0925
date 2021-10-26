package com.itstudy.homework.day4;


import java.util.Scanner;

public class W2hw1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String alphabet = scanner.nextLine();

        //写法1 利用正则表达式
        if (alphabet.matches(".*[a-zA-Z]+.*")) {
            System.out.println(alphabet);
        } else {
            System.out.println("error");
        }
        //写法2 创建数组遍历判断
        //写法3 利用Character工具类
        if (Character.isLetter(alphabet.toCharArray()[0])) {
            System.out.println(alphabet);
        } else {
            System.out.println("error");
        }
        //写法4 利用ascii码
        int ascii = (int) alphabet.toCharArray()[0];
        if (ascii >= 65 && ascii <= 90) {
            System.out.println(alphabet);
        } else if (ascii >= 97 && ascii <= 122) {
            System.out.println(alphabet);
        } else {
            System.out.println("error");
        }


    }
}
