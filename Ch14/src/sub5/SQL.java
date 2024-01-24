package sub5;

public class SQL {

	public static final String INSERT_USER = "INSERT INTO `USER2` VALUES (?,?,?,?)";
	public static final String SELECT_USERS = "SELECT * FROM `USER2`";
	public static final String SELECT_USER = "SELECT * FROM `User2` where `uid`=?";
	public static final String UPDATE_USER = "UPDATE `USER2` SET "
											+ "`name`=?,"
											+ "`birth`=?,"
											+ "`addr`=? "
											+ "WHERE `uid`=?";
	public static final String DELETE_USER = "Delete from `user2` where `uid`=?";
}
