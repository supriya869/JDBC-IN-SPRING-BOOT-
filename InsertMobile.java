package JDBCApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertMobile {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","srilatha","welcome");
			Statement stmt=con.createStatement();
			int i=stmt.executeUpdate("insert into student values(101,'model 1','cname 1',67,89,'os 1','proccessor1',90000,64,85,1234556,'descroption 1'");
			System.out.println("new record inserted successfully");
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

	}

}
