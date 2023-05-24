import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name","root","LNCT12");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from emp");
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int salary = rs.getInt(3);
				System.out.println("eid : " + id+ " ename :  " + name + " esalary : " + salary);

			}
			
			//st.close();
			//con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
