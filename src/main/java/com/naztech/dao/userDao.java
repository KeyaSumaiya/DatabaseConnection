package com.naztech.dao;

import java.sql.Array;

import com.naztech.model.User;

public interface userDao {
	boolean addUser(User User) ;
	boolean deleteUser(User User);
	boolean updateUser(User User);
	String userFindIdByName(String UserName);

}
