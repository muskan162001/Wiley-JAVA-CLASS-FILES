//package Codes_21_April;

public class InstanceOrder {
    String name;
    int age;

    {
        name = "Muskan";
        age = 21;
        System.out.println("Instance Block");
    }
    {
        System.out.println("Instance Block ");
    }

    public InstanceOrder(){
        System.out.println("Name :" + name + " age :" + age);
        System.out.println("Non parametrized Constructor");
    }

    public InstanceOrder(int a, int b){
        System.out.println("parametrized Constructor : " + (a + b));
    }

    
    public static void main(String[] args){
        InstanceOrder iod = new InstanceOrder();

        new InstanceOrder(2, 3);

    }
}
