class Palindrome {
    public static void main(String[] args) {
        //15. Palindrome Program
        int num = 1221;
        int temp = num;
        int res = 0;

        while (temp > 0) {
            int rem = temp%10;
            res = res * 10 + rem;
            temp/=10;    
        }
        if (num == res) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome Number");
        }
    }
}

class PalindromeRange {
    public static void main(String[] args) {
        int range = 100;
        for (int i = 1; i <= range; i++) {
            int temp = i;
            int res = 0;

            while (temp > 0) {
                res = (res * 10) + temp%10;
                temp/=10;
            }
            if (i == res) {
                System.out.print(i + " ");
            }
        }
    }
}