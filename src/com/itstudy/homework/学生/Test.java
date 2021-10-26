package com.itstudy.homework.学生;

public class Test {


    public static void main(String[] args) {
        Student studentA =new Student(1,"小红","双鱼座",12345678L,"北京");
        Student studentB =new Student(1,"小红","金牛座",12345678L,"上海");
        Student studentC =new Student(2,"小白","双鱼座",87654321L,"tokyo");

        System.out.println(studentA.equals(studentB));
        System.out.println(studentA.equals(studentC));

    }
}
