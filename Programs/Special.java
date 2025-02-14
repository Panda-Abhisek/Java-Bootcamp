class Special {
    public static void main(String[] args) {
        //14. Special Number Program
        int num = 59;
        int sum = 0;
        int prod = 1;
        int temp = num;
        int res = 0;

        while (temp > 0) {
            sum += temp%10;
            prod *= temp%10;
            res = sum + prod;
            temp/=10;
        }
        if (num == res) {
            System.out.println("Special Number");
        } else {
            System.out.println("Not Special Number");
        }
    }
}

class SpecialRange {
    public static void main(String[] args) {
        int range = 100;

        for (int i = 1; i <= range; i++) {
            int temp = i;
            int sum = 0;
            int prod = 1;
            int res = 0;

            while (temp > 0) {
                sum += temp%10;
                prod *= temp%10;
                res = sum + prod;
                temp/=10;
            }
            if (i == res) {
                System.out.print(i + " ");
            }
        }
    }
}