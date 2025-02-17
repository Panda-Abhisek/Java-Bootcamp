import java.util.Scanner;

class NumberPrint {
    public static void printNum(int a, int n) {
        if (a > n)
            return;
        System.out.print(a + " ");
        printNum(a+1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print from 1 to N: ");
        int n = sc.nextInt();

        printNum(1, n);

        sc.close();
    }
}