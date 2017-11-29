/*package com.techcompany.TestCases;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techcompany.DAO.UserDAO;
import com.techcompany.Model.User;

public class UserTestCase {

	@Autowired
	static AnnotationConfigApplicationContext config;
	@Autowired
	static UserDAO userDAO;
	@Autowired
	static User user;

	@BeforeClass
	public static void initialize() {

		config = new AnnotationConfigApplicationContext();
		config.scan("com.techcompany");
		config.refresh();

		
		user = (User) config.getBean("user");
		
		userDAO = (UserDAO) config.getBean("userDAOImpl");

	}

	@Test
	public void createUserTest() {

		user.setUname("prao");
		user.setUfname("Prathamesh");
		user.setUlname("Rao");
		user.setPassword("12345");
		user.setUphone("9658741232");
		user.setUadd("Chulna");
		user.setUemail("prao@gmail.com");
		user.setRole("Role_User");

		boolean flag = userDAO.save(user);
		assertEquals("creatUserTest", true, flag);

	}
}
*/