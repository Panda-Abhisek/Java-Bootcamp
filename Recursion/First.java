class First {
    static char recUp(String s) {
        for (int i = 0; i < s.length(); i++)
            if (Character.isUpperCase(s.charAt(i)))
                return s.charAt(i);
        return 0;
    }

    public static void main(String[] args) {
        String str = "Abhisek";
        char res = recUp(str);

        if (res == 0)
            System.out.println("No Uppercase Letter Found!");
        else
            System.out.println(res);
    }
}