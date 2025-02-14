class H {
    public static void main(String[] args) {
        //9. LCM, HCF
        
        //9.1 LCM
        int a = 3, b = 4;
        int num = 1;
        while(true){
            if (num%a==0 && num%b==0) {
                // System.out.println(num);
                break;
            }
            num++;
        }
        System.out.println(num);
    }
}
class HCF{
    public static void main(String[] args) {
        //9.2 HCF
        int a = 3, b = 6;
        int num = a<b? a : b;

        while (true) {
            if (a%num==0 && b%num == 0) {
                break;
            }
            num--;
        }
        System.out.println(num);
    }
}