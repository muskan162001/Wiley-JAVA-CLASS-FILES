package wileyexception;

import java.util.ArrayList;

class StringNotFound extends RuntimeException{
	public StringNotFound(String message) {
		super(message);
	}
}
public class customRuntimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>();
		al.add("Shalu");
		al.add("Wiley");
		if(!al.contains("geeks")) {
			try {
				throw new StringNotFound("this string not found");
			}catch(StringNotFound e) {
				e.printStackTrace();
			}
		}
		System.out.println("message one");

	}

}
