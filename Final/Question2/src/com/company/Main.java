package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    String[] strs1 = {"eat","tea","tan","ate","nat","bat"};
        String[] strs2 = {""};
        String[] strs3 = {"a"};
        System.out.println(groupAnagrams(strs1));
        System.out.println(groupAnagrams(strs2));
        System.out.println(groupAnagrams(strs3));

    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            String sorted = group(str);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
        List<List<String>> result = new ArrayList<>();
        for(List<String> temp : map.values()){
            result.add(temp);
        }
        return result;
    }
    public static String group(String s){
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }
}
