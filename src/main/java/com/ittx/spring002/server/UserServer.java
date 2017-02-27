package com.ittx.spring002.server;

import java.util.List;

import com.ittx.spring002.model.User;

public interface UserServer {
	public void addUser(User user);
	public List<User> getUserLists();
	public void deleteUser(User user);
	public User getUserById(int id);
}
