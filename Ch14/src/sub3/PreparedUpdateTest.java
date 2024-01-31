package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedUpdateTest {
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
			
			// 3단계 - SQL실행 객체 생성
			String sql = "Update `user1` set `hp`=?, `age`=? where `uid`=?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "010-3380-9714");
			psmt.setInt(2, 30);
			psmt.setString(3, "B101");
			// 4단계 - SQL실행
			psmt.executeUpdate();
			
			// 5단계 - 결과처리
			
			
			// 6단계 - 데이터베이스 종료
			psmt.close();
			conn.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Update 완료...");
	}
	
}
