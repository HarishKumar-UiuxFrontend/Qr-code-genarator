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

/**
 * Servlet implementation class ReadAdmin
 */
@WebServlet("/ReadAdmin")
public class ReadAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a = request.getParameter("adminId");
		String b = request.getParameter("password");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "welcome@5902");
			PreparedStatement ps = con.prepareStatement("SELECT * FROM admin WHERE adminId=? && password=?");
			ps.setString(1, a);
			ps.setString(2, b);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("AdminHome.jsp");
				dispatcher.forward(request, response);
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher("Mismatch.jsp");
				dispatcher.include(request, response);
			}

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
