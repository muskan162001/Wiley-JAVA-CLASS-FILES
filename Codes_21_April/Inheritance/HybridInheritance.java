
class Body  
{  
public void displayHuman()  
{  
    System.out.println("Body class");  
}  
}  
interface Male  
{  
    public void show();  
}  
interface Female  
{  
    public void show();  
}   
public class HybridInheritance extends Body implements Male, Female  
{  
    public void show()  
    {  
        System.out.println("show() method");  
    }    
    public void displayChild()  
    {  
        System.out.println("Child class");  
    }   
    public static void main(String args[])  
    {  
        HybridInheritance obj = new HybridInheritance();  
        System.out.println("Implementation of Hybrid Inheritance");  
        obj.show();  
        obj.displayChild();  
}  
}  