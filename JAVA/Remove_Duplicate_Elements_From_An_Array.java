package com.JAVA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Remove_Duplicate_Elements_From_An_Array {
    public static void main(String args[]){
        int[] arr = {4, 3, 2, 4, 9, 2};

        HashMap<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = map.keySet();

        for (int i=0;i<arr.length;i++){
            if (map.containsKey(arr[i])){
                int count = map.get(arr[i]);
                map.put(arr[i],count+1);
            }else {
                map.put(arr[i],1);
            }
        }
        int count = 0;
        for (int num : set){
            if (map.get(num) >= 1){
                arr[count] = num;
                count++;

            }
        }
        int[] RemoveDuplicates = new int[count];

        for (int k=0;k<count;k++){
            RemoveDuplicates[k] = arr[k];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(RemoveDuplicates));


    }
}
