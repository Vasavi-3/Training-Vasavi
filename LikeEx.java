package com.jnit;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;
import java.util.Scanner;
import java.sql.ResultSet;

	public class LikeEx {
public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
	Scanner sc=new Scanner(System.in);
	Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/motivity";
		String username="root";
		String password="Root";
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		System.out.println("enter the character of first letter");
		int ch=sc.nextInt();
		String s="select * from student where sname like '"+ch+"%';";
		ResultSet set=st.executeQuery(s);
		while(set.next())
		{
			System.out.println(set.getInt(1)+"-"+set.getString(2)+"-"+set.getString(3)+"-"+set.getString(4));
		}
	}
		}
		
		
		
		