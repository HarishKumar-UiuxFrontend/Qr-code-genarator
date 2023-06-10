package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Purchase
 */
@WebServlet("/Purchase")
public class Purchase extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String a = request.getParameter("PONNIYIN SELVAN");
		String b = request.getParameter("DHARMATHIN THALAIVAN");
		String c = request.getParameter("PARTHIBAN KANAVU");
		String d = request.getParameter("PANDIYA NAADU");
		
		if(a.length()>0) {
			response.sendRedirect("Buy.jsp");
			session.setAttribute("PONNIYIN SELVAN", a);
		}
		else {
			response.sendRedirect("AdminLogSuccess.jsp");
		}
	}

}
