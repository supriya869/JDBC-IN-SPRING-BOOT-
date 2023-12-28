package JDBCApplication;
import java.sql.*;
public class CreateTable {

	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","srilatha","welcome");
			Statement stmt=con.createStatement();
			int i=stmt.executeUpdate("create table Student(sid number(38),sname varchar2(40),address varchar2(40),mno number(38))");
			System.out.println("new table created successfully");
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

	}

}
