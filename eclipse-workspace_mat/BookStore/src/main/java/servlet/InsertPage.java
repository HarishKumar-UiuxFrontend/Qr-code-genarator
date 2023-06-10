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

/**
 * Servlet implementation class InsertPage
 */
@WebServlet("/InsertPage")
public class InsertPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String a = request.getParameter("userId");
		String b = request.getParameter("password");
		String c = request.getParameter("name");
		String d = request.getParameter("gender");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root",
					"welcome@5902");
			PreparedStatement statement = con
					.prepareStatement("INSERT INTO books(userId,password,name,gender)values(?,?,?,?)");
			statement.setString(1, a);
			statement.setString(2, b);
			statement.setString(3, c);
			statement.setString(4, d);
			int rs = statement.executeUpdate();
			if (rs > 0) {
				response.sendRedirect("RegSuccess.jsp");
			} else {
				response.sendRedirect("LoginHere");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
