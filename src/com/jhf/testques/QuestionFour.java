package com.jhf.testques;
//Given a number that has duplicates in it, return the first appeared number that appeared only once.
import  java.util.*;
public class QuestionFour {
    static int singleNumber(int[] nums)
    {
        HashMap<Integer, Integer> arr = new HashMap<>();
       int sum1 = 0, sum2 = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (!arr.containsKey(nums[i]))
            {
                sum1 += nums[i];
                arr.put(nums[i], 1);
            }
            sum2 += nums[i];
        }
        return (int)(2 * (sum1) - sum2);
    }


    public static void main(String args[])
    {
        int[] a = {2, 3, 5, 4, 5, 3, 4};

        System.out.println(singleNumber(a));

        int[] b = {15, 18, 16, 18, 16, 15, 89};
        System.out.println(singleNumber(b));
    }
}

