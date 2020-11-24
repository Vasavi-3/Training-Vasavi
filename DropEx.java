package com.jnit;
	import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.SQLException;
		import java.sql.Statement;
			public class DropEx {
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
		String s="drop employ table";
				int x=st.executeUpdate(s);
				if(x==0)
					System.out.println("dropped");
				
			}
					
					
					
					
				
					
		}




