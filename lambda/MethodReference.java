package lambda;
interface Sayable{
    void say();
}
public class MethodReference {
    public void hello(){
        System.out.println("Hello, this is a instance method");

    }

    public static void saySomething(){
        System.out.println("Hello, this is a static method");
    }

    public static void main(String[] args){

        MethodReference mt = new MethodReference();
        Sayable isv = mt::hello;
        isv.say();

        Sayable sayable = MethodReference::saySomething;
        sayable.say();

        Thread t1 = new Thread(MethodReference::processSomething);
        t1.start();

        
    }
}
