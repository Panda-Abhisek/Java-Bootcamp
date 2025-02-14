class Palin {
    public static void main(String[] args) {
        int rev = 0;
        int origin = 1221, temp = origin;
        while (origin > 0) {
            int rem = origin % 10;
            rev = (rev * 10) + rem;
            origin /= 10;
        }
        if (temp == rev) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
}