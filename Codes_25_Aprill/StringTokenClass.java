package Codes_25_Aprill;
//package Codes_25_April;
import java.util.StringTokenizer;

public class StringTokenClass {
    
    public static void main(String[] args){
        String str = "I love Java Programming";
        StringTokenizer st = new StringTokenizer(str, " ");

        System.out.println(st.countTokens());

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        StringTokenizer st1 = new StringTokenizer("I , love , Java , Programming , jjher");
        System.out.println(st1.countTokens());

        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }


    }
}
