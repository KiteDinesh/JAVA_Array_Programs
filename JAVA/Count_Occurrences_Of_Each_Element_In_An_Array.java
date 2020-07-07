package com.JAVA;

import java.util.HashMap;

public class Count_Occurrences_Of_Each_Element_In_An_Array {
    public static void main(String args[]){
        int[] arr = {12, 9, 12, 9, 10, 9, 10, 11};

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i=0;i<arr.length;i++){
            if (map.containsKey(arr[i])){
                int count = map.get(arr[i]);
                map.put(arr[i],count+1);
            }else {
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
    }
}
