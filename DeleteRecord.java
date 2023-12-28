package JDBCApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","srilatha","welcome");
			Statement stmt=con.createStatement();
			int i=stmt.executeUpdate("delete from student where id=123");
			System.out.println(i+"record deleted successfully");
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

	}

}
