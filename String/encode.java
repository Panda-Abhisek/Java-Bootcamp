public class encode {
    public static void main(String[] args) {
        String s1 = "java";
        System.out.println(encode(s1, 15));
    }    
    static String encode(String s, int e) {
        char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] a = s.toCharArray();
        String s2 = "";
        for (char c : a) {
            s2 += alpha[((c-'a')+e)%26];
        }
        return s2;
    }
}
