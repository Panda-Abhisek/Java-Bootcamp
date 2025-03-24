public class Palindrome {
    public static void main(String[] args) {
        String s1 = "Madam";
        System.out.println(isPalindrome(s1));
    }

    static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] a = s.toCharArray();
        // int i = 0, j = a.length - 1;
        // while (i < j) {
        //     if (a[i] != a[j])
        //         return false;
        //     i++; j--;
        // }
        int j = a.length-1;
        for (int i = 0; i <= j; i++) {
            if(a[i] != a[j--]) return false;
        }
        return true;
    }
}
