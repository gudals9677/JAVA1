package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 2024/01/24
 * 이름 : 김형민
 * 내용 : PreparedSelect 실습하기
 * 
 * PreparedStatement
 *  - 기존 Statement 보다 향상된 동적 SQL 생성을 위한 Statement
 *  - Query Parameter를 사용해서 값을 Mapping(사상,바인딩) 해서 쿼리 실행
 *  
 * VO객체
 *  - VO(Value object)객체는 SELETE의 결과 테이블의 속성을 갖는 객체
 *  - 테이블 개체(Entity)를 객체(object)로 변환할 때 사용하는 객체
 *  - JSP, Spring에서는 DTO(Data Transfer object)로 사용
 */

public class PreparedSelectTest {
	public static void main(String[] args) {
		
		// DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "gudals";
		String pass = "1234";
		
		// 결과처리용 리스트
		List<User4VO> users = new ArrayList<>();
		
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			// 3단계 - SQL실행객체 생성
			String sql = "Select * from `user4`";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			// 4단계 - SQL실행
			ResultSet rs = psmt.executeQuery();
			
			// 5단계 - 결과처리
			while(rs.next()) {
				//커서가 가르키는 튜플 결과 가져오기
				
				// VO객체 생성 및 초기화
				User4VO u4 = new User4VO();
				u4.setUid(rs.getString(1));
				u4.setName(rs.getString(2));
				u4.setGender(rs.getString(3));
				u4.setAge(rs.getInt(4));
				u4.setHp(rs.getString(5));
				u4.setAddr(rs.getString(6));
				
				// 리스트 추가
				users.add(u4);
			}
			// 6단계 - 데이터베이스 종료
			rs.close();
			psmt.close();
			conn.close();
	
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		for(User4VO u4 : users) {
			System.out.printf("%s,%s,%s,%d,%s,%s",u4.getUid(),
												  u4.getName(),
												  u4.getGender(),
												  u4.getAge(),
												  u4.getHp(),
												  u4.getAddr());
		}
		
		
		System.out.println("select 완료...");
	}
}
