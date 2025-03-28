public class BalanceString {
    public static void main(String[] args) {
        String s1 = "[{k(abhi)s}e]";
        if (isBal(s1)) System.out.println("Balanced");
        else System.out.println("Not Balanced");
    }
    static boolean isBal(String s) {
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == ')' || c == '{' || c == '}' || c == '[' || c == ']') {
                s1 += c;
            }
        }
        while (s1.contains("()") || s1.contains("{}") || s1.contains("[]")) {
            s1 = s1.replace("()", "");
            s1 = s1.replace("{}", "");
            s1 = s1.replace("[]", "");
        }
        return s1.length() == 0;
    }
}
