package com.jhf.testques;


/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.*/

public class Ninteen {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public static String getLongestPrefix(String[] strings)
    {
        int len = strings.length;
        char[] currChar = new char[100];
        for (String string : strings) {
            int i =0;
            while(i<string.length())
            {
                currChar[i]=string.charAt(i);
                i++;
            }

        }
        return null;
    }



}
