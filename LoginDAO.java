import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {

	public boolean verifyUserCredentials(String username,String pwd) {
		String db_url="com.mysql.cj.jdbc.Driver";
		String db_path="jdbc:mysql://localhost:3306/application";
		String db_username="root";
		String db_password="root123";
		String sql="select * from user where username=? and pwd=?";
		try {
			Class.forName(db_url);
		Connection con=DriverManager.getConnection(db_path, db_username,db_password);
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, username);
		ps.setString(2, pwd);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) 
			return true;
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		return false;
}
}