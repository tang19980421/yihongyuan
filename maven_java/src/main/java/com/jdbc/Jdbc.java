package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;



public class Jdbc {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql:///getor", "root", "19980421");
			System.out.println(conn==null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void getconn(){
		try {
			System.out.println("789456");
			System.out.println("123456");
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql:///getor", "root", "19980421");
			System.out.println(conn==null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
