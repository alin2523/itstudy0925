package com.itstudy.homework.oct24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CardDemo {

    public static void main(String[] args) {


        Card card = new Card();
        System.out.println(Arrays.toString(card.getRank()));
        System.out.println(Arrays.toString(card.getSuits()));

        List<String> list = new ArrayList<>();

        for (int i = 0; i < card.getSuits().length; i++) {


            for (int j = 0; j < card.getRank().length; j++) {
                list.add(card.getSuits()[i]+card.getRank()[j]);
            }
        }

        System.out.println(list);
    }
}
