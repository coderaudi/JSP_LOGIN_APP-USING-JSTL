package org.audi.loginapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.audi.loginapp.service.LoginService;
import org.audi.loginapp.service.dto.User;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId , password ;
		userId = request.getParameter("userId");
		password = request.getParameter("password");
		
		LoginService loginService = new LoginService();
		boolean result = loginService.authenticate(userId, password);
		
		if(result) {
			// we can use the session and application 
			
			// application can not applied 
				User  user =loginService.getUserDetails(userId);
				//**  request.getSession().setAttribute("user", user);
				 request.setAttribute("user", user);
				// we can also use the req.dispacher using this we are not sending the user to go for the success.jsp
				// using hte req dispacher broser does not know this is the new request
			 // it happne in the server it self  
		// **	response.sendRedirect("success.jsp");
				// RequestDispatcher reqdispatcher = request.getRequestDispatcher("success.jsp");
				RequestDispatcher reqdispatcher = request.getRequestDispatcher("successjstl.jsp");
				reqdispatcher.forward(request, response);
				
			return ;
		}else {
			response.sendRedirect("login.jsp");
		}
		
	}

}
