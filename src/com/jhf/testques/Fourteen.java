package com.jhf.testques;


import java.util.HashSet;

public class Fourteen {

    /*Given an array A[] and a number x, check for pair in A[] with sum as x
     *
     * 	Input: arr[] = {0, -1, 2, -3, 1}
        sum = -2
        Output: -3, 1
        Valid pair exixts.

        If we calculate the sum of the output,
        1 + (-3) = -2



        Input: arr[] = {1, -2, 1, 0, 5}
       sum = 0
        Output:
        No valid pair exists.
     *
     * */
    public static void main(String[] args) {

        int[] arr = { 1, 5, 9,24};

        System.out.println(chkPair(arr  , 6));

    }

    public static boolean chkPair(int[] nums , int x)
    {
        boolean result = false ;
        HashSet<Integer> s = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            int temp = x-nums[i];
            if(s.contains(temp))
            {
                result = true;
                System.out.println(" "+ x+"is the sum of "+temp+ "  and  "+nums[i]);
            }
            s.add(nums[i]);
        }
        return result;
    }

}
