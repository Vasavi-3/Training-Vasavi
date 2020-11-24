package com.jnit;
	import java.sql.Connection;
	import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
	import java.sql.Statement;
	public class SubQuery {
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/motivity";
		String username="root";
		String password="Root";
		Connection con=DriverManager.getConnection(url,username,password);
		if(con!=null)
		{
			System.out.println("connection established");
		}
		Statement st=con.createStatement();
		String subquery="select * from customers where id not in(select cid from orders)";
		
		ResultSet rs=st.executeQuery(subquery);
		System.out.println("Id || Customer name");
		while(rs.next())
		{
				System.out.println(rs.getInt(1)+" || "+rs.getString(2));
				
		}

}
	}
