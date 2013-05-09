package springbook.user.dao;

import java.sql.SQLException;

import springbook.user.domain.User;

public class userDaoTest {

	/**
	 * @param args
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		UserDao dao =  new UserDao();
		User user = new User();
		
		user.setId("unifyCore");
		user.setName("KimJongsung");
		user.setPassword("Password");
		
		dao.add(user);
		
		System.out.println(user.getId() + " update complete");
		
		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		
		System.out.println(user2.getPassword());
		System.out.println(user2.getId() + "조회 성공");

	}

}
