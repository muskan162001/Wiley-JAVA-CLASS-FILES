//package Codes_25_April;

public class StringClass {

    public static void main(String[] args){
        String s1 = "Hello";
        String s2 = "Hello";

        //System.out.println(s1 == s2);

        String s3 = new String("Wiley");
        String s4 = new String("Wiley");

        //System.out.println(s1 == s3);
        //System.out.println(s3 == s4);

        //System.out.println(s1.equals(s4));

        String str = "Java Developer";
        String str1 = "Python Developer";

        System.out.println(str.charAt(6));
        String str2 = str.concat(str1);
        System.out.println(str2);
        String strp = str.concat(" ").concat(str1);
        System.out.println(strp);

        System.out.println(str + " " + str1);
        
        System.out.println(str.replace("D", "d"));
        System.out.println(str);

        String st[] = str.split("");
        
        for(String s : st){
            System.out.println(s);
        }

        String userInput = "   mobile   ";
        System.out.println(userInput);
        System.out.println(userInput.trim());

        System.out.println(str.substring(1, 5));

        System.out.println(str.toUpperCase());

        
    }
}
