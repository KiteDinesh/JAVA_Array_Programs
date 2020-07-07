package com.JAVA;

import java.util.Arrays;

public class Check_The_Equality_Of_Two_Arrays {
    public static void main(String args[]){
        int[] arr1 = {21, 57, 11, 37, 24};
        int[] arr2 = {21, 57, 11, 37, 24};
        boolean isEqual = true;

        if (arr1.length == arr2.length){
            for (int i=0;i<arr1.length;i++){
                if (arr1[i] != arr2[i]){
                    isEqual = false;
                }
            }

        }else {
            isEqual = false;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        if (isEqual){
            System.out.println("The two arrays are equal");
        }else {
            System.out.println("The two arrays are not equal");

        }
    }
}
