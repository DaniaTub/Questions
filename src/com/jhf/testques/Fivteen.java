package com.jhf.testques;
/*You are given a large integer represented as an integer array digits,
 *  where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order.
 *  The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.
Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].*/
public class Fivteen {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        isPlusOne(arr);
    }

    public static int[] isPlusOne(int[] nums) {
        int l= nums.length;
        int num=0;
        for (int i = 0; i < nums.length; i++) {
            num += nums[i]*(int)Math.pow(10, l-i-1);
        }
        num =num+1;
        System.out.println(num);

        for (int i = 0; i < nums.length; i++) {
            nums[i]=num/(int)Math.pow(10, l-i-1);;
            num=num%(int)Math.pow(10, l-i-1);
        }
        for (int i : nums) {
            System.out.print(i);
        }
        return nums;
    }
}