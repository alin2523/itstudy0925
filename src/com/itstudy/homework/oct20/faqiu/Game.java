package com.itstudy.homework.oct20.faqiu;

public class Game {
    public static void main(String[] args) {
        Tennis tennis = new Tennis("李娜",8);
        Football football = new Football("小罗",11);
        tennis.faqiuPrint();
        tennis.defenPrint();
        football.faqiuPrint();
        football.defenPrint();
    }
}
