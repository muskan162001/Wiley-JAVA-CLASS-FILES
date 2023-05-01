package wileyexception;

public class exceptionPropagation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1();
		}
		catch(Exception e) {
			System.out.println("exceptipn caugth: "+ e.getMessage());
		}
	}
		public static void method1() throws Exception{
		System.out.println("this is meth 1 calling meth2");
			method2();
		}
		public static void method2() throws Exception{
			throw new Exception("Exception occured");
		}


}
