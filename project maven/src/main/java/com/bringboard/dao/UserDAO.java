package com.bringboard.dao;

import java.util.List;

import com.bringboard.model.UserTable;

public interface UserDAO {
	public boolean saveUser(UserTable u);
	public void deleteUser(String uname);
	public void updateUser(UserTable u);
	public List<UserTable> allUsers();
	public List<UserTable> fetchUser(String uname);

	
}
