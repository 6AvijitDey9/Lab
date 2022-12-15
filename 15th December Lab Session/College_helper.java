package Com.College;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class College_helper {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public static Connection con() throws SQLException{ //Address of JDBC with user name and password
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/assignments", "root", "root");
	}
}
