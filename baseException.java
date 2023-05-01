package wileyexception;

public class baseException {

	public static void main(String[] args) {
		System.out.println("first Statement");
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4};
		String str="Shalu";
		try {
			 System.out.println(arr[2]);
			 System.out.println(arr[3]);
			 System.out.println("hey there");
			 System.out.println(str.charAt(4));//in same try block if two exception occurs only the first one will excuted as lines after exceptions are always ignored;
			 System.out.println(12/0); 
		 }catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println(e.getMessage());
		     e.printStackTrace();
			 System.out.println(e.toString());
		 }
		 catch(IndexOutOfBoundsException e) {
			System.out.println("catch in block 2");
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			
			try {
				 System.out.print(10/0);	 
			 }catch(Exception e1) {
				 e1.printStackTrace();
			 }
			finally {
				System.out.println("This is nested finally");
			}
			e.printStackTrace();
		}
		finally {
			System.out.println("im finally block");
		}
       System.out.println("another Statement");
	}

}
