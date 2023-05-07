package lambda;

import java.util.function.BiConsumer;

public class BuiltInConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BiConsumer<Integer,Integer>el=(Integer age,Integer Percent)->{
    	 if(age>18 && Percent>75)
    		 System.out.println("You are eligible for the job");
    	 else
    		 System.out.println("You are not egligible for teh job");
      };
	}

}