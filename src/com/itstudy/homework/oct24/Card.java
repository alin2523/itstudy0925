package com.itstudy.homework.oct24;

import java.util.Arrays;

public class Card {

    private String[] rank = {"A","1","2","3","4","5","6","7","8","9","10","J","Q","K"};
    private String[] suits = {"红桃","黑桃","草花","方块"};

    @Override
    public String toString() {
        return "Card{" +
                "rank=" + Arrays.toString(rank) +
                ", suits=" + Arrays.toString(suits) +
                '}';
    }

    public String[] getSuits() {
        return suits;
    }

    public void setSuits(String[] suits) {
        this.suits = suits;
    }

    public String[] getRank() {
        return rank;
    }

    public void setRank(String[] rank) {
        this.rank = rank;
    }
}
