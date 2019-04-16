import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DB.DBManager;

public class jdbcTest3 {
	public static void main(String[] args) {

	
		
		try {
			DBManager db = DBManager.getInstance();
			Connection con = db.open();
			
			// 3. Query ���� �غ�
			String sql = "select * from ��";
			PreparedStatement stmt = con.prepareStatement(sql);
			
			// 4. Query ����
			ResultSet rs= stmt.executeQuery();
			while(rs.next()) {
				int age = rs.getInt("����");
				String customerId = rs.getString("�����̵�");
				System.out.println(age + " " + customerId);
			}
			} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
