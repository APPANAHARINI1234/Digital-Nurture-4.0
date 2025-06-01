import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.Connection;
public class App {
    public static void main(String[] args) throws Exception {
        String url ="jdbc:mysql://localhost:3306/bank";
        String username ="root";
        String password ="";
        double a = 3;
        String debitQuery = "update amounts set amount = amount - ? where id = ?";
        String creditQuery ="update amounts set amount = amount + ? where id = ?";
        try{
            Connection conn = DriverManager.getConnection(url, username, password);
            conn.setAutoCommit(false);
            PreparedStatement ps = conn.prepareStatement(debitQuery);
            ps.setDouble(1,a);
            ps.setInt(2, 2 );
            ps.executeUpdate();
            ps = conn.prepareStatement(creditQuery);
            ps.setDouble(1,a);
            ps.setInt(2, 1 );
            ps.executeUpdate();
            String query ="select amount from amounts where id = 2";
            Statement st = conn.createStatement();
             ResultSet rs=st.executeQuery(query);
             rs.next();
             double db = rs.getDouble(1);
             if(db < 0){
                conn.rollback();
                System.out.println("failed");
             }
             else{
                conn.commit();
                System.out.println("successful");
             }
             conn.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
