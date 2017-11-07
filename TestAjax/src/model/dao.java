package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class dao {
	
	public int fatchName(String pname) 
	{
	int y=0;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/zappy?user=root&password=");
			
			PreparedStatement ps=con.prepareStatement("select pname from product where pname=?");
			ps.setString(1,pname);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{	
				y=1;	
			}
			} catch (Exception e) {
			
			System.out.println(e);
			}
		
		return y;
		}
	}
