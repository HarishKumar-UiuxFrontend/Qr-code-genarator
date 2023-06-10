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
 * Servlet implementation class Novel
 */
@WebServlet("/Novel")
public class Novel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "welcome@5902");
			PreparedStatement ps = con.prepareStatement("SELECT * FROM mybooks");
			
			List product = new ArrayList<>();
			List price = new ArrayList<>();
			HttpSession session = request.getSession();
			ResultSet set = ps.executeQuery();
			while(set.next()) {
				product.add(set.getString("Book"));
				price.add(set.getString("price"));
				
				session.setAttribute("Book", product);
				session.setAttribute("price", price);
				
			}
			response.sendRedirect("Novel.jsp");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
