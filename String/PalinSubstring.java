public class PalinSubstring {
    static boolean isPalindrome(String s, int start, int end) {
        char[] a = s.toCharArray();
        int i = start, j = end;
        while(i < j) {
            if(a[i] != a[j]) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "banana"; //ana, anana, nan
        for(int i = 0; i < s1.length()-1; i++) {
            for (int j = i+1; j < s1.length(); j++) {
                if (isPalindrome(s1, i, j)) {
                    System.out.println(s1.substring(i, j+1));
                }
            }
        }
    }
}
