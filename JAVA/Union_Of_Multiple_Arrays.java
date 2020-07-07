package com.JAVA;

import java.util.Arrays;
import java.util.HashSet;

public class Union_Of_Multiple_Arrays {
    static void union(int[] ...inputArrays){
        HashSet<Integer> UnionSet = new HashSet<>();

        for (int[] inputArray : inputArrays){

            for (int i : inputArray){

                UnionSet.add(i);
            }
        }
        System.out.println(UnionSet);
    }

    public static void main(String[] args)
    {
        int[] inputArray1 = {2, 3, 4, 7, 1};
        int[] inputArray2 = {4, 1, 3, 5};
        int[] inputArray3 = {8, 4, 6, 2, 1};
        int[] inputArray4 = {7, 9, 4, 1};
        union(inputArray1, inputArray2, inputArray3, inputArray4);
    }
}
