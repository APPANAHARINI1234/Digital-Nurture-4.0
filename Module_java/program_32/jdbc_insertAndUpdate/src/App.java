import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class App {
    public static void main(String[] args) throws Exception {
        String url ="jdbc:mysql://localhost:3306/school";
        String username ="root";
        String password ="";
        String insertQuery = "insert into students values(?,?,?)";
        String updateQuery ="update students set name=? where id = ?";
        try{
           Connection conn = DriverManager.getConnection(url, username, password);
           PreparedStatement stmt = conn.prepareStatement(insertQuery);
           stmt.setString(2, "hoy");
           stmt.setInt(1,80);
           stmt.setInt(3,34);
           stmt.executeUpdate();
           stmt = conn.prepareStatement(updateQuery);
           stmt.setInt(2,2);
           stmt.setString(1,"hbkjkj");
           
           stmt.executeUpdate();
           String query = "select * from students";
           Statement s = conn.createStatement();
           ResultSet rs=s.executeQuery(query);
           while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)); 
           }
           conn.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
