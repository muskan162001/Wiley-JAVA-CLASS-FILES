import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBC_delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name","root","LNCT12");
			Statement smt = con.createStatement();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true) {
				System.out.println("Enter Deletion employee id : ");
				int eno = Integer.parseInt(br.readLine());
				
				int count = smt.executeUpdate("delete from emp where eno="+eno);
				if(count > 0) {
					System.out.println(count + "One record deleted");
				}
				else {
					System.out.println("no record deleted");
				}
				
			System.out.println("Do you want to delete more record [Yes/No]: ");
				String ch = br.readLine();
				if(ch.equalsIgnoreCase("no"))
				break;
			}
			con.close();
		
	}catch(Exception e) {
		System.out.println(e);
	}
	}

}
