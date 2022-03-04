package program05;

import java.util.StringTokenizer;

public class StringTokanizerClass {
    public static void main(String[] args) {
        String s = "Durga Soft-ware Solutions nanu";
        StringTokenizer stringTokenizer = new StringTokenizer(s,"-");
        while (stringTokenizer.hasMoreElements()) {
            System.out.println(stringTokenizer.nextToken());
        }}}
