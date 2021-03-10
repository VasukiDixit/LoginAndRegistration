import java.sql.*;
import java.sql.SQLException;

public class RegistrationDAO {
public boolean registerUser(User user) {
	System.out.println(user);
	String db_url="com.mysql.cj.jdbc.Driver";
	String db_path="jdbc:mysql://localhost:3306/application";
	String db_username="root";
	String db_password="root123";
	 String 	sql= "insert into user values(?,?,?,?,?)";
	try {
		Class.forName(db_url);
	Connection con=DriverManager.getConnection(db_path, db_username,db_password);
	PreparedStatement ps=con.prepareStatement(sql);
    //String 	sql= "insert into user values(?,?,?,?,?)";
	ps.setInt(1, user.getId());
	ps.setString(2, user.getUsername());
	ps.setString(3, user.getPassword());
	ps.setInt(4, user.getPhone());
	ps.setString(5, user.getAddress());
	int result=ps.executeUpdate();
	if(result>0)
		return true;
	}
	catch(Exception e) 
	{
		e.printStackTrace();
	}
	return false;
}
}
