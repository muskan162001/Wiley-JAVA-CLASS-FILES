package Codes_25_Aprill;
//package Codes_25_April;

public class StringBufferClass {

    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Wiley");
        StringBuffer sb1 = new StringBuffer("Wiley");
        String ss = "Wiley";
        System.out.println(sb.equals(sb1));
        System.out.println(ss.equals(sb1.toString()));

        System.out.println(sb);

        sb.append(" Program");
        System.out.println(sb);

        sb.insert(4, "JAin");
        System.out.println(sb);

        System.out.println(sb.reverse());
        System.out.println(sb.delete(5, 9));
    }
    
}
