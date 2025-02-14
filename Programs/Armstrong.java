class Armstrong {
    public static void main(String[] args) {
        // 12. Armstrong Number
        int num = 153;
        int temp = num;

        // Count Digits
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        // System.out.println("Count: " + count);
        num = temp;

        // find armstrong or not
        int sum = 0;
        while (num>0) {
            int rem = num % 10;
            int prod = 1;
            for (int i = 1; i <= count; i++) {                
                prod *= rem;
            }
            sum += prod;
            num /= 10;
            // System.out.println("prod = " + prod);
        }
        // System.out.println("sum = " + sum);
        if (temp == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}

class ArmstrongRange {
    public static void main(String[] args) {
        // Armstrong Range Program
        int range = 1000;
        
        for (int i = 1; i <= range; i++) {
            int temp = i;
            //count digit
            int count = 0;
            while (temp>0) {
                count++;
                temp/=10;
            }
            temp = i;
            //finding armstrong or not
            int sum = 0;
            while (temp > 0) {
                int rem = temp % 10;
                int prod = 1;
                for (int j = 1; j <= count; j++) {
                    prod *= rem;
                }
                sum += prod;
                temp/=10;
            }
            if (i == sum) {
                System.out.print(i + " ");
            }
        }
    }
}