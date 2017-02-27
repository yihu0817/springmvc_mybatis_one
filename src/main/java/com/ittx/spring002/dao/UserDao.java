package com.ittx.spring002.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ittx.spring002.model.User;
@Repository("userDao")
public interface UserDao {
	public void addUser(User user);
	public List<User> getUserLists();
	public void deleteUser(User user);
	public User getUserById(int id);
}
