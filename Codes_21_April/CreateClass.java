//package Codes_21_April;

public class CreateClass implements Cloneable{
    int a = 10;
    
    public static void add(){
        System.out.println("Number addedd");
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, CloneNotSupportedException{

        //create object with new keyword
        CreateClass cc = new CreateClass();
        cc.add();
        System.out.println(cc);

        //create obj with new instance 
        try{
            Class c = Class.forName("CreateClass");
            CreateClass ci = (CreateClass)c.newInstance();
            ci.add();
            System.out.println(ci);

        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }

        //create object with object.clone 
        CreateClass objClone = (CreateClass)cc.clone();
        objClone.add();
        System.out.println("object clone : " + objClone);
    }
}
