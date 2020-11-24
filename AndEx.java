package com.jnit;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;
import java.util.Scanner;
import java.sql.ResultSet;
public class AndEx {
public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
	Scanner sc=new Scanner(System.in);
	Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/motivity";
		String username="root";
		String password="Root";
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		System.out.println("enter first sid");
		int id1=sc.nextInt();
		System.out.println("enter second sid");
		int id2=sc.nextInt();
		String s= "select sid,sname where id="+id1+"and id="+id2+";";
		System.out.println(s);
		ResultSet set=st.executeQuery(s);
		while(set.next())
		{
			System.out.println(set.getString(1)+"-"+set.getString(2)+"-"+set.getInt(3));
			
		}
		
			
		}
		
}
