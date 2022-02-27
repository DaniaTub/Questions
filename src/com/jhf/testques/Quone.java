package com.jhf.testques;
import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.*;
public class Quone {
    //1-Find the smallest positive number missing from an unsorted array:
    //Input:  {2, 3, 7, 6, 8, -1, -10, 15}
    // Output: 1
    public static void main(String args[]) {
        int arr[] = new int[]{2, 3, 7, 6, 8, -1, -10, 15};
        int out = getSmall(arr);
        System.out.println(out);
    }
    private static int getSmall(int arr[]) {
      int smallNumber =1;
      HashSet <Integer> array=new HashSet<Integer>();
        for (int i = 0; i <arr.length ; i++) {
            if(smallNumber <arr[i]){
                array.add(arr[i]);
            }
            else if(smallNumber ==arr[i]){
                smallNumber=smallNumber+1;

            }
            while (array.contains(smallNumber)){
                array.remove(smallNumber);
                smallNumber=smallNumber+1;
            }
        }
   return smallNumber;
        }
}



