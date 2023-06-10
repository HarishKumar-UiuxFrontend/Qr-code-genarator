package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Storage2 extends storage{
	List<SecondaryData> list2 = new ArrayList<>();
	public List<SecondaryData> getSecondaryData() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root", "welcome@5902");
			java.sql.Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM secondarydata");
			
			while (rs.next()) {
				SecondaryData data = new SecondaryData();
				data.setId(rs.getString("id"));
				data.setDesignation(rs.getString("designation"));
				list2.add(data);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list2;
		
	}
}
