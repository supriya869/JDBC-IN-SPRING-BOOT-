package JDBCApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecords {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","srilatha","welcome");
			Statement stmt=con.createStatement();
			int i=stmt.executeUpdate("insert into student values(101,'srilatha','khammam',8897110225");
			System.out.println("new record inserted successfully");
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

	}

}
