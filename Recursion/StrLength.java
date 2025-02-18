class StrLength {
    // Length of string using Recursion
    public static void main(String[] args) {
        String str = "Abhisek";
        System.out.println(length(str));
    }
    public static int length(String s) {
        if (s.isEmpty())
            return 0;
        return 1 + length(s.substring(1));
    }
}