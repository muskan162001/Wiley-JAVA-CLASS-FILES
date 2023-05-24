import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class create_database {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name","root","LNCT12");
			Statement st = con.createStatement();
			st.executeUpdate("create table emp(eno int not null, ename varchar(12), esal int not null)");
			

			System.out.println("Tabel Created Succesfully");
			st.close();
			con.close();
		
	}catch(Exception e) {
		System.out.println(e);
	}
	} 
}
