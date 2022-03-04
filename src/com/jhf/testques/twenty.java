package com.jhf.testques;
import java.util.Arrays;
//Is string Argum
public class twenty {

    public static void main(String[] args)
    {
        String name1 = "cinema" ;
        String name2 ="iceman";
        System.out.println(isAnagram(name1, name2));
    }
    public static boolean isAnagram (String str1 , String str2)
    {
        boolean res = false;
        if(sort(str1).equals(sort(str2)))
        {
            res = true;
        }
        return res;
    }

    public static String sort(String str)
    {
        char[] strArr = str.toCharArray();
        Arrays.sort(strArr);
        str = String.valueOf(strArr);
        return str;
    }
}
