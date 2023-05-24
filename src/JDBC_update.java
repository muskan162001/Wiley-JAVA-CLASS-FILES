import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class JDBC_update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value;
		int eid;
		int esal;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name","root","LNCT12");
			Statement smt = con.createStatement();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
				System.out.println("Enter employee id : ");
				value = br.readLine();
				eid = Integer.parseInt(value);
				
				System.out.println("Enter employee new Salary : ");
				value = br.readLine();
				esal = Integer.parseInt(value);
				
				int count = smt.executeUpdate("update emp set esal="+esal+" where eno="+eid);
				if(count > 0) {
					System.out.println(count + "rows updated");
				}
				else {
					System.out.println("no record found");
				}
				
				
			//con.close();
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
