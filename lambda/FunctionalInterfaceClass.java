package lambda;
@FunctionalInterface
interface Calc{
    int Calculate(int val);
}


public class FunctionalInterfaceClass {
    public static void main(String[] args){

        Calc c = (int val) -> val + 54;

        System.out.println("Result : ")
    }
}
