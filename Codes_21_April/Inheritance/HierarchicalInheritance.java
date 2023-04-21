//package Inheritance;

class Vehicle1{

    public void steering(){
        System.out.println("steering");
    }
}
class Car1 extends Vehicle1{
    public void airbag(){
        System.out.println("airbag");
    }

}

class Truck extends Vehicle1{
    public void HydraulicPump(){
        System.out.println("pump");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args){
        Truck sc = new Truck();
        sc.HydraulicPump();
        sc.steering();
    }
}
