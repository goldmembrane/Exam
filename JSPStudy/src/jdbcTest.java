import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcTest {
	public static void main(String[] args) {

		try {
			// 1. 라이브러리를 메모리 등록
			Class.forName("com.mysql.jdbc.Driver");

			// 2. DB 연결
			String url = "jdbc:mysql://localhost:3306/java";
			String id = "root";
			String pw = "mysql";
			Connection con = DriverManager.getConnection(url, id, pw);
			
			// 3. Query 실행 준비
			String sql = "select * from 고객";
			PreparedStatement stmt = con.prepareStatement(sql);
			
			// 4. Query 실행
			ResultSet rs= stmt.executeQuery();
			while(rs.next()) {
				int age = rs.getInt("나이");
				String customerId = rs.getString("고객아이디");
				System.out.println(age + " " + customerId);
			}
			} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
