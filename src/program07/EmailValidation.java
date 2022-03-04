package program07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        String str ="kesharwani._ratan09@gmail.com";
        Pattern p = Pattern.compile("[A-Za-z0-9][A-Za-z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z0-9]+)+");
//        Pattern p = Pattern.compile("^(.+)@(.+)$");
        Matcher m = p.matcher(str);
        if (m.find() && m.group().equals(str)) {
            System.out.println("Valid MailID");
        } else {
            System.out.println("Invalid MailID");
        }
    }
}
