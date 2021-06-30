package anujitha;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ContactInsert")
public class ContactInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("NameS");
		String email = request.getParameter("EmailS");
		String sub = request.getParameter("SubjectS");
		String message = request.getParameter("MessageS");
		
		boolean isTrue;
		isTrue = databaseutil.insertResponses(name, email, sub, message);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("contactus.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis1 = request.getRequestDispatcher("error.jsp");
			dis1.forward(request, response);
		}
	}

}
