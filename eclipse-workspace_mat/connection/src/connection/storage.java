package connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.*;

public class storage {
	List<PrimaryData> list1 = new ArrayList<>();
	
	public List<PrimaryData> getPrimaryData() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root", "welcome@5902");
			java.sql.Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM primarydata");
			
			while (rs.next()) {
				PrimaryData data = new PrimaryData();
				data.setId(rs.getString("id"));
				data.setName(rs.getString("name"));
				list1.add(data);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list1;
		
	
	}
	

}
