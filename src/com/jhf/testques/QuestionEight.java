package com.jhf.testques;
import java.util.*;
//There is a service that on start loads a preexisting collection of words
//it expose two API
//put(string s)- add stringg s to the collection of stringd
//Get(stringg s) returns all of the permutation of the given string that are stored in the service ..
public class QuestionEight {
    public static  void main(String []args) {
        String[] arr = new String[]{"acb", "bac", "bbcc", "cba"};
    }
        Set<String> lst = new HashSet<String>();
        Map<String , Set<String >> wordMap = new HashMap<String, Set<String>>();
        public  void put(String str) {
            Set<String> allPerm = new HashSet<String>();
            if(wordMap.containsKey(sort(str)))
            {
                allPerm= new HashSet<String>(wordMap.get(sort(str)));
            }
            allPerm.add(str);
            wordMap.put(sort(str) , allPerm);
        }
        private String sort(String str) {
            char[] sortWord = str.toCharArray();
            Arrays.sort(sortWord);
            String word = new String (sortWord);
            return word;
        }
        public Set<String> get(String str)
        {
            return wordMap.get(str);
        }
}
//
// public static boolean checkPair (int[] nums , int num)
//	{
//		boolean result =false;
//		Set<Integer> set = new HashSet<Integer>();
//
//		for (int i = 0; i < nums.length; i++) {
//			int temp = num- nums[i];
//			if(set.contains(temp))
//			{
//				return true;
//			}
//			set.add(nums[i]);
//
//		}
//
//		return result;
//	}
//[11:20, 26.2.2022] דאניה: public static void moveZeros(int[] arr)
//	{
//		int[] temp = new int[arr.length];
//		int j=0;
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i] != 0)
//			{
//				temp[j++]=arr[i];
//			}
//		}
//
//		for (int k = 0; k < temp.length; k++) {
//			System.err.print(temp[k]);
//		}
//	}
//[11:27, 26.2.2022] דאניה: public static int findSecondLargestNumberInTheArray(int array[])
//    {
//
//        int highest = Integer.MIN_VALUE;
//        int secondHighest = Integer.MIN_VALUE;
//
//
//        for (int i = 0; i < array.length; i++) {
//
//            if (array[i] > highest) {
//
//
//                secondHighest = highest;
//
//
//                highest = array[i];
//            } else if (array[i] > secondHighest && array[i]!=highest)
//
//                secondHighest = array[i];
//        }
//        return secondHighest;
//    }
//[11:44, 26.2.2022] דאניה: private static int findfirstrepeatingElement(int[] arr) {
//		Set<Integer> hash = new HashSet<Integer>();
//		int index =-1;
//		for (int i = arr.length-1; i >=0; i--) {
//			if(hash.contains(arr[i]))
//			{
//				index =i;
//			}else {
//				hash.add(arr[i]);
//			}
//		}
//		return index;
//	}
//[12:07, 26.2.2022] דאניה: public static void main(String[] args) {
//		String[] arr= {"jhf1Hussam" ,"jhf12" , "jhf123Ahamad"};   //abc abcccc abcbbbbbbbb
//		String res= getLongPrefix(arr);
//	}
//	private static String getLongPrefix(String[] arr) {
//
//		String minStr =getMinStr(arr);
//		if(arr ==null) return "";
//		int minLen =minStr.length();
//		for (int i = 0; i < arr.length; i++) {
//			int j;
//			for ( j = 0; j <minLen; j++) {
//				if(minStr.charAt(j) != arr[i].charAt(j))
//				{
//					break;
//				}
//			}
//			if(j<minLen)
//			{
//				minLen=j;
//			}
//		}
//		return minStr.substring(0,minLen);
//	}
//	private static String getMinStr(String[] arr) {
//		String minStr = arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i].length() < minStr.length())
//			{
//				minStr =arr[i];
//			}
//		}
//[12:07, 26.2.2022] דאניה: return minstr
//[13:46, 26.2.2022] דאניה: לתשומת ליבכם,
//בפורטל מוצגת שנת הלימודים תשפ"ב. אם ברצונכם לצפות בתשובות לפניות משנת תשפ"א או משנים קודמות, יש לבחור את שנת הלימודים שבה נפתחה הפנייה.
//[13:46, 26.2.2022] דאניה: public int sol(int [] arr){
//        int sum = 0;
//        int max = 0 ;
//        for (int i = 0 ; i < arr.length;i++){
//            sum += arr[i];
//         if (sum > max){
//             max = sum;
//         }else if ( sum +i < 0){
//             sum = 0;
//         }
//
//        }
//        return max;
//    }
//[14:01, 26.2.2022] דאניה: public double sol(String str) {
//        double num  = 0 ;
//        int index = 0;
//        boolean flag = false;
//        if (str.charAt(0) == '-'){
//            index =1;
//            flag = true;
//        }
//        boolean flag2 = false;
//        int len = 1;
//        while(index < str.length() ){
//            if (str.charAt(index) == '.'){
//                flag2 = true;
//                index ++;
//                continue;
//            }
//            if (flag2){
//                num += (double) ( str.charAt(index)-'0')/(Math.pow(10.0,len));
//                len++;
//                index ++;
//                continue;
//            }
//            num*=10;
//            num += str.charAt(index) - '0';
//            index++;
//        }
//    return flag?-1.0*num:num;
//    }
//[14:11, 26.2.2022] דאניה: public double sol(String str) {
//        double num  = 0 ;
//        int index = 0;
//        boolean flag = false;
//        if (str.charAt(0) == '-'){
//            index =1;
//            flag = true;
//        }
//        boolean flag2 = false;
//        int len = 1;
//        while(index < str.length() ){
//            if (str.charAt(index) == '.'){
//                flag2 = true;
//                index ++;
//                continue;
//            }
//            if (flag2){
//                num += (double) ( str.charAt(index)-'0')/(Math.pow(10.0,len));
//                len++;
//                index ++;
//                continue;
//            }
//            num*=10;
//            num += str.charAt(index) - '0';
//            index++;
//        }
//    return flag?-1.0*num:num;
//    }
//[14:21, 26.2.2022] דאניה: public char sol(String str) {
//        HashMap<Character,Integer> map = new HashMap<>();
//        for (int i = 0 ; i < str.length();i++){
//            if (map.containsKey(str.charAt(i))){
//                int count  = map.get(str.charAt(i)) + 1;
//                map.put(str.charAt(i),count);
//            }else{
//                map.put(str.charAt(i),1);
//            }
//        }
//        for (int i = 0 ;i< str.length();i++){
//            if (map.get(str.charAt(i))==1){
//                return str.charAt(i);
//            }
//        }
//        return 'a';
//    }