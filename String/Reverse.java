package com.strings;
// Reverse a String
public class Reverse {
    public static void main(String[] args) {
        String s1 = "Abhisek";
        String s2 = "";
        char[] a = s1.toCharArray();
        int i = 0, j = a.length-1;
        while(i<j) {
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++; j--;
        }
        s2 = new String(a);
        System.out.println(s2);
    }
}
