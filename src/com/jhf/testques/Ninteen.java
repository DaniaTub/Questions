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
    public static void main(String[] args)
    {
        String[] arr = {"Dania", "Dana", "Danoosh", "Dandon", "dano"};
       System.out.println( getLongPrefix(arr));
    }
    private static String getLongPrefix(String[] arr)
    {
        String minStr = getMinStr(arr);
        if (arr == null)
        {
            return "";
        }
        int minLen = minStr.length();
        for (int i = 0; i < arr.length; i++)
        {
            int j;
            for (j = 0; j < minLen; j++)
            {
                if (minStr.charAt(j) != arr[i].charAt(j))
                {
                    break;
                }
            }
            if (j < minLen)
            {
                minLen = j;
            }
        }
        return minStr.substring(0, minLen);

    }


    private static String getMinStr(String[] arr)
    {
        String minStr = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i].length() < minStr.length())
            {
                minStr = arr[i];
            }
        }
        return minStr;
    }
}

