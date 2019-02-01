package com.lambton.magicalcardgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShuffleList {
    public  static void firstshuffleArray(List<String> a) {
        int n = a.size();
        Random random = new Random();
        random.nextInt();
        for (int i = 0; i < n; i++) {
            int change = i + random.nextInt(n - i);
            swap(a, i, change);
        }
    }

    private static void swap(List<String> a, int i, int change) {
        String helper = a.get(i);
        a.set(i, a.get(change));
        a.set(change, helper);
    }

    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("A");
        list.add("5");
        list.add("2");
        list.add("7");
        list.add("3");
        list.add("3");
        list.add("6");
        list.add("k");
        firstshuffleArray(list);
        for (String i : list) {
            System.out.println(i+"\t");
        }
    }
}
