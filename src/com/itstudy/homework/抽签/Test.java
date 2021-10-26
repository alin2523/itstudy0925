package com.itstudy.homework.抽签;

import java.util.concurrent.Callable;

public class Test {


    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            chouqian();
        }

    }


    public static  void chouqian(){
        int randomNumber = (int)(Math.random()*(6-1)+1);//(Math.random()*(max-min)+min)

        if (randomNumber == 1 ){
            System.out.println("大吉");
        }else if (randomNumber == 2){
            System.out.println("吉");
        }else if (randomNumber == 3){
            System.out.println("小吉");
        }else if (randomNumber == 4){
            System.out.println("凶");
        }else if (randomNumber == 5){
            System.out.println("大凶");
        }
//        switch (randomNumber){
//            case 1 :
//                System.out.println("大吉");
//                break;
//            case 2 :
//                System.out.println("吉");
//                break;
//            case 3 :
//                System.out.println("小吉");
//                break;
//            case 4 :
//                System.out.println("凶");
//                break;
//            case 5 :
//                System.out.println("大凶");
//                break;
//
//
//
//        }





    }
}
