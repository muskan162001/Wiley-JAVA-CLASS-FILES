package lambda;

public class LambdaClass {
	static String printThing(Printable thing) {
	return	thing.print("Edge");
	}
public static void main(String[]args) {
//	Product myprod=new Product();
	//myprod.print();
	//printThing(myprod);
	//printThing(()->System.out.println("This is lambda expression"));// we can use lambda to implement body of interface whicch have one abstract meth other void or default method can be there i.e functional interface;
//	Printable lambdaprint=()->System.out.println("This is lambda express");
//	printThing(lambdaprint);
	//Printable lambdaprint=s ->System.out.println("expression"+s);
//	printThing(lambdaprint);
	Printable lambdaprint= s->{
		return "wiley"+s;
	};
	
	System.out.println(printThing(lambdaprint));
	
	
}
}