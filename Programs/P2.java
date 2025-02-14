// D I A G O N A L - A L P H A B E T - P A T T E R N
class P2 {
    public static void main(String[] args) {
        char ch = 'A';
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == j)
                    System.out.print(ch);
                else
                    System.out.print(j);
            }
            System.out.println();
            ch++;
        }
    }
}