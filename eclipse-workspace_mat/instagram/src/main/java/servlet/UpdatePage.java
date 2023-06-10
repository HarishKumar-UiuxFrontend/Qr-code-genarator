package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UpdatePage
 */
@WebServlet("/UpdatePage")
public class UpdatePage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String a = request.getParameter("password");
		String b = request.getParameter("name");
		HttpSession session = request.getSession();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "welcome@5902");
			PreparedStatement ps = con.prepareStatement("UPDATE instagram SET password=? WHERE name=?");
			ps.setString(1, a);
			ps.setString(2, b);
			int rs = ps.executeUpdate();

			if (rs > 0) {
				response.sendRedirect("Updated.jsp");
				session.setAttribute("name", b);
			} else {
				response.sendRedirect("LoginHere.jsp");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
