package com.company;

public class Main {

    public static void main(String[] args) {
        boolean palindrome = isPalindrome("ABAABA");
        if(palindrome){
            System.out.println("String is palidrome");
        }else{
            System.out.println("String is not palidrome");
        }

    }

    private static  boolean isPalindrome(String str){
        if(str == null || str.length() <= 1){
            return true;

        }
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            if(arr[start] !=arr[end]){
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }

    private static  boolean areAnagram(String str1, String str2){
        if(str1 == null || str2 == null || str1.isEmpty())
    }
}
