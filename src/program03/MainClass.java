package program03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {
    public static void main(String[] args) {
        //QUANTIFIERS
        // a  exactly one a
        // a+  atleast one a
        // a*  any no. of a's including 0's also
        // a? atmost one a
        int count =0;
        Pattern pattern = Pattern.compile("a*"); //RegularExpression
        Matcher matcher  = pattern.matcher("abaabbabaa");
        while (matcher.find()){
            count++;
            System.out.println(matcher.start()+"----"+matcher.end()+"----"+matcher.group());
        }
        System.out.println("NumberOfOccurance :"+count);
    }
}
