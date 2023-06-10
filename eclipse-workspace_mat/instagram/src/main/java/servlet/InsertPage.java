package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.InputMismatchException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		HttpSession session = request.getSession();
		session.setAttribute("name", c);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "welcome@5902");
			PreparedStatement statement = con
					.prepareStatement("INSERT INTO instagram(userId,password,name,gender)values(?,?,?,?)");
			statement.setString(1, a);
			statement.setString(2, b);
			statement.setString(3, c);
			statement.setString(4, d);
			int rs = statement.executeUpdate();
			if (rs > 0) {
				response.sendRedirect("RegSuccess.jsp");
				session.setAttribute("name", c);
			} else {
				response.sendRedirect("LoginHere");
			}

		} catch (SQLException | ClassNotFoundException | ArithmeticException | InputMismatchException e) {
			e.printStackTrace();
		}
	}

}
//document.getElementById("sp").innerHTML="***Pls Enter Name***"