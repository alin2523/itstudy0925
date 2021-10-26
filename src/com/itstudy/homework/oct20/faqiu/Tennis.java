package com.itstudy.homework.oct20.faqiu;

public class Tennis implements Faqiu,Defen{
    private String name;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Tennis(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String defen() {
        return "第"+number+"号"+name+"选手压制对手于网前，得分！";
    }

    @Override
    public void defenPrint() {

        System.out.println("第"+number+"号"+name+"选手压制对手于网前，得分！");
    }

    @Override
    public String faqiu() {
        return "第"+number+"号"+name+"选手优美地发球！";
    }

    @Override
    public void faqiuPrint() {

        System.out.println("第"+number+"号"+name+"选手优美地发球！");
    }
}
