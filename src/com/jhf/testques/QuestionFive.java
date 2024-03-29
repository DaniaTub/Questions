package com.jhf.testques;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Array of strings, return the word that is the most common ( appeared in all strings in the array )
public class QuestionFive {
    public static void main(String[] args)
    {
        String arr[] = { "ٍRafik", "for", "geeks", "a",
                "portal", "to", "ٍRafik", "ٍRafik", "be",
                "ٍRafik", "ٍRafik", "zoom", "yup",
                "ٍRafik", "in", "be", "ٍRafik", "geeks" };
        String mostCommonWord = findWord(arr);

        System.out.println(mostCommonWord);
    }
    static String findWord(String[] arr)
    {
        HashMap<String, Integer> OurMap = new HashMap<String, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (OurMap.containsKey(arr[i])) {
                OurMap.put(arr[i], OurMap.get(arr[i]) + 1);
            }
            else {
                OurMap.put(arr[i], 1);
            }
        }

        Set<Map.Entry<String, Integer> > set = OurMap.entrySet();
        String key = "";
        int value = 0;
        for (Map.Entry<String, Integer> me : set) {
            if (me.getValue() > value) {
                value = me.getValue();
                key = me.getKey();
            }
        }
        return key;
    }
}

