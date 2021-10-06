package com.itstudy.homework.day4;

import java.util.Scanner;

public class W2hw2 {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入性别");
        String gender = scanner.nextLine();
        System.out.println("输入身高");
        int height =scanner.nextInt();
        System.out.println("输入体重");
        int weight=scanner.nextInt();
        int standardWeight;
        if (gender.equals("男")){
            standardWeight= height - 105 ;
        }else{
            standardWeight= height - 100 ;
        }
        System.out.println("身高"+height+"体重"+weight+"标准体重"+standardWeight);


    }

}
