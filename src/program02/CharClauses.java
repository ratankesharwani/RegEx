package program02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharClauses {
    public static void main(String[] args) {
        int count =0;
        Pattern pattern = Pattern.compile("\\s"); //RegularExpression
//         \\s Space
//         \\S Except Space
//         \\d AnyDigit[0-9]
//         \\D Except [0-9]
//         \\w [A-Za-z0-9]
//         \\W except  [A-Za-z0-9]
        Matcher matcher  = pattern.matcher("a7b k@9");
        while (matcher.find()){
            count++;
            System.out.println(matcher.start()+"----"+matcher.end()+"-----"+matcher.group());
        }
        System.out.println("NumberOfOccurance :"+count);
    }
}
