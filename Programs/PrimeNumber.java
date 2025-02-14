import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        //10. Prime Number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();

        boolean flag = true;
        for (int i = 2; i <= num/2; i++) {
            if (num%i ==0) {
                flag = false;
                break;
            }
        }
        if (num > 1 && flag) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
        sc.close();
    }
}

class PrimeRange {
    public static void main(String[] args) {
        //Prime Number Range
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range: ");
        int range = sc.nextInt();
        int primeCount = 0;

        for (int i = 2; i <= range; i++) {
            boolean flag = true;
            for (int j = 2; j <= i/2; j++) {
                if (i%j==0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                primeCount++;
                if(primeCount % 2 != 0){System.out.print(i + " ");}
                // System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
class Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting range: ");
        int start = sc.nextInt();

        System.out.println("Enter ending range: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            boolean flag = true;
            for (int j = 2; j <= i/2; j++) {
                if (i%j==0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}

class PrimeRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range: ");
        int range = sc.nextInt();

        for (int i = range; i >= 2; i--) {
            boolean flag = true;
            for (int j = 2; j <= i/2; j++) {
                if (i%j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}

class PrimeRange2ndLargest {
    public static void main(String[] args) {
        int range = 100;
        int largest = -1;
        int secondLargest = -1;

        for (int i = 1; i <= range; i++) {
            boolean flag = true;
            for (int j = 2; j <= i/2; j++) {
                if (i%j == 0) {
                    flag = false;
                    break;
                }
            }
            // if (i>1 && flag) {
            //     System.out.print(i + " ");
            // }
            if (flag) {
                if (i>largest) {
                    secondLargest = largest;
                    largest = i;
                } else if (i > secondLargest) {
                    secondLargest = i;
                }
            }
        }

        if (secondLargest > -1) {
            System.out.print("Second Largest Prime number with in range of 100 : " + secondLargest);
        }
        
    }
}