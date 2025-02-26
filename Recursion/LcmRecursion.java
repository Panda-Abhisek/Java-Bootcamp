public class LcmRecursion {
    public static void main(String[] args) {
        int a = 5, b = 10;
        int lcm = (a*b)/hcfRecursion(a, b);
        System.out.println("LCM : "+ lcm);
    }
    public static int hcfRecursion(int a, int b) {
        if (b == 0) {
            return a;
        }
        return hcfRecursion(b, a%b);
    }
}
