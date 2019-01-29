package com.naztech.dbUtil;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.naztech.model.User;
import com.naztech.service.userDAOimpl;

public class DBOperationTest {

	/*@Test*/
	public void insertTest() throws SQLException {
		
		User user =  new User();
		
	/*	user.setCity("Dhaka");
		user.setCountry("England");
		user.setName("Promi");
		user.setSalary(40000);
		user.setUserId("2014039");
		user.setZipCode(1205);*/
		
	/*	user.setCity("Dhaka");
		user.setCountry("England");
		user.setName("Plabita");
		user.setSalary(40000);
		user.setUserId("2014052");
		user.setZipCode(1205);
		
		user.setCity("Patuakhali");
		user.setCountry("England");
		user.setName("Keya");
		user.setSalary(40000);
		user.setUserId("2011055");
		user.setZipCode(1203);
		
		user.setCity("Noakhali");
		user.setCountry("England");
		user.setName("Afee");
		user.setSalary(40000);
		user.setUserId("20161058");
		user.setZipCode(1206);*/
		
		//DBOperation dbOperation =  new DBOperation();
		//assertEquals(user,dbOperation.addData(user));
		userDAOimpl  userDAOimpl = new userDAOimpl();
		assertEquals(true,userDAOimpl.addUser(user));
		
		
		
		
	}
	
	
	
 /*@Test	*/
 public void deleteTest() throws SQLException {
		
		User user =  new User();
		
		
		user.setCity("Dhaka");
		user.setCountry("England");
		user.setName("afee");
		user.setSalary(40000);
		user.setUserId("2014052");
		user.setZipCode(1205);
		
		
	
		
	DBOperation dbOperation =  new DBOperation();
	userDAOimpl  userDAOimpl = new userDAOimpl();
	
	//assertFalse(dbOperation.deleteData(user));
	assertTrue(userDAOimpl.deleteUser(user));
	
	
	
	//assertEquals(user,dbOperation.deleteData(user));
		//assertTrue(dbOperation.deleteData(user));
		
		//assertEquals(user,userDAOimpl.deleteUser(user));
		  //assert true [: userDAOimpl.deleteUser(user)];
		
	  //assertTrue(userDAOimpl.deleteUser(user));
	  //assertFalse(userDAOimpl.deleteUser(user));
		
	
}
	
	/*@Test
	public void updateTest() throws SQLException {
		
		User user =  new User();
		
		
		user.setCity("Patuakhali");
		user.setCountry("England");
		user.setName("Afee");
		user.setSalary(40000);
		user.setUserId("2011055");
		user.setZipCode(1203);
		
		//DBOperation dbOperation =  new DBOperation();
		//assertEquals(3,dbOperation.updateData(user));
		userDAOimpl  userDAOimpl = new userDAOimpl();
		assertEquals(true,userDAOimpl.updateUser(user));
		
		
		
		
		
	}*/
	
 @Test	
public void findTest() throws SQLException {
		
		User user =  new User();
		String userName="Promi";
		
	DBOperation dbOperation =  new DBOperation();
	//assertEquals(user,dbOperation.deleteData(user));
	  userDAOimpl  userDAOimpl = new userDAOimpl();
	  assertEquals("2014039", userDAOimpl.userFindIdByName(userName));
		
	
}
}
	

	


