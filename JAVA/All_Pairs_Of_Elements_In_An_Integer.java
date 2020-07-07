package com.JAVA;

import java.util.Arrays;

public class All_Pairs_Of_Elements_In_An_Integer {
    static void FindElements(int[] arr,int sum){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j] == sum){
                    System.out.println(arr[i]+ " + " + arr[j]+ " = "+ sum);
                }
            }
        }
    }
    public static void main(String args[]){
        FindElements(new int[]{5,8,4,7,12,16,5,-2},10);
    }

}
