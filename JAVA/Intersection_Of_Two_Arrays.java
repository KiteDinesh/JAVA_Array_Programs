package com.JAVA;

import java.util.HashSet;

public class Intersection_Of_Two_Arrays {
    public static void main(String args[]){
        String[] inputArray1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
        String[] inputArray2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR","TWO"};

        HashSet<String> set = new HashSet<>();
        for (int i=0;i<inputArray1.length;i++){
            for (int j=0;j<inputArray2.length;j++){
                if (inputArray1[i].equals(inputArray2[j])){
                    set.add(inputArray1[i]);
                }
            }
        }
        System.out.println(set);
    }
}
