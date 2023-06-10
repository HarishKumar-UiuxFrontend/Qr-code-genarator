package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeletePage
 */
@WebServlet("/DeletePage")
public class DeletePage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String a = request.getParameter("userId");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "welcome@5902");
			PreparedStatement ps = con.prepareStatement("DELETE FROM instagram WHERE userId=?");
			ps.setString(1, a);
			int rs = ps.executeUpdate();

			if (rs > 0) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("Deleted.jsp");
				dispatcher.forward(request, response);
			} else {
				response.sendRedirect("LoginHere.jsp");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}