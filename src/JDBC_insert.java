import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBC_insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name","root","LNCT12");
			PreparedStatement psmt = con.prepareStatement("insert into emp values(?,?,?)");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true) {
				System.out.println("Enter employee id : ");
				int eno = Integer.parseInt(br.readLine());
				System.out.println("Enter employ name : ");
				String ename = br.readLine();
				System.out.println("Enter employee id : ");
				int esalary = Integer.parseInt(br.readLine());
				
				psmt.setInt(1,eno);
				psmt.setString(2, ename);
				psmt.setInt(3,  esalary);
				
				int count = psmt.executeUpdate();
				if(count > 0) {
					System.out.println(count + "One record inserted");
				}
				else {
					System.out.println("no record Inserted");
				}
				
				System.out.println("Do you want to insert more record [Yes/No]: ");
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
