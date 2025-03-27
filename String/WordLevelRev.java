public class WordLevelRev {
    public static void main(String[] args) {
        String s1 = "java is easy";
        System.out.println("With split(): " + rev(s1));
        System.out.println("Without split(): " + rev1(s1));
    }

    static String rev1(String s) {
        char[] a = s.toCharArray();
        int i = 0, j = 0;
        while(j < a.length) {
            while (i < a.length && a[i] != ' ') i++;
            int k = i - 1;
            while (j<k) {
                char temp = a[j];
                a[j] = a[k];
                a[k] = temp;
                j++; k--;
            }
            j = ++i;
        }
        return new String(a);
    }

    static String rev(String s) {
        // with split()
        String[] st = s.split(" ");
        String s2 = "", res = "";
        for (int i = 0; i < st.length; i++) {
            char[] a = st[i].toCharArray();
            int m = 0, n = a.length - 1;
            while (m < n) {
                char temp = a[m];
                a[m] = a[n];
                a[n] = temp;
                m++;
                n--;
            }
            s2 = new String(a);
            res += s2;
            if (i < st.length - 1)
                res += " ";
        }
        return res;
    }
}
