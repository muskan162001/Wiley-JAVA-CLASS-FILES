//package Generics_Codes;

public class Generic_Example {

    public static void main(String[] args){
        //Printer<Integer> printer = new Printer(27);
        //printer.print();
        Printer<Cat> printer1 = new Printer(new Cat());
        printer.print();

        Printer<Dog> printer1 = new Printer(new Dog());
        printerr1.print();

        ArrayList<Object> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Dog());

    }
    
}
