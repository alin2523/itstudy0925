package com.itstudy.homework.caidan;

public class OrderTest {
    public static void main(String[] args) {
        Order order1 = new Order();
        Order order2 = new Order();
        order1.name="鱼香肉丝";
        order1.number=2;
        order2.name="番茄炒蛋";
        order2.number=1;
        System.out.println(order1.buy());
        System.out.println(order2.buy());

    }
}
