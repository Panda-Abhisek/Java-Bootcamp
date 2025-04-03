//Check if a string is a palindrome
public class Palindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] a = s.toCharArray();
        int i = 0, j = a.length-1;
        while(i<j) {
            if(a[i] != a[j]) {
               return false;
            }
            i++; j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "Madam";
        if(isPalindrome(s1)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
