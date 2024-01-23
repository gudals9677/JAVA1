package sub4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * 날짜 : 2024/01/23
 * 이름 : 김형민
 * 내용 : Transcation 실습하기
 */
public class TransactionTest {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.print("장애를 발생하시겠습니까?");
		
	int answer = scan.nextInt(); // 1:장애발생
	
	// 트랜잭션 선언 - 선언과 생성 분리해야함
	Connection conn = null;
	
	// DB정보
	String host = "jdbc:mysql://127.0.0.1:3306/bank";
	String user = "gudals";
	String pass = "1234";
	try {
		// 1단계 - JDBC 드라이버 로드
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2단계 - 데이터베이스 접속
		conn = DriverManager.getConnection(host,user,pass);
		
		// 트랜잭션 시작
		conn.setAutoCommit(false);
		
		// 3단계 - SQL 실행객체 생성
		String sql1 = "UPDATE `bank_account` SET `a_balance`= `a_balance` -10000 where `a_no`=? ";
		String sql2 = "UPDATE `bank_account` SET `a_balance`= `a_balance` +10000 where `a_no`=? ";
		
		PreparedStatement psmt1 = conn.prepareStatement(sql1);
		psmt1.setString(1, "101-11-1001");
		PreparedStatement psmt2 = conn.prepareStatement(sql2);
		psmt2.setString(1, "101-11-1002");
		
		// 4단계 - SQL 실행
		psmt1.executeUpdate();
		
		if(answer == 1) {
			throw new Exception("예상치 못한 예외발생!");
		}
		psmt2.executeUpdate();
		
		//트랜잭션 확정 - 성공처리
		conn.commit();
		
		// 5단계 - 결과처리(SELECT)
		
		
		// 6단계 - 데이터베이스 종료
		psmt1.close();
		psmt2.close();
		conn.close();
		
		}catch(Exception e) {
			e.printStackTrace();
			
			// 트랜잭션 취소 - 실패처리
			try {
				conn.rollback();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	System.out.println("트랜잭션 완료...");
	}
}
