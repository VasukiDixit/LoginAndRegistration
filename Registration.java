

import java.io.IOException;
import java.sql.SQLException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hi");
		RegistrationDAO dao;
		String username=request.getParameter("username");
		String password=request.getParameter("pwd");
		int phone=Integer.parseInt(request.getParameter("phone"));
		String address=request.getParameter("address");
		
		
		Random random=new Random();
		int userId=random.nextInt(99);
		System.out.println(userId);
		User newuser=new User(userId,username,password,phone,address);
		dao =new RegistrationDAO();
		boolean result=dao.registerUser(newuser);
		if(result) {
			System.out.println("inserted");
		    response.sendRedirect("welcome.jsp");
		}
		else {
			System.out.println("error");
		
	}
	}
	

}
