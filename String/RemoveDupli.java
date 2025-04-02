package com.strings;

//Remove all duplicates from a string - The task is to take a string and remove any duplicate characters, keeping only the first occurrence of each character.
public class RemoveDupli {
    public static void main(String[] args) {
        String input = "geeksforgeeks";
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!result.contains(""+c)) {
                result += c;
            }
        }
        System.out.println(result);
    }
}
