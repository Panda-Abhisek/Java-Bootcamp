import java.util.Scanner;

class Prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        boolean flag = true;

        for (int i = 2; i <= num/2; i++) {
            if(num % i == 0) {
                flag = false;
                break;
            }
        }

        if(flag)System.out.println("Prime");
        else System.out.println("Not Prime");
        sc.close();
    }
}

class PrimeRange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = scn.nextInt();

        System.out.print("Enter End: ");
        int end = scn.nextInt();
        scn.close();

        for (int i = start; i <= end; i++) {
            boolean flag = true;
            if(i <= 1)
                continue;
            for (int j = 2; j <= i/2; j++) {
                if (i%j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.print(i + " ");
        }
    }
}

class AlternativePrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = scn.nextInt();

        System.out.print("Enter End: ");
        int end = scn.nextInt();
        scn.close();
        int count = 0;

        for (int i = start; i <= end; i++) {
            boolean flag = true;
            if(i <= 1)
                continue;
            for (int j = 2; j <= i/2; j++) {
                if (i%j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) { 
                count++;
                if(count % 2 != 0)
                    System.out.print(i + " ");
            }
        }
    }
}