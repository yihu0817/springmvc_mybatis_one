package com.ittx.spring002.dao.impl;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ittx.spring002.dao.UserDao;
import com.ittx.spring002.model.User;

public class UserDaoImplTest {

	@Test
	public void testGetUserLists() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao = (UserDao) ctx.getBean("userDao");
		List<User> lists = userDao.getUserLists();
		System.out.println(">>>>"+lists.size());
		for(User user:lists){
			System.out.println(user);
		}
	
	}

}
