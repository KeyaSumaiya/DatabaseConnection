package com.naztech.dbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.naztech.model.User;

public class DBOperation {

	public User addData(User user1) throws SQLException {
		DBConnection conn = DBConnection.getInstance();

		Connection dbConnection = conn.getConnection();

		String insertSQL = "INSERT INTO [dbo].[User_Nusraat]" + "(name,UserID,salary,country,city,zipCode) VALUES"
				+ "(?,?,?,?,?,?)";

		PreparedStatement preparedStatement = dbConnection.prepareStatement(insertSQL);

		preparedStatement.setString(1, user1.getName());
		preparedStatement.setString(2, user1.getUserId());
		preparedStatement.setInt(3, user1.getSalary());
		preparedStatement.setString(4, user1.getCountry());
		preparedStatement.setString(5, user1.getCity());
		preparedStatement.setInt(6, user1.getZipCode());
		preparedStatement.execute();

		return user1;
	}

	public boolean deleteData(User user1) throws SQLException {
		DBConnection conn = DBConnection.getInstance();

		Connection dbConnection = conn.getConnection();

		String query = "delete from [dbo].[User_Nusraat] where name = ?";
		PreparedStatement preparedStatement = dbConnection.prepareStatement(query);
		
		preparedStatement.setString(1, user1.getName());

		

		return preparedStatement.execute();
		
	}

	public int updateData(User user1) throws SQLException {
		DBConnection conn = DBConnection.getInstance();

	

		Connection dbConnection = conn.getConnection();

		
		String query = "update [dbo].[User_Nusraat] SET zipCode = 3333  where name = ?";
		PreparedStatement preparedStatement = dbConnection.prepareStatement(query);

		preparedStatement.setString(1, user1.getName());
		
		return preparedStatement.executeUpdate();
		
	}

	
	public String findIdByName(String userName) throws SQLException  {
		DBConnection conn = DBConnection.getInstance();
		String id;
		
	
		Connection dbConnection = conn.getConnection();
		
	
		String query = "SELECT UserId FROM User_Nusraat where name= ? ";
		
		
		PreparedStatement preparedStatement = conn.getConnection().prepareStatement(query);
		
		preparedStatement.setString(1, userName);
		preparedStatement.execute();
		
		
		
		
		ResultSet rs = preparedStatement.executeQuery();
		
		while(rs.next()) {
			id=rs.getString("UserId");
		System.out.println(String.format("UserId %s ", id));
		return id;
		
		
		}
		
		return null;
	
	}

}
