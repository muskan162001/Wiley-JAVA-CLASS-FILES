//package Codes_21_April;

public class ConstructorTypes {
    public ConstructorTypes(int a, int b) {
        System.out.println("2 args count : " + (a + b));
    }

    public ConstructorTypes(float a, int b) {
        this(2,7);
        System.out.println("2 args count : " + (a + b));
        // wrong this(2,7); 
        //because constructor call must be the first in the constructor

    }

    public ConstructorTypes(){
        System.out.println("0 args count");
    }

    public void add(int v1, int v2){
        int val = v1 + v2;
        System.out.println("Addition in instance method " + val);
    }

    public static void main(String[] args){
        ConstructorTypes c = new ConstructorTypes();
        ConstructorTypes ct = new ConstructorTypes(2,3);
        ConstructorTypes ctf = new ConstructorTypes(2.3f,3);

    }
}
