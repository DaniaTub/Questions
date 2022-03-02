package com.jhf.testques;
public class Seventeen {
	/*Given an array, rotate the array to the right by k steps, where k is non-negative.
	Example 1:
	Input: nums = [1,2,3,4,5,6,7], k = 3
	Output: [5,6,7,1,2,3,4]
	Explanation:
	rotate 1 steps to the right: [7,1,2,3,4,5,6]
	rotate 2 steps to the right: [6,7,1,2,3,4,5]
	rotate 3 steps to the right: [5,6,7,1,2,3,4]
	Example 2:
	Input: nums = [-1,-100,3,99], k = 2
	Output: [3,99,-1,-100]
	Explanation:
	rotate 1 steps to the right: [99,-1,-100,3]
	rotate 2 steps to the right: [3,99,-1,-100]
*/
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k=7;
        rotateArr(nums, k);
    }
    public static void rotateArr(int[] arr , int k) {
        int l = arr.length;
        if(arr.length ==0 ||arr ==null || k >arr.length)
            throw new RuntimeException(" Error Input which will avoid the rotate process !!");
        if(arr.length ==1 || k ==0)
            // return arr;
            System.out.println(" return arr");
        int[] result =new int[l-k];
        for(int i=0 ;i < l-k ;i++)
        {
            result[i] = arr[i];
        }
        for(int i=0 ;i<l-k;i++) {
            System.out.print(" " + result[i]);
        }
        System.out.println( );

        for(int i=l-k ; i<l ;i++)
        {
            arr[i-l+k] =arr[i] ;
        }
        for(int i=0 ; i<l;i++)
        {
            System.out.print(" "+ arr[i]);
        }
        System.out.println( );

        for (int i=0;i< result.length;i++)
        {
            arr[i+k] =result[i];
        }

        for(int i=0 ; i<arr.length;i++)
        {
            System.out.print(" "+ arr[i]);
        }
    }
}
