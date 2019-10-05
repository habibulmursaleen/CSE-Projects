package logins;

import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.SQLException ;
import java.sql.Statement ;
import java.sql.ResultSet ;

import java.util.List ;
import java.util.ArrayList ;
import javax.swing.JOptionPane;

public class dbconnect
{
	
	Connection con = null;
	public static Connection dbconnector ()
	{
		try 
		{
			Class.forName ("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atten","root","");
			
				//JOptionPane.showMessageDialog(null, "Connection Successful");	
			System.out.print("Connected\n");
			return con;
		}
		catch (Exception e) 
		{
			System.out.print("Not Connected\n");
				//JOptionPane.showMessageDialog(null, "Database doesn't Connected");
			
			return null;
		}
    }
}