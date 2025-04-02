package com.strings;
//Find the first non-repeating character in a string
public class NonRepeatingChar {
    public static void main(String[] args) {
        String s1 = "hello";
        int i = 0; boolean found = false;
        while(i < s1.length() && !found) {
            char c = s1.charAt(i);
            int count = 0;
            int j = 0;

            while(j < s1.length()) {
                if (s1.charAt(j) == c) count++;
                j++;
            }
            if (count == 1) {
                System.out.println(c);
                found = true;
            }
            i++;
        }
    }
}
