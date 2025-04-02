package com.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Count vowels and consonants in a string
public class CountVowels {
    public static int countVowel(String s) {
        int count = 0;
        Matcher m = Pattern.compile("[aeiouAEIOU]").matcher(s);
        while(m.find()) {
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String s1 = "Abhisek";
        int cVowel = countVowel(s1);
        int cConso = s1.length() - cVowel;
        System.out.println("String: " + s1 + "\nVowel Count: " + cVowel);
        System.out.println("Consonant Count: " + cConso);
    }
}
