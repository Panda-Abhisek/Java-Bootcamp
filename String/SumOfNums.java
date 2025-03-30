import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfNums {
    static int sum(String s) {
        Pattern p = Pattern.compile("[0-9]{1}");
        Matcher m = p.matcher(s);
        int sum = 0;
        while (m.find()) {
            sum += Integer.parseInt(m.group());
        }
        return sum;
    }
    public static void main(String[] args) {
        String s1 = "ab13c4d5e";
        System.out.println(sum(s1));
    }
}