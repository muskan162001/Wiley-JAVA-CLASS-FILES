//package Codes_21_April;
class test{
    public static int addTest(int v1, int v2){
        int val = v1 + v2;
       // System.out.println("Addition in instance method " + val);

       return val;
    }
}
public class MethodType {

    public void sub(int v1, int v2){
        int val = v1 - v2;
        System.out.println("sub in instance method " + val);
    }
    public void add(int v1, int v2){
        int val = v1 + v2;
        System.out.println("Addition in instance method " + val);

        this.sub(9,5);
    }
    public static void addi(int v1, int v2){
        int val = v1 + v2;
        System.out.println("Addition in static method " + val);
    }
    public static void main(String[] args){
        addi(10, 20);

        MethodType mt = new MethodType();
        mt.add(11, 21);

        int ans = test.addTest(7, 8);

        System.out.println("from different class : " + ans);
    }
}
