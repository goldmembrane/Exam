import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcTest {
	public static void main(String[] args) {

		try {
			// 1. ���̺귯���� �޸� ���
			Class.forName("com.mysql.jdbc.Driver");

			// 2. DB ����
			String url = "jdbc:mysql://localhost:3306/java";
			String id = "root";
			String pw = "mysql";
			Connection con = DriverManager.getConnection(url, id, pw);
			
			// 3. Query ���� �غ�
			String sql = "select * from ����";
			PreparedStatement stmt = con.prepareStatement(sql);
			
			// 4. Query ����
			ResultSet rs= stmt.executeQuery();
			while(rs.next()) {
				int age = rs.getInt("����");
				String customerId = rs.getString("�������̵�");
				System.out.println(age + " " + customerId);
			}
			} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}