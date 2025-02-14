class Perfect {
    public static void main(String[] args) {
        // 17. Perfect Number Program
        // Perfect Number : Sum of divisors of a number excluding itself is equal to the
        // same number.

        int num = 6;
        int sum = 0;
        // find divisors
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                // System.out.print(i + " ");
                sum += i;
            }
        }
        if (num == sum) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
    }
}

class PerfectRange {
    public static void main(String[] args) {
        // Print Perfect Numbers in 1 to 100
        int range = 1000;
        for (int i = 1; i <= range; i++) {
            int temp = i;

            //find divisors and add
            int sum = 0;
            for (int j = 1; j <= temp/2; j++) {
                if (temp % j == 0) {
                    sum += j;
                }
            }

            if (i == sum) {
                System.out.print(i + " ");
            }
        }
    }
}