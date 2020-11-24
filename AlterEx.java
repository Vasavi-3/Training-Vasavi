package com.jnit;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;
import java.util.Scanner;
import java.sql.ResultSet;
public class AlterEx {
public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
	Scanner sc=new Scanner(System.in);
	Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/motivity";
		String username="root";
		String password="Root";
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		System.out.println("1. change columname\n2. add columname");
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("enter the old colname:");
			String oldColName = sc.next();
			System.out.println("enter the new colname:");
			String newColName = sc.next();
			System.out.println("enter the datatype of new colname:");
			String datatype = sc.next();
			String alter = "alter table student change " + oldColName + " " + newColName + " " + datatype;
			int a = st.executeUpdate(alter);
			if (a == 0)
				System.out.println("altered");
		} else if(choice == 2) {
			System.out.println("enter the new colname:");
			String newColName = sc.next();
			System.out.println("enter the datatype of new colname:");
			String datatype = sc.next();
			String alter = "alter table student add "+ newColName + " " + datatype;
			int a = st.executeUpdate(alter);
			if (a == 0)
				System.out.println("altered");
		}

}}

