package com.etc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args){
		String url = "jdbc:mysql://127.0.0.1:3306/zznj?useUnicode=true&amp;characterEncoding=utf-8";
		String user = "root";
		String password = "";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url,user,password);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from t_store");
			while(resultSet.next()){
				System.out.println(resultSet.getString("store_name"));
			}
			resultSet.close();
			statement.close();
			connection.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
