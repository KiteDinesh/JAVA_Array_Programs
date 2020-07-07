package com.JAVA;
import java.util.Scanner;

public class Duplicate_Elements_In_An_Array {
    public static void main(String args[]){
        String[] arr = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i].equals(arr[j])){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
