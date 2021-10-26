package com.itstudy.homework.caidan;

public class Order extends Menu{

    Integer orderNumber;
    Integer number;

    @Override
    String buy(){
        return "买了"+number+"份"+name;
    }
}
