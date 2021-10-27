package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        System.out.println(longestSubString(s1));
    }

    public static char[] longestSubString(String s) {

        for(int i = 0, j = 0; i < s.length() && j < s.length(); i++, j++){
            char[] res = s.toCharArray();
            if(s.charAt(i) == s.charAt(j) && i != j){
            }
        }


        }
    }
}
