package com.strings;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

//Remove vowels from a string
public class RemoveVowels {
    public static void main(String[] args) {
        String s1 = "java is easy";
        Matcher m = Pattern.compile("[aeioutAEIOU]").matcher(s1);
        while(m.find()){
            s1 = s1.replace(m.group(), "");
        }
        System.out.println(s1);
    }
}
