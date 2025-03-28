public class Decode {
    public static void main(String[] args) {
		String s1 = "ypkp";
        System.out.println(decode(s1, 15));
	}
	static String decode(String s, int d) {
	    char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	    char[] a = s.toCharArray();
	    String s2 = "";
	    for(char c : a) {
	        int newPos = ((c - 'a') - d)%26;
	        if(newPos < 0) newPos += 26;
	        s2 += alpha[newPos];
	    }
	    return s2;
	}
}
