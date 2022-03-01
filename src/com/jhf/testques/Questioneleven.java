package com.jhf.testques;
//Find Second Largest Number

public class Questioneleven {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
       int [] arra=new int[]{1,2,3,5,4,3,2,1,8,9,3};
       int num=get2ndLargestNum(arra);
       System.out.println(num);
    }

    public static int get2ndLargestNum(int[] arr)
    {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > highest)
            {
                secondHighest=highest;
                highest=arr[i];
            }else if(arr[i] > secondHighest && arr[i] != highest){
                secondHighest =arr[i];
            }
        }
        return secondHighest;
    }

}
