package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] ary = {10,8,12,59,21,40};
        bubble(ary);
        //select(ary);
        //quick(ary);
       // merge(ary);
        for(int i : ary){
            System.out.print(i + ",");
        }

    }
    public static void bubble(int [] a){
        int loops = a.length;
        while(loops > 0) {
            for (int i = 1; i < loops; i++) {
               if(a[i] < a[i-1]){
                   int temp = a[i];
                   a[i] = a[i-1];
                   a[i-1] = temp;
               }
            }
            loops--;
        }
    }
    public static void select(int [] a){

    }
    public static void quick(int [] a){

    }
    public static void merge(int [] a){

    }

}
