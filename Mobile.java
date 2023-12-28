package JDBCApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Mobile {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","srilatha","welcome");
			Statement stmt=con.createStatement();
			int i=stmt.executeUpdate("create table mobile(mobileno number(38),mobilename varchar2(40),companyname varchar2(40),ramsize number(38),romsize number(40),osname varchar2(40),proccessorname varchar2(40),price number(40),fcamsize number(40),bcamsize number(40),imeino number(40),description varchar2(40)");
			System.out.println("new table created successfully");
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

	}

}
