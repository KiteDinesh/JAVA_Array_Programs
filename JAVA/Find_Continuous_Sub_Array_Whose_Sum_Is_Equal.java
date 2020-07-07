package com.JAVA;

public class Find_Continuous_Sub_Array_Whose_Sum_Is_Equal {
    public static void main(String args[]){
        int[] arr = {12,20,10,5,19,65,45,28,17,13,35};
        int sum = 35;
        int total = 0;
        for (int i=0;i<arr.length;i++){
            total = arr[i];
            for (int j=i+1;j<arr.length;j++){
                total += arr[j];
                if (total == sum){

                    for (int k=i;k<=j;k++){
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println("= "+sum);


                }
            }
        }
    }
}
