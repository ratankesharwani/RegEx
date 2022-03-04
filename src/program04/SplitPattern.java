package program04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitPattern {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\."); //RegularExpression
        String[] strings  = pattern.split("www.durgasoft.com");
        for(String s1:strings){
            System.out.println(s1);
        }

    }
}
