package com.database.programs;
import java.sql.*;
import java.util.*;

public class ques2 {

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/db1","root","a41d89bc");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Id:");
			int Id=sc.nextInt();
			if(Id>100 && Id<=121)
				System.out.println("Valid ID");
			else
				throw new ArithmeticException("Invalid ID");
			System.out.println("Enter the name of the employee:");
			String Name=sc.next();
			System.out.println("Enter the Salry:");
			Double Salary=sc.nextDouble();
			String sql="Insert into employee values(?,?,?)";
			PreparedStatement ptm=con.prepareStatement(sql);
			ptm.setString(1, Name);
			ptm.setInt(2, Id);
			ptm.setDouble(3, Salary);
			int c=ptm.executeUpdate();
			if(c!=0)
			{
				System.out.println("Data Inserted"+" "+c);
			}
			else
			{
				System.out.println("Data Not Inserted");
			}
			ptm.close();
			con.close();
		}
		catch(SQLException s)
		{
			s.printStackTrace();
		}
		catch(ClassNotFoundException c)
		{
			c.printStackTrace();
		}
	}

}
