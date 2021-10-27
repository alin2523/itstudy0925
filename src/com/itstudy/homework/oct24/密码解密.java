package com.itstudy.homework.oct24;

public class 密码解密 {


    public static void main(String[] args) {

        jiemi("the");


    }

    public static void jiemi(String str){

        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            char temp = (char) (str.charAt(i)-4);
            stringBuffer.append(temp);
        }
        System.out.println(stringBuffer);



    }
}
