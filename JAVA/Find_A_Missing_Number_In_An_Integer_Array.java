package com.JAVA;

public class Find_A_Missing_Number_In_An_Integer_Array {
    public static void main(String args[]) {
        int[] arr = {1, 4, 5, 3, 2, 8, 6};
        int n = 8;
        int SumOfNumbers = n*(n+1)/2;
        int SumOfElements = 0, MissingNumber = 0;
        for (int i=0;i<arr.length;i++){
            SumOfElements += arr[i];
        }

        MissingNumber = SumOfNumbers - SumOfElements;
        System.out.println(MissingNumber);

    }
}
