public class WordLevelRev {
    public static void main(String[] args) {
        String s1 = "java is easy";
        System.out.println(rev(s1));
    }
    static String rev(String s) {
        //with split()
        String[] st = s.split(" ");
        String s2 = "", res = "";
        for (int i = 0; i < st.length; i++) {
            char[] a = st[i].toCharArray();
            int m = 0, n = a.length-1;
            while(m<n) {
                char temp = a[m];
                a[m] = a[n];
                a[n] = temp;
                m++; n--;
            }
            s2 = new String(a);
            res += s2;
            if(i < st.length-1)res += " ";
        }
        return res;
    }
}

