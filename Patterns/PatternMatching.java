import java.util.regex.Matcher;
import java.util.regex.Pattern;

//package Patterns;

public class PatternMatching {
    
    public static void main(String[] args){
        String input = "The key to learn programming is consistent practice";

        Pattern pattern = Pattern.compile("learn");
        Matcher matcher = pattern.matcher(input);

        System.out.println(matcher.find());

        if(matcher.find()){
            int start = matcher.start();
            int end = matcher.end();

            System.out.println("Found match from index : " + start + " to " + (end - 1));
        }

        String pat = "learn";
        int index = input.indexOf(pat);

        int 

    }
}
