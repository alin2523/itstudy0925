package com.itstudy.homework.day4;

import java.util.Scanner;

public class W2hw3 {

    public static void main(String[] args) {

        String[][] cities = {
                {"新宿区", "豊島区", "板橋区"},
                {"川口市", "和光市", "蕨市"},
                {"川崎市", "横浜市"},
                {"大阪市", "此花区"},
                {"上京区", "下京区", "伏見区"},
        };
        String[] prefectures = {"東京都", "埼玉県", "神奈川", "大阪府", "京都府"};

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();//输入都道府县
        //外层循环都道府县，因为要首先确定输入的是哪个都道府县，循环次数设为都道府县数组长度
        for (int i = 0; i < prefectures.length; i++) {
            //内层循环 遍历输出都道府县下的区市，
            // 外层i=0时，内层数组长度为数组cities[0]的长度，
            // 即{"新宿区", "豊島区", "板橋区"}的长度，以此类推
            for (int j = 0; j < cities[i].length; j++) {
                if(input.equals(prefectures[i])){
                    System.out.println(cities[i][j]);
                }

            }

        }


    }
}
