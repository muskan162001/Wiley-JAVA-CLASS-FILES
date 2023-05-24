import java.sql.*;
import java.lang.*;
public class JDBC_Connect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name","root","LNCT12");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from people where id = 25");
			rs.next();
			int id = rs.getInt("id");
			String name = rs.getString("first_name");
			String last = rs.getString("last_name");
			
			System.out.println(id+ " " + name + " " + last);
			st.close();
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
