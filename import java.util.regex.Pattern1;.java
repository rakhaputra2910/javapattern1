import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        String string = "Hello, world!";
        String pattern = "world";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(string);
        if (m.find()) {
            System.out.println("Found pattern: " + m.group());
        } else {
            System.out.println("Pattern not found.");
        }
    }
}
This code will output "Found pattern: world".




