package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedDeleteTest {
	public static void main(String[] args) {
		
		// DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "gudals";
		String pass = "1234";
		
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			// 3단계 - SQL실행객체 생성
			String sql = "Delete from `user2` where `uid`=?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1,"A101");
			PreparedStatement psmt2 = conn.prepareStatement(sql);
			psmt2.setString(1, "A103");
			
			// 4단계 - SQL실행
			psmt.executeUpdate();
			psmt2.executeUpdate();
			
			// 5단계 - 결과처리
			

			// 6단계 - 데이터베이스 종료
			psmt2.close();
			psmt.close();
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Delete 완료...");
	}
}
