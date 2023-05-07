
public class StaticBlock {

    static{
        System.out.println("Static Block");
    }

    {
        System.out.println("Instanc3 Block");
    }

    public StaticBlock(){
        System.out.println("constructor Block");
    }
    public static void main(String[] args){
        //static block executes only once
        StaticBlock sb = new StaticBlock();
        new StaticBlock();
        new StaticBlock();

    }
}
