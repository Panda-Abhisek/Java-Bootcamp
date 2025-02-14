class Strong {
    public static void main(String[] args) {
        //18. Strong Number Program
        int num = 145;
        int temp = num;
        int sum = 0;

        while (num>0) {
            int rem = num%10;
            int fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact = fact * i;
            }
            sum+=fact;
            num/=10;
            // System.out.println(fact);
        }
        // System.out.println(sum);
        if (temp == sum) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not a Strong Number");
        }
        
    }
}

class StrongRange {
    public static void main(String[] args) {
        // print all the strong numbers in a range of 1000
        int range = 1000;
        int count = 0;

        for (int i = 1; i <= range; i++) {
            int temp = i;
            int sum = 0;

            while (temp > 0) {
                int rem = temp%10;
                int fact = 1;
                for (int j = 1; j <= rem; j++) {
                    fact *= j;
                }
                temp/=10;
                sum += fact;
            }
            if (i == sum) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println(count);
    }
}