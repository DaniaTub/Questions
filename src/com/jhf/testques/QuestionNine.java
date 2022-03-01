package com.jhf.testques;

import java.util.HashSet;
import java.util.Set;
//given ann array a[] and a number x, check for pair in a[] with sum as x
public class QuestionNine {
    public static  void main(String args[]){
  int arr[] =new int[]{0,-1,-2,-3,1};
      //sum=-2;
      //output = -3,1 .. valid pair exist
        System.out.println(checkPair(arr,-2));
        int arr2[] =new int[]{1,-2,1,0,5};
       //sum=0;
        // output : no valid exit
        System.out.println(checkPair(arr2,0));
    }
    public static boolean checkPair (int[] nums , int num)
	{
		boolean result =false;
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < nums.length; i++) {
			int temp = num- nums[i];
			if(set.contains(temp))
			{
				return true;
			}
			set.add(nums[i]);

		}

		return result;
	}
}
