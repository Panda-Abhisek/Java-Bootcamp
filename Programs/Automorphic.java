import java.util.Scanner;

class Automorphic {
    public static void main(String[] args) {
        //11. Automorphic Number
        int num = 25;
        int sq = num * num;
        boolean flag = true;
        while (num>0) {
            if (num%10 != sq%10) {
                flag = false;
                break;
            }
            sq/=10;
            num/=10;
        }
        if (flag) {
            System.out.println("Automorphic");
        }
        else {
            System.out.println("Not Automorphic");
        }
    }
}

class AutomorphicRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range: ");
        int range = sc.nextInt();

        for (int i = 1; i <= range; i++) {
            int temp = i;
            int sq = i * i;
            boolean flag = true;

            while (temp>0) {
                if (temp%10 != sq%10) {
                    flag = false;
                    break;
                }
                sq/=10;
                temp/=10;
            }
            if (flag) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}

class AutomorphicRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range: ");
        int range = sc.nextInt();

        for (int i = range; i >= 1; i--) {
            int temp = i;
            int sq = (int) Math.pow(i, 2);
            boolean flag = true;

            while (temp > 0) {
                if (temp%10 != sq%10) {
                    flag = false;
                    break;
                }
                sq/= 10;
                temp /= 10;
            }
            if (flag) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}

class Automorphic2ndLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range: ");
        int range = sc.nextInt();

        int largest = -1;      // To store the largest automorphic number
        int secondLargest = -1; // To store the second largest automorphic number

        for (int i = 1; i <= range; i++) {
            int temp = i;
            int sq = i * i;
            boolean flag = true;

            // Check if the number is automorphic
            while (temp > 0) {
                if (temp % 10 != sq % 10) {
                    flag = false;
                    break;
                }
                sq /= 10;
                temp /= 10;
            }

            // If the number is automorphic, update largest and secondLargest
            if (flag) {
                if (i > largest) {
                    secondLargest = largest; // Update secondLargest
                    largest = i;             // Update largest
                } else if (i > secondLargest) {
                    secondLargest = i;       // Update secondLargest
                }
            }
        }

        // Output the second largest automorphic number
        if (secondLargest != -1) {
            System.out.println("The second largest automorphic number within the range is: " + secondLargest);
        } else {
            System.out.println("There are less than 2 automorphic numbers within the range.");
        }

        sc.close();
    }
}

class Automorphic2ndSmallest {
    public static void main(String[] args) {
        int range = 100;
        int smallest = range;
        int secondSmallest = range-1;
        for (int i = 1; i <= range; i++) {
            int temp = i;
            int sq = i * i;
            boolean flag = true;

            while (temp>0) {
                if (temp%10 != sq%10) {
                    flag = false;
                    break;
                }
                sq/=10;
                temp/=10;
            }
            if (flag) {
                // System.out.print(i + " ");
                if (i < smallest) {
                    secondSmallest = smallest;
                    smallest = i;
                } else if (i < secondSmallest) {
                    secondSmallest = i;
                }
            }
        }

        if (secondSmallest != range-1) {
            System.out.print("Second Smallest Automorphic Number: " + secondSmallest);
        }
    }
}