import java.sql.*;
public class Jdbcdemo{
    public static void main(String arg[]){
        String url = "jdbbc url";
        String username = "jdbbc username";
        String password = "jdbbc password";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,password);
              Statement stmt = con.createStatement();
              ResultSet rs = stmt.executeQuery("SELECT * FROM students_details");
              while(rs.next()){
                System.out.println(rs.getString("Student_name"));
              } 
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}