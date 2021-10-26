package com.itstudy.homework.oct20.faqiu2;

public class Game {
    public static void main(String[] args) {
        Tennis tennis = new Tennis("aa",11);
        Football football = new Football();

        FaqiuI faqiuImpl = (name,num) -> System.out.println(num+"号"+name+"发球了");
        FaqiuI faqiuImpl2 = (name,num) -> System.out.println(num+"号"+name+"不发球了");

        faqiuImpl.faqiuPrint(tennis.getName(), tennis.getNum());

    }

}
