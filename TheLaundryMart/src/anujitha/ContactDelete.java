package anujitha;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ContactDelete")
public class ContactDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		boolean isTrue;
		isTrue = databaseutil.deleteContact(email);
		if (isTrue == true){

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<meta http-equiv='refresh' content='3;URL=admin.jsp'>");//redirects after 3 seconds
		out.println("<p style='color:red;'>Data Deleted Successfully!</p>");
		}
		else {
		RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
		dis.forward(request, response);
		}
	}

}

