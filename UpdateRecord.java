package JDBCApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateRecord {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","srilatha","welcome");
			Statement stmt=con.createStatement();
			int i=stmt.executeUpdate("update student set id=101 where id=130");
			System.out.println(i+"record updated");;
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}


	}

}
