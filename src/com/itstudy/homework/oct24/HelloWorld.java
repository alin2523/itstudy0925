package com.itstudy.homework.oct24;

public class HelloWorld {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("helloworld");
        System.out.println(stringBuffer);

        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer.capacity());
        stringBuffer.delete(0,1);
        System.out.println(stringBuffer);
        stringBuffer.append("aaaa");
        System.out.println(stringBuffer);
        stringBuffer.insert(0,"h");
        System.out.println(stringBuffer);
        stringBuffer.replace(10,15,"bbb");
        System.out.println(stringBuffer);




    }
}
