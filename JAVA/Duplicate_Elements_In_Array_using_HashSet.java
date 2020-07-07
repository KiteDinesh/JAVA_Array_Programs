package com.JAVA;

import java.util.HashSet;

public class Duplicate_Elements_In_Array_using_HashSet {
    public static void main(String args[]){
        String[] arr = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
        HashSet<String> set = new HashSet<>();
        for (int i=0;i<arr.length;i++){
            if (!set.add(arr[i])){
                System.out.println(arr[i]);
            }
        }
    }
}
