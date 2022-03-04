package program06;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class TenDigitMobileNoClass {
    public static void main(String[] args) {
        String str ="05653567654";
        Pattern p = Pattern.compile("(0|91)?[6789][0-9]{9}");
        Matcher m = p.matcher(str);
        if (m.find() && m.group().equals(str)) {
            System.out.println("Valid Mobile Number");
        } else {
            System.out.println("Invalid Mobile Number");
        }
    }
}
