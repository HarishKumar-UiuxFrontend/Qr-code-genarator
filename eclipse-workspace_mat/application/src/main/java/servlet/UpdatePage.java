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
 * Servlet implementation class Update
 */
@WebServlet("/UpdatePage")
public class UpdatePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a = request.getParameter("rollNo");
		String b = request.getParameter("name");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","welcome@5902");
			PreparedStatement ps = con.prepareStatement("UPDATE studentdetails SET name=? WHERE rollNo=?");
			ps.setString(1, a);
			ps.setString(2, b);
			int rs = ps.executeUpdate();
		if (rs>0) {
			response.sendRedirect("Updated.jsp");
		} else {
			response.sendRedirect("LoginHere.jsp");
		}
		}catch ( SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
