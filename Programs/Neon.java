class Neon {
    public static void main(String[] args) {
        //13. Neon Number Program
        int num = 9;
        int sq = num * num;
        int sum = 0;
        while (sq > 0) {
            int rem = sq%10;
            sum += rem;
            sq/=10;
        }
        if (num == sum) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not Neon Number");
        }
    }
}

class NeonRange {
    public static void main(String[] args) {
        int range = 1000000;
        for (int i = 1; i <= range; i++) {
            int temp = i;
            int sq = temp * temp;
            int sum = 0;
            while (sq > 0) {
                int rem = sq%10;
                sum += rem;
                sq/=10;
            }
            if (i == sum) {
                System.out.print(i + " ");
            }
        }
    }
}