import java.sql.*;
public class createuser {
	public void getUserValues() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/Airline_booking";
		String username="root";
		String password="0901";
		String Query= "insert into UserDetails values(?,?,?,?,?,?)";
		
		
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement st=con.prepareStatement(Query);
		st.setInt(1,1);
		st.setString(2,"OhmGangadharan");
		st.setString(3,"ohmsethu002@gmail.com");
		st.setInt(4,21);
		st.setString(5,"9597670065");
		st.setString(6,"Ohmsethu003@");
		st.executeUpdate();
		
	}
	public void getUpdate() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/Airline_booking";
		String username="root";
		String password="0901";
		String Query= "UPDATE UserDetails SET name=? WHERE id=?";
		
		
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement st=con.prepareStatement(Query);
		st.setString(1,"ohm");
		st.setInt(2, 1);
		st.executeUpdate();
		
	}
	public void getDelete() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/Airline_booking";
		String username="root";
		String password="0901";
		int Id =1;
		String Query=" delete from UserDetails where Id="+Id;
		
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement st=con.prepareStatement(Query);
		st.executeUpdate(Query);
		st.close();
	}
	public void getDeleteAll() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/Airline_booking";
		String username="root";
		String password="0901";
		String Query="DROP TABLE UserDetails";
		
		
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		st.executeUpdate(Query);
	}
	public void getTruncate()  {
		try {
		String url="jdbc:mysql://127.0.0.1:3306/Airline_booking";
		String username="root";
		String password="0901";
		String Query="TRUNCATE TABLE UserDetails";
		
		
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		st.executeUpdate(Query);
		}
		catch(Exception e){
			System.out.println("Error");
		}
	
			
	}
	public void getSelectAll() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/Airline_booking";
		String username="root";
		String password="0901";
		String Query="SELECT * FROM  UserDetails";
		
		
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=(Statement)con.createStatement();
		ResultSet rs =st.executeQuery(Query);
		while(rs.next()) {
			System.out.print("Id "+rs.getInt(1));
			System.out.print("Name "+rs.getString(2));
			System.out.print("Email "+rs.getString(3));
			System.out.print("Age "+rs.getInt(4));
			System.out.print("Phone "+rs.getString(5));
			System.out.print("Password "+rs.getString(6));
			
			
		}
		
	

	}
	
}
