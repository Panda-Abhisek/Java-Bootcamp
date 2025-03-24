public class StringReverse {
    public static void main(String[] args) {
        String s1 = "jspiders";
        String s2 = rev(s1);
        
        System.out.println(s2);
    }
    static String rev(String s) {
        char[] a = s.toCharArray();
        int i = 0, j = a.length-1;
        while(i<j) {
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++; j--;
        }
        return new String(a);
    }
}