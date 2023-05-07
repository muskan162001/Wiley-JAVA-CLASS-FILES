//package Codes_21_April;

public class VarScope {

    int ins = 20;
    int val = 18;
    static String name = "Muskan";

    public void sumMethod(){
        int val = 11;
        int val1 = 2;
        System.out.println("sum is : " + (this.val + val1));

        System.out.println("sum with this keyword : " + (this.val + val1));

    }


    public static void main(String[] args){
        int val = 22;
        int loc = 10;

        
        VarScope vso = new VarScope();
        vso.sumMethod();
        System.out.println("checking which Variable value will print : " + val);

        System.out.println("Local Variable : " + loc);

        System.out.println("Instace Variable : " + vso.ins);

        System.out.println("Static Variable : " + name);


    }
}
