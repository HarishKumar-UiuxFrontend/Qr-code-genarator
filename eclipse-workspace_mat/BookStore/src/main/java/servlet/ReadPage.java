package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ReadPage
 */
@WebServlet("/ReadPage")
public class ReadPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a = request.getParameter("name");
		String b = request.getParameter("password");
		HttpSession session = request.getSession();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "welcome@5902");
			PreparedStatement ps = con.prepareStatement("SELECT * FROM books WHERE name=? && password=?");
			ps.setString(1, a);
			ps.setString(2, b);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				response.sendRedirect("Welcome.jsp");
				session.setAttribute("name", a);
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher("Mismatch.jsp");
				dispatcher.include(request, response);
			}

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
