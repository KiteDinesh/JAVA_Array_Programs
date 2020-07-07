package com.JAVA;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Convert_An_Array_To_ArrayList_And_An_ArrayList_To_Array {
    public static void main(String args[]){
        //Array to ArrayList
        String[] arr = {"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};
        System.out.println(Arrays.toString(arr));

        ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Android");
        list1.add("JAVA");
        list1.add("JSP");
        list1.add("JSF");
        System.out.println(list1);

        String[] arr1 = new String[list1.size()];
        list1.toArray(arr1);
        System.out.println(Arrays.toString(arr1));

    }
}
