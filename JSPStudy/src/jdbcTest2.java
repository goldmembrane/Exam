import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcTest2 {
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
			String sql = "insert into �� (�����̵�, ���̸�) values";
			sql += "   (null, ?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, "python");
			// 4. Query ����
			stmt.executeUpdate();
			
			} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
