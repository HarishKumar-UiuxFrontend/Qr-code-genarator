package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class InsertProd
 */
@WebServlet("/InsertProd")
public class InsertProd extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		String a = request.getParameter("book");
//		String b = request.getParameter("Price");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root",
					"welcome@5902");
			PreparedStatement statement = con.prepareStatement("SELECT * FROM MYBOOKS(book,price)values(?,?)");
			ResultSet rs = statement.executeQuery();
			HttpSession session = request.getSession();
			List<String> list1 = new ArrayList<>();
			List<Integer> list2 = new ArrayList<>();
			while (rs.next()) {
				list1.add(rs.getString(1));
				list2.add(rs.getInt(2));
			}
			session.setAttribute("book", list1);
			response.sendRedirect("search.jsp");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
