package com.JAVA;

public class Find_All_The_Leaders_In_An_Integer_Array {
    public static void main(String args[]){
        int[] arr = {12, 9, 7, 14, 8, 6, 3};
        int length = arr.length-1;
        int leader = arr[length];
        System.out.print(leader+" ");
        for (int i=arr.length-1;i>=0;i--){
            if (arr[i] > leader){
                leader = arr[i];
                System.out.print(leader+" ");
            }
        }

    }
}
