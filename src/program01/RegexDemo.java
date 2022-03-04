package program01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        int count =0;
        Pattern pattern = Pattern.compile("ab"); //RegularExpression
        Matcher matcher  = pattern.matcher("ababbaba");
        while (matcher.find()){
            count++;
            System.out.println(matcher.start()+" "+matcher.end()+" "+matcher.group());
        }
        System.out.println("NumberOfOccurance :"+count);
    }
}
