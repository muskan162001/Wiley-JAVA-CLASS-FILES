package Inheritance;

class Animal{
    public void eat(){
        System.out.println("eat");
    }
    public void sleep(){
        System.out.println("sleep");
    }
}

class Lion extends Animal{
    public void roar(){
        System.out.println("roar");
    }
}
public class SingleInheritance {

    public static void main(String[] args){
        Lion lion = new Lion();
        lion.roar();
        lion.sleep();
        lion.eat();
    }
}
