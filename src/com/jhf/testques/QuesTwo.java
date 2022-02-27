package com.jhf.testques;
import java.util.HashMap;
import java.util.Map;
//2-I need to create a method that receives a String and also returns a String
//Ex input: AAABBBBCCJ
//Ex output: 3A4B2C1J
public class QuesTwo {
    public static void main(String[] args) {
        String test = "AAABBBBCCJ";
        getOutString(test);
    }
    private static void getOutString(String arr) {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] strArray = arr.toCharArray();
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c,charCountMap.get(c)+1);
            }
            else {
                charCountMap.put(c, 1);
            }
        }
        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.print(entry.getValue() + "" + entry.getKey());
        }
    }

    // Driver Code

}








