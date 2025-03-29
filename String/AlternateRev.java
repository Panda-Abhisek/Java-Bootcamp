public class AlternateRev {
    public static void main(String[] args) {
        // Alternate Case Reversal (e.g., "KNOWLEDGE" → "WONKLEGDE")
        String s1 = "KNOWLEDGE";
        System.out.println(rev(s1));
    }

    static String rev(String s) {
        char[] a = s.toCharArray();
        int i = 0, j = (a.length / 2) - 1;
        for (int k = 0; k < 2; k++) {
            while (i < a.length && i < j) {
                char temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
            i = a.length - a.length / 2;
            j = a.length - 1;
        }
        return new String(a);
    }
}
