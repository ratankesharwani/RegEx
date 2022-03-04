package program09;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TxtFileName {
    public static void main(String[] args) {
        int count =0;
        Pattern p = Pattern.compile("[A-Za-z0-9][a-zA-Z0-9$_.]*[.]txt");
        File file=new File("C:\\Durga_Classes"); //Path Of File
        String[] s = file.list();
        for(String s1:s ){
            Matcher m = p.matcher(s1);
            if(m.find() && m.group().equals(s1)){
                System.out.println(s1);
                count++;
            }
        }
    }
}
