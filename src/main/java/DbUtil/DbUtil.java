package DbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	
	public static Connection getConnection() {
		
		
        Connection conn=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String url= "jdbc:mysql://localhost:3306/kumarandb";
		
		try {
			 conn= DriverManager.getConnection(url,"gowri","Prasath@0304");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
		
		
	}

}
