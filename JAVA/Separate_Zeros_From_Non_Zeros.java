package com.JAVA;

import java.util.Arrays;

public class Separate_Zeros_From_Non_Zeros {
    public static void main(String args[]){
        int[] arr = {12, 0, 7, 0, 8, 0, 3};
        int[] arr1 = new int[arr.length];
         int counter = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i] != 0 ){
                arr1[counter] = arr[i];
                counter++;
            }
        }
        for (int j=arr1.length;j<arr.length;j++){
            arr1[j] = 0;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

    }

}
