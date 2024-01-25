package sub5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// Data Access Object
// 데이터베이스 CRUD 처리 객체
public class UserDAO {

	// 싱글톤
	private static UserDAO instance = new UserDAO();

	public static UserDAO getInstance() {
		return instance;
	}

	private UserDAO() {
	}

	// DB정보
	private String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
	private String USER = "gudals";
	private String PASS = "1234";

	// DB자원
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	// 커넥션 생성 메서드
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		// 1단계
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 2단계
		return DriverManager.getConnection(HOST, USER, PASS);

	}

	// 자원해제 메서드
	private void close() throws SQLException {

		if (rs != null) {
			rs.close();

		}
		if (psmt != null) {
			psmt.close();
		}
		if (stmt != null) {
			stmt.close();
		}
		if (conn != null) {
			conn.close();
		}
	}

	// CRUD 메서드
	public void insertUser(UserDTO user) {

		try {
			conn = getConnection();
			// 3단계
			psmt = conn.prepareStatement(SQL.INSERT_USER);
			psmt.setString(1, user.getUid());
			psmt.setString(2, user.getName());
			psmt.setString(3, user.getBirth());
			psmt.setString(4, user.getAddr());

			// 4단계
			psmt.executeUpdate();

			// 5단계

			// 6단계
			close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<UserDTO> selectUsers() {
		List<UserDTO> users = new ArrayList<>();
		try {
			conn = getConnection();
			// 3단계
			stmt = conn.createStatement();
			// 4단계
			rs = stmt.executeQuery(SQL.SELECT_USERS);
			// 5단계
			while (rs.next()) {

				UserDTO d4 = new UserDTO();
				d4.setUid(rs.getString(1));
				d4.setName(rs.getString(2));
				d4.setBirth(rs.getString(3));
				d4.setAddr(rs.getString(4));

				users.add(d4);

			}
			// 6단계
			close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}

	public UserDTO selectUser(String uid) {

		UserDTO user = null;

		try { // 리스트는 객체들을 구조화 시키기위해 만드는것인데 이 메서드는
				// IF문 1또는0이라서 쓸필요가없음
			conn = getConnection();
			// 3단계
			psmt = conn.prepareStatement(SQL.SELECT_USER);
			psmt.setString(1, uid);
			// 4단계
			rs = psmt.executeQuery();
			// 5단계

			if (rs.next()) {
				user = new UserDTO();
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setBirth(rs.getString(3));
				user.setAddr(rs.getString(4));

			}
			// 6단계
			close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	public void updateUser(UserDTO user) {
		try {
			conn = getConnection();
			// 3단계
			psmt = conn.prepareStatement(SQL.UPDATE_USER);
			psmt.setString(1, user.getName());
			psmt.setString(2, user.getBirth());
			psmt.setString(3, user.getAddr());
			psmt.setString(4, user.getUid());
			// 4단계
			psmt.executeUpdate();
			// 5단계
			// 6단계
			close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteUser(String uid) {
		try {
			conn = getConnection();
			// 3단계
			psmt = conn.prepareStatement(SQL.DELETE_USER);
			psmt.setString(1, uid);
			// 4단계
			psmt.executeUpdate();
			// 5단계
			// 6단계
			close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
