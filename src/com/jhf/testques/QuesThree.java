package com.jhf.testques;
//Given 2 Arrays that both are sorted.
//Merge them into one array that is sorted
//Time(O(N))
import  java.util.*;
public class QuesThree {
public static void main(String[] args)
{
    int a[] = {1, 3, 5, 7}, b[] = {2, 4, 6, 8};
    MergeArrays(a, b);
}

private static void MergeArrays(int []arr1,int[] arr2){
    Map <Integer,Boolean> ournewarr=new TreeMap<Integer,Boolean>();
    for (int i = 0; i < arr1.length; i++) {
        ournewarr.put(arr1[i],true);
    }
    for (int j = 0; j < arr2.length;j++) {
        ournewarr.put(arr2[j],true);
    }

for(Map.Entry entry:ournewarr.entrySet()){
    System.out.print(entry.getKey());
}
}
}
