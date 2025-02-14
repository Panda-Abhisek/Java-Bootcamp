class G {
    public static void main(String[] args) {
        //8. Length of Digits
        int num = 875823;
        int count = 0;

        while (num > 0) {
            if (num%10 > 0) {
                count++;
            }
            num /= 10;
        }

        System.out.println("Count/Digit: " + count);
    }
}