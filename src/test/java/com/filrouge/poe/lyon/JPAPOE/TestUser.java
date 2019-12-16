package com.filrouge.poe.lyon.JPAPOE;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.filrouge.poe.lyon.JPAPOE.dao.impl.Dao;
import com.filrouge.poe.lyon.JPAPOE.model.User;
import com.filrouge.poe.lyon.JPAPOE.service.IUserService;
import com.filrouge.poe.lyon.JPAPOE.service.impl.UserService;

public class TestUser {
	private static Dao dao;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dao = new Dao();
		dao.init();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		dao.close();
	}

	@Test
	public void testAllUser() {
		IUserService userservice = new UserService(dao);
		List<User> ul = userservice.allUser();
		ul.forEach(u -> System.out.println(u));
	}
	
	@Test 
	public void testFindUser() {
		IUserService userservice = new UserService(dao);
		User u = userservice.findUser(1);
		System.out.println(u);
	}
	
	

}
