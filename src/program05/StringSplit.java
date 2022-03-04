package program05;
public class StringSplit {
    public static void main(String[] args) {
        String s = "Durga Software Solutions";
        String [] strings = s.split("\\s");
        for(String s1: strings){
            System.out.println(s1);}}}
