package class1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Class1")
public class Class1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());

		String a = request.getParameter("user");
		String b = request.getParameter("password");
		if (a.equalsIgnoreCase("Matheshwaran") && (b.equals("mat@123"))) {
			response.sendRedirect("class2.jsp");
		}
		else {
			response.sendRedirect("day1.jsp");
		}
	}

}
