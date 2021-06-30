package anujitha;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 

@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
        String userName = request.getParameter("username");
        String passWord = request.getParameter("password");
        
        try {
            List <Admin> cusDetails = databaseutil.validate(userName, passWord);
            request.setAttribute("cusDetails", cusDetails);
        }
        
        catch(Exception e) {
            e.printStackTrace();
        }
        
        RequestDispatcher dis = request.getRequestDispatcher("admin.jsp");
        dis.forward(request, response);
    }

 

}
 