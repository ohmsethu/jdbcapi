import java.sql.*;
public class CreateFlightDetails {
	public void getFlightInfo()throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/Airline_booking";
		String username="root";
		String password="0901";
		String Query= "insert into FlightDetails values(?,?,?,?,?)";
		
		
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement st=con.prepareStatement(Query);
		st.setInt(1,1);
		st.setString(2,"Air India");
		st.setString(3,"AI 9597");
		st.setString(4,"Domestic");
		st.setString(5,"08:30");
		st.executeUpdate();
	}
	public void getUpdate() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/Airline_booking";
		String username="root";
		String password="0901";
		String Query= "UPDATE FlightDetails SET FlightName=?,FlightNumber=? WHERE id=?";
	
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement st=con.prepareStatement(Query);
		st.setString(1,"Air Asia");
		st.setString(2, "AA 9795");
		st.setInt(3, 1);
		st.executeUpdate();
	}
	public void getDelete()throws Exception{
		

	String url="jdbc:mysql://127.0.0.1:3306/Airline_booking";
			String username="root";
			String password="0901";
			int Id =1;
			String Query=" delete from FlightDetails  where Id="+Id;
			
			Connection con=DriverManager.getConnection(url,username,password);
			PreparedStatement st=con.prepareStatement(Query);
			st.executeUpdate(Query);
			st.close();
	}
	public void getDeleteAll() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/Airline_booking";
		String username="root";
		String password="0901";
		String Query="DROP TABLE FlightDetails";
		
		
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		st.executeUpdate(Query);
	}
	public void getTruncate() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/Airline_booking";
		String username="root";
		String password="0901";
		String Query="TRUNCATE TABLE FlightDetails";
		
		
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		st.executeUpdate(Query);
	}
	public void getSelectAll() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/Airline_booking";
		String username="root";
		String password="0901";
		String Query="SELECT * FROM  FlightDetails";
		
		
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=(Statement)con.createStatement();
		ResultSet rs =st.executeQuery(Query);
		while(rs.next()) {
			System.out.println("Id "+rs.getInt(1));
			System.out.println("FlightName "+rs.getString(2));
			System.out.println("FlightNumber "+rs.getString(3));
			System.out.println("Dom_Inter "+rs.getString(4));
			System.out.println("Time "+rs.getString(5));
			
			
		}
		
	}
}
