package com.itstudy.homework.oct24;

public class URL判断 {

    public static void main(String[] args) {

        panduan("https://www.baidu.com");
    }

    public static void panduan(String str){

        if (str.startsWith("https")){

            str=str.replace("https","http");
            System.out.println("!!!!!!"+str);
        }else {
            System.out.println("url不是加密网址");
        }


        if (str.endsWith(".jpg")||str.endsWith(".png")||str.endsWith(".gif")){
            System.out.println(str+">--"+str.substring(str.length()-4));


        }else {
            System.out.println("不是图片");
        }


    }
}
