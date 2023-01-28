package Day1;

import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbfunction {
    public Connection connect_to_db(String dbname, String user, String pass) {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbname, user, pass);
            if (conn != null) {
                System.out.println("Connection Established");
            } else {
                System.out.println("Connection Failed");
            }
        }catch(Exception e){
            e.getMessage();
        }
        return conn;
    }

}
