package com.jhf.testques;
import java.util.*;
// // Function to print the most occurring character
    public class Questionsix {
    public static void main(String[] args)
    {
        Vector<String> str = new Vector<String>()   ;
        str.add("animal");
        str.add("zebra");
        str.add("lion");
        str.add("giraffe");
        findMostOccurringChar(str);
    }
        static void findMostOccurringChar(Vector<String> str)
        {
            int []hash = new int[26];
            for (int i = 0; i < str.size(); i++)
            {
                for (int j = 0; j < str.get(i).length(); j++)
                {
                    hash[str.get(i).charAt(j)-97]++;
                }
            }
            int max = 0;
            for (int i = 0; i < 26; i++)
            {
                max = hash[i] > hash[max] ? i : max;
            }
            System.out.print((char)(max + 97) +"\n");
        }
    }
