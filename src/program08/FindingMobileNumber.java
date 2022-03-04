package program08;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.out;

public class FindingMobileNumber {
    public static void main(String[] args) throws IOException {
//        Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");    //For PhoneNUmber
        Pattern p = Pattern.compile("[A-Za-z0-9][A-Za-z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z0-9]+)+");  // For EmailID's
        PrintWriter pw = new PrintWriter("Output.txt");
        BufferedReader br = new BufferedReader(new FileReader("Input.txt"));
        String line = br.readLine();
        while (line != null){
            Matcher m = p.matcher(line);
            while (m.find()){
                pw.println(m.group());
            }line= br.readLine();}pw.flush();}}
