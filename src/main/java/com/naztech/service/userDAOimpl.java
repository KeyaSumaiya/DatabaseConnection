package com.naztech.service;

import java.sql.Array;
import java.sql.SQLException;

import com.naztech.dao.userDao;
import com.naztech.dbUtil.DBOperation;
import com.naztech.model.User;

public class userDAOimpl implements userDao {

	public boolean addUser(User User) {
		DBOperation dbOperations = new DBOperation();
		
		try {
			dbOperations.addData(User);
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return true;
	}

	public boolean deleteUser(User User) {
		// TODO Auto-generated method stub
		
         DBOperation dbOperations = new DBOperation();
		
		try {
			//dbOperations.deleteData(User);
			if(dbOperations.deleteData(User)==false) {return true;}
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return false;
		
	}

	public boolean updateUser(User User) {
		// TODO Auto-generated method stub
		  DBOperation dbOperations = new DBOperation();
			
			try {
				//dbOperations.updateData(User);
				if(dbOperations.updateData(User)==3) {return true;}
			} catch (SQLException e) {
				e.printStackTrace();
				
			}
			
			return true;
		
	}

	


	public String userFindIdByName(String UserName) {
		// TODO Auto-generated method stub
		DBOperation dbOperations = new DBOperation();
		
		try {
			
			
			return dbOperations.findIdByName(UserName);
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return null;
	}

	/*public String userFindById(User User) {
		
		DBOperation dbOperations = new DBOperation();
		
		try {
			//dbOperations.updateData(User);
			if(dbOperations.findData(User)==true) {return User.getUserId();}
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		
		return null;
		
	}*/



	

	}
