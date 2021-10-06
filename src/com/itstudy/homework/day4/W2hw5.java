package com.itstudy.homework.day4;

import java.util.Scanner;

public class W2hw5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入年龄");
        int age = scanner.nextInt();
        System.out.println("输入性别");
        byte gender = scanner.nextByte();
        System.out.println("票价为");
        System.out.println(buyTicket(age,gender));
    }

    public static double buyTicket(int age, byte gender) {
        double price =3000;

        if (age <=15 || age >=60) {

            price = price*0.5;

        } else if (age <=22){

            price =  price*0.8;
        }else{
            price =  price*0.9;

        }
        if (gender == 2){
            price-=500;
        }
        return price;
    }

}
