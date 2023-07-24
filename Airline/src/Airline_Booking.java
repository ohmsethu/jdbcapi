import java.sql.*;
public class Airline_Booking {
	public void getTable()  throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/Airline_booking";
		String username="root";
		String password="0901";
		
		
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		 String sql = "CREATE TABLE  UserDetails" +
	             "(Id INTEGER not NULL PRIMARY KEY AUTO_INCREMENT, " +
	             " Name VARCHAR(255), " + 
	             " Email VARCHAR(255) UNIQUE, " + 
	             " Age INTEGER,"
	             + "PhoneNumber VARCHAR(255) UNIQUE,"
	             + "Password VARCHAR(255))";
		 st.executeUpdate(sql);
		 System.out.println("create table");
		
	}
	public void getTable1()  throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/Airline_booking";
		String username="root";
		String password="0901";
		
		
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		 String sql = "CREATE TABLE FlightDetails" +
	             "(Id INTEGER not NULL PRIMARY KEY AUTO_INCREMENT, " +
	             " FlightName VARCHAR(255), " + 
	             " FlightNumber VARCHAR(255) not NULL UNIQUE, " + 
	             " Dom_Inter VARCHAR(255) not NULL,"
	             +" Time VARCHAR(255) not NULL)";
		 st.executeUpdate(sql);
		 System.out.println("create table");
	}
}

