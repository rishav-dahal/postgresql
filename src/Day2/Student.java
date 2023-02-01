package Day2;
import java.sql.*;
public class Student {
    public static void main (String[]args){
        final String url="jdbc:postgresql://localhost:5432";
        final String uname="postgres";
        final String pass="";
        try{
           // Class.forName("org.postgresql.Driver");
            Connection conn=DriverManager.getConnection(url,uname,pass);
        }catch (Exception e){
            e.getMessage();
        }

    }
}
