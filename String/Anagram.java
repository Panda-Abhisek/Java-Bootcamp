package com.strings;
//Check if two strings are anagrams
public class Anagram {
    public static boolean anagram(String s1, String s2) {
        // 1. both s1 and s2 length should be same
        while(true) {
            if(s1.length() != s2.length()) return false;
            if (s1.length() == 0 && s2.length() == 0) return true;
            char c = s1.charAt(0);
            s1 = s1.replace(c + "", "");
            s2 = s2.replace(c+"", "");
        }
    }
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";
        //check anagram
        if (anagram(s1, s2)) System.out.println("Both Strings are Anagram");
        else System.out.println("Not Anagram");
    }
}
