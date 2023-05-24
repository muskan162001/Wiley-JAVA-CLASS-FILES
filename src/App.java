import java.sql.*;
import java.lang.*;

public class App {
	public static void main(String args[]) {
		String url = "jdbc:mysql//localhost:3306/database_name";
		String username = "root";
		String password = "LNCT12";
		
		System.out.println("Loading Driver....");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded...");
			
		}
		catch(ClassNotFoundException e) {
			throw new IllegalStateException("cannot find the ")
		}
	}
}
