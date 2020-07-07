package com.JAVA;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Frequent_Elements_In_Array {
    public static void main(String args[]){
        int[] arr = {4, 5, 8, 7, 4, 7, 6, 7,6,6,6,7,7};

        HashMap<Integer,Integer> map = new HashMap<>();

        for ( int i=0;i<arr.length;i++){
            if (map.containsKey(arr[i])){
               int count = map.get(arr[i]);
                map.put(arr[i],count+1);
            }else {
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
        Set<Map.Entry<Integer,Integer>> set = map.entrySet();

        int element = 0;
        int value = 1;
        for (Map.Entry<Integer,Integer> entry : set){
            if (entry.getValue()>value){
                element = entry.getKey();
                value = entry.getValue();
            }
        }
        System.out.println("The frequent element is: "+element );
        System.out.println("its frequency is: "+value);

    }
}
