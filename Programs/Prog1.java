class Prog1 {
    public static void main(String[] args) {
        // F A C T O R I A L P R O G R A M
        int num = 5;
        int fact = 1;
        
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println(fact);
    }    
}
