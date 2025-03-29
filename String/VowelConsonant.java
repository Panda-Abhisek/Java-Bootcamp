public class VowelConsonant {
    public static void main(String[] args) {
        String s1 = "Abhisek";
        int vowelCount = vowelCount(s1);
        int consonantCount = s1.length() - vowelCount;
        System.out.println("Vowel Count: " + vowelCount);
        System.out.println("Consonant Count: " + consonantCount);
    }
    static int vowelCount(String s) {
        s = s.toLowerCase();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}
