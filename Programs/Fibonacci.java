class Fibonacci {
    public static void main(String[] args) {
        //16. Fibonacci Series Printing Program
        int a = 0;
        int b = 1;
        int c; 

        for (int i = 1; i <= 10; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}

class FibonacciRange {
    public static void main(String[] args) {
        // Print 20 fibonacci numbers
        int range = 20;
        int a = 0, b = 1, c;

        for (int i = 1; i <= range; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}

class FibonacciRange1 {
    public static void main(String[] args) {
        // Print fibonacci numbers upto 100
        int range = 100;
        int a = 0, b= 1, c;

        while (a<range) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}