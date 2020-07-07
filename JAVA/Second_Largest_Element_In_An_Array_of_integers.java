package com.JAVA;

public class Second_Largest_Element_In_An_Array_of_integers {
    public static void main(String args[]){
        int[] arr = {45,75,84,15,46,28,95,15,74,46,25,38,45,45};
        int FirstLargest = 0,SecondLargest = 0;

        if (arr[0] > arr[1]){
            FirstLargest = arr[0];
            SecondLargest = arr[1];
        }else {
            SecondLargest = arr[1];
            FirstLargest = arr[0];
        }

        for (int i=2;i<arr.length;i++){
            if (arr[i] >FirstLargest){
                SecondLargest = FirstLargest;
                FirstLargest = arr[i];
            }else if (FirstLargest < arr[i] && arr[i] > SecondLargest){
                SecondLargest = arr[i];
            }
        }
        System.out.println(FirstLargest);
        System.out.println(SecondLargest);
    }
}
